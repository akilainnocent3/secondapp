package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class z270 {
    public final ex4 a;
    public final psm b;
    public final jpk c;
    public final wwd0 d = xwd0.a(null);
    public final wwd0 e = xwd0.a(a.c);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("VISIBLE_FOR_SINGLE_BETSLIP_TYPE", 0);
            a = aVar;
            a aVar2 = new a("VISIBLE_FOR_MULTIPLE_BETSLIP_TYPE", 1);
            b = aVar2;
            a aVar3 = new a("HIDDEN", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public z270(ex4 ex4Var, psm psmVar, jpk jpkVar, ht90 ht90Var, hn9 hn9Var, omw omwVar, rmw rmwVar) {
        this.a = ex4Var;
        this.b = psmVar;
        this.c = jpkVar;
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, a.c));
    }

    public final void b(bz3 bz3Var) {
        wwd0 wwd0Var;
        Object value;
        a aVar;
        bz3Var.getClass();
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
            int iOrdinal = bz3Var.ordinal();
            if (iOrdinal == 0) {
                aVar = a.a;
            } else if (iOrdinal == 1) {
                aVar = a.b;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                aVar = a.c;
            }
        } while (!wwd0Var.g(value, aVar));
    }
}
