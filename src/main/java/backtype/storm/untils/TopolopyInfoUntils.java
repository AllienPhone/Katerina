package backtype.storm.untils;

import backtype.storm.backtype.storm.generated.ExecutorSummary;

/**
 * Copyright (c) 2014, Sohu.com All Rights Reserved.
 * <p/>
 * User: jeffreywu  MailTo:jeffreywu@sohu-inc.com
 * Date: 14-7-4
 * Time: PM6:22
 */
public class TopolopyInfoUntils {
    private String id;
    private String host;
    private String port;
    private String updatime;
    private String acked;
    private String transferred;

    public TopolopyInfoUntils(ExecutorSummary executorSummary) {
        this.id = executorSummary.getComponent_id();
        this.host = executorSummary.getHost();
        this.port = String.valueOf(executorSummary.getPort());
        this.updatime = String.valueOf(executorSummary.getUptime_secs());
        this.acked = String.valueOf(executorSummary.getStats().getEmitted().get(":all-time").get("default"))+"/"+String.valueOf(executorSummary.getStats().getEmitted().get("600").get("default"))+"/"+String.valueOf(executorSummary.getStats().getEmitted().get("10800").get("default"))+"/"+String.valueOf(executorSummary.getStats().getEmitted().get("86400").get("default"));
        this.transferred = String.valueOf(executorSummary.getStats().getTransferred().get(":all-time").get("default"))+"/"+String.valueOf(executorSummary.getStats().getTransferred().get("600").get("default"))+"/"+String.valueOf(executorSummary.getStats().getTransferred().get("10800").get("default"))+"/"+String.valueOf(executorSummary.getStats().getTransferred().get("86400").get("default"));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUpdatime() {
        return updatime;
    }

    public void setUpdatime(String updatime) {
        this.updatime = updatime;
    }

    public String getAcked() {
        return acked;
    }

    public void setAcked(String acked) {
        this.acked = acked;
    }

    public String getTransferred() {
        return transferred;
    }

    public void setTransferred(String transferred) {
        this.transferred = transferred;
    }
}
