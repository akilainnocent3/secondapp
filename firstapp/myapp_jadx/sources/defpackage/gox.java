package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class gox {
    public static final gox a;
    public static final gox b;
    public static final gox c;
    public static final gox d;
    public static final gox e;
    public static final gox f;
    public static final gox i;
    public static final gox v;
    public static final /* synthetic */ gox[] w;

    static {
        gox goxVar = new gox("IS_AVAILABLE", 0);
        a = goxVar;
        gox goxVar2 = new gox("USER_VALIDATION", 1);
        b = goxVar2;
        gox goxVar3 = new gox("START", 2);
        c = goxVar3;
        gox goxVar4 = new gox("RESUME", 3);
        d = goxVar4;
        gox goxVar5 = new gox("CLAIM", 4);
        e = goxVar5;
        gox goxVar6 = new gox("FINISH", 5);
        f = goxVar6;
        gox goxVar7 = new gox("CAMPAIGN", 6);
        i = goxVar7;
        gox goxVar8 = new gox("SEARCH", 7);
        v = goxVar8;
        w = new gox[]{goxVar, goxVar2, goxVar3, goxVar4, goxVar5, goxVar6, goxVar7, goxVar8};
    }

    public gox() {
        throw null;
    }

    public static gox valueOf(String str) {
        return (gox) Enum.valueOf(gox.class, str);
    }

    public static gox[] values() {
        return (gox[]) w.clone();
    }
}
