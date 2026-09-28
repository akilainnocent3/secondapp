package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class t690 {
    public static final t690 a;
    public static final t690 b;
    public static final t690 c;
    public static final t690 d;
    public static final /* synthetic */ t690[] e;

    static {
        t690 t690Var = new t690("Addable", 0);
        a = t690Var;
        t690 t690Var2 = new t690("Removable", 1);
        b = t690Var2;
        t690 t690Var3 = new t690("Selected", 2);
        c = t690Var3;
        t690 t690Var4 = new t690("Neutral", 3);
        d = t690Var4;
        e = new t690[]{t690Var, t690Var2, t690Var3, t690Var4};
    }

    public t690() {
        throw null;
    }

    public static t690 valueOf(String str) {
        return (t690) Enum.valueOf(t690.class, str);
    }

    public static t690[] values() {
        return (t690[]) e.clone();
    }
}
