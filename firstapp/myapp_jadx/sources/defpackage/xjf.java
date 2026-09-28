package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xjf {
    public static final xjf a;
    public static final xjf b;
    public static final xjf c;
    public static final xjf d;
    public static final /* synthetic */ xjf[] e;

    static {
        xjf xjfVar = new xjf("ONE_X_TWO_UP", 0);
        a = xjfVar;
        xjf xjfVar2 = new xjf("DC_ONE_UP", 1);
        b = xjfVar2;
        xjf xjfVar3 = new xjf("NEVER_DOWN", 2);
        c = xjfVar3;
        xjf xjfVar4 = new xjf("EARLY_GOAL", 3);
        d = xjfVar4;
        e = new xjf[]{xjfVar, xjfVar2, xjfVar3, xjfVar4};
    }

    public xjf() {
        throw null;
    }

    public static xjf valueOf(String str) {
        return (xjf) Enum.valueOf(xjf.class, str);
    }

    public static xjf[] values() {
        return (xjf[]) e.clone();
    }
}
