package io.fliu.core.comm;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public interface IComm {

    public final static int STATE_CONNECTED = 1;
    public final static int STATE_CONNECTING = 2;
    public final static int STATE_DISCONNECTED = 3;

    void connect();
    void disconnect();
    void onDisconnected();

    byte[] receive();
    int send(byte[] bytes);
}
