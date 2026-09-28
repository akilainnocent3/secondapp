package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ts4 {
    public static final ts4 a;
    public static final ts4 b;
    public static final ts4 c;
    public static final /* synthetic */ ts4[] d;

    static {
        ts4 ts4Var = new ts4("STAKE_AMOUNT", 0);
        a = ts4Var;
        ts4 ts4Var2 = new ts4("BET_COUNT", 1);
        b = ts4Var2;
        ts4 ts4Var3 = new ts4("UNKNOWN", 2);
        c = ts4Var3;
        d = new ts4[]{ts4Var, ts4Var2, ts4Var3};
    }

    public ts4() {
        throw null;
    }

    public static ts4 valueOf(String str) {
        return (ts4) Enum.valueOf(ts4.class, str);
    }

    public static ts4[] values() {
        return (ts4[]) d.clone();
    }
}
