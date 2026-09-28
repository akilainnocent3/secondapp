package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class gbh0 {
    public static final gbh0 a;
    public static final gbh0 b;
    public static final gbh0 c;
    public static final gbh0 d;
    public static final /* synthetic */ gbh0[] e;

    static {
        gbh0 gbh0Var = new gbh0("INITIALIZED", 0);
        a = gbh0Var;
        gbh0 gbh0Var2 = new gbh0("LOADING", 1);
        b = gbh0Var2;
        gbh0 gbh0Var3 = new gbh0("LOADED", 2);
        c = gbh0Var3;
        gbh0 gbh0Var4 = new gbh0("ERROR", 3);
        d = gbh0Var4;
        e = new gbh0[]{gbh0Var, gbh0Var2, gbh0Var3, gbh0Var4};
    }

    public gbh0() {
        throw null;
    }

    public static gbh0 valueOf(String str) {
        return (gbh0) Enum.valueOf(gbh0.class, str);
    }

    public static gbh0[] values() {
        return (gbh0[]) e.clone();
    }
}
