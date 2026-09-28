package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class cld0 {
    public static final cld0 a;
    public static final cld0 b;
    public static final /* synthetic */ cld0[] c;

    static {
        cld0 cld0Var = new cld0("None", 0);
        a = cld0Var;
        cld0 cld0Var2 = new cld0("Top", 1);
        cld0 cld0Var3 = new cld0("TopAndLeft", 2);
        cld0 cld0Var4 = new cld0("TopAndRight", 3);
        cld0 cld0Var5 = new cld0("Bottom", 4);
        b = cld0Var5;
        c = new cld0[]{cld0Var, cld0Var2, cld0Var3, cld0Var4, cld0Var5, new cld0("BottomAndLeft", 5), new cld0("BottomAndRight", 6), new cld0("Left", 7), new cld0("Right", 8)};
    }

    public cld0() {
        throw null;
    }

    public static cld0 valueOf(String str) {
        return (cld0) Enum.valueOf(cld0.class, str);
    }

    public static cld0[] values() {
        return (cld0[]) c.clone();
    }
}
