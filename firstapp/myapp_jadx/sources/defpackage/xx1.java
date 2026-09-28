package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class xx1 implements tr, yr {
    public static final xx1 a = new xx1();

    @Override // defpackage.yr
    public final boolean a(bj1 bj1Var) {
        int iOrdinal = bj1Var.f.ordinal();
        return iOrdinal == 0 || iOrdinal == 2;
    }

    @Override // defpackage.yr
    public final xr b(bj1 bj1Var, oug ougVar, amv amvVar) {
        return new dze(new d3c(ougVar, new qug(Runtime.getRuntime().availableProcessors(), vx30.a())), amvVar);
    }

    public final String toString() {
        return "Base2ExponentialHistogramAggregation{maxBuckets=160,maxScale=20}";
    }
}
