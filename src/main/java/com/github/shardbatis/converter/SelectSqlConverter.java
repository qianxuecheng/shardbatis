package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.google.common.base.Preconditions;
import com.qunar.flight.fuwu.visitor.TableNameModifier;

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
}
