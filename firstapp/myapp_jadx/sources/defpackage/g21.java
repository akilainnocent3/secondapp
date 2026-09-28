package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g21 {
    public static final g21 a;
    public static final g21 b;
    public static final g21 c;
    public static final g21 d;
    public static final g21 e;
    public static final g21 f;
    public static final g21 i;
    public static final g21 v;
    public static final /* synthetic */ g21[] w;

    static {
        g21 g21Var = new g21("STRING", 0);
        a = g21Var;
        g21 g21Var2 = new g21("BOOLEAN", 1);
        b = g21Var2;
        g21 g21Var3 = new g21("LONG", 2);
        c = g21Var3;
        g21 g21Var4 = new g21("DOUBLE", 3);
        d = g21Var4;
        g21 g21Var5 = new g21("STRING_ARRAY", 4);
        e = g21Var5;
        g21 g21Var6 = new g21("BOOLEAN_ARRAY", 5);
        f = g21Var6;
        g21 g21Var7 = new g21("LONG_ARRAY", 6);
        i = g21Var7;
        g21 g21Var8 = new g21("DOUBLE_ARRAY", 7);
        v = g21Var8;
        w = new g21[]{g21Var, g21Var2, g21Var3, g21Var4, g21Var5, g21Var6, g21Var7, g21Var8};
    }

    public g21() {
        throw null;
    }

    public static g21 valueOf(String str) {
        return (g21) Enum.valueOf(g21.class, str);
    }

    public static g21[] values() {
        return (g21[]) w.clone();
    }
}
