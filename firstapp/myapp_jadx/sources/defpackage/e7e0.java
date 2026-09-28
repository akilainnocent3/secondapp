package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e7e0 {
    public static final a a;
    public static final e7e0 b;
    public static final e7e0 c;
    public static final /* synthetic */ e7e0[] d;

    public static final class a {
    }

    static {
        e7e0 e7e0Var = new e7e0("Achieved", 0);
        b = e7e0Var;
        e7e0 e7e0Var2 = new e7e0("Repaired", 1);
        c = e7e0Var2;
        d = new e7e0[]{e7e0Var, e7e0Var2};
        a = new a();
    }

    public e7e0() {
        throw null;
    }

    public static e7e0 valueOf(String str) {
        return (e7e0) Enum.valueOf(e7e0.class, str);
    }

    public static e7e0[] values() {
        return (e7e0[]) d.clone();
    }
}
