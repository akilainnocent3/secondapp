package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class u1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f41051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41052c;

    public u1(t1 t1Var, boolean z10, int i10) {
        this.f41051b = t1Var;
        this.f41052c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f41051b.a(this.f41052c);
    }
}
