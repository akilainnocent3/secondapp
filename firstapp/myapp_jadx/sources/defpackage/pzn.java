package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class pzn {
    public final uy0 a;
    public final ex4 b;
    public final vxw c;
    public final psm d;
    public final nzm e;
    public final jpk f;
    public final k5b g;
    public final wwd0 h = xwd0.a(null);
    public final wwd0 i = xwd0.a(null);
    public final wwd0 j = xwd0.a(a.b);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("VISIBLE", 0);
            a = aVar;
            a aVar2 = new a("GONE", 1);
            b = aVar2;
            a aVar3 = new a("MANUALLY_GONE", 2);
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

    public pzn(uy0 uy0Var, ex4 ex4Var, vxw vxwVar, psm psmVar, nzm nzmVar, jpk jpkVar, ht90 ht90Var, hn9 hn9Var, k5b k5bVar) {
        this.a = uy0Var;
        this.b = ex4Var;
        this.c = vxwVar;
        this.d = psmVar;
        this.e = nzmVar;
        this.f = jpkVar;
        this.g = k5bVar;
    }
}
