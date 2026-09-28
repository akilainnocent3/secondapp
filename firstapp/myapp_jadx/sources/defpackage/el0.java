package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class el0 {
    public static final el0 a;
    public static final el0 b;
    public static final el0 c;
    public static final /* synthetic */ el0[] d;

    static {
        el0 el0Var = new el0("VALID", 0);
        a = el0Var;
        el0 el0Var2 = new el0("INVALID_BUT_LOW_RETURN", 1);
        b = el0Var2;
        el0 el0Var3 = new el0("INVALID", 2);
        c = el0Var3;
        d = new el0[]{el0Var, el0Var2, el0Var3};
    }

    public el0() {
        throw null;
    }

    public static el0 valueOf(String str) {
        return (el0) Enum.valueOf(el0.class, str);
    }

    public static el0[] values() {
        return (el0[]) d.clone();
    }
}
