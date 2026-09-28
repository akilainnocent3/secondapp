package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wz5 {
    public static final wz5 a;
    public static final wz5 b;
    public static final wz5 c;
    public static final wz5 d;
    public static final wz5 e;
    public static final wz5 f;
    public static final wz5 i;
    public static final /* synthetic */ wz5[] v;

    static {
        wz5 wz5Var = new wz5("UNKNOWN", 0);
        a = wz5Var;
        wz5 wz5Var2 = new wz5("OFF", 1);
        b = wz5Var2;
        wz5 wz5Var3 = new wz5("ON", 2);
        c = wz5Var3;
        wz5 wz5Var4 = new wz5("ON_AUTO_FLASH", 3);
        d = wz5Var4;
        wz5 wz5Var5 = new wz5("ON_ALWAYS_FLASH", 4);
        e = wz5Var5;
        wz5 wz5Var6 = new wz5("ON_AUTO_FLASH_REDEYE", 5);
        f = wz5Var6;
        wz5 wz5Var7 = new wz5("ON_EXTERNAL_FLASH", 6);
        i = wz5Var7;
        v = new wz5[]{wz5Var, wz5Var2, wz5Var3, wz5Var4, wz5Var5, wz5Var6, wz5Var7};
    }

    public wz5() {
        throw null;
    }

    public static wz5 valueOf(String str) {
        return (wz5) Enum.valueOf(wz5.class, str);
    }

    public static wz5[] values() {
        return (wz5[]) v.clone();
    }
}
