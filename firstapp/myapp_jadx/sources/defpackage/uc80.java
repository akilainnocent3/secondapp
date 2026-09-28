package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uc80 {
    public static int f;
    public final int a;
    public final dnf0[] b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a[] b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("hold", 0);
            a = aVar;
            c = new a[]{aVar, new a("once", 1), new a("loop", 2), new a("pingpong", 3), new a("onceReverse", 4), new a("loopReverse", 5), new a("pingpongReverse", 6)};
            b = values();
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

    public uc80(int i) {
        int i2;
        synchronized (uc80.class) {
            i2 = f;
            f = i2 + 1;
        }
        this.a = i2;
        this.b = new dnf0[i];
    }

    public final void a(g1a0 g1a0Var, jel jelVar) {
        int length = g1a0Var.f;
        if (length == -1) {
            length = this.e;
        }
        dnf0[] dnf0VarArr = this.b;
        if (length >= dnf0VarArr.length) {
            length = dnf0VarArr.length - 1;
        }
        dnf0 dnf0Var = dnf0VarArr[length];
        if (jelVar.d() != dnf0Var) {
            jelVar.b(dnf0Var);
            jelVar.c();
        }
    }
}
