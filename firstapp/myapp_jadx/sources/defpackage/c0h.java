package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class c0h implements tr, yr {
    public static final c0h c = new c0h(e0h.a);
    public final List<Double> a;
    public final double[] b;

    public c0h(List<Double> list) {
        this.a = list;
        e0h.b(list);
        this.b = list.stream().mapToDouble(new d0h()).toArray();
    }

    @Override // defpackage.yr
    public final boolean a(bj1 bj1Var) {
        int iOrdinal = bj1Var.f.ordinal();
        return iOrdinal == 0 || iOrdinal == 2;
    }

    @Override // defpackage.yr
    public final xr b(bj1 bj1Var, oug ougVar, amv amvVar) {
        return new lze(this.b, new d3c(ougVar, new rug(this.a)), amvVar);
    }

    public final String toString() {
        return "ExplicitBucketHistogramAggregation(" + this.a.toString() + ")";
    }
}
