package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class xzd0 {
    public static final xzd0 a;
    public static final xzd0 b;
    public static final xzd0 c;
    public static final /* synthetic */ xzd0[] d;

    static {
        xzd0 xzd0Var = new xzd0("UNSET", 0);
        a = xzd0Var;
        xzd0 xzd0Var2 = new xzd0("OK", 1);
        b = xzd0Var2;
        xzd0 xzd0Var3 = new xzd0("ERROR", 2);
        c = xzd0Var3;
        d = new xzd0[]{xzd0Var, xzd0Var2, xzd0Var3};
    }

    public xzd0() {
        throw null;
    }

    public static xzd0 valueOf(String str) {
        return (xzd0) Enum.valueOf(xzd0.class, str);
    }

    public static xzd0[] values() {
        return (xzd0[]) d.clone();
    }
}
