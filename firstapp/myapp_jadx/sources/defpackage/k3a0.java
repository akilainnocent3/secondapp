package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k3a0 {
    public static final k3a0 a;
    public static final k3a0 b;
    public static final /* synthetic */ k3a0[] c;

    static {
        k3a0 k3a0Var = new k3a0("Short", 0);
        a = k3a0Var;
        k3a0 k3a0Var2 = new k3a0("Long", 1);
        k3a0 k3a0Var3 = new k3a0("Indefinite", 2);
        b = k3a0Var3;
        c = new k3a0[]{k3a0Var, k3a0Var2, k3a0Var3};
    }

    public k3a0() {
        throw null;
    }

    public static k3a0 valueOf(String str) {
        return (k3a0) Enum.valueOf(k3a0.class, str);
    }

    public static k3a0[] values() {
        return (k3a0[]) c.clone();
    }
}
