package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class o9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f75297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f75299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t9 f75300d;

    public o9(t9 t9Var, d9 d9Var, int i10, long j10) {
        this.f75300d = t9Var;
        this.f75297a = d9Var;
        this.f75298b = i10;
        this.f75299c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f75300d.a(this.f75297a, this.f75298b, this.f75299c);
        } catch (Throwable unused) {
        }
    }
}
