package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class q43 {
    public static final q43 a;
    public static final q43 b;
    public static final q43 c;
    public static final /* synthetic */ q43[] d;

    static {
        q43 q43Var = new q43("NORMAL", 0);
        a = q43Var;
        q43 q43Var2 = new q43("STANDARD", 1);
        b = q43Var2;
        q43 q43Var3 = new q43("SIMPLE", 2);
        c = q43Var3;
        d = new q43[]{q43Var, q43Var2, q43Var3};
    }

    public q43() {
        throw null;
    }

    public static q43 valueOf(String str) {
        return (q43) Enum.valueOf(q43.class, str);
    }

    public static q43[] values() {
        return (q43[]) d.clone();
    }
}
