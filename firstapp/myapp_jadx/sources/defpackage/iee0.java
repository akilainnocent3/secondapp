package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class iee0 {
    public static final iee0 a;
    public static final iee0 b;
    public static final /* synthetic */ iee0[] c;

    static {
        iee0 iee0Var = new iee0("MATCHMAKING", 0);
        a = iee0Var;
        iee0 iee0Var2 = new iee0("GAMEPLAY", 1);
        b = iee0Var2;
        c = new iee0[]{iee0Var, iee0Var2};
    }

    public iee0() {
        throw null;
    }

    public static iee0 valueOf(String str) {
        return (iee0) Enum.valueOf(iee0.class, str);
    }

    public static iee0[] values() {
        return (iee0[]) c.clone();
    }
}
