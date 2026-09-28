package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i0p {
    public static final i0p a;
    public static final i0p b;
    public static final i0p c;
    public static final i0p d;
    public static final /* synthetic */ i0p[] e;

    static {
        i0p i0pVar = new i0p("LookaheadMeasurement", 0);
        a = i0pVar;
        i0p i0pVar2 = new i0p("LookaheadPlacement", 1);
        b = i0pVar2;
        i0p i0pVar3 = new i0p("Measurement", 2);
        c = i0pVar3;
        i0p i0pVar4 = new i0p("Placement", 3);
        d = i0pVar4;
        e = new i0p[]{i0pVar, i0pVar2, i0pVar3, i0pVar4};
    }

    public i0p() {
        throw null;
    }

    public static i0p valueOf(String str) {
        return (i0p) Enum.valueOf(i0p.class, str);
    }

    public static i0p[] values() {
        return (i0p[]) e.clone();
    }
}
