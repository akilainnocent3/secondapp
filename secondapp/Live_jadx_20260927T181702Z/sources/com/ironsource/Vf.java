package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f60247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f60248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f60249c;

    public long a() {
        return Math.max(0L, this.f60247a - System.currentTimeMillis());
    }

    public void b(long j10) {
        this.f60249c = j10;
        this.f60247a += j10 - this.f60248b;
    }

    public void c(long j10) {
        this.f60248b = j10;
        this.f60249c = 0L;
    }

    public void a(long j10) {
        this.f60247a = System.currentTimeMillis() + j10;
    }

    public void b() {
        this.f60247a = 0L;
        this.f60248b = 0L;
        this.f60249c = 0L;
    }
}
