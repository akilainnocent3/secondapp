package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k3f0 {
    public static final k3f0 a;
    public static final k3f0 b;
    public static final k3f0 c;
    public static final /* synthetic */ k3f0[] d;

    static {
        k3f0 k3f0Var = new k3f0("Tabs", 0);
        a = k3f0Var;
        k3f0 k3f0Var2 = new k3f0("Divider", 1);
        b = k3f0Var2;
        k3f0 k3f0Var3 = new k3f0("Indicator", 2);
        c = k3f0Var3;
        d = new k3f0[]{k3f0Var, k3f0Var2, k3f0Var3};
    }

    public k3f0() {
        throw null;
    }

    public static k3f0 valueOf(String str) {
        return (k3f0) Enum.valueOf(k3f0.class, str);
    }

    public static k3f0[] values() {
        return (k3f0[]) d.clone();
    }
}
