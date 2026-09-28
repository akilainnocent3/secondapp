package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lw1 {
    public static final lw1 a;
    public static final lw1 b;
    public static final /* synthetic */ lw1[] c;

    static {
        lw1 lw1Var = new lw1("RECOMMENDED", 0);
        a = lw1Var;
        lw1 lw1Var2 = new lw1("OTHER_BANKS", 1);
        b = lw1Var2;
        c = new lw1[]{lw1Var, lw1Var2};
    }

    public lw1() {
        throw null;
    }

    public static lw1 valueOf(String str) {
        return (lw1) Enum.valueOf(lw1.class, str);
    }

    public static lw1[] values() {
        return (lw1[]) c.clone();
    }
}
