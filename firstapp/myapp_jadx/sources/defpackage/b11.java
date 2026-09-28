package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b11 {
    public static final b11 a;
    public static final b11 b;
    public static final /* synthetic */ b11[] c;

    static {
        b11 b11Var = new b11("AUTOMATIC", 0);
        a = b11Var;
        b11 b11Var2 = new b11("ENABLED", 1);
        b = b11Var2;
        c = new b11[]{b11Var, b11Var2, new b11("DISABLED", 2)};
    }

    public b11() {
        throw null;
    }

    public static b11 valueOf(String str) {
        return (b11) Enum.valueOf(b11.class, str);
    }

    public static b11[] values() {
        return (b11[]) c.clone();
    }
}
