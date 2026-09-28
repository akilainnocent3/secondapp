package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class z83 {
    public static final z83 a;
    public static final z83 b;
    public static final z83 c;
    public static final z83 d;
    public static final /* synthetic */ z83[] e;

    static {
        z83 z83Var = new z83("BET", 0);
        a = z83Var;
        z83 z83Var2 = new z83("CASH_OUT", 1);
        b = z83Var2;
        z83 z83Var3 = new z83("WAITING", 2);
        c = z83Var3;
        z83 z83Var4 = new z83("ONE_TAP_SHOWN", 3);
        d = z83Var4;
        e = new z83[]{z83Var, z83Var2, z83Var3, z83Var4};
    }

    public z83() {
        throw null;
    }

    public static z83 valueOf(String str) {
        return (z83) Enum.valueOf(z83.class, str);
    }

    public static z83[] values() {
        return (z83[]) e.clone();
    }
}
