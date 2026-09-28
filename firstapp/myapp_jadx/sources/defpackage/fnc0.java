package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fnc0 {
    public static final fnc0 a;
    public static final fnc0 b;
    public static final /* synthetic */ fnc0[] c;

    static {
        fnc0 fnc0Var = new fnc0("Home", 0);
        a = fnc0Var;
        fnc0 fnc0Var2 = new fnc0("Away", 1);
        b = fnc0Var2;
        c = new fnc0[]{fnc0Var, fnc0Var2};
    }

    public fnc0() {
        throw null;
    }

    public static fnc0 valueOf(String str) {
        return (fnc0) Enum.valueOf(fnc0.class, str);
    }

    public static fnc0[] values() {
        return (fnc0[]) c.clone();
    }
}
