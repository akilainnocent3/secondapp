package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class t2d0 {
    public static final t2d0 a;
    public static final t2d0 b;
    public static final /* synthetic */ t2d0[] c;

    static {
        t2d0 t2d0Var = new t2d0("LEFT", 0);
        a = t2d0Var;
        t2d0 t2d0Var2 = new t2d0("RIGHT", 1);
        b = t2d0Var2;
        c = new t2d0[]{t2d0Var, t2d0Var2};
    }

    public t2d0() {
        throw null;
    }

    public static t2d0 valueOf(String str) {
        return (t2d0) Enum.valueOf(t2d0.class, str);
    }

    public static t2d0[] values() {
        return (t2d0[]) c.clone();
    }
}
