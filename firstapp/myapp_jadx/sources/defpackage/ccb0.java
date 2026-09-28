package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ccb0 {
    public static final ccb0 a;
    public static final ccb0 b;
    public static final ccb0 c;
    public static final /* synthetic */ ccb0[] d;

    static {
        ccb0 ccb0Var = new ccb0("Idle", 0);
        a = ccb0Var;
        ccb0 ccb0Var2 = new ccb0("IndefiniteSpin", 1);
        b = ccb0Var2;
        ccb0 ccb0Var3 = new ccb0("SlowingDown", 2);
        c = ccb0Var3;
        d = new ccb0[]{ccb0Var, ccb0Var2, ccb0Var3};
    }

    public ccb0() {
        throw null;
    }

    public static ccb0 valueOf(String str) {
        return (ccb0) Enum.valueOf(ccb0.class, str);
    }

    public static ccb0[] values() {
        return (ccb0[]) d.clone();
    }
}
