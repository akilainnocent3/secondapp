package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wtv {
    public static final wtv a;
    public static final wtv b;
    public static final wtv c;
    public static final wtv d;
    public static final /* synthetic */ wtv[] e;

    static {
        wtv wtvVar = new wtv("FreebetGift", 0);
        a = wtvVar;
        wtv wtvVar2 = new wtv("RakebackBoostGift", 1);
        b = wtvVar2;
        wtv wtvVar3 = new wtv("SportyTvWorldCupPass", 2);
        c = wtvVar3;
        wtv wtvVar4 = new wtv("BetslipTheme", 3);
        d = wtvVar4;
        e = new wtv[]{wtvVar, wtvVar2, wtvVar3, wtvVar4};
    }

    public wtv() {
        throw null;
    }

    public static wtv valueOf(String str) {
        return (wtv) Enum.valueOf(wtv.class, str);
    }

    public static wtv[] values() {
        return (wtv[]) e.clone();
    }
}
