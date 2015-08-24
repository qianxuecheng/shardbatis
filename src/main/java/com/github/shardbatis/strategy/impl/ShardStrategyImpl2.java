package com.github.shardbatis.strategy.impl;

import com.github.shardbatis.strategy.ShardStrategy;

/**
 * Created by qianxuecheng on 15/8/23.
 */
public class ShardStrategyImpl2 implements ShardStrategy {
    @Override
    public String getTargetTableName(String baseTableName, Object params, String mapperId) {
        return baseTableName+"_hjehjehj";
    }
}
