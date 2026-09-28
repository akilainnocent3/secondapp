package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class aak {
    public static final aak a;
    public static final aak b;
    public static final aak c;
    public static final aak d;
    public static final aak e;
    public static final aak f;
    public static final aak i;
    public static final aak v;
    public static final /* synthetic */ aak[] w;

    static {
        aak aakVar = new aak("EARLY_GOALS_SELECTION", 0);
        a = aakVar;
        aak aakVar2 = new aak("EARLY_GOALS_INSURE", 1);
        b = aakVar2;
        aak aakVar3 = new aak("ONE_UP_TWO_UP_SELECTION", 2);
        c = aakVar3;
        aak aakVar4 = new aak("ONE_UP_TWO_UP_INSURE", 3);
        d = aakVar4;
        aak aakVar5 = new aak("NEVER_DOWN_SELECTION", 4);
        e = aakVar5;
        aak aakVar6 = new aak("PLACE_BET_OUTCOME_VALIDATION", 5);
        f = aakVar6;
        aak aakVar7 = new aak("INITIALIZATION", 6);
        i = aakVar7;
        aak aakVar8 = new aak("REFRESH", 7);
        v = aakVar8;
        w = new aak[]{aakVar, aakVar2, aakVar3, aakVar4, aakVar5, aakVar6, aakVar7, aakVar8};
    }

    public aak() {
        throw null;
    }

    public static aak valueOf(String str) {
        return (aak) Enum.valueOf(aak.class, str);
    }

    public static aak[] values() {
        return (aak[]) w.clone();
    }
}
