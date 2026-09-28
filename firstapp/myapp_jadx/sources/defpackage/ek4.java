package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ek4 {
    public static final ek4 a;
    public static final ek4 b;
    public static final ek4 c;
    public static final ek4 d;
    public static final /* synthetic */ ek4[] e;

    static {
        ek4 ek4Var = new ek4("NORMAL_BALL", 0);
        a = ek4Var;
        ek4 ek4Var2 = new ek4("GOLDEN_BALL", 1);
        b = ek4Var2;
        ek4 ek4Var3 = new ek4("YELLOW_CARD", 2);
        c = ek4Var3;
        ek4 ek4Var4 = new ek4("RED_CARD", 3);
        d = ek4Var4;
        e = new ek4[]{ek4Var, ek4Var2, ek4Var3, ek4Var4};
    }

    public ek4() {
        throw null;
    }

    public static ek4 valueOf(String str) {
        return (ek4) Enum.valueOf(ek4.class, str);
    }

    public static ek4[] values() {
        return (ek4[]) e.clone();
    }
}
