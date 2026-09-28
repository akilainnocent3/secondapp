package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class l7a0 {
    public static final l7a0 a;
    public static final l7a0 b;
    public static final /* synthetic */ l7a0[] c;

    static {
        l7a0 l7a0Var = new l7a0("CIRCLE", 0);
        a = l7a0Var;
        l7a0 l7a0Var2 = new l7a0("SNOWFLAKE", 1);
        b = l7a0Var2;
        c = new l7a0[]{l7a0Var, l7a0Var2};
    }

    public l7a0() {
        throw null;
    }

    public static l7a0 valueOf(String str) {
        return (l7a0) Enum.valueOf(l7a0.class, str);
    }

    public static l7a0[] values() {
        return (l7a0[]) c.clone();
    }
}
