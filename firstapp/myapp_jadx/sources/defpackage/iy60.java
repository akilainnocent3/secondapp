package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iy60 {
    public static final iy60 a;
    public static final iy60 b;
    public static final iy60 c;
    public static final iy60 d;
    public static final iy60 e;
    public static final /* synthetic */ iy60[] f;

    static {
        iy60 iy60Var = new iy60("TopBar", 0);
        a = iy60Var;
        iy60 iy60Var2 = new iy60("MainContent", 1);
        b = iy60Var2;
        iy60 iy60Var3 = new iy60("Snackbar", 2);
        c = iy60Var3;
        iy60 iy60Var4 = new iy60("Fab", 3);
        d = iy60Var4;
        iy60 iy60Var5 = new iy60("BottomBar", 4);
        e = iy60Var5;
        f = new iy60[]{iy60Var, iy60Var2, iy60Var3, iy60Var4, iy60Var5};
    }

    public iy60() {
        throw null;
    }

    public static iy60 valueOf(String str) {
        return (iy60) Enum.valueOf(iy60.class, str);
    }

    public static iy60[] values() {
        return (iy60[]) f.clone();
    }
}
