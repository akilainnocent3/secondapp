package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c38 {
    public static final c38 a;
    public static final c38 b;
    public static final c38 c;
    public static final /* synthetic */ c38[] d;

    static {
        c38 c38Var = new c38("LOADING", 0);
        a = c38Var;
        c38 c38Var2 = new c38("SUCCESS", 1);
        b = c38Var2;
        c38 c38Var3 = new c38("ERROR", 2);
        c = c38Var3;
        d = new c38[]{c38Var, c38Var2, c38Var3};
    }

    public c38() {
        throw null;
    }

    public static c38 valueOf(String str) {
        return (c38) Enum.valueOf(c38.class, str);
    }

    public static c38[] values() {
        return (c38[]) d.clone();
    }
}
