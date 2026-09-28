package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lw20 {
    public static final lw20 a;
    public static final lw20 b;
    public static final lw20 c;
    public static final lw20 d;
    public static final /* synthetic */ lw20[] e;

    static {
        lw20 lw20Var = new lw20("IMMEDIATE", 0);
        a = lw20Var;
        lw20 lw20Var2 = new lw20("HIGH", 1);
        b = lw20Var2;
        lw20 lw20Var3 = new lw20("NORMAL", 2);
        c = lw20Var3;
        lw20 lw20Var4 = new lw20("LOW", 3);
        d = lw20Var4;
        e = new lw20[]{lw20Var, lw20Var2, lw20Var3, lw20Var4};
    }

    public lw20() {
        throw null;
    }

    public static lw20 valueOf(String str) {
        return (lw20) Enum.valueOf(lw20.class, str);
    }

    public static lw20[] values() {
        return (lw20[]) e.clone();
    }
}
