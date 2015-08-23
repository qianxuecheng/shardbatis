package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLDeleteStatement;
import com.google.common.base.Preconditions;

/**
 * Created by qianxuecheng on 15/8/23.
 */
public class DeleteSqlConverter extends AbstractSqlConverter {
    @Override
    protected SQLStatement doConvert(SQLStatement statement, Object params, String mapperId) {
        Preconditions.checkArgument(statement instanceof SQLDeleteStatement,"Parameter 'statement' must be instance of 'SQLDeleteStatement'");
        SQLDeleteStatement deleteStatement= (SQLDeleteStatement) statement;
        deleteStatement.setTableName(convertTabName(deleteStatement.getTableName().getSimpleName(),params,mapperId));
        return deleteStatement;
    }
}
