package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v750 {
    public static final v750 a;
    public static final v750 b;
    public static final v750 c;
    public static final /* synthetic */ v750[] d;

    static {
        v750 v750Var = new v750("AUTOMATIC", 0);
        a = v750Var;
        v750 v750Var2 = new v750("HARDWARE", 1);
        b = v750Var2;
        v750 v750Var3 = new v750("SOFTWARE", 2);
        c = v750Var3;
        d = new v750[]{v750Var, v750Var2, v750Var3};
    }

    public v750() {
        throw null;
    }

    public static v750 valueOf(String str) {
        return (v750) Enum.valueOf(v750.class, str);
    }

    public static v750[] values() {
        return (v750[]) d.clone();
    }
}
