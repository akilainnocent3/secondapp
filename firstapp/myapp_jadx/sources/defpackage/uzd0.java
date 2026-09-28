package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class uzd0 {
    public static final uzd0 a;
    public static final uzd0 b;
    public static final uzd0 c;
    public static final /* synthetic */ uzd0[] d;

    static {
        uzd0 uzd0Var = new uzd0("RUNNING", 0);
        a = uzd0Var;
        uzd0 uzd0Var2 = new uzd0("SUCCESS", 1);
        b = uzd0Var2;
        uzd0 uzd0Var3 = new uzd0("FAILED", 2);
        c = uzd0Var3;
        d = new uzd0[]{uzd0Var, uzd0Var2, uzd0Var3};
    }

    public uzd0() {
        throw null;
    }

    public static uzd0 valueOf(String str) {
        return (uzd0) Enum.valueOf(uzd0.class, str);
    }

    public static uzd0[] values() {
        return (uzd0[]) d.clone();
    }
}
