package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a4f0 {
    public static final a4f0 a;
    public static final a4f0 b;
    public static final /* synthetic */ a4f0[] c;

    static {
        a4f0 a4f0Var = new a4f0("SCROLLABLE_WHEN_MORE_THAN_3_TABS", 0);
        a = a4f0Var;
        a4f0 a4f0Var2 = new a4f0("ALWAYS_SCROLLABLE", 1);
        b = a4f0Var2;
        c = new a4f0[]{a4f0Var, a4f0Var2};
    }

    public a4f0() {
        throw null;
    }

    public static a4f0 valueOf(String str) {
        return (a4f0) Enum.valueOf(a4f0.class, str);
    }

    public static a4f0[] values() {
        return (a4f0[]) c.clone();
    }
}
