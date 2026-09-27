package n0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class n extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f115672s = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f115673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f115674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f115675r;

    public n(String str) {
        this.f115556a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f115673p = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        this.f115674q = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    @Override // n0.d
    public double a(double d10) {
        return e(d10);
    }

    @Override // n0.d
    public double b(double d10) {
        return d(d10);
    }

    public final double d(double d10) {
        double d11 = this.f115674q;
        if (d10 < d11) {
            double d12 = this.f115673p;
            return ((d12 * d11) * d11) / ((((d11 - d10) * d12) + d10) * ((d12 * (d11 - d10)) + d10));
        }
        double d13 = this.f115673p;
        return (((d11 - 1.0d) * d13) * (d11 - 1.0d)) / (((((-d13) * (d11 - d10)) - d10) + 1.0d) * ((((-d13) * (d11 - d10)) - d10) + 1.0d));
    }

    public final double e(double d10) {
        double d11 = this.f115674q;
        return d10 < d11 ? (d11 * d10) / (d10 + (this.f115673p * (d11 - d10))) : ((1.0d - d11) * (d10 - 1.0d)) / ((1.0d - d10) - (this.f115673p * (d11 - d10)));
    }
}
