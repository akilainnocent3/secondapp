package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cdj0 {
    public static final cdj0 a;
    public static final cdj0 b;
    public static final cdj0 c;
    public static final cdj0 d;
    public static final /* synthetic */ cdj0[] e;

    static {
        cdj0 cdj0Var = new cdj0("IDLE", 0);
        a = cdj0Var;
        cdj0 cdj0Var2 = new cdj0("LOADING", 1);
        b = cdj0Var2;
        cdj0 cdj0Var3 = new cdj0("FAILURE", 2);
        c = cdj0Var3;
        cdj0 cdj0Var4 = new cdj0("SUCCESS", 3);
        d = cdj0Var4;
        e = new cdj0[]{cdj0Var, cdj0Var2, cdj0Var3, cdj0Var4};
    }

    public cdj0() {
        throw null;
    }

    public static cdj0 valueOf(String str) {
        return (cdj0) Enum.valueOf(cdj0.class, str);
    }

    public static cdj0[] values() {
        return (cdj0[]) e.clone();
    }
}
