package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5037f5 extends kotlin.jvm.internal.o0 implements ds.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5037f5 f97319a = new C5037f5();

    public C5037f5() {
        super(1);
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
