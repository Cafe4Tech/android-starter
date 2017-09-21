package io.fliu.core.threading;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public abstract class CyclicThread  extends Thread{
    volatile boolean isRunning = true;

    @Override
    public void run() {
        while(true) {
            if (!isRunning) {
                break;
            }

            work();
        }
    }

    abstract void work();

    void quit(){
        isRunning = false;
        interrupt();
    }
}
