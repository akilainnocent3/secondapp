package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lni0 {
    public static final lni0 a;
    public static final lni0 b;
    public static final /* synthetic */ lni0[] c;

    static {
        lni0 lni0Var = new lni0("HIDDEN", 0);
        a = lni0Var;
        lni0 lni0Var2 = new lni0("VISIBLE", 1);
        b = lni0Var2;
        c = new lni0[]{lni0Var, lni0Var2};
    }

    public lni0() {
        throw null;
    }

    public static lni0 valueOf(String str) {
        return (lni0) Enum.valueOf(lni0.class, str);
    }

    public static lni0[] values() {
        return (lni0[]) c.clone();
    }
}
