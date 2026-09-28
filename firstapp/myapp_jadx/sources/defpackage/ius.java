package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ius {
    public static final ius a;
    public static final ius b;
    public static final ius c;
    public static final /* synthetic */ ius[] d;

    static {
        ius iusVar = new ius("Loading", 0);
        a = iusVar;
        ius iusVar2 = new ius("LoginRequired", 1);
        b = iusVar2;
        ius iusVar3 = new ius("FirstTimeDepositRequired", 2);
        c = iusVar3;
        d = new ius[]{iusVar, iusVar2, iusVar3};
    }

    public ius() {
        throw null;
    }

    public static ius valueOf(String str) {
        return (ius) Enum.valueOf(ius.class, str);
    }

    public static ius[] values() {
        return (ius[]) d.clone();
    }
}
