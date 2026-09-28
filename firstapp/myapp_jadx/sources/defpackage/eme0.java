package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class eme0 {
    public static final eme0 a;
    public static final eme0 b;
    public static final eme0 c;
    public static final /* synthetic */ eme0[] d;

    static {
        eme0 eme0Var = new eme0("AutomaticAndManual", 0);
        a = eme0Var;
        eme0 eme0Var2 = new eme0("Automatic", 1);
        b = eme0Var2;
        eme0 eme0Var3 = new eme0("Manual", 2);
        c = eme0Var3;
        d = new eme0[]{eme0Var, eme0Var2, eme0Var3, new eme0("None", 3)};
    }

    public eme0() {
        throw null;
    }

    public static eme0 valueOf(String str) {
        return (eme0) Enum.valueOf(eme0.class, str);
    }

    public static eme0[] values() {
        return (eme0[]) d.clone();
    }

    public final boolean a() {
        return this == a || this == b;
    }

    public final boolean b() {
        return this == a || this == c;
    }
}
