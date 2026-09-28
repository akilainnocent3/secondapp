package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class x300 {
    public static final x300 a;
    public static final x300 b;
    public static final /* synthetic */ x300[] c;

    static {
        x300 x300Var = new x300("FromSavedAssets", 0);
        a = x300Var;
        x300 x300Var2 = new x300("FromApi", 1);
        b = x300Var2;
        c = new x300[]{x300Var, x300Var2};
    }

    public x300() {
        throw null;
    }

    public static x300 valueOf(String str) {
        return (x300) Enum.valueOf(x300.class, str);
    }

    public static x300[] values() {
        return (x300[]) c.clone();
    }
}
