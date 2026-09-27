package com.fyber.inneractive.sdk.util;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f47888a;

    public p1(s1 s1Var) {
        this.f47888a = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1 s1Var = this.f47888a;
        s1Var.getClass();
        r.f47891a.execute(new r1(s1Var));
    }
}
