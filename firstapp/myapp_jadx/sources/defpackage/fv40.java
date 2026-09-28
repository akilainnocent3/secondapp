package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fv40 {
    public static final fv40 a;
    public static final fv40 b;
    public static final /* synthetic */ fv40[] c;

    static {
        fv40 fv40Var = new fv40("SELECTOR", 0);
        a = fv40Var;
        fv40 fv40Var2 = new fv40("SMS", 1);
        b = fv40Var2;
        c = new fv40[]{fv40Var, fv40Var2, new fv40("TELEGRAM", 2)};
    }

    public fv40() {
        throw null;
    }

    public static fv40 valueOf(String str) {
        return (fv40) Enum.valueOf(fv40.class, str);
    }

    public static fv40[] values() {
        return (fv40[]) c.clone();
    }
}
