package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class jz7 {
    public static final jz7 a;
    public static final jz7 b;
    public static final jz7 c;
    public static final /* synthetic */ jz7[] d;

    static {
        jz7 jz7Var = new jz7("POPULAR", 0);
        a = jz7Var;
        jz7 jz7Var2 = new jz7("BET_BUILDER", 1);
        b = jz7Var2;
        jz7 jz7Var3 = new jz7("WORLD_CUP", 2);
        c = jz7Var3;
        d = new jz7[]{jz7Var, jz7Var2, jz7Var3};
    }

    public jz7() {
        throw null;
    }

    public static jz7 valueOf(String str) {
        return (jz7) Enum.valueOf(jz7.class, str);
    }

    public static jz7[] values() {
        return (jz7[]) d.clone();
    }
}
