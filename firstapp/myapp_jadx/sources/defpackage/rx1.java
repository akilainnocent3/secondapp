package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rx1 {
    public static final rx1 a;
    public static final rx1 b;
    public static final rx1 c;
    public static final rx1 d;
    public static final rx1 e;
    public static final rx1 f;
    public static final /* synthetic */ rx1[] i;

    static {
        rx1 rx1Var = new rx1("Join", 0);
        a = rx1Var;
        rx1 rx1Var2 = new rx1("Timer", 1);
        b = rx1Var2;
        rx1 rx1Var3 = new rx1("PlaceFirstBet", 2);
        c = rx1Var3;
        rx1 rx1Var4 = new rx1("InPrizeRange", 3);
        d = rx1Var4;
        rx1 rx1Var5 = new rx1("OutOfPrizeRange", 4);
        e = rx1Var5;
        rx1 rx1Var6 = new rx1("Stopped", 5);
        f = rx1Var6;
        i = new rx1[]{rx1Var, rx1Var2, rx1Var3, rx1Var4, rx1Var5, rx1Var6};
    }

    public rx1() {
        throw null;
    }

    public static rx1 valueOf(String str) {
        return (rx1) Enum.valueOf(rx1.class, str);
    }

    public static rx1[] values() {
        return (rx1[]) i.clone();
    }
}
