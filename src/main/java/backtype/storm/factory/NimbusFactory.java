package backtype.storm.factory;

import backtype.storm.backtype.storm.generated.Nimbus;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Copyright (c) 2014, Sohu.com All Rights Reserved.
 * <p/>
 * User: jeffreywu  MailTo:jeffreywu@sohu-inc.com
 * Date: 14-7-3
 * Time: AM9:29
 * Nimbus Thrift Client Create
 */
public class NimbusFactory extends Factory<Nimbus.Client> {
    private static Nimbus.Client client = null;

    public NimbusFactory(String host, int port, int timeout) {
        super(host, port, timeout);
    }

    /**
     * 创建实例
     *
     * @return
     */
    public Nimbus.Client getInstance() {
        lockobj.lock();
        if (client == null) {
            //实例化对象
            TTransport transport = null;
            try {
                transport = new TSocket(this.host, this.port, this.timeout);
                TTransport conn = new TFramedTransport(transport);
                client = new Nimbus.Client(new TBinaryProtocol(conn));
                transport.open();
            } catch (TTransportException e) {
                e.printStackTrace();
            } catch (TException e) {
                e.printStackTrace();
            }
        }
        lockobj.unlock();
        return client;
    }

    public void restartInstance() {
        lockobj.lock();
        //实例化对象
        TTransport transport = null;
        try {
            transport = new TSocket(this.host, this.port, this.timeout);
            TTransport conn = new TFramedTransport(transport);
            client = new Nimbus.Client(new TBinaryProtocol(conn));
            transport.open();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }
        lockobj.unlock();
    }
}
