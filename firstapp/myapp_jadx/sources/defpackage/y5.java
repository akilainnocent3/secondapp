package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class y5 {
    public static final y5 a;
    public static final y5 b;
    public static final y5 c;
    public static final /* synthetic */ y5[] d;

    static {
        y5 y5Var = new y5("SHOW_REGISTRATION_KYC_PAGE", 0);
        a = y5Var;
        y5 y5Var2 = new y5("SUCCESS", 1);
        b = y5Var2;
        y5 y5Var3 = new y5("ERROR", 2);
        c = y5Var3;
        d = new y5[]{y5Var, y5Var2, y5Var3};
    }

    public y5() {
        throw null;
    }

    public static y5 valueOf(String str) {
        return (y5) Enum.valueOf(y5.class, str);
    }

    public static y5[] values() {
        return (y5[]) d.clone();
    }
}
