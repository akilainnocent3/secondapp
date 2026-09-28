package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class mz6 {
    public static final mz6 a;
    public static final mz6 b;
    public static final /* synthetic */ mz6[] c;

    /* JADX INFO: Fake field, exist only in values array */
    mz6 EF0;

    static {
        mz6 mz6Var = new mz6("LOYALTY_TIER_CHALLENGE", 0);
        mz6 mz6Var2 = new mz6("LOYALTY_SPECIAL_GROUP_CHALLENGE", 1);
        a = mz6Var2;
        mz6 mz6Var3 = new mz6("UNKNOWN", 2);
        b = mz6Var3;
        c = new mz6[]{mz6Var, mz6Var2, mz6Var3};
    }

    public mz6() {
        throw null;
    }

    public static mz6 valueOf(String str) {
        return (mz6) Enum.valueOf(mz6.class, str);
    }

    public static mz6[] values() {
        return (mz6[]) c.clone();
    }
}
