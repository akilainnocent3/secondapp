package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ao10 {
    public static final ao10 a;
    public static final ao10 b;
    public static final /* synthetic */ ao10[] c;

    static {
        ao10 ao10Var = new ao10("PLAY_TIME_CONTROL_SELF_EXCLUSION", 0);
        a = ao10Var;
        ao10 ao10Var2 = new ao10("PLAY_TIME_CONTROL_TIME_OUT", 1);
        b = ao10Var2;
        c = new ao10[]{ao10Var, ao10Var2};
    }

    public static ao10 valueOf(String str) {
        return (ao10) Enum.valueOf(ao10.class, str);
    }

    public static ao10[] values() {
        return (ao10[]) c.clone();
    }
}
