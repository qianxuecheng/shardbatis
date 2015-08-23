package com.github.shardbatis.converter;

import com.alibaba.druid.sql.ast.SQLStatement;


/**
 * Created by qianxuecheng on 15/8/23.
 */
public interface SqlConverter {
    String convert(SQLStatement statement, Object params, String mapperId);

}
