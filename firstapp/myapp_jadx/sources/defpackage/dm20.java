package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dm20 {
    public static final dm20 a;
    public static final dm20 b;
    public static final /* synthetic */ dm20[] c;

    static {
        dm20 dm20Var = new dm20("EXACT", 0);
        a = dm20Var;
        dm20 dm20Var2 = new dm20("INEXACT", 1);
        b = dm20Var2;
        c = new dm20[]{dm20Var, dm20Var2};
    }

    public dm20() {
        throw null;
    }

    public static dm20 valueOf(String str) {
        return (dm20) Enum.valueOf(dm20.class, str);
    }

    public static dm20[] values() {
        return (dm20[]) c.clone();
    }
}
