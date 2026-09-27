package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4515t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final AbstractC4448p0 f64098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final LevelPlayAdInfo f64099b;

    public C4515t0(@oy.l AbstractC4448p0 adUnit, @oy.m LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.m0.p(adUnit, "adUnit");
        this.f64098a = adUnit;
        this.f64099b = levelPlayAdInfo;
    }

    @oy.l
    public final AbstractC4448p0 a() {
        return this.f64098a;
    }

    @oy.m
    public final LevelPlayAdInfo b() {
        return this.f64099b;
    }

    @oy.m
    public final LevelPlayAdInfo c() {
        return this.f64099b;
    }

    @oy.l
    public final AbstractC4448p0 d() {
        return this.f64098a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4515t0)) {
            return false;
        }
        C4515t0 c4515t0 = (C4515t0) obj;
        return kotlin.jvm.internal.m0.g(this.f64098a, c4515t0.f64098a) && kotlin.jvm.internal.m0.g(this.f64099b, c4515t0.f64099b);
    }

    public int hashCode() {
        int iHashCode = this.f64098a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f64099b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    @oy.l
    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f64098a + ", adInfo=" + this.f64099b + gi.j.f86771d;
    }

    public /* synthetic */ C4515t0(AbstractC4448p0 abstractC4448p0, LevelPlayAdInfo levelPlayAdInfo, int i10, kotlin.jvm.internal.x xVar) {
        this(abstractC4448p0, (i10 & 2) != 0 ? null : levelPlayAdInfo);
    }

    @oy.l
    public final C4515t0 a(@oy.l AbstractC4448p0 adUnit, @oy.m LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.m0.p(adUnit, "adUnit");
        return new C4515t0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C4515t0 a(C4515t0 c4515t0, AbstractC4448p0 abstractC4448p0, LevelPlayAdInfo levelPlayAdInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC4448p0 = c4515t0.f64098a;
        }
        if ((i10 & 2) != 0) {
            levelPlayAdInfo = c4515t0.f64099b;
        }
        return c4515t0.a(abstractC4448p0, levelPlayAdInfo);
    }
}
