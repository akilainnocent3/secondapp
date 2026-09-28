package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yz5 {
    public static final yz5 a;
    public static final yz5 b;
    public static final yz5 c;
    public static final yz5 d;
    public static final /* synthetic */ yz5[] e;

    static {
        yz5 yz5Var = new yz5("UNKNOWN", 0);
        a = yz5Var;
        yz5 yz5Var2 = new yz5("OFF", 1);
        b = yz5Var2;
        yz5 yz5Var3 = new yz5("ON_MANUAL_AUTO", 2);
        c = yz5Var3;
        yz5 yz5Var4 = new yz5("ON_CONTINUOUS_AUTO", 3);
        d = yz5Var4;
        e = new yz5[]{yz5Var, yz5Var2, yz5Var3, yz5Var4};
    }

    public yz5() {
        throw null;
    }

    public static yz5 valueOf(String str) {
        return (yz5) Enum.valueOf(yz5.class, str);
    }

    public static yz5[] values() {
        return (yz5[]) e.clone();
    }
}
