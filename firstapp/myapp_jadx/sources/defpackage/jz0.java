package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class jz0 {
    public static final jz0 a;
    public static final jz0 b;
    public static final /* synthetic */ jz0[] c;

    static {
        jz0 jz0Var = new jz0("SUCCESS", 0);
        a = jz0Var;
        jz0 jz0Var2 = new jz0("FAILURE_HIGH_DEMAND", 1);
        b = jz0Var2;
        c = new jz0[]{jz0Var, jz0Var2};
    }

    public jz0() {
        throw null;
    }

    public static jz0 valueOf(String str) {
        return (jz0) Enum.valueOf(jz0.class, str);
    }

    public static jz0[] values() {
        return (jz0[]) c.clone();
    }
}
