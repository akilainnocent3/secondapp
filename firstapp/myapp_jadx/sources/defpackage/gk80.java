package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gk80 {
    public static final gk80 a;
    public static final gk80 b;
    public static final /* synthetic */ gk80[] c;

    /* JADX INFO: Fake field, exist only in values array */
    gk80 EF0;

    static {
        gk80 gk80Var = new gk80("None", 0);
        gk80 gk80Var2 = new gk80("Top", 1);
        a = gk80Var2;
        gk80 gk80Var3 = new gk80("Bottom", 2);
        b = gk80Var3;
        c = new gk80[]{gk80Var, gk80Var2, gk80Var3};
    }

    public gk80() {
        throw null;
    }

    public static gk80 valueOf(String str) {
        return (gk80) Enum.valueOf(gk80.class, str);
    }

    public static gk80[] values() {
        return (gk80[]) c.clone();
    }
}
