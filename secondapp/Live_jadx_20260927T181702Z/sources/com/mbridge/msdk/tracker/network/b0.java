package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f70282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f70283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f70285d;

    public b0() {
        this.f70284c = 0;
        this.f70285d = "";
        this.f70282a = null;
    }

    public void a(long j10) {
        this.f70283b = j10;
    }

    public abstract int d();

    public int g() {
        return this.f70284c;
    }

    public void a(int i10) {
        this.f70284c = i10;
    }

    public b0(q qVar) {
        this.f70284c = 0;
        this.f70285d = "";
        this.f70282a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f70284c = 0;
        this.f70285d = "";
        this.f70282a = null;
    }

    public b0(Throwable th2) {
        super(th2);
        this.f70284c = 0;
        this.f70285d = "";
        this.f70282a = null;
    }
}
