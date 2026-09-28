package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h0f0 {
    public static final h0f0 a;
    public static final h0f0 b;
    public static final /* synthetic */ h0f0[] c;

    static {
        h0f0 h0f0Var = new h0f0("Manual", 0);
        a = h0f0Var;
        h0f0 h0f0Var2 = new h0f0("Auto", 1);
        b = h0f0Var2;
        c = new h0f0[]{h0f0Var, h0f0Var2};
    }

    public h0f0() {
        throw null;
    }

    public static h0f0 valueOf(String str) {
        return (h0f0) Enum.valueOf(h0f0.class, str);
    }

    public static h0f0[] values() {
        return (h0f0[]) c.clone();
    }
}
