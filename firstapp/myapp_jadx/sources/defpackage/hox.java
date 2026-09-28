package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class hox {
    public static final hox a;
    public static final hox b;
    public static final hox c;
    public static final hox d;
    public static final hox e;
    public static final hox f;
    public static final hox i;
    public static final /* synthetic */ hox[] v;

    static {
        hox hoxVar = new hox("USER_VALIDATION", 0);
        a = hoxVar;
        hox hoxVar2 = new hox("AVAILABLE", 1);
        b = hoxVar2;
        hox hoxVar3 = new hox("START", 2);
        c = hoxVar3;
        hox hoxVar4 = new hox("GET_STATUS", 3);
        d = hoxVar4;
        hox hoxVar5 = new hox("CLAIM", 4);
        e = hoxVar5;
        hox hoxVar6 = new hox("CAMPAIGN", 5);
        f = hoxVar6;
        hox hoxVar7 = new hox("SEARCH", 6);
        i = hoxVar7;
        v = new hox[]{hoxVar, hoxVar2, hoxVar3, hoxVar4, hoxVar5, hoxVar6, hoxVar7};
    }

    public hox() {
        throw null;
    }

    public static hox valueOf(String str) {
        return (hox) Enum.valueOf(hox.class, str);
    }

    public static hox[] values() {
        return (hox[]) v.clone();
    }
}
