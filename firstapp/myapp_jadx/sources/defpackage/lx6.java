package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lx6 {
    public static final lx6 a;
    public static final /* synthetic */ lx6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    lx6 EF0;

    static {
        lx6 lx6Var = new lx6("SINGLE", 0);
        lx6 lx6Var2 = new lx6("MULTIPLE", 1);
        lx6 lx6Var3 = new lx6("SYSTEM", 2);
        lx6 lx6Var4 = new lx6("UNKNOWN", 3);
        a = lx6Var4;
        b = new lx6[]{lx6Var, lx6Var2, lx6Var3, lx6Var4};
    }

    public lx6() {
        throw null;
    }

    public static lx6 valueOf(String str) {
        return (lx6) Enum.valueOf(lx6.class, str);
    }

    public static lx6[] values() {
        return (lx6[]) b.clone();
    }
}
