package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class auy {
    public static final auy a;
    public static final auy b;
    public static final auy c;
    public static final auy d;
    public static final auy e;
    public static final auy f;
    public static final /* synthetic */ auy[] i;

    static {
        auy auyVar = new auy("LIVE_UPCOMING_PREMATCH", 0);
        a = auyVar;
        auy auyVar2 = new auy("LIVE_CURRENT", 1);
        b = auyVar2;
        auy auyVar3 = new auy("SPORT_PREMATCH", 2);
        c = auyVar3;
        auy auyVar4 = new auy("SPORT_LIVE", 3);
        d = auyVar4;
        auy auyVar5 = new auy("SEARCH_PREMATCH", 4);
        e = auyVar5;
        auy auyVar6 = new auy("SEARCH_LIVE", 5);
        f = auyVar6;
        i = new auy[]{auyVar, auyVar2, auyVar3, auyVar4, auyVar5, auyVar6};
    }

    public auy() {
        throw null;
    }

    public static auy valueOf(String str) {
        return (auy) Enum.valueOf(auy.class, str);
    }

    public static auy[] values() {
        return (auy[]) i.clone();
    }
}
