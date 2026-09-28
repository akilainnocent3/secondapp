package defpackage;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wj4 {
    public static final wj4 a;
    public static final wj4 b;
    public static final wj4 c;
    public static final wj4 d;
    public static final wj4 e;
    public static final wj4 f;
    public static final wj4 i;
    public static final wj4 v;
    public static final /* synthetic */ wj4[] w;

    public wj4() {
        throw null;
    }

    public static wj4 valueOf(String str) {
        return (wj4) Enum.valueOf(wj4.class, str);
    }

    public static wj4[] values() {
        return (wj4[]) w.clone();
    }

    static {
        wj4 wj4Var = new wj4("NORMAL_BALL_COLLECTED", 0);
        a = wj4Var;
        wj4 wj4Var2 = new wj4("GOLDEN_BALL_COLLECTED", 1);
        b = wj4Var2;
        wj4 wj4Var3 = new wj4("BALL_BECOMES_GOLDEN", 2);
        c = wj4Var3;
        wj4 wj4Var4 = new wj4("BALL_JUGGLED", 3);
        d = wj4Var4;
        wj4 wj4Var5 = new wj4(vZBMKENANSz.suD, 4);
        e = wj4Var5;
        wj4 wj4Var6 = new wj4("BALL_MISSED", 5);
        f = wj4Var6;
        wj4 wj4Var7 = new wj4("YELLOW_CARD_COLLECTED", 6);
        i = wj4Var7;
        wj4 wj4Var8 = new wj4("RED_CARD_COLLECTED", 7);
        v = wj4Var8;
        w = new wj4[]{wj4Var, wj4Var2, wj4Var3, wj4Var4, wj4Var5, wj4Var6, wj4Var7, wj4Var8};
    }
}
