package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class anp {
    public final bnp a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("TINK", 0);
            a = aVar;
            a aVar2 = new a("LEGACY", 1);
            a aVar3 = new a("RAW", 2);
            b = aVar3;
            c = new a[]{aVar, aVar2, aVar3, new a("CRUNCHY", 3)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public anp(bnp bnpVar) {
        this.a = bnpVar;
    }
}
