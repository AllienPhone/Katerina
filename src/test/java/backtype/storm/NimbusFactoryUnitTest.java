package backtype.storm;

import backtype.storm.backtype.storm.generated.ClusterSummary;
import backtype.storm.backtype.storm.generated.Nimbus;
import backtype.storm.backtype.storm.generated.StormTopology;
import backtype.storm.backtype.storm.generated.TopologyInfo;
import backtype.storm.factory.NimbusFactory;
import org.apache.thrift.TException;
import org.junit.Test;

/**
 * Copyright (c) 2014, Sohu.com All Rights Reserved.
 * <p/>
 * User: jeffreywu  MailTo:jeffreywu@sohu-inc.com
 * Date: 14-7-3
 * Time: PM1:05
 */
public class NimbusFactoryUnitTest {

    @Test
    public void createClusterSummaryNimbusInstanceUnitTest() {
        NimbusFactory nimbusFactory = new NimbusFactory("10.11.132.4", 8089, 20000);
        Nimbus.Client client = nimbusFactory.getInstance();
        try {
            String info = client.getNimbusConf();
            ClusterSummary clusterSummary = client.getClusterInfo();
            System.out.print(clusterSummary.getNimbus_uptime_secs());
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void  getStormTopolopyUnitTest() {
        NimbusFactory nimbusFactory = new NimbusFactory("10.11.132.4", 8089, 20000);
        Nimbus.Client client = nimbusFactory.getInstance();
        try {
            StormTopology topologyInfo = client.getTopology("wordcount-1-1404438110");
            System.out.print("xxxx");
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getTopolopyInfoUnitTest()
    {
        NimbusFactory nimbusFactory = new NimbusFactory("10.11.132.4", 8089, 20000);
        Nimbus.Client client = nimbusFactory.getInstance();
        try {
            TopologyInfo topologyInfo = client.getTopologyInfo("wordcount-1-1404438110");
            System.out.print("xxxx");
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getStormUserTopolopyUnitTest()
    {
        NimbusFactory nimbusFactory = new NimbusFactory("10.11.132.4", 8089, 20000);
        Nimbus.Client client = nimbusFactory.getInstance();
        try {
            StormTopology topologyInfo = client.getUserTopology("wordcount-1-1404438110");
            System.out.print("xxxx");
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getTopologyInfoUnitTest() {
        NimbusFactory nimbusFactory = new NimbusFactory("10.11.132.4", 8089, 20000);
        Nimbus.Client client = nimbusFactory.getInstance();
        try {
            String topologyInfo = client.getTopologyConf("wordcount-1-1404438110");
            System.out.print(topologyInfo);
        } catch (TException e) {
            e.printStackTrace();
        }
    }

}
