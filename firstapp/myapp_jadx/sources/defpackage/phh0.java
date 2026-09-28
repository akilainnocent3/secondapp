package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class phh0 {
    public static final phh0 a;
    public static final phh0 b;
    public static final /* synthetic */ phh0[] c;

    static {
        phh0 phh0Var = new phh0("ONE_UP", 0);
        a = phh0Var;
        phh0 phh0Var2 = new phh0("TWO_UP", 1);
        b = phh0Var2;
        c = new phh0[]{phh0Var, phh0Var2};
    }

    public phh0() {
        throw null;
    }

    public static phh0 valueOf(String str) {
        return (phh0) Enum.valueOf(phh0.class, str);
    }

    public static phh0[] values() {
        return (phh0[]) c.clone();
    }
}
