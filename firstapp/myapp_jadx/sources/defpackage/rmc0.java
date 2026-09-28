package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class rmc0 {
    public static final rmc0 a;
    public static final rmc0 b;
    public static final /* synthetic */ rmc0[] c;

    static {
        rmc0 rmc0Var = new rmc0("COLLAPSED", 0);
        a = rmc0Var;
        rmc0 rmc0Var2 = new rmc0("EXPANDED", 1);
        b = rmc0Var2;
        c = new rmc0[]{rmc0Var, rmc0Var2};
    }

    public rmc0() {
        throw null;
    }

    public static rmc0 valueOf(String str) {
        return (rmc0) Enum.valueOf(rmc0.class, str);
    }

    public static rmc0[] values() {
        return (rmc0[]) c.clone();
    }
}
