package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g040 {
    public static final g040 a;
    public static final g040 b;
    public static final g040 c;
    public static final /* synthetic */ g040[] d;

    static {
        g040 g040Var = new g040("ENDTHUMB", 0);
        a = g040Var;
        g040 g040Var2 = new g040("STARTTHUMB", 1);
        b = g040Var2;
        g040 g040Var3 = new g040("TRACK", 2);
        c = g040Var3;
        d = new g040[]{g040Var, g040Var2, g040Var3};
    }

    public g040() {
        throw null;
    }

    public static g040 valueOf(String str) {
        return (g040) Enum.valueOf(g040.class, str);
    }

    public static g040[] values() {
        return (g040[]) d.clone();
    }
}
