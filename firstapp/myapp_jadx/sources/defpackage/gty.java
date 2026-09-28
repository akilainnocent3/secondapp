package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class gty {
    public static final gty a;
    public static final gty b;
    public static final gty c;
    public static final gty d;
    public static final gty e;
    public static final gty f;
    public static final /* synthetic */ gty[] i;

    static {
        gty gtyVar = new gty("HOME_PAGE", 0);
        a = gtyVar;
        gty gtyVar2 = new gty("LIVE_PAGE", 1);
        b = gtyVar2;
        gty gtyVar3 = new gty("SPORT_PAGE", 2);
        c = gtyVar3;
        gty gtyVar4 = new gty("MY_FAVORITES_PAGE", 3);
        d = gtyVar4;
        gty gtyVar5 = new gty("SEARCH_RESULTS_PAGE", 4);
        e = gtyVar5;
        gty gtyVar6 = new gty("UNSUPPORTED", 5);
        f = gtyVar6;
        i = new gty[]{gtyVar, gtyVar2, gtyVar3, gtyVar4, gtyVar5, gtyVar6};
    }

    public gty() {
        throw null;
    }

    public static gty valueOf(String str) {
        return (gty) Enum.valueOf(gty.class, str);
    }

    public static gty[] values() {
        return (gty[]) i.clone();
    }
}
