package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class oy0 {
    public static final oy0 a;
    public static final oy0 b;
    public static final oy0 c;
    public static final oy0 d;
    public static final oy0 e;
    public static final /* synthetic */ oy0[] f;

    static {
        oy0 oy0Var = new oy0("DEFAULT_ASSET", 0);
        a = oy0Var;
        oy0 oy0Var2 = new oy0("UNSUPPORTED", 1);
        b = oy0Var2;
        oy0 oy0Var3 = new oy0("EXPIRED", 2);
        oy0 oy0Var4 = new oy0("IN_REVIEW", 3);
        c = oy0Var4;
        oy0 oy0Var5 = new oy0("VERIFY", 4);
        d = oy0Var5;
        oy0 oy0Var6 = new oy0("RESUBMIT", 5);
        e = oy0Var6;
        f = new oy0[]{oy0Var, oy0Var2, oy0Var3, oy0Var4, oy0Var5, oy0Var6};
    }

    public oy0() {
        throw null;
    }

    public static oy0 valueOf(String str) {
        return (oy0) Enum.valueOf(oy0.class, str);
    }

    public static oy0[] values() {
        return (oy0[]) f.clone();
    }
}
