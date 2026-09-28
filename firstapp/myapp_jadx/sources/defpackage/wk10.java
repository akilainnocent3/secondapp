package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wk10 {
    public static final wk10 a;
    public static final wk10 b;
    public static final wk10 c;
    public static final wk10 d;
    public static final wk10 e;
    public static final /* synthetic */ wk10[] f;

    static {
        wk10 wk10Var = new wk10("ANDROID", 0);
        a = wk10Var;
        wk10 wk10Var2 = new wk10("IOS", 1);
        b = wk10Var2;
        wk10 wk10Var3 = new wk10("WEB", 2);
        c = wk10Var3;
        wk10 wk10Var4 = new wk10("WAP", 3);
        d = wk10Var4;
        wk10 wk10Var5 = new wk10("UNKNOWN", 4);
        e = wk10Var5;
        f = new wk10[]{wk10Var, wk10Var2, wk10Var3, wk10Var4, wk10Var5};
    }

    public wk10() {
        throw null;
    }

    public static wk10 valueOf(String str) {
        return (wk10) Enum.valueOf(wk10.class, str);
    }

    public static wk10[] values() {
        return (wk10[]) f.clone();
    }
}
