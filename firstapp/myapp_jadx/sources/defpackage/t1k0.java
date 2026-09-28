package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t1k0 {
    public static final t1k0 a;
    public static final t1k0 b;
    public static final /* synthetic */ t1k0[] c;

    static {
        t1k0 t1k0Var = new t1k0("INVITATION", 0);
        a = t1k0Var;
        t1k0 t1k0Var2 = new t1k0("UNLOCK", 1);
        b = t1k0Var2;
        c = new t1k0[]{t1k0Var, t1k0Var2};
    }

    public t1k0() {
        throw null;
    }

    public static t1k0 valueOf(String str) {
        return (t1k0) Enum.valueOf(t1k0.class, str);
    }

    public static t1k0[] values() {
        return (t1k0[]) c.clone();
    }
}
