package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qt7 {
    public static final qt7 a;
    public static final qt7 b;
    public static final /* synthetic */ qt7[] c;

    static {
        qt7 qt7Var = new qt7("Started", 0);
        a = qt7Var;
        qt7 qt7Var2 = new qt7("Failure", 1);
        b = qt7Var2;
        c = new qt7[]{qt7Var, qt7Var2, new qt7("Success", 2)};
    }

    public qt7() {
        throw null;
    }

    public static qt7 valueOf(String str) {
        return (qt7) Enum.valueOf(qt7.class, str);
    }

    public static qt7[] values() {
        return (qt7[]) c.clone();
    }
}
