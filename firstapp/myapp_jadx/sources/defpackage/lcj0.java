package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lcj0 {
    public static final lcj0 a;
    public static final lcj0 b;
    public static final /* synthetic */ lcj0[] c;

    static {
        lcj0 lcj0Var = new lcj0("DON_LOGO", 0);
        a = lcj0Var;
        lcj0 lcj0Var2 = new lcj0("INFO_EXPANDED", 1);
        b = lcj0Var2;
        c = new lcj0[]{lcj0Var, lcj0Var2};
    }

    public lcj0() {
        throw null;
    }

    public static lcj0 valueOf(String str) {
        return (lcj0) Enum.valueOf(lcj0.class, str);
    }

    public static lcj0[] values() {
        return (lcj0[]) c.clone();
    }
}
