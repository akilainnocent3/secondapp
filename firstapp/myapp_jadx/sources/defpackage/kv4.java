package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class kv4 {
    public static final kv4 a;
    public static final kv4 b;
    public static final kv4 c;
    public static final kv4 d;
    public static final /* synthetic */ kv4[] e;

    static {
        kv4 kv4Var = new kv4("DAY", 0);
        a = kv4Var;
        kv4 kv4Var2 = new kv4("HOUR", 1);
        b = kv4Var2;
        kv4 kv4Var3 = new kv4("MINUTE", 2);
        c = kv4Var3;
        kv4 kv4Var4 = new kv4("UNKNOWN", 3);
        d = kv4Var4;
        e = new kv4[]{kv4Var, kv4Var2, kv4Var3, kv4Var4};
    }

    public kv4() {
        throw null;
    }

    public static kv4 valueOf(String str) {
        return (kv4) Enum.valueOf(kv4.class, str);
    }

    public static kv4[] values() {
        return (kv4[]) e.clone();
    }
}
