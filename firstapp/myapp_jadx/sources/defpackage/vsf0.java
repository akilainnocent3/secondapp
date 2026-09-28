package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class vsf0 {
    public static final vsf0 a;
    public static final vsf0 b;
    public static final vsf0 c;
    public static final vsf0 d;
    public static final vsf0 e;
    public static final /* synthetic */ vsf0[] f;

    static {
        vsf0 vsf0Var = new vsf0("MISSION", 0);
        a = vsf0Var;
        vsf0 vsf0Var2 = new vsf0("COLLECT_GIFTS", 1);
        b = vsf0Var2;
        vsf0 vsf0Var3 = new vsf0("USE_GIFTS", 2);
        c = vsf0Var3;
        vsf0 vsf0Var4 = new vsf0("COMPLETED", 3);
        d = vsf0Var4;
        vsf0 vsf0Var5 = new vsf0("LOCKED", 4);
        e = vsf0Var5;
        f = new vsf0[]{vsf0Var, vsf0Var2, vsf0Var3, vsf0Var4, vsf0Var5};
    }

    public vsf0() {
        throw null;
    }

    public static vsf0 valueOf(String str) {
        return (vsf0) Enum.valueOf(vsf0.class, str);
    }

    public static vsf0[] values() {
        return (vsf0[]) f.clone();
    }
}
