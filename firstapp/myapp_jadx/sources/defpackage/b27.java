package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b27 {
    public static final b27 a;
    public static final b27 b;
    public static final b27 c;
    public static final b27 d;
    public static final /* synthetic */ b27[] e;

    /* JADX INFO: Fake field, exist only in values array */
    b27 EF0;

    static {
        b27 b27Var = new b27("DRAFT", 0);
        b27 b27Var2 = new b27("APPROVED", 1);
        b27 b27Var3 = new b27("PRE_PUBLISHED", 2);
        a = b27Var3;
        b27 b27Var4 = new b27("PUBLISHED", 3);
        b = b27Var4;
        b27 b27Var5 = new b27("UNPUBLISHED", 4);
        c = b27Var5;
        b27 b27Var6 = new b27("UNKNOWN", 5);
        d = b27Var6;
        e = new b27[]{b27Var, b27Var2, b27Var3, b27Var4, b27Var5, b27Var6};
    }

    public b27() {
        throw null;
    }

    public static b27 valueOf(String str) {
        return (b27) Enum.valueOf(b27.class, str);
    }

    public static b27[] values() {
        return (b27[]) e.clone();
    }
}
