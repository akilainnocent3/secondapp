package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class edg {
    public static final edg a;
    public static final edg b;
    public static final edg c;
    public static final edg d;
    public static final edg e;
    public static final edg f;
    public static final edg i;
    public static final /* synthetic */ edg[] v;

    static {
        edg edgVar = new edg("ONE", 0);
        a = edgVar;
        edg edgVar2 = new edg("TWO", 1);
        b = edgVar2;
        edg edgVar3 = new edg("THREE", 2);
        c = edgVar3;
        edg edgVar4 = new edg("FOUR", 3);
        d = edgVar4;
        edg edgVar5 = new edg("FIVE", 4);
        e = edgVar5;
        edg edgVar6 = new edg("SIX", 5);
        f = edgVar6;
        edg edgVar7 = new edg("SPORTY", 6);
        i = edgVar7;
        v = new edg[]{edgVar, edgVar2, edgVar3, edgVar4, edgVar5, edgVar6, edgVar7};
    }

    public edg() {
        throw null;
    }

    public static edg valueOf(String str) {
        return (edg) Enum.valueOf(edg.class, str);
    }

    public static edg[] values() {
        return (edg[]) v.clone();
    }
}
