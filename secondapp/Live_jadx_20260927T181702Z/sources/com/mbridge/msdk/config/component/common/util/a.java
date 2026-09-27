package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f65267a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f65268b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f65269c = new AtomicBoolean(false);

    public T a(long j10) throws InterruptedException {
        if (this.f65267a.await(j10, TimeUnit.MILLISECONDS)) {
            return this.f65268b.get();
        }
        return null;
    }

    public boolean a(T t10) {
        if (!this.f65269c.compareAndSet(false, true)) {
            return false;
        }
        this.f65268b.set(t10);
        this.f65267a.countDown();
        return true;
    }
}
