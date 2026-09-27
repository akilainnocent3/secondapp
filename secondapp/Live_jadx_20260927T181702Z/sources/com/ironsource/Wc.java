package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f60277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final N3 f60278b;

    public Wc(long j10, @oy.l N3 unit) {
        kotlin.jvm.internal.m0.p(unit, "unit");
        this.f60277a = j10;
        this.f60278b = unit;
    }

    public final long a() {
        return this.f60277a;
    }

    @oy.l
    public final N3 b() {
        return this.f60278b;
    }

    @oy.l
    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f60277a + " unit=" + this.f60278b + gi.j.f86771d;
    }

    public /* synthetic */ Wc(long j10, N3 n10, int i10, kotlin.jvm.internal.x xVar) {
        this(j10, (i10 & 2) != 0 ? N3.Second : n10);
    }
}
