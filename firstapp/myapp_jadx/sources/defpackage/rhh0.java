package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rhh0 {
    public static final rhh0 a;
    public static final rhh0 b;
    public static final /* synthetic */ rhh0[] c;

    static {
        rhh0 rhh0Var = new rhh0("ONE_X_TWO", 0);
        a = rhh0Var;
        rhh0 rhh0Var2 = new rhh0("DOUBLE_CHANCE", 1);
        b = rhh0Var2;
        c = new rhh0[]{rhh0Var, rhh0Var2};
    }

    public rhh0() {
        throw null;
    }

    public static rhh0 valueOf(String str) {
        return (rhh0) Enum.valueOf(rhh0.class, str);
    }

    public static rhh0[] values() {
        return (rhh0[]) c.clone();
    }
}
