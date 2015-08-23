package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.google.common.collect.ImmutableMap;

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
            .build();


    public String convert(String sql, Object params, String mapperId) {
        MySqlStatementParser parser = new MySqlStatementParser(sql);
        SQLStatement statement = parser.parseStatement();
        SqlConverter converter = converterMap.get(statement.getClass());
        if (converter != null) {
            return converter.convert(statement, params, mapperId);
        }
        return sql;
    }


}
