package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class nui0 {
    public static final nui0 a;
    public static final nui0 b;
    public static final /* synthetic */ nui0[] c;

    static {
        nui0 nui0Var = new nui0("Manual", 0);
        a = nui0Var;
        nui0 nui0Var2 = new nui0("Auto", 1);
        b = nui0Var2;
        c = new nui0[]{nui0Var, nui0Var2};
    }

    public nui0() {
        throw null;
    }

    public static nui0 valueOf(String str) {
        return (nui0) Enum.valueOf(nui0.class, str);
    }

    public static nui0[] values() {
        return (nui0[]) c.clone();
    }
}
