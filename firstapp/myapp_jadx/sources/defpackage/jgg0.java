package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class jgg0 {
    public static final jgg0 a;
    public static final jgg0 b;
    public static final jgg0 c;
    public static final jgg0 d;
    public static final /* synthetic */ jgg0[] e;

    static {
        jgg0 jgg0Var = new jgg0("RANK_DATA", 0);
        a = jgg0Var;
        jgg0 jgg0Var2 = new jgg0("LEADERBOARD_DATA", 1);
        b = jgg0Var2;
        jgg0 jgg0Var3 = new jgg0("TOURNAMENT_STATUS", 2);
        c = jgg0Var3;
        jgg0 jgg0Var4 = new jgg0("TOURNAMENT_INFO", 3);
        d = jgg0Var4;
        e = new jgg0[]{jgg0Var, jgg0Var2, jgg0Var3, jgg0Var4};
    }

    public jgg0() {
        throw null;
    }

    public static jgg0 valueOf(String str) {
        return (jgg0) Enum.valueOf(jgg0.class, str);
    }

    public static jgg0[] values() {
        return (jgg0[]) e.clone();
    }
}
