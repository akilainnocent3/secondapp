package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wia0 {
    public static final a a;
    public static final wia0 b;
    public static final wia0 c;
    public static final wia0 d;
    public static final /* synthetic */ wia0[] e;

    public static final class a {
    }

    static {
        wia0 wia0Var = new wia0("FOLLOWING", 0);
        b = wia0Var;
        wia0 wia0Var2 = new wia0("SUGGESTED", 1);
        c = wia0Var2;
        wia0 wia0Var3 = new wia0("POPULAR", 2);
        d = wia0Var3;
        e = new wia0[]{wia0Var, wia0Var2, wia0Var3};
        a = new a();
    }

    public wia0() {
        throw null;
    }

    public static wia0 valueOf(String str) {
        return (wia0) Enum.valueOf(wia0.class, str);
    }

    public static wia0[] values() {
        return (wia0[]) e.clone();
    }
}
