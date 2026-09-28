package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xyi0 {
    public static final xyi0 a;
    public static final xyi0 b;
    public static final /* synthetic */ xyi0[] c;

    static {
        xyi0 xyi0Var = new xyi0("MATCHMAKING", 0);
        a = xyi0Var;
        xyi0 xyi0Var2 = new xyi0("GAMEPLAY", 1);
        b = xyi0Var2;
        c = new xyi0[]{xyi0Var, xyi0Var2};
    }

    public xyi0() {
        throw null;
    }

    public static xyi0 valueOf(String str) {
        return (xyi0) Enum.valueOf(xyi0.class, str);
    }

    public static xyi0[] values() {
        return (xyi0[]) c.clone();
    }
}
