package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r700 {
    public static final r700 a;
    public static final r700 b;
    public static final /* synthetic */ r700[] c;

    static {
        r700 r700Var = new r700("DEPOSIT", 0);
        a = r700Var;
        r700 r700Var2 = new r700("WITHDRAWAL", 1);
        b = r700Var2;
        c = new r700[]{r700Var, r700Var2};
    }

    public r700() {
        throw null;
    }

    public static r700 valueOf(String str) {
        return (r700) Enum.valueOf(r700.class, str);
    }

    public static r700[] values() {
        return (r700[]) c.clone();
    }
}
