package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gvg0 {
    public static final gvg0 a;
    public static final gvg0 b;
    public static final gvg0 c;
    public static final /* synthetic */ gvg0[] d;

    static {
        gvg0 gvg0Var = new gvg0("ContinueTraversal", 0);
        a = gvg0Var;
        gvg0 gvg0Var2 = new gvg0("SkipSubtreeAndContinueTraversal", 1);
        b = gvg0Var2;
        gvg0 gvg0Var3 = new gvg0("CancelTraversal", 2);
        c = gvg0Var3;
        d = new gvg0[]{gvg0Var, gvg0Var2, gvg0Var3};
    }

    public gvg0() {
        throw null;
    }

    public static gvg0 valueOf(String str) {
        return (gvg0) Enum.valueOf(gvg0.class, str);
    }

    public static gvg0[] values() {
        return (gvg0[]) d.clone();
    }
}
