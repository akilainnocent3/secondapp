package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v78 {
    public static final v78 a;
    public static final v78 b;
    public static final v78 c;
    public static final /* synthetic */ v78[] d;

    static {
        v78 v78Var = new v78("INITIAL", 0);
        a = v78Var;
        v78 v78Var2 = new v78("RECEIVER", 1);
        b = v78Var2;
        v78 v78Var3 = new v78("OTHER", 2);
        c = v78Var3;
        d = new v78[]{v78Var, v78Var2, v78Var3};
    }

    public v78() {
        throw null;
    }

    public static v78 valueOf(String str) {
        return (v78) Enum.valueOf(v78.class, str);
    }

    public static v78[] values() {
        return (v78[]) d.clone();
    }
}
