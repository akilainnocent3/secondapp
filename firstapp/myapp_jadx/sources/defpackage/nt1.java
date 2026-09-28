package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nt1 {
    public static final nt1 a;
    public static final nt1 b;
    public static final /* synthetic */ nt1[] c;

    static {
        nt1 nt1Var = new nt1("EXPONENTIAL", 0);
        a = nt1Var;
        nt1 nt1Var2 = new nt1("LINEAR", 1);
        b = nt1Var2;
        c = new nt1[]{nt1Var, nt1Var2};
    }

    public nt1() {
        throw null;
    }

    public static nt1 valueOf(String str) {
        return (nt1) Enum.valueOf(nt1.class, str);
    }

    public static nt1[] values() {
        return (nt1[]) c.clone();
    }
}
