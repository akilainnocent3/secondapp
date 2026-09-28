package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a06 {
    public static final a06 a;
    public static final a06 b;
    public static final a06 c;
    public static final a06 d;
    public static final a06 e;
    public static final a06 f;
    public static final a06 i;
    public static final a06 v;
    public static final a06 w;
    public static final a06 y;
    public static final /* synthetic */ a06[] z;

    static {
        a06 a06Var = new a06("UNKNOWN", 0);
        a = a06Var;
        a06 a06Var2 = new a06("OFF", 1);
        b = a06Var2;
        a06 a06Var3 = new a06("AUTO", 2);
        c = a06Var3;
        a06 a06Var4 = new a06("INCANDESCENT", 3);
        d = a06Var4;
        a06 a06Var5 = new a06("FLUORESCENT", 4);
        e = a06Var5;
        a06 a06Var6 = new a06("WARM_FLUORESCENT", 5);
        f = a06Var6;
        a06 a06Var7 = new a06("DAYLIGHT", 6);
        i = a06Var7;
        a06 a06Var8 = new a06("CLOUDY_DAYLIGHT", 7);
        v = a06Var8;
        a06 a06Var9 = new a06("TWILIGHT", 8);
        w = a06Var9;
        a06 a06Var10 = new a06("SHADE", 9);
        y = a06Var10;
        z = new a06[]{a06Var, a06Var2, a06Var3, a06Var4, a06Var5, a06Var6, a06Var7, a06Var8, a06Var9, a06Var10};
    }

    public a06() {
        throw null;
    }

    public static a06 valueOf(String str) {
        return (a06) Enum.valueOf(a06.class, str);
    }

    public static a06[] values() {
        return (a06[]) z.clone();
    }
}
