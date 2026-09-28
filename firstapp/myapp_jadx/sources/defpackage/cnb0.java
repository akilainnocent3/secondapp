package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class cnb0 {
    public static final cnb0 a;
    public static final cnb0 b;
    public static final cnb0 c;
    public static final cnb0 d;
    public static final cnb0 e;
    public static final /* synthetic */ cnb0[] f;

    static {
        cnb0 cnb0Var = new cnb0("MultiplierPowering", 0);
        a = cnb0Var;
        cnb0 cnb0Var2 = new cnb0("MultiplierOngoing", 1);
        b = cnb0Var2;
        cnb0 cnb0Var3 = new cnb0("StagedMultiplierPowering", 2);
        c = cnb0Var3;
        cnb0 cnb0Var4 = new cnb0("StagedMultiplierOngoing", 3);
        d = cnb0Var4;
        cnb0 cnb0Var5 = new cnb0("CarOverlay", 4);
        e = cnb0Var5;
        f = new cnb0[]{cnb0Var, cnb0Var2, cnb0Var3, cnb0Var4, cnb0Var5};
    }

    public cnb0() {
        throw null;
    }

    public static cnb0 valueOf(String str) {
        return (cnb0) Enum.valueOf(cnb0.class, str);
    }

    public static cnb0[] values() {
        return (cnb0[]) f.clone();
    }
}
