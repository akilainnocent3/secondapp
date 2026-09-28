package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class bk4 {
    public static final bk4 a;
    public static final bk4 b;
    public static final /* synthetic */ bk4[] c;

    static {
        bk4 bk4Var = new bk4("CATCH", 0);
        a = bk4Var;
        bk4 bk4Var2 = new bk4("MISS", 1);
        b = bk4Var2;
        c = new bk4[]{bk4Var, bk4Var2};
    }

    public bk4() {
        throw null;
    }

    public static bk4 valueOf(String str) {
        return (bk4) Enum.valueOf(bk4.class, str);
    }

    public static bk4[] values() {
        return (bk4[]) c.clone();
    }
}
