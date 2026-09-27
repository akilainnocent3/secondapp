package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ICommonExecutor extends IInterruptionSafeThread, Executor {
    @Override // java.util.concurrent.Executor
    void execute(@NonNull Runnable runnable);

    void executeDelayed(@NonNull Runnable runnable, long j10);

    void executeDelayed(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit);

    void remove(@NonNull Runnable runnable);

    void removeAll();

    <T> Future<T> submit(Callable<T> callable);
}
