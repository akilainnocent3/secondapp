package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f2d0 {
    public static final f2d0 a;
    public static final f2d0 b;
    public static final /* synthetic */ f2d0[] c;

    static {
        f2d0 f2d0Var = new f2d0("KICKING", 0);
        a = f2d0Var;
        f2d0 f2d0Var2 = new f2d0("POST_ANIMATION", 1);
        b = f2d0Var2;
        c = new f2d0[]{f2d0Var, f2d0Var2};
    }

    public f2d0() {
        throw null;
    }

    public static f2d0 valueOf(String str) {
        return (f2d0) Enum.valueOf(f2d0.class, str);
    }

    public static f2d0[] values() {
        return (f2d0[]) c.clone();
    }
}
