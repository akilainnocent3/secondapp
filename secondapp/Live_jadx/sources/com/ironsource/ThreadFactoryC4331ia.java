package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.ironsource.ia, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class ThreadFactoryC4331ia implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final AtomicInteger f62017a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    @oy.l
    public Thread newThread(@oy.l Runnable r10) {
        kotlin.jvm.internal.m0.p(r10, "r");
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        String str = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f62017a.incrementAndGet())}, 2));
        kotlin.jvm.internal.m0.o(str, "format(locale, format, *args)");
        return new Thread(r10, str);
    }
}
