package io.appmetrica.analytics.coreutils.internal.executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class SynchronizedBlockingExecutor extends BlockingExecutor {
    @Override // io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
