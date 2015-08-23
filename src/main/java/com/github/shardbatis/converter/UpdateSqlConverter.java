package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.ast.statement.SQLUpdateStatement;
import com.google.common.base.Preconditions;

/**
 * Created by qianxuecheng on 15/8/23.
 */
public class UpdateSqlConverter extends AbstractSqlConverter{
    @Override
    protected SQLStatement doConvert(SQLStatement statement, Object params, String mapperId) {
        Preconditions.checkArgument(statement instanceof SQLUpdateStatement,"Parameter 'statement' must be instance of 'SQLUpdateStatement'");
        SQLUpdateStatement updateStatement= (SQLUpdateStatement) statement;
        updateStatement.setTableSource(
                new SQLExprTableSource(
                        new SQLIdentifierExpr(
                                convertTabName(updateStatement.getTableName().getSimpleName(),params,mapperId))));
        return updateStatement;
    }
}
