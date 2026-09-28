package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class iyf0 {
    public static final iyf0 a;
    public static final iyf0 b;
    public static final /* synthetic */ iyf0[] c;

    static {
        iyf0 iyf0Var = new iyf0("Start", 0);
        a = iyf0Var;
        iyf0 iyf0Var2 = new iyf0("Center", 1);
        b = iyf0Var2;
        c = new iyf0[]{iyf0Var, iyf0Var2, new iyf0("End", 2)};
    }

    public iyf0() {
        throw null;
    }

    public static iyf0 valueOf(String str) {
        return (iyf0) Enum.valueOf(iyf0.class, str);
    }

    public static iyf0[] values() {
        return (iyf0[]) c.clone();
    }
}
