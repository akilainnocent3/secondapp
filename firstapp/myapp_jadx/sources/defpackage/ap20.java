package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ap20 {
    public static final ap20 a;
    public static final ap20 b;
    public static final ap20 c;
    public static final ap20 d;
    public static final /* synthetic */ ap20[] e;

    static {
        ap20 ap20Var = new ap20("RED", 0);
        a = ap20Var;
        ap20 ap20Var2 = new ap20("GREEN", 1);
        b = ap20Var2;
        ap20 ap20Var3 = new ap20("BLUE", 2);
        c = ap20Var3;
        ap20 ap20Var4 = new ap20("ROBOTIC", 3);
        d = ap20Var4;
        e = new ap20[]{ap20Var, ap20Var2, ap20Var3, ap20Var4};
    }

    public ap20() {
        throw null;
    }

    public static ap20 valueOf(String str) {
        return (ap20) Enum.valueOf(ap20.class, str);
    }

    public static ap20[] values() {
        return (ap20[]) e.clone();
    }
}
