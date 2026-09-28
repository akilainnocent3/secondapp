package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lg10 {
    public static final lg10 a;
    public static final lg10 b;
    public static final /* synthetic */ lg10[] c;

    static {
        lg10 lg10Var = new lg10("UNCHANGED", 0);
        a = lg10Var;
        lg10 lg10Var2 = new lg10("TRANSLUCENT", 1);
        lg10 lg10Var3 = new lg10("OPAQUE", 2);
        b = lg10Var3;
        c = new lg10[]{lg10Var, lg10Var2, lg10Var3};
    }

    public lg10() {
        throw null;
    }

    public static lg10 valueOf(String str) {
        return (lg10) Enum.valueOf(lg10.class, str);
    }

    public static lg10[] values() {
        return (lg10[]) c.clone();
    }
}
