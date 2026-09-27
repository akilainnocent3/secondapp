package wh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f143133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w6 f143134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f143135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f143136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t6 f143137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t6 f143138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t6 f143139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t6 f143140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t6 f143141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t6 f143142k = t6.c(25.0d, 84.0d);

    public l(m mVar, w6 w6Var, boolean z10, double d10, t6 t6Var, t6 t6Var2, t6 t6Var3, t6 t6Var4, t6 t6Var5) {
        this.f143132a = mVar.k();
        this.f143133b = mVar;
        this.f143134c = w6Var;
        this.f143135d = z10;
        this.f143136e = d10;
        this.f143137f = t6Var;
        this.f143138g = t6Var2;
        this.f143139h = t6Var3;
        this.f143140i = t6Var4;
        this.f143141j = t6Var5;
    }

    public static double a(m mVar, double[] dArr, double[] dArr2) {
        double d10 = mVar.d();
        int i10 = 0;
        if (dArr2.length == 1) {
            return w5.g(d10 + dArr2[0]);
        }
        int length = dArr.length;
        while (i10 <= length - 2) {
            double d11 = dArr[i10];
            int i11 = i10 + 1;
            double d12 = dArr[i11];
            if (d11 < d10 && d10 < d12) {
                return w5.g(d10 + dArr2[i10]);
            }
            i10 = i11;
        }
        return d10;
    }
}
