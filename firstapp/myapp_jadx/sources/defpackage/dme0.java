package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dme0 {
    public static final dme0 a;
    public static final dme0 b;
    public static final dme0 c;
    public static final /* synthetic */ dme0[] d;

    static {
        dme0 dme0Var = new dme0("StartToEnd", 0);
        a = dme0Var;
        dme0 dme0Var2 = new dme0("EndToStart", 1);
        b = dme0Var2;
        dme0 dme0Var3 = new dme0("Settled", 2);
        c = dme0Var3;
        d = new dme0[]{dme0Var, dme0Var2, dme0Var3};
    }

    public dme0() {
        throw null;
    }

    public static dme0 valueOf(String str) {
        return (dme0) Enum.valueOf(dme0.class, str);
    }

    public static dme0[] values() {
        return (dme0[]) d.clone();
    }
}
