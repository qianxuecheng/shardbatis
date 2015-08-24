package com.github.shardbatis.builder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.shardbatis.strategy.ShardStrategy;


/**
 * Created by qianxuecheng on 15/8/23.
 * ClassLoader Lazy
 */
public class ShardbatisConfig {
    private static final class ShardbatisConfigHolder{
        private static final ShardbatisConfig instance=new ShardbatisConfig();
    }
    public static final ShardbatisConfig getInstance(){
        return ShardbatisConfigHolder.instance;
    }
    private Map<String/*tableName*/,ShardStrategy> strategyRegister=new HashMap<String, ShardStrategy>();

    private Set<String> ignoreSet;
    private Set<String> parseSet;
    /**
     * Default Constructor
     */
    public ShardbatisConfig() {

    }
    public void register(String tableName, ShardStrategy strategy) {
        this.strategyRegister.put(tableName.toLowerCase(), strategy);
    }
    public ShardStrategy getStrategy(String tableName) {
        return strategyRegister.get(tableName.toLowerCase());
    }

    public synchronized void addIgnoreId(String id) {
        if (ignoreSet == null) {
            ignoreSet = new HashSet<String>();
        }
        ignoreSet.add(id);
    }
    public synchronized void addParseId(String id) {
        if (parseSet == null) {
            parseSet = new HashSet<String>();
        }
        parseSet.add(id);
    }

    public boolean isConfigParseId() {
        return parseSet != null;
    }
    public boolean isParseId(String id) {
        return parseSet != null && parseSet.contains(id);
    }
    public boolean isIgnoreId(String id) {
        return ignoreSet != null && ignoreSet.contains(id);
    }

}
