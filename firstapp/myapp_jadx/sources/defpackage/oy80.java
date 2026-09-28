package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy80 implements a0b {
    public final a a;
    public final be0 b;
    public final be0 c;
    public final be0 d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SIMULTANEOUSLY", 0);
            a = aVar;
            a aVar2 = new a("INDIVIDUALLY", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
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

    public oy80(String str, a aVar, be0 be0Var, be0 be0Var2, be0 be0Var3, boolean z) {
        this.a = aVar;
        this.b = be0Var;
        this.c = be0Var2;
        this.d = be0Var3;
        this.e = z;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new ywg0(w12Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
