package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c020 {
    public static final c020 a;
    public static final c020 b;
    public static final c020 c;
    public static final /* synthetic */ c020[] d;

    static {
        c020 c020Var = new c020("Initial", 0);
        a = c020Var;
        c020 c020Var2 = new c020("Main", 1);
        b = c020Var2;
        c020 c020Var3 = new c020("Final", 2);
        c = c020Var3;
        d = new c020[]{c020Var, c020Var2, c020Var3};
    }

    public c020() {
        throw null;
    }

    public static c020 valueOf(String str) {
        return (c020) Enum.valueOf(c020.class, str);
    }

    public static c020[] values() {
        return (c020[]) d.clone();
    }
}
