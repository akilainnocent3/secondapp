package wh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t6 f143077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t6 f143078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t6 f143079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t6 f143080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t6 f143081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t6 f143082f;

    public f(int i10, boolean z10) {
        m mVarB = m.b(i10);
        double d10 = mVarB.d();
        double dC = mVarB.c();
        if (z10) {
            this.f143077a = t6.c(d10, dC);
            this.f143078b = t6.c(d10, dC / 3.0d);
            this.f143079c = t6.c(60.0d + d10, dC / 2.0d);
            this.f143080d = t6.c(d10, Math.min(dC / 12.0d, 4.0d));
            this.f143081e = t6.c(d10, Math.min(dC / 6.0d, 8.0d));
        } else {
            this.f143077a = t6.c(d10, Math.max(48.0d, dC));
            this.f143078b = t6.c(d10, 16.0d);
            this.f143079c = t6.c(60.0d + d10, 24.0d);
            this.f143080d = t6.c(d10, 4.0d);
            this.f143081e = t6.c(d10, 8.0d);
        }
        this.f143082f = t6.c(25.0d, 84.0d);
    }

    public static f a(int i10) {
        return new f(i10, true);
    }

    public static f b(int i10) {
        return new f(i10, false);
    }
}
