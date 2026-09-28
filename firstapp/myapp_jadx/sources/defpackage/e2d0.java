package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e2d0 {
    public static final e2d0 a;
    public static final e2d0 b;
    public static final /* synthetic */ e2d0[] c;

    static {
        e2d0 e2d0Var = new e2d0("GOAL", 0);
        a = e2d0Var;
        e2d0 e2d0Var2 = new e2d0("NO_GOAL", 1);
        b = e2d0Var2;
        c = new e2d0[]{e2d0Var, e2d0Var2};
    }

    public e2d0() {
        throw null;
    }

    public static e2d0 valueOf(String str) {
        return (e2d0) Enum.valueOf(e2d0.class, str);
    }

    public static e2d0[] values() {
        return (e2d0[]) c.clone();
    }
}
