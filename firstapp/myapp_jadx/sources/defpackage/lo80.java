package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class lo80 {
    public static final lo80 a;
    public static final lo80 b;
    public static final lo80 c;
    public static final /* synthetic */ lo80[] d;

    static {
        lo80 lo80Var = new lo80("NORMAL", 0);
        a = lo80Var;
        lo80 lo80Var2 = new lo80("GIF", 1);
        b = lo80Var2;
        lo80 lo80Var3 = new lo80("BITMAP", 2);
        c = lo80Var3;
        d = new lo80[]{lo80Var, lo80Var2, lo80Var3};
    }

    public lo80() {
        throw null;
    }

    public static lo80 valueOf(String str) {
        return (lo80) Enum.valueOf(lo80.class, str);
    }

    public static lo80[] values() {
        return (lo80[]) d.clone();
    }
}
