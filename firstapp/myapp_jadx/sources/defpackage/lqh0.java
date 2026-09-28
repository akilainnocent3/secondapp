package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lqh0 {
    public static final lqh0 a;
    public static final lqh0 b;
    public static final lqh0 c;
    public static final lqh0 d;
    public static final /* synthetic */ lqh0[] e;

    static {
        lqh0 lqh0Var = new lqh0("Checking", 0);
        a = lqh0Var;
        lqh0 lqh0Var2 = new lqh0("AllowEdit", 1);
        b = lqh0Var2;
        lqh0 lqh0Var3 = new lqh0("Blocked", 2);
        c = lqh0Var3;
        lqh0 lqh0Var4 = new lqh0("WarnEmptyCodeDeletion", 3);
        d = lqh0Var4;
        e = new lqh0[]{lqh0Var, lqh0Var2, lqh0Var3, lqh0Var4};
    }

    public lqh0() {
        throw null;
    }

    public static lqh0 valueOf(String str) {
        return (lqh0) Enum.valueOf(lqh0.class, str);
    }

    public static lqh0[] values() {
        return (lqh0[]) e.clone();
    }
}
