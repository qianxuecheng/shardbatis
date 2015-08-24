package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlOutputVisitor;
import com.github.shardbatis.builder.ShardbatisConfig;
import com.github.shardbatis.strategy.ShardStrategy;

/**
 * Created by qianxuecheng on 15/8/23.
 */
public abstract class AbstractSqlConverter implements SqlConverter{
    @Override
    public String convert(SQLStatement statement, Object params, String mapperId) {
        return doDeParse(doConvert(statement, params, mapperId));
    }

    protected abstract SQLStatement doConvert(SQLStatement statement, Object params, String mapperId);
    protected String doDeParse(SQLStatement statement) {
        MySqlOutputVisitor deParser = new MySqlOutputVisitor(new StringBuffer());
        statement.accept(deParser);
        return deParser.getAppender().toString().replace("\n"," ");
    }
    protected String convertTabName(String tableName,Object params,String mapperId){
        ShardbatisConfig config = ShardbatisConfig.getInstance();
        ShardStrategy strategy = config.getStrategy(tableName);
        if(strategy==null){
            return tableName;
        }
        return strategy.getTargetTableName(tableName,params,mapperId);
    }

}
