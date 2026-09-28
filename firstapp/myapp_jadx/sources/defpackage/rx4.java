package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rx4 {
    public static final rx4 a;
    public static final rx4 b;
    public static final rx4 c;
    public static final /* synthetic */ rx4[] d;

    static {
        rx4 rx4Var = new rx4("None", 0);
        a = rx4Var;
        rx4 rx4Var2 = new rx4("CheckBetHistory", 1);
        b = rx4Var2;
        rx4 rx4Var3 = new rx4("OpenSports", 2);
        c = rx4Var3;
        d = new rx4[]{rx4Var, rx4Var2, rx4Var3};
    }

    public rx4() {
        throw null;
    }

    public static rx4 valueOf(String str) {
        return (rx4) Enum.valueOf(rx4.class, str);
    }

    public static rx4[] values() {
        return (rx4[]) d.clone();
    }
}
