package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class wbj0 {
    public static final wbj0 a;
    public static final wbj0 b;
    public static final wbj0 c;
    public static final /* synthetic */ wbj0[] d;

    static {
        wbj0 wbj0Var = new wbj0("ENABLED", 0);
        a = wbj0Var;
        wbj0 wbj0Var2 = new wbj0("DISABLED", 1);
        b = wbj0Var2;
        wbj0 wbj0Var3 = new wbj0("LOADING", 2);
        c = wbj0Var3;
        d = new wbj0[]{wbj0Var, wbj0Var2, wbj0Var3};
    }

    public wbj0() {
        throw null;
    }

    public static wbj0 valueOf(String str) {
        return (wbj0) Enum.valueOf(wbj0.class, str);
    }

    public static wbj0[] values() {
        return (wbj0[]) d.clone();
    }
}
