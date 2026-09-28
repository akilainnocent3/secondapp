package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ku1 {
    public static final ku1 a;
    public static final ku1 b;
    public static final /* synthetic */ ku1[] c;

    static {
        ku1 ku1Var = new ku1("TOP", 0);
        a = ku1Var;
        ku1 ku1Var2 = new ku1("BOTTOM", 1);
        b = ku1Var2;
        c = new ku1[]{ku1Var, ku1Var2};
    }

    public ku1() {
        throw null;
    }

    public static ku1 valueOf(String str) {
        return (ku1) Enum.valueOf(ku1.class, str);
    }

    public static ku1[] values() {
        return (ku1[]) c.clone();
    }
}
