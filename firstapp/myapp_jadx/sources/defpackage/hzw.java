package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hzw {
    public static final hzw a;
    public static final hzw b;
    public static final hzw c;
    public static final hzw d;
    public static final hzw e;
    public static final /* synthetic */ hzw[] f;

    /* JADX INFO: Fake field, exist only in values array */
    hzw EF0;

    static {
        hzw hzwVar = new hzw("SPORTS", 0);
        hzw hzwVar2 = new hzw("LEAGUES", 1);
        a = hzwVar2;
        hzw hzwVar3 = new hzw("TEAMS", 2);
        b = hzwVar3;
        hzw hzwVar4 = new hzw("MARKETS", 3);
        c = hzwVar4;
        hzw hzwVar5 = new hzw("ODDS_RANGE", 4);
        d = hzwVar5;
        hzw hzwVar6 = new hzw("DEFAULT_STAKE", 5);
        e = hzwVar6;
        f = new hzw[]{hzwVar, hzwVar2, hzwVar3, hzwVar4, hzwVar5, hzwVar6};
    }

    public hzw() {
        throw null;
    }

    public static hzw valueOf(String str) {
        return (hzw) Enum.valueOf(hzw.class, str);
    }

    public static hzw[] values() {
        return (hzw[]) f.clone();
    }
}
