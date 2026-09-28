package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b6c0 {
    public static final b6c0 a;
    public static final b6c0 b;
    public static final b6c0 c;
    public static final /* synthetic */ b6c0[] d;

    static {
        b6c0 b6c0Var = new b6c0("CLASSIC", 0);
        a = b6c0Var;
        b6c0 b6c0Var2 = new b6c0("OVER_UNDER", 1);
        b = b6c0Var2;
        b6c0 b6c0Var3 = new b6c0("RANGE", 2);
        c = b6c0Var3;
        d = new b6c0[]{b6c0Var, b6c0Var2, b6c0Var3};
    }

    public b6c0() {
        throw null;
    }

    public static b6c0 valueOf(String str) {
        return (b6c0) Enum.valueOf(b6c0.class, str);
    }

    public static b6c0[] values() {
        return (b6c0[]) d.clone();
    }
}
