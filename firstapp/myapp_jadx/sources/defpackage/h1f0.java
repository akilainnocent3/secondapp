package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h1f0 {
    public static final h1f0 a;
    public static final h1f0 b;
    public static final h1f0 c;
    public static final /* synthetic */ h1f0[] d;

    static {
        h1f0 h1f0Var = new h1f0("NONE", 0);
        a = h1f0Var;
        h1f0 h1f0Var2 = new h1f0("NEW", 1);
        b = h1f0Var2;
        h1f0 h1f0Var3 = new h1f0("CHECKED", 2);
        c = h1f0Var3;
        d = new h1f0[]{h1f0Var, h1f0Var2, h1f0Var3};
    }

    public h1f0() {
        throw null;
    }

    public static h1f0 valueOf(String str) {
        return (h1f0) Enum.valueOf(h1f0.class, str);
    }

    public static h1f0[] values() {
        return (h1f0[]) d.clone();
    }
}
