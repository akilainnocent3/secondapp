package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class tv30 {
    public static final /* synthetic */ tv30[] a = {new tv30("ACTIVE", 0), new tv30("UPCOMING", 1), new tv30("STOPPED", 2), new tv30("PAUSED", 3), new tv30("ENDED", 4), new tv30("ERROR", 5), new tv30("WARNING", 6), new tv30("CLAIM_SUCCESS", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    tv30 EF5;

    public static tv30 valueOf(String str) {
        return (tv30) Enum.valueOf(tv30.class, str);
    }

    public static tv30[] values() {
        return (tv30[]) a.clone();
    }
}
