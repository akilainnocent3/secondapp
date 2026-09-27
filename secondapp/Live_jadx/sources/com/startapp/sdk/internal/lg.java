package com.startapp.sdk.internal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class lg implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f75147a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f75148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f75149c;

    public lg(Executor executor) {
        this.f75148b = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) ((ArrayDeque) this.f75147a).poll();
        this.f75149c = runnable;
        if (runnable != null) {
            this.f75148b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        ((ArrayDeque) this.f75147a).offer(new kg(this, runnable));
        if (this.f75149c == null) {
            a();
        }
    }
}
