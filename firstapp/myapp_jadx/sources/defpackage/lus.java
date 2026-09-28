package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lus {
    public static final lus a;
    public static final lus b;
    public static final /* synthetic */ lus[] c;

    static {
        lus lusVar = new lus("LoginRequired", 0);
        a = lusVar;
        lus lusVar2 = new lus("FirstDepositRequired", 1);
        b = lusVar2;
        c = new lus[]{lusVar, lusVar2};
    }

    public lus() {
        throw null;
    }

    public static lus valueOf(String str) {
        return (lus) Enum.valueOf(lus.class, str);
    }

    public static lus[] values() {
        return (lus[]) c.clone();
    }
}
