package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 {
    public static final ph0 a;
    public static final ph0 b;
    public static final /* synthetic */ ph0[] c;

    static {
        ph0 ph0Var = new ph0("BoundReached", 0);
        a = ph0Var;
        ph0 ph0Var2 = new ph0("Finished", 1);
        b = ph0Var2;
        c = new ph0[]{ph0Var, ph0Var2};
    }

    public ph0() {
        throw null;
    }

    public static ph0 valueOf(String str) {
        return (ph0) Enum.valueOf(ph0.class, str);
    }

    public static ph0[] values() {
        return (ph0[]) c.clone();
    }
}
