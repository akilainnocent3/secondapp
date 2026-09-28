package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dje0 {
    public static final dje0 a;
    public static final dje0 b;
    public static final /* synthetic */ dje0[] c;

    static {
        dje0 dje0Var = new dje0("Visible", 0);
        a = dje0Var;
        dje0 dje0Var2 = new dje0("Gone", 1);
        b = dje0Var2;
        c = new dje0[]{dje0Var, dje0Var2};
    }

    public dje0() {
        throw null;
    }

    public static dje0 valueOf(String str) {
        return (dje0) Enum.valueOf(dje0.class, str);
    }

    public static dje0[] values() {
        return (dje0[]) c.clone();
    }
}
