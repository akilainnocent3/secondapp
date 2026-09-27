package com.yandex.div.internal.util;

import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.internal.Assert;
import dr.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public abstract class SingleThreadExecutor {

    @m
    private Worker currentWorker;

    @l
    private final Executor executor;

    @l
    private final Object monitor = new Object();

    @m
    private List<Runnable> passedTasks;

    @l
    private final String threadNameSuffix;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class Worker extends NamedRunnable {
        public Worker() {
            super(SingleThreadExecutor.this.threadNameSuffix);
        }

        @Override // com.yandex.div.internal.util.NamedRunnable
        public void execute() {
            Object obj = SingleThreadExecutor.this.monitor;
            SingleThreadExecutor singleThreadExecutor = SingleThreadExecutor.this;
            synchronized (obj) {
                if (m0.g(singleThreadExecutor.currentWorker, this) && singleThreadExecutor.passedTasks != null) {
                    List list = singleThreadExecutor.passedTasks;
                    singleThreadExecutor.passedTasks = null;
                    w2 w2Var = w2.f79517a;
                    boolean z10 = true;
                    while (z10) {
                        if (list != null) {
                            try {
                                SingleThreadExecutor singleThreadExecutor2 = SingleThreadExecutor.this;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((Runnable) it.next()).run();
                                    } catch (RuntimeException e10) {
                                        singleThreadExecutor2.handleError(e10);
                                    }
                                }
                            } catch (Throwable th2) {
                                Object obj2 = SingleThreadExecutor.this.monitor;
                                SingleThreadExecutor singleThreadExecutor3 = SingleThreadExecutor.this;
                                synchronized (obj2) {
                                    singleThreadExecutor3.currentWorker = null;
                                    w2 w2Var2 = w2.f79517a;
                                    throw th2;
                                }
                            }
                        }
                        Object obj3 = SingleThreadExecutor.this.monitor;
                        SingleThreadExecutor singleThreadExecutor4 = SingleThreadExecutor.this;
                        synchronized (obj3) {
                            try {
                                if (singleThreadExecutor4.passedTasks != null) {
                                    list = singleThreadExecutor4.passedTasks;
                                    singleThreadExecutor4.passedTasks = null;
                                } else {
                                    singleThreadExecutor4.currentWorker = null;
                                    z10 = false;
                                }
                                w2 w2Var3 = w2.f79517a;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    return;
                }
                Assert.fail("We shouldn't create excessive workers");
            }
        }
    }

    public SingleThreadExecutor(@l Executor executor, @l String str) {
        this.executor = executor;
        this.threadNameSuffix = str;
    }

    private final void addTaskLocked(Runnable runnable) {
        if (this.passedTasks == null) {
            this.passedTasks = new ArrayList(2);
        }
        List<Runnable> list = this.passedTasks;
        if (list != null) {
            list.add(runnable);
        }
    }

    public abstract void handleError(@l RuntimeException runtimeException);

    public final void post(@l Runnable runnable) {
        Worker worker;
        synchronized (this.monitor) {
            try {
                addTaskLocked(runnable);
                if (this.currentWorker == null) {
                    worker = new Worker();
                    this.currentWorker = worker;
                } else {
                    worker = null;
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (worker != null) {
            this.executor.execute(worker);
        }
    }

    @l
    public final Future<?> submit(@l Runnable runnable) {
        FutureTask futureTask = new FutureTask(runnable, null);
        post(futureTask);
        return futureTask;
    }

    @l
    public final <T> Future<T> submit(@l Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        post(futureTask);
        return futureTask;
    }
}
