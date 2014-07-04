package backtype.storm.factory;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (c) 2014, Sohu.com All Rights Reserved.
 * <p/>
 * User: jeffreywu  MailTo:jeffreywu@sohu-inc.com
 * Date: 14-7-4
 * Time: PM5:18
 */
public abstract class Factory<T> {
    protected static ReentrantLock lockobj = new ReentrantLock();
    protected String host;
    protected int port;
    protected int timeout;

    public Factory() {

    }

    protected Factory(String host, int port, int timeout) {
        this.host = host;
        this.port = port;
        this.timeout = timeout;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public abstract T getInstance();

    public abstract void restartInstance();
}
