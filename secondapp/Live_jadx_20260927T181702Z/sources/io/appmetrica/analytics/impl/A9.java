package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class A9 implements IHandlerExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f95545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f95546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThreadC4992db f95547c;

    public A9(@NonNull String str) {
        this(a(str));
    }

    public static HandlerThreadC4992db a(String str) {
        HandlerThreadC4992db handlerThreadC4992db = new HandlerThreadC4992db(str + TokenBuilder.TOKEN_DELIMITER + Ad.f95550a.incrementAndGet());
        handlerThreadC4992db.start();
        return handlerThreadC4992db;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f95546b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10) {
        this.f95546b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f95546b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f95545a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z10;
        HandlerThreadC4992db handlerThreadC4992db = this.f95547c;
        synchronized (handlerThreadC4992db) {
            z10 = handlerThreadC4992db.f97186a;
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f95546b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f95546b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC4992db handlerThreadC4992db = this.f95547c;
        synchronized (handlerThreadC4992db) {
            handlerThreadC4992db.f97186a = false;
            handlerThreadC4992db.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f95546b.post(futureTask);
        return futureTask;
    }

    public A9(HandlerThreadC4992db handlerThreadC4992db) {
        this(handlerThreadC4992db, handlerThreadC4992db.getLooper(), new Handler(handlerThreadC4992db.getLooper()));
    }

    @k.h1
    public A9(@NonNull HandlerThreadC4992db handlerThreadC4992db, @NonNull Looper looper, @NonNull Handler handler) {
        this.f95547c = handlerThreadC4992db;
        this.f95545a = looper;
        this.f95546b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        this.f95546b.postDelayed(runnable, timeUnit.toMillis(j10));
    }
}
