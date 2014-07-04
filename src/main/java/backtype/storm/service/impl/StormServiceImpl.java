package backtype.storm.service.impl;

import backtype.storm.backtype.storm.generated.ClusterSummary;
import backtype.storm.backtype.storm.generated.Nimbus;
import backtype.storm.backtype.storm.generated.StormTopology;
import backtype.storm.backtype.storm.generated.TopologyInfo;
import backtype.storm.factory.NimbusFactory;
import backtype.storm.service.StormService;
import backtype.storm.untils.JsonUnitls;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Copyright (c) 2014, Sohu.com All Rights Reserved.
 * <p/>
 * User: jeffreywu  MailTo:jeffreywu@sohu-inc.com
 * Date: 14-7-3
 * Time: AM12:08
 */
@Service
public class StormServiceImpl implements StormService {
    @Autowired
    private NimbusFactory nimbusFactory;

    @Override
    public ClusterSummary getClusterSummary() {
        Nimbus.Client client = nimbusFactory.getInstance();
        ClusterSummary summary = null;
        try {
            summary = client.getClusterInfo();
        } catch (Exception e) {
            e.printStackTrace();
            nimbusFactory.restartInstance();
        }
        return summary;
    }

    @Override
    public Map<String, String> getNimbusConf() {
        Nimbus.Client client = nimbusFactory.getInstance();
        String nimbusConf = null;
        Map<String, String> result = null;
        try {
            nimbusConf = client.getNimbusConf();
            if (!Strings.isNullOrEmpty(nimbusConf)) {
                result = (Map) JsonUnitls.StringToJsonVideo(nimbusConf, Map.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            nimbusFactory.restartInstance();
        }
        return result;
    }

    @Override
    public StormTopology getStormTopologyById(String id) {
        return null;
    }

    @Override
    public Map<String, String> getTopolopyConf(String id) {
        Preconditions.checkNotNull(id);
        Nimbus.Client client = nimbusFactory.getInstance();
        String topolopyConf = null;
        Map<String, String> result = null;
        try {
            topolopyConf = client.getTopologyConf(id);
            if (!Strings.isNullOrEmpty(topolopyConf)) {
                result = (Map) JsonUnitls.StringToJsonVideo(topolopyConf, Map.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            nimbusFactory.restartInstance();
        }
        return result;
    }

    @Override
    public TopologyInfo getTopolopyInfoById(String id) {
        Preconditions.checkNotNull(id);
        Nimbus.Client client = nimbusFactory.getInstance();
        TopologyInfo topologyInfo = null;
        try {
            topologyInfo = client.getTopologyInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            nimbusFactory.restartInstance();
        }
        return topologyInfo;
    }


}
