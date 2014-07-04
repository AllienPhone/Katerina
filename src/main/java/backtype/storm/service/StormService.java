package backtype.storm.service;

import backtype.storm.backtype.storm.generated.ClusterSummary;
import backtype.storm.backtype.storm.generated.StormTopology;
import backtype.storm.backtype.storm.generated.TopologyInfo;

import java.util.Map;

/**
 * Copyright (c) 2014, Sohu.com All Rights Reserved.
 * <p/>
 * User: jeffreywu  MailTo:jeffreywu@sohu-inc.com
 * Date: 14-7-3
 * Time: AM12:08
 */
public interface StormService {

    /**
     * 获取集群信息
     *
     * @return
     */
    public ClusterSummary getClusterSummary();

    /**
     * 获取Nimbus 配置信息
     *
     * @return
     */
    public Map<String, String> getNimbusConf();


    /**
     * 获取StormTopology信息
     *
     * @param id
     * @return
     */
    public StormTopology getStormTopologyById(String id);

    /**
     * 获取StormTopology配置信息
     *
     * @param id
     * @return
     */
    public Map<String, String> getTopolopyConf(String id);

    /**
     * 获取TopolopyInfo信息
     *
     * @param id
     * @return
     */
    public TopologyInfo getTopolopyInfoById(String id);
}
