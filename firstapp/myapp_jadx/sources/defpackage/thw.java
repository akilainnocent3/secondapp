package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class thw {
    public static final thw a;
    public static final thw b;
    public static final thw c;
    public static final thw d;
    public static final /* synthetic */ thw[] e;

    static {
        thw thwVar = new thw("LEAGUE", 0);
        a = thwVar;
        thw thwVar2 = new thw("MARKET", 1);
        b = thwVar2;
        thw thwVar3 = new thw("TIME_RANGE", 2);
        c = thwVar3;
        thw thwVar4 = new thw("ODDS", 3);
        d = thwVar4;
        e = new thw[]{thwVar, thwVar2, thwVar3, thwVar4};
    }

    public thw() {
        throw null;
    }

    public static thw valueOf(String str) {
        return (thw) Enum.valueOf(thw.class, str);
    }

    public static thw[] values() {
        return (thw[]) e.clone();
    }
}
