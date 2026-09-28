package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rl0 {
    public static final rl0 a;
    public static final rl0 b;
    public static final rl0 c;
    public static final rl0 d;
    public static final /* synthetic */ rl0[] e;

    static {
        rl0 rl0Var = new rl0("NONE", 0);
        a = rl0Var;
        rl0 rl0Var2 = new rl0("ODDS_CHANGED", 1);
        b = rl0Var2;
        rl0 rl0Var3 = new rl0("LOW_RETURN", 2);
        c = rl0Var3;
        rl0 rl0Var4 = new rl0("ODDS_CHANGED_AND_LOW_RETURN", 3);
        d = rl0Var4;
        e = new rl0[]{rl0Var, rl0Var2, rl0Var3, rl0Var4};
    }

    public rl0() {
        throw null;
    }

    public static rl0 valueOf(String str) {
        return (rl0) Enum.valueOf(rl0.class, str);
    }

    public static rl0[] values() {
        return (rl0[]) e.clone();
    }
}
