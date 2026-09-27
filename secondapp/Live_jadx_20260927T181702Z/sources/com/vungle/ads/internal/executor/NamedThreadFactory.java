package com.vungle.ads.internal.executor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class NamedThreadFactory implements ThreadFactory {

    @l
    private final AtomicInteger atomicInteger;

    @l
    private final String name;
    private final ThreadFactory threadFactory;

    public NamedThreadFactory(@l String name) {
        m0.p(name, "name");
        this.name = name;
        this.threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    @l
    public final String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    @l
    public Thread newThread(@l Runnable r10) {
        m0.p(r10, "r");
        Thread t10 = this.threadFactory.newThread(r10);
        t10.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        m0.o(t10, "t");
        return t10;
    }
}
