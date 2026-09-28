package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e9f0 {
    public static final e9f0 a;
    public static final e9f0 b;
    public static final /* synthetic */ e9f0[] c;

    static {
        e9f0 e9f0Var = new e9f0("HOME", 0);
        a = e9f0Var;
        e9f0 e9f0Var2 = new e9f0("AWAY", 1);
        b = e9f0Var2;
        c = new e9f0[]{e9f0Var, e9f0Var2};
    }

    public e9f0() {
        throw null;
    }

    public static e9f0 valueOf(String str) {
        return (e9f0) Enum.valueOf(e9f0.class, str);
    }

    public static e9f0[] values() {
        return (e9f0[]) c.clone();
    }
}
