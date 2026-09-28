package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ckf {
    public static final ckf a;
    public static final ckf b;
    public static final ckf c;
    public static final ckf d;
    public static final ckf e;
    public static final /* synthetic */ ckf[] f;

    static {
        ckf ckfVar = new ckf("ONE_X_TWO_ONE_UP", 0);
        a = ckfVar;
        ckf ckfVar2 = new ckf("ONE_X_TWO_TWO_UP", 1);
        b = ckfVar2;
        ckf ckfVar3 = new ckf("OVER_UNDER_EARLY_GOALS", 2);
        c = ckfVar3;
        ckf ckfVar4 = new ckf("DOUBLE_CHANCE_ONE_UP", 3);
        d = ckfVar4;
        ckf ckfVar5 = new ckf("ONE_X_TWO_NEVER_DOWN", 4);
        e = ckfVar5;
        f = new ckf[]{ckfVar, ckfVar2, ckfVar3, ckfVar4, ckfVar5};
    }

    public ckf() {
        throw null;
    }

    public static ckf valueOf(String str) {
        return (ckf) Enum.valueOf(ckf.class, str);
    }

    public static ckf[] values() {
        return (ckf[]) f.clone();
    }
}
