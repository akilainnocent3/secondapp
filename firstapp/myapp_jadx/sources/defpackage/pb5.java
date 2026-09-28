package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class pb5 {
    public static final pb5 a;
    public static final pb5 b;
    public static final pb5 c;
    public static final /* synthetic */ pb5[] d;

    static {
        pb5 pb5Var = new pb5("SUSPEND", 0);
        a = pb5Var;
        pb5 pb5Var2 = new pb5("DROP_OLDEST", 1);
        b = pb5Var2;
        pb5 pb5Var3 = new pb5("DROP_LATEST", 2);
        c = pb5Var3;
        d = new pb5[]{pb5Var, pb5Var2, pb5Var3};
    }

    public pb5() {
        throw null;
    }

    public static pb5 valueOf(String str) {
        return (pb5) Enum.valueOf(pb5.class, str);
    }

    public static pb5[] values() {
        return (pb5[]) d.clone();
    }
}
