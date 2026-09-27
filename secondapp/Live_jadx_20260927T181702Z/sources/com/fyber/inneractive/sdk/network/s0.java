package com.fyber.inneractive.sdk.network;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f45366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f45367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f45368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f45369d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z10) {
        this.f45369d = t0Var;
        this.f45366a = obj;
        this.f45367b = exc;
        this.f45368c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45369d.f45371b.a(this.f45366a, this.f45367b, this.f45368c);
    }
}
