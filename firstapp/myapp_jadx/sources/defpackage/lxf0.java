package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lxf0 {
    public static final lxf0 a;
    public static final lxf0 b;
    public static final /* synthetic */ lxf0[] c;

    static {
        lxf0 lxf0Var = new lxf0("SECONDS", 0);
        a = lxf0Var;
        lxf0 lxf0Var2 = new lxf0("MINUTES", 1);
        b = lxf0Var2;
        c = new lxf0[]{lxf0Var, lxf0Var2};
    }

    public lxf0() {
        throw null;
    }

    public static lxf0 valueOf(String str) {
        return (lxf0) Enum.valueOf(lxf0.class, str);
    }

    public static lxf0[] values() {
        return (lxf0[]) c.clone();
    }
}
