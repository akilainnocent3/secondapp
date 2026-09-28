package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lg50 {
    public static final lg50 a;
    public static final lg50 b;
    public static final /* synthetic */ lg50[] c;

    static {
        lg50 lg50Var = new lg50("Ltr", 0);
        a = lg50Var;
        lg50 lg50Var2 = new lg50("Rtl", 1);
        b = lg50Var2;
        c = new lg50[]{lg50Var, lg50Var2};
    }

    public lg50() {
        throw null;
    }

    public static lg50 valueOf(String str) {
        return (lg50) Enum.valueOf(lg50.class, str);
    }

    public static lg50[] values() {
        return (lg50[]) c.clone();
    }
}
