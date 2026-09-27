package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4535u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f64247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f64248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f64249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private final C4316hd f64250d;

    public AbstractC4535u3(int i10, @oy.l String placementName, boolean z10, @oy.m C4316hd c4316hd) {
        kotlin.jvm.internal.m0.p(placementName, "placementName");
        this.f64247a = i10;
        this.f64248b = placementName;
        this.f64249c = z10;
        this.f64250d = c4316hd;
    }

    @oy.m
    public final C4316hd a() {
        return this.f64250d;
    }

    public final int b() {
        return this.f64247a;
    }

    @oy.l
    public final String c() {
        return this.f64248b;
    }

    public final boolean d() {
        return this.f64249c;
    }

    @oy.l
    public String toString() {
        return "placement name: " + this.f64248b;
    }

    public final boolean a(int i10) {
        return this.f64247a == i10;
    }

    public /* synthetic */ AbstractC4535u3(int i10, String str, boolean z10, C4316hd c4316hd, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? null : c4316hd);
    }
}
