package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sox {
    public static final sox a;
    public static final sox b;
    public static final sox c;
    public static final sox d;
    public static final sox e;
    public static final sox f;
    public static final /* synthetic */ sox[] i;

    static {
        sox soxVar = new sox("NOT_REQUIRED", 0);
        a = soxVar;
        sox soxVar2 = new sox("CONNECTED", 1);
        b = soxVar2;
        sox soxVar3 = new sox("UNMETERED", 2);
        c = soxVar3;
        sox soxVar4 = new sox("NOT_ROAMING", 3);
        d = soxVar4;
        sox soxVar5 = new sox("METERED", 4);
        e = soxVar5;
        sox soxVar6 = new sox("TEMPORARILY_UNMETERED", 5);
        f = soxVar6;
        i = new sox[]{soxVar, soxVar2, soxVar3, soxVar4, soxVar5, soxVar6};
    }

    public sox() {
        throw null;
    }

    public static sox valueOf(String str) {
        return (sox) Enum.valueOf(sox.class, str);
    }

    public static sox[] values() {
        return (sox[]) i.clone();
    }
}
