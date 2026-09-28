package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class jv4 {
    public static final jv4 a;
    public static final jv4 b;
    public static final jv4 c;
    public static final jv4 d;
    public static final /* synthetic */ jv4[] e;

    static {
        jv4 jv4Var = new jv4("IN_PROGRESS", 0);
        a = jv4Var;
        jv4 jv4Var2 = new jv4("READY_TO_CLAIM", 1);
        b = jv4Var2;
        jv4 jv4Var3 = new jv4("GIFT_AVAILABLE", 2);
        c = jv4Var3;
        jv4 jv4Var4 = new jv4("FINISHED", 3);
        d = jv4Var4;
        e = new jv4[]{jv4Var, jv4Var2, jv4Var3, jv4Var4};
    }

    public jv4() {
        throw null;
    }

    public static jv4 valueOf(String str) {
        return (jv4) Enum.valueOf(jv4.class, str);
    }

    public static jv4[] values() {
        return (jv4[]) e.clone();
    }
}
