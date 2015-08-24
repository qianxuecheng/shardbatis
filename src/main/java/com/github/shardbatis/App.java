package com.github.shardbatis;

import com.github.shardbatis.builder.ShardbatisConfig;
import com.github.shardbatis.builder.ShardbatisConfigParser;
import com.github.shardbatis.converter.SqlConverterFactory;
import org.apache.ibatis.io.Resources;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        String selectSql="select * from test,test2 where id in (select id from test2 where id=?)";
        String updateSql="update test set id=?";
        String insertSql="insert into test values()";
        String deleteSql="delete from test where id";
        ShardbatisConfig config = new ShardbatisConfigParser().parse(Resources.getResourceAsStream("shardbatis-config.xml"));
        System.out.println(SqlConverterFactory.getInstance().convert(selectSql, "hehe", "hehe"));
        System.out.println(SqlConverterFactory.getInstance().convert(updateSql, "hehe", "hehe"));
        System.out.println(SqlConverterFactory.getInstance().convert(insertSql, "hehe", "hehe"));
        System.out.println(SqlConverterFactory.getInstance().convert(deleteSql, "hehe", "hehe"));

    }
}
