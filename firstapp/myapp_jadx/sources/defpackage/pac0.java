package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class pac0 {
    public static final pac0 a;
    public static final pac0 b;
    public static final pac0 c;
    public static final /* synthetic */ pac0[] d;

    static {
        pac0 pac0Var = new pac0("ADDED", 0);
        a = pac0Var;
        pac0 pac0Var2 = new pac0("DUPLICATE", 1);
        b = pac0Var2;
        pac0 pac0Var3 = new pac0("IGNORED", 2);
        c = pac0Var3;
        d = new pac0[]{pac0Var, pac0Var2, pac0Var3};
    }

    public pac0() {
        throw null;
    }

    public static pac0 valueOf(String str) {
        return (pac0) Enum.valueOf(pac0.class, str);
    }

    public static pac0[] values() {
        return (pac0[]) d.clone();
    }
}
