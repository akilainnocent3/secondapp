package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b06 {
    public static final b06 a;
    public static final b06 b;
    public static final b06 c;
    public static final b06 d;
    public static final b06 e;
    public static final /* synthetic */ b06[] f;

    static {
        b06 b06Var = new b06("UNKNOWN", 0);
        a = b06Var;
        b06 b06Var2 = new b06("INACTIVE", 1);
        b = b06Var2;
        b06 b06Var3 = new b06("METERING", 2);
        c = b06Var3;
        b06 b06Var4 = new b06("CONVERGED", 3);
        d = b06Var4;
        b06 b06Var5 = new b06("LOCKED", 4);
        e = b06Var5;
        f = new b06[]{b06Var, b06Var2, b06Var3, b06Var4, b06Var5};
    }

    public b06() {
        throw null;
    }

    public static b06 valueOf(String str) {
        return (b06) Enum.valueOf(b06.class, str);
    }

    public static b06[] values() {
        return (b06[]) f.clone();
    }
}
