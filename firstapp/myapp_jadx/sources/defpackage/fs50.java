package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class fs50 {
    public static final fs50 a;
    public static final fs50 b;
    public static final /* synthetic */ fs50[] c;

    static {
        fs50 fs50Var = new fs50("Levels", 0);
        a = fs50Var;
        fs50 fs50Var2 = new fs50("BonusRounds", 1);
        b = fs50Var2;
        c = new fs50[]{fs50Var, fs50Var2};
    }

    public fs50() {
        throw null;
    }

    public static fs50 valueOf(String str) {
        return (fs50) Enum.valueOf(fs50.class, str);
    }

    public static fs50[] values() {
        return (fs50[]) c.clone();
    }
}
