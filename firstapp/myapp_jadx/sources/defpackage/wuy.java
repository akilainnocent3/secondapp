package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wuy {
    public static final wuy a;
    public static final wuy b;
    public static final wuy c;
    public static final wuy d;
    public static final wuy e;
    public static final /* synthetic */ wuy[] f;

    static {
        wuy wuyVar = new wuy("HOME_PAGE", 0);
        a = wuyVar;
        wuy wuyVar2 = new wuy("LIVE_PAGE", 1);
        b = wuyVar2;
        wuy wuyVar3 = new wuy("SPORT_PAGE", 2);
        c = wuyVar3;
        wuy wuyVar4 = new wuy("SEARCH_PAGE", 3);
        d = wuyVar4;
        wuy wuyVar5 = new wuy("FAVORITES_PAGE", 4);
        e = wuyVar5;
        f = new wuy[]{wuyVar, wuyVar2, wuyVar3, wuyVar4, wuyVar5};
    }

    public wuy() {
        throw null;
    }

    public static wuy valueOf(String str) {
        return (wuy) Enum.valueOf(wuy.class, str);
    }

    public static wuy[] values() {
        return (wuy[]) f.clone();
    }
}
