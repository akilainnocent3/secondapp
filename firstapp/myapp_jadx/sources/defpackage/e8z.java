package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e8z {
    public static final e8z a;
    public static final e8z b;
    public static final e8z c;
    public static final e8z d;
    public static final e8z e;
    public static final e8z f;
    public static final e8z i;
    public static final e8z v;
    public static final /* synthetic */ e8z[] w;

    static {
        e8z e8zVar = new e8z("HOME_SCREEN_TODAY", 0);
        a = e8zVar;
        e8z e8zVar2 = new e8z("HOME_SCREEN_HIGHLIGHTS", 1);
        b = e8zVar2;
        e8z e8zVar3 = new e8z("HOME_SCREEN_LIVE", 2);
        c = e8zVar3;
        e8z e8zVar4 = new e8z("HOME_SCREEN_FEATURED", 3);
        d = e8zVar4;
        e8z e8zVar5 = new e8z("DETAIL_SCREEN", 4);
        e = e8zVar5;
        e8z e8zVar6 = new e8z("SEARCH_RESULT", 5);
        f = e8zVar6;
        e8z e8zVar7 = new e8z("FAVORITES", 6);
        i = e8zVar7;
        e8z e8zVar8 = new e8z("UPCOMING", 7);
        v = e8zVar8;
        w = new e8z[]{e8zVar, e8zVar2, e8zVar3, e8zVar4, e8zVar5, e8zVar6, e8zVar7, e8zVar8};
    }

    public e8z() {
        throw null;
    }

    public static e8z valueOf(String str) {
        return (e8z) Enum.valueOf(e8z.class, str);
    }

    public static e8z[] values() {
        return (e8z[]) w.clone();
    }
}
