package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dja0 {
    public static final dja0 a;
    public static final dja0 b;
    public static final /* synthetic */ dja0[] c;

    static {
        dja0 dja0Var = new dja0("KOL", 0);
        a = dja0Var;
        dja0 dja0Var2 = new dja0("NORMAL", 1);
        b = dja0Var2;
        c = new dja0[]{dja0Var, dja0Var2};
    }

    public dja0() {
        throw null;
    }

    public static dja0 valueOf(String str) {
        return (dja0) Enum.valueOf(dja0.class, str);
    }

    public static dja0[] values() {
        return (dja0[]) c.clone();
    }
}
