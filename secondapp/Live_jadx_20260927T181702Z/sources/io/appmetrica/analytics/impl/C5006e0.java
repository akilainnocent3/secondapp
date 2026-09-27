package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5006e0 implements Dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5032f0 f97231a;

    public C5006e0(C5032f0 c5032f0) {
        this.f97231a = c5032f0;
    }

    @Override // io.appmetrica.analytics.impl.Dn
    @oy.l
    public final Thread a() {
        return this.f97231a.f97313b;
    }

    @Override // io.appmetrica.analytics.impl.Dn
    @oy.m
    public final StackTraceElement[] b() {
        C5032f0 c5032f0 = this.f97231a;
        return (StackTraceElement[]) c5032f0.f97312a.get(c5032f0.f97313b);
    }

    @Override // io.appmetrica.analytics.impl.Dn
    @oy.l
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f97231a.f97312a;
    }
}
