package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c06 {
    public static final c06 a;
    public static final c06 b;
    public static final c06 c;
    public static final c06 d;
    public static final /* synthetic */ c06[] e;

    static {
        c06 c06Var = new c06("UNKNOWN", 0);
        a = c06Var;
        c06 c06Var2 = new c06("NONE", 1);
        b = c06Var2;
        c06 c06Var3 = new c06("READY", 2);
        c = c06Var3;
        c06 c06Var4 = new c06("FIRED", 3);
        d = c06Var4;
        e = new c06[]{c06Var, c06Var2, c06Var3, c06Var4};
    }

    public c06() {
        throw null;
    }

    public static c06 valueOf(String str) {
        return (c06) Enum.valueOf(c06.class, str);
    }

    public static c06[] values() {
        return (c06[]) e.clone();
    }
}
