package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class wqa0 {
    public static final wqa0 a;
    public static final wqa0 b;
    public static final wqa0 c;
    public static final wqa0 d;
    public static final wqa0 e;
    public static final /* synthetic */ wqa0[] f;

    static {
        wqa0 wqa0Var = new wqa0("INTERNAL", 0);
        a = wqa0Var;
        wqa0 wqa0Var2 = new wqa0("SERVER", 1);
        b = wqa0Var2;
        wqa0 wqa0Var3 = new wqa0("CLIENT", 2);
        c = wqa0Var3;
        wqa0 wqa0Var4 = new wqa0("PRODUCER", 3);
        d = wqa0Var4;
        wqa0 wqa0Var5 = new wqa0("CONSUMER", 4);
        e = wqa0Var5;
        f = new wqa0[]{wqa0Var, wqa0Var2, wqa0Var3, wqa0Var4, wqa0Var5};
    }

    public wqa0() {
        throw null;
    }

    public static wqa0 valueOf(String str) {
        return (wqa0) Enum.valueOf(wqa0.class, str);
    }

    public static wqa0[] values() {
        return (wqa0[]) f.clone();
    }
}
