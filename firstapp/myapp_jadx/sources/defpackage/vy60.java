package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vy60 {
    public static final vy60 a;
    public static final vy60 b;
    public static final /* synthetic */ vy60[] c;

    static {
        vy60 vy60Var = new vy60("FILL", 0);
        a = vy60Var;
        vy60 vy60Var2 = new vy60("FIT", 1);
        b = vy60Var2;
        c = new vy60[]{vy60Var, vy60Var2};
    }

    public vy60() {
        throw null;
    }

    public static vy60 valueOf(String str) {
        return (vy60) Enum.valueOf(vy60.class, str);
    }

    public static vy60[] values() {
        return (vy60[]) c.clone();
    }
}
