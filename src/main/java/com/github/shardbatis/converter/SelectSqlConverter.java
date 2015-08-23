package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.ast.statement.SQLSelectQuery;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitorAdapter;
import com.github.shardbatis.visitor.TableNameModifier;
import com.google.common.base.Preconditions;

/**
 * Created by qianxuecheng on 15/8/23.
 */
public class SelectSqlConverter extends AbstractSqlConverter{
    @Override
    protected SQLStatement doConvert(SQLStatement statement, Object params, String mapperId) {
        Preconditions.checkArgument(statement instanceof SQLSelectStatement, "Param 'statement' must be instance of 'SQLSelectStatement'");
        SQLSelectStatement selectStatement=(SQLSelectStatement)statement;
        TableNameModifier tableNameModifier=new TableNameModifier(params,mapperId);
        selectStatement.accept(tableNameModifier);
        return selectStatement;
    }

    private class TableNameModifier extends MySqlASTVisitorAdapter{
        private Object params;
        private String mapperId;

        public TableNameModifier(Object params, String mapperId) {
            this.params = params;
            this.mapperId = mapperId;
        }

        @Override
        public boolean visit(SQLSelectStatement astNode) {
            astNode.getSelect().accept(this);
            return false;
        }
        @Override
        public boolean visit(SQLSelect x){
            x.getQuery().accept(this);
            return false;
        }
        @Override
        public boolean visit(SQLExprTableSource x){
            x.getExpr().accept(this);
            return false;
        }
        @Override
        public boolean visit(SQLIdentifierExpr x) {
            x.setName(convertTabName(x.getName(),params,mapperId));
            return false;
        }
    }
}
