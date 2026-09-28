package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xia0 {
    public static final xia0 a;
    public static final xia0 b;
    public static final /* synthetic */ xia0[] c;

    static {
        xia0 xia0Var = new xia0("WINNER", 0);
        a = xia0Var;
        xia0 xia0Var2 = new xia0("SUGGESTED", 1);
        b = xia0Var2;
        c = new xia0[]{xia0Var, xia0Var2};
    }

    public xia0() {
        throw null;
    }

    public static xia0 valueOf(String str) {
        return (xia0) Enum.valueOf(xia0.class, str);
    }

    public static xia0[] values() {
        return (xia0[]) c.clone();
    }
}
