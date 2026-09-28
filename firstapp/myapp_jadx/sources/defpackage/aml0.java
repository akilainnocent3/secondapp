package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class aml0 {
    public static final aml0 a;
    public static final aml0 b;
    public static final /* synthetic */ aml0[] c;

    static {
        aml0 aml0Var = new aml0("CONSENT", 0);
        a = aml0Var;
        aml0 aml0Var2 = new aml0("LEGITIMATE_INTEREST", 1);
        aml0 aml0Var3 = new aml0("FLEXIBLE_CONSENT", 2);
        aml0 aml0Var4 = new aml0("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        b = aml0Var4;
        c = new aml0[]{aml0Var, aml0Var2, aml0Var3, aml0Var4};
    }

    public static aml0[] values() {
        return (aml0[]) c.clone();
    }
}
