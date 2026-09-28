package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ep4 {
    public static final ep4 a;
    public static final ep4 b;
    public static final ep4 c;
    public static final ep4 d;
    public static final ep4 e;
    public static final ep4 f;
    public static final ep4 i;
    public static final ep4 v;
    public static final ep4 w;
    public static final ep4 y;
    public static final /* synthetic */ ep4[] z;

    static {
        ep4 ep4Var = new ep4("GAME_OVER", 0);
        a = ep4Var;
        ep4 ep4Var2 = new ep4("START_WHISTLE", 1);
        b = ep4Var2;
        ep4 ep4Var3 = new ep4("COUNTDOWN_THREE", 2);
        ep4 ep4Var4 = new ep4("COUNTDOWN_TWO", 3);
        ep4 ep4Var5 = new ep4("COUNTDOWN_ONE", 4);
        ep4 ep4Var6 = new ep4("BALL_MISSED", 5);
        c = ep4Var6;
        ep4 ep4Var7 = new ep4("CUP_REBOUND", 6);
        d = ep4Var7;
        ep4 ep4Var8 = new ep4("BALL_REBOUND", 7);
        e = ep4Var8;
        ep4 ep4Var9 = new ep4("BALL_CAUGHT", 8);
        f = ep4Var9;
        ep4 ep4Var10 = new ep4("GOLDEN_BALL_CAUGHT", 9);
        i = ep4Var10;
        ep4 ep4Var11 = new ep4("YELLOW_CARD_CAUGHT", 10);
        v = ep4Var11;
        ep4 ep4Var12 = new ep4("RED_CARD_CAUGHT", 11);
        w = ep4Var12;
        ep4 ep4Var13 = new ep4("BALL_BECOMES_GOLDEN", 12);
        y = ep4Var13;
        z = new ep4[]{ep4Var, ep4Var2, ep4Var3, ep4Var4, ep4Var5, ep4Var6, ep4Var7, ep4Var8, ep4Var9, ep4Var10, ep4Var11, ep4Var12, ep4Var13};
    }

    public ep4() {
        throw null;
    }

    public static ep4 valueOf(String str) {
        return (ep4) Enum.valueOf(ep4.class, str);
    }

    public static ep4[] values() {
        return (ep4[]) z.clone();
    }
}
