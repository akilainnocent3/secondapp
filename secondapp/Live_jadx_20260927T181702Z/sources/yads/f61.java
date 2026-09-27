package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e61 f148988a = new e61(co2.E, co2.D, co2.F, co2.G);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e61 f148989b = new e61(co2.f147830p, co2.f147829o, co2.f147831q, co2.f147832r);

    public static e61 a(va vaVar) {
        int iOrdinal = vaVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return f148988a;
        }
        if (iOrdinal == 2) {
            return f148989b;
        }
        throw new dr.o0();
    }
}
