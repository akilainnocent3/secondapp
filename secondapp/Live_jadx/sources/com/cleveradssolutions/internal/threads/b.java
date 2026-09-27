package com.cleveradssolutions.internal.threads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f43830a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadGroup f43831b;

    public b() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f43831b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r10) {
        m0.p(r10, "r");
        a aVar = new a(r10, "CASHandler-" + this.f43830a.incrementAndGet(), this.f43831b);
        if (aVar.isDaemon()) {
            aVar.setDaemon(false);
        }
        if (aVar.getPriority() != 1) {
            aVar.setPriority(1);
        }
        return aVar;
    }
}
