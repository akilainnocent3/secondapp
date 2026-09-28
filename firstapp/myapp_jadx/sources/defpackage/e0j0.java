package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e0j0 {
    public static final e0j0 a;
    public static final e0j0 b;
    public static final /* synthetic */ e0j0[] c;

    static {
        e0j0 e0j0Var = new e0j0("TIER_1_TRUSTED", 0);
        a = e0j0Var;
        e0j0 e0j0Var2 = new e0j0("TIER_2_WHITELISTED", 1);
        e0j0 e0j0Var3 = new e0j0("TIER_3_UNTRUSTED", 2);
        b = e0j0Var3;
        c = new e0j0[]{e0j0Var, e0j0Var2, e0j0Var3};
    }

    public e0j0() {
        throw null;
    }

    public static e0j0 valueOf(String str) {
        return (e0j0) Enum.valueOf(e0j0.class, str);
    }

    public static e0j0[] values() {
        return (e0j0[]) c.clone();
    }
}
