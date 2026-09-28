package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hk2 {
    public static final hk2 a;
    public static final /* synthetic */ hk2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    hk2 EF0;

    static {
        hk2 hk2Var = new hk2("ALL", 0);
        hk2 hk2Var2 = new hk2("REAL_SPORT", 1);
        hk2 hk2Var3 = new hk2("INSTANT_VIRTUAL", 2);
        hk2 hk2Var4 = new hk2("GAME", 3);
        hk2 hk2Var5 = new hk2("UNKNOWN", 4);
        a = hk2Var5;
        b = new hk2[]{hk2Var, hk2Var2, hk2Var3, hk2Var4, hk2Var5};
    }

    public hk2() {
        throw null;
    }

    public static hk2 valueOf(String str) {
        return (hk2) Enum.valueOf(hk2.class, str);
    }

    public static hk2[] values() {
        return (hk2[]) b.clone();
    }
}
