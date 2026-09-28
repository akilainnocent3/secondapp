package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zfe0 {
    public static final zfe0 a;
    public static final zfe0 b;
    public static final zfe0 c;
    public static final zfe0 d;
    public static final zfe0 e;
    public static final /* synthetic */ zfe0[] f;

    static {
        zfe0 zfe0Var = new zfe0("END", 0);
        a = zfe0Var;
        zfe0 zfe0Var2 = new zfe0("ROLLBACK", 1);
        b = zfe0Var2;
        zfe0 zfe0Var3 = new zfe0("BEGIN_EXCLUSIVE", 2);
        c = zfe0Var3;
        zfe0 zfe0Var4 = new zfe0("BEGIN_IMMEDIATE", 3);
        d = zfe0Var4;
        zfe0 zfe0Var5 = new zfe0("BEGIN_DEFERRED", 4);
        e = zfe0Var5;
        f = new zfe0[]{zfe0Var, zfe0Var2, zfe0Var3, zfe0Var4, zfe0Var5};
    }

    public zfe0() {
        throw null;
    }

    public static zfe0 valueOf(String str) {
        return (zfe0) Enum.valueOf(zfe0.class, str);
    }

    public static zfe0[] values() {
        return (zfe0[]) f.clone();
    }
}
