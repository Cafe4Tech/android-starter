package io.fliu.core.rx;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public class RxBus {
    Map<RxSubscription, Disposable> disposableMap;

    private final Subject bus = PublishSubject.create();

    public RxBus(){
        disposableMap = new ConcurrentHashMap<>();
    }

    public void post(RxMessage msg) {
        bus.onNext(msg);
    }

    public void subscribe(RxSubscription rxSubscription){
        disposableMap.put(rxSubscription, bus.subscribe(rxSubscription));
    }

    public void unsubscribe(RxSubscription rxSubscription){
        Disposable disposable = disposableMap.get(rxSubscription);
        if (!disposable.isDisposed()) {
            disposable.dispose();
        }

        disposableMap.remove(rxSubscription);
    }
}
