package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wqb0 {
    public static final wqb0 a;
    public static final wqb0 b;
    public static final wqb0 c;
    public static final wqb0 d;
    public static final /* synthetic */ wqb0[] e;

    static {
        wqb0 wqb0Var = new wqb0("ALL_BETS", 0);
        a = wqb0Var;
        wqb0 wqb0Var2 = new wqb0("MY_BETS", 1);
        b = wqb0Var2;
        wqb0 wqb0Var3 = new wqb0("TOP_WINS", 2);
        c = wqb0Var3;
        wqb0 wqb0Var4 = new wqb0("ELITE", 3);
        d = wqb0Var4;
        e = new wqb0[]{wqb0Var, wqb0Var2, wqb0Var3, wqb0Var4};
    }

    public wqb0() {
        throw null;
    }

    public static wqb0 valueOf(String str) {
        return (wqb0) Enum.valueOf(wqb0.class, str);
    }

    public static wqb0[] values() {
        return (wqb0[]) e.clone();
    }
}
