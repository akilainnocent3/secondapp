package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class qtv {
    public static final qtv a;
    public static final qtv b;
    public static final qtv c;
    public static final qtv d;
    public static final /* synthetic */ qtv[] e;

    static {
        qtv qtvVar = new qtv("BetAmount", 0);
        a = qtvVar;
        qtv qtvVar2 = new qtv("DepositAmount", 1);
        b = qtvVar2;
        qtv qtvVar3 = new qtv("PlaceCount", 2);
        c = qtvVar3;
        qtv qtvVar4 = new qtv("NonBet", 3);
        d = qtvVar4;
        e = new qtv[]{qtvVar, qtvVar2, qtvVar3, qtvVar4};
    }

    public qtv() {
        throw null;
    }

    public static qtv valueOf(String str) {
        return (qtv) Enum.valueOf(qtv.class, str);
    }

    public static qtv[] values() {
        return (qtv[]) e.clone();
    }
}
