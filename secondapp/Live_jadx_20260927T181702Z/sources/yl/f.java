package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final e f159616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final e f159617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f159618c;

    public f() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ f e(f fVar, e eVar, e eVar2, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = fVar.f159616a;
        }
        if ((i10 & 2) != 0) {
            eVar2 = fVar.f159617b;
        }
        if ((i10 & 4) != 0) {
            d10 = fVar.f159618c;
        }
        return fVar.d(eVar, eVar2, d10);
    }

    @oy.l
    public final e a() {
        return this.f159616a;
    }

    @oy.l
    public final e b() {
        return this.f159617b;
    }

    public final double c() {
        return this.f159618c;
    }

    @oy.l
    public final f d(@oy.l e performance, @oy.l e crashlytics, double d10) {
        kotlin.jvm.internal.m0.p(performance, "performance");
        kotlin.jvm.internal.m0.p(crashlytics, "crashlytics");
        return new f(performance, crashlytics, d10);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f159616a == fVar.f159616a && this.f159617b == fVar.f159617b && Double.compare(this.f159618c, fVar.f159618c) == 0;
    }

    @oy.l
    public final e f() {
        return this.f159617b;
    }

    @oy.l
    public final e g() {
        return this.f159616a;
    }

    public final double h() {
        return this.f159618c;
    }

    public int hashCode() {
        return (((this.f159616a.hashCode() * 31) + this.f159617b.hashCode()) * 31) + f0.i.a(this.f159618c);
    }

    @oy.l
    public String toString() {
        return "DataCollectionStatus(performance=" + this.f159616a + ", crashlytics=" + this.f159617b + ", sessionSamplingRate=" + this.f159618c + ')';
    }

    public f(@oy.l e performance, @oy.l e crashlytics, double d10) {
        kotlin.jvm.internal.m0.p(performance, "performance");
        kotlin.jvm.internal.m0.p(crashlytics, "crashlytics");
        this.f159616a = performance;
        this.f159617b = crashlytics;
        this.f159618c = d10;
    }

    public /* synthetic */ f(e eVar, e eVar2, double d10, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? e.COLLECTION_SDK_NOT_INSTALLED : eVar, (i10 & 2) != 0 ? e.COLLECTION_SDK_NOT_INSTALLED : eVar2, (i10 & 4) != 0 ? 1.0d : d10);
    }
}
