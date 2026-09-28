package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class gj80 {
    public static final gj80 a;
    public static final gj80 b;
    public static final gj80 c;
    public static final /* synthetic */ gj80[] d;

    static {
        gj80 gj80Var = new gj80("USE_CACHE", 0);
        a = gj80Var;
        gj80 gj80Var2 = new gj80("SKIP_CACHE_LOOKUP", 1);
        b = gj80Var2;
        gj80 gj80Var3 = new gj80("IGNORE_CACHE_EXPIRATION", 2);
        c = gj80Var3;
        d = new gj80[]{gj80Var, gj80Var2, gj80Var3};
    }

    public gj80() {
        throw null;
    }

    public static gj80 valueOf(String str) {
        return (gj80) Enum.valueOf(gj80.class, str);
    }

    public static gj80[] values() {
        return (gj80[]) d.clone();
    }
}
