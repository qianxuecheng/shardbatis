package com.github.shardbatis.strategy;

/**
 * Created by qianxuecheng on 15/8/23.
 */
public interface ShardStrategy {
    String getTargetTableName(String baseTableName, Object params, String mapperId);
}
