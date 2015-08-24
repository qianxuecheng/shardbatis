package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLDeleteStatement;
import com.alibaba.druid.sql.ast.statement.SQLInsertStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.ast.statement.SQLUpdateStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Created by qianxuecheng on 15/8/23.
 */
public class SqlConverterFactory {
    private static SqlConverterFactory factory = new SqlConverterFactory();

    public static SqlConverterFactory getInstance() {
        return factory;
    }

    public SqlConverterFactory() {

    }

    private ImmutableMap<Class<? extends SQLStatement>, SqlConverter> converterMap = ImmutableMap
            .<Class<? extends SQLStatement>, SqlConverter>builder()
            .put(SQLSelectStatement.class, new SelectSqlConverter())
            .put(SQLUpdateStatement.class,new UpdateSqlConverter())
            .put(SQLDeleteStatement.class,new DeleteSqlConverter())
            .put(SQLInsertStatement.class,new InsertSqlConverter())
            .build();


    public String convert(String sql, Object params, String mapperId) {
        MySqlStatementParser parser = new MySqlStatementParser(sql);
        SQLStatement statement = parser.parseStatement();
        SqlConverter converter = get(statement.getClass());
        if (converter != null) {
            return converter.convert(statement, params, mapperId);
        }
        return sql;
    }

    private SqlConverter get(Class<? extends SQLStatement> clazz){
        for(Map.Entry<Class<? extends SQLStatement>, SqlConverter> entry:converterMap.entrySet()){
            if(entry.getKey().isAssignableFrom(clazz)){
                return entry.getValue();
            }
        }
        return null;
    }


}
