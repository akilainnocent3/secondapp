package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class tre0 {
    public static final tre0 a;
    public static final tre0 b;
    public static final /* synthetic */ tre0[] c;

    static {
        tre0 tre0Var = new tre0("End", 0);
        a = tre0Var;
        tre0 tre0Var2 = new tre0("Complete", 1);
        b = tre0Var2;
        c = new tre0[]{tre0Var, tre0Var2};
    }

    public tre0() {
        throw null;
    }

    public static tre0 valueOf(String str) {
        return (tre0) Enum.valueOf(tre0.class, str);
    }

    public static tre0[] values() {
        return (tre0[]) c.clone();
    }
}
