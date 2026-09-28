package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class i8s {
    public static final i8s a;
    public static final i8s b;
    public static final i8s c;
    public static final /* synthetic */ i8s[] d;

    static {
        i8s i8sVar = new i8s("ACCEPTED", 0);
        a = i8sVar;
        i8s i8sVar2 = new i8s("REJECTED_BY_BET_OR_MARKET", 1);
        b = i8sVar2;
        i8s i8sVar3 = new i8s("REJECTED_BY_BOOKING_CODE", 2);
        c = i8sVar3;
        d = new i8s[]{i8sVar, i8sVar2, i8sVar3};
    }

    public i8s() {
        throw null;
    }

    public static i8s valueOf(String str) {
        return (i8s) Enum.valueOf(i8s.class, str);
    }

    public static i8s[] values() {
        return (i8s[]) d.clone();
    }
}
