package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class evh0 {
    public static final evh0 a;
    public static final evh0 b;
    public static final evh0 c;
    public static final evh0 d;
    public static final /* synthetic */ evh0[] e;

    static {
        evh0 evh0Var = new evh0("STRING", 0);
        a = evh0Var;
        evh0 evh0Var2 = new evh0("BOOLEAN", 1);
        evh0 evh0Var3 = new evh0("LONG", 2);
        evh0 evh0Var4 = new evh0("DOUBLE", 3);
        evh0 evh0Var5 = new evh0("ARRAY", 4);
        b = evh0Var5;
        evh0 evh0Var6 = new evh0("KEY_VALUE_LIST", 5);
        c = evh0Var6;
        evh0 evh0Var7 = new evh0("BYTES", 6);
        d = evh0Var7;
        e = new evh0[]{evh0Var, evh0Var2, evh0Var3, evh0Var4, evh0Var5, evh0Var6, evh0Var7};
    }

    public evh0() {
        throw null;
    }

    public static evh0 valueOf(String str) {
        return (evh0) Enum.valueOf(evh0.class, str);
    }

    public static evh0[] values() {
        return (evh0[]) e.clone();
    }
}
