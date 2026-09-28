package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wzd0 {
    public static final wzd0 a;
    public static final wzd0 b;
    public static final wzd0 c;
    public static final /* synthetic */ wzd0[] d;

    static {
        wzd0 wzd0Var = new wzd0("RUNNING", 0);
        a = wzd0Var;
        wzd0 wzd0Var2 = new wzd0("SUCCESS", 1);
        b = wzd0Var2;
        wzd0 wzd0Var3 = new wzd0("FAILED", 2);
        c = wzd0Var3;
        d = new wzd0[]{wzd0Var, wzd0Var2, wzd0Var3};
    }

    public wzd0() {
        throw null;
    }

    public static wzd0 valueOf(String str) {
        return (wzd0) Enum.valueOf(wzd0.class, str);
    }

    public static wzd0[] values() {
        return (wzd0[]) d.clone();
    }
}
