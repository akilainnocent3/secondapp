package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ctv {
    public static final ctv a;
    public static final ctv b;
    public static final ctv c;
    public static final ctv d;
    public static final ctv e;
    public static final /* synthetic */ ctv[] f;

    static {
        ctv ctvVar = new ctv("Completed", 0);
        a = ctvVar;
        ctv ctvVar2 = new ctv("AlmostComplete", 1);
        b = ctvVar2;
        ctv ctvVar3 = new ctv("WarningOneDayLeft", 2);
        c = ctvVar3;
        ctv ctvVar4 = new ctv("WarningTwoDaysLeft", 3);
        d = ctvVar4;
        ctv ctvVar5 = new ctv("InProgress", 4);
        e = ctvVar5;
        f = new ctv[]{ctvVar, ctvVar2, ctvVar3, ctvVar4, ctvVar5};
    }

    public ctv() {
        throw null;
    }

    public static ctv valueOf(String str) {
        return (ctv) Enum.valueOf(ctv.class, str);
    }

    public static ctv[] values() {
        return (ctv[]) f.clone();
    }
}
