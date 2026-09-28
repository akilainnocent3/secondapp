package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class qt1 {
    public static final qt1 a;
    public static final qt1 b;
    public static final /* synthetic */ qt1[] c;

    static {
        qt1 qt1Var = new qt1("MISSING", 0);
        a = qt1Var;
        qt1 qt1Var2 = new qt1("ERROR", 1);
        qt1 qt1Var3 = new qt1("BUFFER", 2);
        b = qt1Var3;
        c = new qt1[]{qt1Var, qt1Var2, qt1Var3, new qt1("DROP", 3), new qt1("LATEST", 4)};
    }

    public qt1() {
        throw null;
    }

    public static qt1 valueOf(String str) {
        return (qt1) Enum.valueOf(qt1.class, str);
    }

    public static qt1[] values() {
        return (qt1[]) c.clone();
    }
}
