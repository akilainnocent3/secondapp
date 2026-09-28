package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class lkf {
    public static final lkf a;
    public static final lkf b;
    public static final lkf c;
    public static final lkf d;
    public static final lkf e;
    public static final /* synthetic */ lkf[] f;

    static {
        lkf lkfVar = new lkf("HOME_PAGE", 0);
        a = lkfVar;
        lkf lkfVar2 = new lkf("LIVE_PAGE", 1);
        b = lkfVar2;
        lkf lkfVar3 = new lkf("SPORT_PAGE", 2);
        c = lkfVar3;
        lkf lkfVar4 = new lkf("SEARCH_PAGE", 3);
        d = lkfVar4;
        lkf lkfVar5 = new lkf("FAVORITES_PAGE", 4);
        e = lkfVar5;
        f = new lkf[]{lkfVar, lkfVar2, lkfVar3, lkfVar4, lkfVar5};
    }

    public lkf() {
        throw null;
    }

    public static lkf valueOf(String str) {
        return (lkf) Enum.valueOf(lkf.class, str);
    }

    public static lkf[] values() {
        return (lkf[]) f.clone();
    }
}
