package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class me1 {
    public static final me1 a;
    public static final me1 b;
    public static final /* synthetic */ me1[] c;

    static {
        me1 me1Var = new me1("ALL_LIVE", 0);
        a = me1Var;
        me1 me1Var2 = new me1("ALL_LIVE_DYNAMIC_MARKETS", 1);
        b = me1Var2;
        c = new me1[]{me1Var, me1Var2};
    }

    public me1() {
        throw null;
    }

    public static me1 valueOf(String str) {
        return (me1) Enum.valueOf(me1.class, str);
    }

    public static me1[] values() {
        return (me1[]) c.clone();
    }
}
