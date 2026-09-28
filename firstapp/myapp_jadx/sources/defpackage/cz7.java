package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cz7 {
    public static final cz7 a;
    public static final cz7 b;
    public static final cz7 c;
    public static final /* synthetic */ cz7[] d;

    static {
        cz7 cz7Var = new cz7("OPTION", 0);
        a = cz7Var;
        cz7 cz7Var2 = new cz7("TYPE_IN", 1);
        b = cz7Var2;
        cz7 cz7Var3 = new cz7("SLIDER", 2);
        c = cz7Var3;
        d = new cz7[]{cz7Var, cz7Var2, cz7Var3};
    }

    public cz7() {
        throw null;
    }

    public static cz7 valueOf(String str) {
        return (cz7) Enum.valueOf(cz7.class, str);
    }

    public static cz7[] values() {
        return (cz7[]) d.clone();
    }
}
