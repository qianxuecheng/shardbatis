package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.statement.SQLInsertStatement;
import com.google.common.base.Preconditions;

/**
 * Created by qianxuecheng on 15/8/23.
 */
public class InsertSqlConverter extends AbstractSqlConverter{
    @Override
    protected SQLStatement doConvert(SQLStatement statement, Object params, String mapperId) {
        Preconditions.checkArgument(statement instanceof SQLInsertStatement,"Parameter 'statement' must be instance of 'SQLInsertStatement'");
        SQLInsertStatement insertStatement= (SQLInsertStatement) statement;
        insertStatement.setTableName(new SQLIdentifierExpr(convertTabName(insertStatement.getTableName().getSimpleName(),params,mapperId)));
        return insertStatement;
    }
}
