package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class B9 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54393b;

    public B9(String name, boolean z10) {
        kotlin.jvm.internal.m0.p(name, "name");
        this.f54392a = z10;
        this.f54393b = "TIM-" + name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r10) {
        kotlin.jvm.internal.m0.p(r10, "r");
        try {
            Thread thread = new Thread(r10, this.f54393b);
            thread.setDaemon(this.f54392a);
            return thread;
        } catch (InternalError e10) {
            e10.toString();
            return null;
        }
    }
}
