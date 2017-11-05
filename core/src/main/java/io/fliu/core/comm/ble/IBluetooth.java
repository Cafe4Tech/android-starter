package io.fliu.core.comm.ble;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public interface IBluetooth {

    void startScan();

    void stopScan();

    void connect();

    void disconnect();

    int send(byte[] bytes);

    void startReceive();

    void stopReceive();
}
