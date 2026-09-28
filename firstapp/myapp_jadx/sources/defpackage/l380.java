package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l380 {
    public static final l380 a;
    public static final l380 b;
    public static final /* synthetic */ l380[] c;

    static {
        l380 l380Var = new l380("Inherit", 0);
        a = l380Var;
        l380 l380Var2 = new l380("SecureOn", 1);
        b = l380Var2;
        c = new l380[]{l380Var, l380Var2, new l380("SecureOff", 2)};
    }

    public l380() {
        throw null;
    }

    public static l380 valueOf(String str) {
        return (l380) Enum.valueOf(l380.class, str);
    }

    public static l380[] values() {
        return (l380[]) c.clone();
    }
}
