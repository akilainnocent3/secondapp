package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ylf0 {
    public static final ylf0 a;
    public static final ylf0 b;
    public static final /* synthetic */ ylf0[] c;

    static {
        ylf0 ylf0Var = new ylf0("PERCENT", 0);
        a = ylf0Var;
        ylf0 ylf0Var2 = new ylf0("INDEX", 1);
        b = ylf0Var2;
        c = new ylf0[]{ylf0Var, ylf0Var2};
    }

    public ylf0() {
        throw null;
    }

    public static ylf0 valueOf(String str) {
        return (ylf0) Enum.valueOf(ylf0.class, str);
    }

    public static ylf0[] values() {
        return (ylf0[]) c.clone();
    }
}
