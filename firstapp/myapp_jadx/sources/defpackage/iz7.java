package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class iz7 {
    public static final iz7 a;
    public static final iz7 b;
    public static final iz7 c;
    public static final iz7 d;
    public static final iz7 e;
    public static final /* synthetic */ iz7[] f;

    static {
        iz7 iz7Var = new iz7("WORLD_CUP_CODES", 0);
        a = iz7Var;
        iz7 iz7Var2 = new iz7("POPULAR_CODES", 1);
        b = iz7Var2;
        iz7 iz7Var3 = new iz7("FOLLOWING_CODES", 2);
        c = iz7Var3;
        iz7 iz7Var4 = new iz7("LOAD_CODES", 3);
        d = iz7Var4;
        iz7 iz7Var5 = new iz7("CUSTOM_CODES", 4);
        iz7 iz7Var6 = new iz7("BET_BUILDER_CODES", 5);
        e = iz7Var6;
        f = new iz7[]{iz7Var, iz7Var2, iz7Var3, iz7Var4, iz7Var5, iz7Var6};
    }

    public iz7() {
        throw null;
    }

    public static iz7 valueOf(String str) {
        return (iz7) Enum.valueOf(iz7.class, str);
    }

    public static iz7[] values() {
        return (iz7[]) f.clone();
    }
}
