package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fpc0 {
    public static final fpc0 a;
    public static final fpc0 b;
    public static final /* synthetic */ fpc0[] c;

    static {
        fpc0 fpc0Var = new fpc0("Above", 0);
        a = fpc0Var;
        fpc0 fpc0Var2 = new fpc0("Below", 1);
        b = fpc0Var2;
        c = new fpc0[]{fpc0Var, fpc0Var2};
    }

    public fpc0() {
        throw null;
    }

    public static fpc0 valueOf(String str) {
        return (fpc0) Enum.valueOf(fpc0.class, str);
    }

    public static fpc0[] values() {
        return (fpc0[]) c.clone();
    }
}
