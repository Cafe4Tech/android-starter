package io.fliu.android_starter.rx;

import java.io.Serializable;

import io.reactivex.functions.Consumer;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public abstract class RxSubscription implements Consumer<RxMessage> {
    @Override
    public void accept(RxMessage rxMessage) throws Exception {
        onReceive(rxMessage);
    }

    abstract void onReceive(RxMessage msg);
}
