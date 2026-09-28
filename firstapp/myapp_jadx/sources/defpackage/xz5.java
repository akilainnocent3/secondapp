package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xz5 {
    public static final xz5 a;
    public static final xz5 b;
    public static final xz5 c;
    public static final xz5 d;
    public static final xz5 e;
    public static final xz5 f;
    public static final /* synthetic */ xz5[] i;

    static {
        xz5 xz5Var = new xz5("UNKNOWN", 0);
        a = xz5Var;
        xz5 xz5Var2 = new xz5("INACTIVE", 1);
        b = xz5Var2;
        xz5 xz5Var3 = new xz5("SEARCHING", 2);
        c = xz5Var3;
        xz5 xz5Var4 = new xz5("FLASH_REQUIRED", 3);
        d = xz5Var4;
        xz5 xz5Var5 = new xz5("CONVERGED", 4);
        e = xz5Var5;
        xz5 xz5Var6 = new xz5("LOCKED", 5);
        f = xz5Var6;
        i = new xz5[]{xz5Var, xz5Var2, xz5Var3, xz5Var4, xz5Var5, xz5Var6};
    }

    public xz5() {
        throw null;
    }

    public static xz5 valueOf(String str) {
        return (xz5) Enum.valueOf(xz5.class, str);
    }

    public static xz5[] values() {
        return (xz5[]) i.clone();
    }
}
