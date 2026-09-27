package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f70288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f70289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f70291d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f70289b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f70288a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f70290c;
    }

    public e(int i10, int i11) {
        this(i10, 60000L, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f70290c + 1;
        this.f70290c = i10;
        return i10 <= this.f70291d;
    }

    public e(int i10, long j10, int i11) {
        this.f70289b = j10;
        this.f70288a = i10;
        this.f70291d = i11;
    }
}
