package io.fliu.core.threading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by liulingfeng on 2017/9/21.
 */

public class ThreadPool {
    int maxThread;

    ThreadPoolExecutor poolExecutor;

    BlockingQueue<Runnable> tasks;

    public ThreadPool(int maxThread, int timeout) {
        this.maxThread = maxThread;
        this.tasks = new PriorityBlockingQueue<>(maxThread);
        poolExecutor = new ThreadPoolExecutor(maxThread, maxThread*2, timeout, TimeUnit.SECONDS, this.tasks);
    }

    public Future submitTask(Runnable runnable) {
        return poolExecutor.submit(runnable);
    }

    public Future submitTask(Callable callable) {
        return poolExecutor.submit(callable);
    }
}
