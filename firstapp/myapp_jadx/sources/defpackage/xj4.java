package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xj4 {
    public static final xj4 a;
    public static final xj4 b;
    public static final xj4 c;
    public static final /* synthetic */ xj4[] d;

    static {
        xj4 xj4Var = new xj4("TIME_UP", 0);
        a = xj4Var;
        xj4 xj4Var2 = new xj4("BONUS_BUDGET_EXHAUSTED", 1);
        xj4 xj4Var3 = new xj4("TWO_YELLOW_CARDS", 2);
        b = xj4Var3;
        xj4 xj4Var4 = new xj4("RED_CARD", 3);
        c = xj4Var4;
        d = new xj4[]{xj4Var, xj4Var2, xj4Var3, xj4Var4};
    }

    public xj4() {
        throw null;
    }

    public static xj4 valueOf(String str) {
        return (xj4) Enum.valueOf(xj4.class, str);
    }

    public static xj4[] values() {
        return (xj4[]) d.clone();
    }
}
