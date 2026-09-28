package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class hw1 {
    public static final hw1 a;
    public static final /* synthetic */ hw1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    hw1 EF0;

    static {
        hw1 hw1Var = new hw1("CREATED", 0);
        hw1 hw1Var2 = new hw1("AUTHORIZED", 1);
        a = hw1Var2;
        b = new hw1[]{hw1Var, hw1Var2, new hw1("UNAUTHORIZED", 2), new hw1("PROCESSING", 3)};
    }

    public hw1() {
        throw null;
    }

    public static hw1 valueOf(String str) {
        return (hw1) Enum.valueOf(hw1.class, str);
    }

    public static hw1[] values() {
        return (hw1[]) b.clone();
    }
}
