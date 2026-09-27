package is;

import cs.g;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f99170a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    public static final double f99171b = Math.log(2.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @g
    public static final double f99172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g
    public static final double f99173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @g
    public static final double f99174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @g
    public static final double f99175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @g
    public static final double f99176g;

    static {
        double dUlp = Math.ulp(1.0d);
        f99172c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f99173d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f99174e = dSqrt2;
        double d10 = 1;
        f99175f = d10 / dSqrt;
        f99176g = d10 / dSqrt2;
    }
}
