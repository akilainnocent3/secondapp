package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l3f0 {
    public static final l3f0 a;
    public static final l3f0 b;
    public static final l3f0 c;
    public static final /* synthetic */ l3f0[] d;

    static {
        l3f0 l3f0Var = new l3f0("Tabs", 0);
        a = l3f0Var;
        l3f0 l3f0Var2 = new l3f0("Divider", 1);
        b = l3f0Var2;
        l3f0 l3f0Var3 = new l3f0("Indicator", 2);
        c = l3f0Var3;
        d = new l3f0[]{l3f0Var, l3f0Var2, l3f0Var3};
    }

    public l3f0() {
        throw null;
    }

    public static l3f0 valueOf(String str) {
        return (l3f0) Enum.valueOf(l3f0.class, str);
    }

    public static l3f0[] values() {
        return (l3f0[]) d.clone();
    }
}
