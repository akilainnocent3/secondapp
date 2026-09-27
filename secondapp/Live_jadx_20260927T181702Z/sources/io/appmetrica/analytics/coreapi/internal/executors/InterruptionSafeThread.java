package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f95228a;

    public InterruptionSafeThread() {
        this.f95228a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f95228a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f95228a = false;
        interrupt();
    }

    public InterruptionSafeThread(@NonNull Runnable runnable, @NonNull String str) {
        super(runnable, str);
        this.f95228a = true;
    }

    public InterruptionSafeThread(@NonNull String str) {
        super(str);
        this.f95228a = true;
    }

    @h1(otherwise = 5)
    public InterruptionSafeThread(@NonNull Runnable runnable) {
        super(runnable);
        this.f95228a = true;
    }
}
