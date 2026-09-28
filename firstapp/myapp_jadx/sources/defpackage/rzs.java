package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rzs {
    public static final rzs a;
    public static final rzs b;
    public static final rzs c;
    public static final rzs d;
    public static final rzs e;
    public static final rzs f;
    public static final rzs i;
    public static final rzs v;
    public static final rzs w;
    public static final /* synthetic */ rzs[] y;

    static {
        rzs rzsVar = new rzs("CMS_DEFAULT", 0);
        a = rzsVar;
        rzs rzsVar2 = new rzs("SPINE", 1);
        b = rzsVar2;
        rzs rzsVar3 = new rzs("SPINE_MATCHMAKING", 2);
        c = rzsVar3;
        rzs rzsVar4 = new rzs("SPINE_GAMEPLAY", 3);
        d = rzsVar4;
        rzs rzsVar5 = new rzs("SESSION_CARDS", 4);
        e = rzsVar5;
        rzs rzsVar6 = new rzs("STATUS_LOBBY", 5);
        f = rzsVar6;
        rzs rzsVar7 = new rzs("STATUS_MATCHMAKING", 6);
        i = rzsVar7;
        rzs rzsVar8 = new rzs("STATUS_GAMEPLAY", 7);
        v = rzsVar8;
        rzs rzsVar9 = new rzs("JOIN_ROOM", 8);
        w = rzsVar9;
        y = new rzs[]{rzsVar, rzsVar2, rzsVar3, rzsVar4, rzsVar5, rzsVar6, rzsVar7, rzsVar8, rzsVar9};
    }

    public rzs() {
        throw null;
    }

    public static rzs valueOf(String str) {
        return (rzs) Enum.valueOf(rzs.class, str);
    }

    public static rzs[] values() {
        return (rzs[]) y.clone();
    }
}
