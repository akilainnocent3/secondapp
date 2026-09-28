package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class pt1 {
    public static final pt1 a;
    public static final /* synthetic */ pt1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    pt1 EF0;

    static {
        pt1 pt1Var = new pt1("ERROR", 0);
        pt1 pt1Var2 = new pt1("DROP_OLDEST", 1);
        a = pt1Var2;
        b = new pt1[]{pt1Var, pt1Var2, new pt1("DROP_LATEST", 2)};
    }

    public pt1() {
        throw null;
    }

    public static pt1 valueOf(String str) {
        return (pt1) Enum.valueOf(pt1.class, str);
    }

    public static pt1[] values() {
        return (pt1[]) b.clone();
    }
}
