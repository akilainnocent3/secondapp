package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cy80 {
    public static final cy80 a;
    public static final cy80 b;
    public static final cy80 c;
    public static final cy80 d;
    public static final cy80 e;
    public static final cy80 f;
    public static final cy80 i;
    public static final cy80 v;
    public static final /* synthetic */ cy80[] w;

    /* JADX INFO: Fake field, exist only in values array */
    cy80 EF0;

    static {
        cy80 cy80Var = new cy80("CornerExtraExtraLarge", 0);
        cy80 cy80Var2 = new cy80("CornerExtraLarge", 1);
        a = cy80Var2;
        cy80 cy80Var3 = new cy80("CornerExtraLargeIncreased", 2);
        cy80 cy80Var4 = new cy80("CornerExtraLargeTop", 3);
        b = cy80Var4;
        cy80 cy80Var5 = new cy80("CornerExtraSmall", 4);
        c = cy80Var5;
        cy80 cy80Var6 = new cy80("CornerExtraSmallTop", 5);
        d = cy80Var6;
        cy80 cy80Var7 = new cy80("CornerFull", 6);
        e = cy80Var7;
        cy80 cy80Var8 = new cy80("CornerLarge", 7);
        f = cy80Var8;
        cy80 cy80Var9 = new cy80("CornerLargeEnd", 8);
        cy80 cy80Var10 = new cy80("CornerLargeIncreased", 9);
        cy80 cy80Var11 = new cy80("CornerLargeStart", 10);
        cy80 cy80Var12 = new cy80("CornerLargeTop", 11);
        cy80 cy80Var13 = new cy80("CornerMedium", 12);
        i = cy80Var13;
        cy80 cy80Var14 = new cy80("CornerNone", 13);
        cy80 cy80Var15 = new cy80("CornerSmall", 14);
        v = cy80Var15;
        w = new cy80[]{cy80Var, cy80Var2, cy80Var3, cy80Var4, cy80Var5, cy80Var6, cy80Var7, cy80Var8, cy80Var9, cy80Var10, cy80Var11, cy80Var12, cy80Var13, cy80Var14, cy80Var15};
    }

    public cy80() {
        throw null;
    }

    public static cy80 valueOf(String str) {
        return (cy80) Enum.valueOf(cy80.class, str);
    }

    public static cy80[] values() {
        return (cy80[]) w.clone();
    }
}
