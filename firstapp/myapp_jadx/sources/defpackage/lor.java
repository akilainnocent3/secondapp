package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class lor implements tr, yr {
    public static final lor a = new lor();

    @Override // defpackage.yr
    public final boolean a(bj1 bj1Var) {
        lso lsoVar = bj1Var.f;
        return lsoVar == lso.e || lsoVar == lso.f;
    }

    @Override // defpackage.yr
    public final xr b(bj1 bj1Var, oug ougVar, amv amvVar) {
        d3c d3cVar = new d3c(ougVar, new qug(Runtime.getRuntime().availableProcessors(), vx30.a()));
        int iOrdinal = bj1Var.g.ordinal();
        if (iOrdinal == 0) {
            return new bkt(d3cVar, amvVar);
        }
        if (iOrdinal == 1) {
            return new rze(d3cVar, amvVar);
        }
        hb5.a("Invalid instrument value type");
        return null;
    }

    public final String toString() {
        return "LastValueAggregation";
    }
}
