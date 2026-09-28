package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xp40 {
    public static final xp40 a;
    public static final xp40 b;
    public static final /* synthetic */ xp40[] c;

    static {
        xp40 xp40Var = new xp40("STANDARD_MOTION", 0);
        a = xp40Var;
        xp40 xp40Var2 = new xp40("REDUCED_MOTION", 1);
        b = xp40Var2;
        c = new xp40[]{xp40Var, xp40Var2};
    }

    public xp40() {
        throw null;
    }

    public static xp40 valueOf(String str) {
        return (xp40) Enum.valueOf(xp40.class, str);
    }

    public static xp40[] values() {
        return (xp40[]) c.clone();
    }
}
