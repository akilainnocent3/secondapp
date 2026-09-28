package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class hfe0 implements tr, yr {
    public static final hfe0 a = new hfe0();

    @Override // defpackage.yr
    public final boolean a(bj1 bj1Var) {
        int iOrdinal = bj1Var.f.ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4;
    }

    @Override // defpackage.yr
    public final xr b(bj1 bj1Var, oug ougVar, amv amvVar) {
        d3c d3cVar = new d3c(ougVar, new qug(Runtime.getRuntime().availableProcessors(), vx30.a()));
        int iOrdinal = bj1Var.g.ordinal();
        if (iOrdinal == 0) {
            return new skt(bj1Var, d3cVar, amvVar);
        }
        if (iOrdinal == 1) {
            return new a6f(bj1Var, d3cVar, amvVar);
        }
        hb5.a("Invalid instrument value type");
        return null;
    }

    public final String toString() {
        return "SumAggregation";
    }
}
