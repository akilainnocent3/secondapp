package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class yp70 {
    public static final yp70 a;
    public static final yp70 b;
    public static final yp70 c;
    public static final yp70 d;
    public static final /* synthetic */ yp70[] e;

    static {
        yp70 yp70Var = new yp70("TAB_SCROLL", 0);
        a = yp70Var;
        yp70 yp70Var2 = new yp70("TAB_DONE", 1);
        b = yp70Var2;
        yp70 yp70Var3 = new yp70("MANUAL_SCROLL", 2);
        c = yp70Var3;
        yp70 yp70Var4 = new yp70("MANUAL_DONE", 3);
        d = yp70Var4;
        e = new yp70[]{yp70Var, yp70Var2, yp70Var3, yp70Var4};
    }

    public yp70() {
        throw null;
    }

    public static yp70 valueOf(String str) {
        return (yp70) Enum.valueOf(yp70.class, str);
    }

    public static yp70[] values() {
        return (yp70[]) e.clone();
    }
}
