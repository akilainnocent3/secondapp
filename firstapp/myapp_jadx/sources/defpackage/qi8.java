package defpackage;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class qi8 {
    public static float a(int i, int i2) {
        float f = i / i2;
        if (f >= 2.2f || f >= 2.0f) {
            return 0.298f;
        }
        if (f >= 1.89f) {
            return 0.305f;
        }
        if (f < 1.8f && f < 1.7f) {
            return f >= 1.5f ? 0.36f : 0.32f;
        }
        return 0.30625f;
    }

    public static Map b(int i, float f) {
        Float fValueOf = Float.valueOf(0.2152f);
        Float fValueOf2 = Float.valueOf(0.044f);
        Float fValueOf3 = Float.valueOf(0.222f);
        Float fValueOf4 = Float.valueOf(0.1048f);
        Float fValueOf5 = Float.valueOf(0.2252f);
        Float fValueOf6 = Float.valueOf(0.23f);
        Float fValueOf7 = Float.valueOf(0.22f);
        Float fValueOf8 = Float.valueOf(0.056f);
        Float fValueOf9 = Float.valueOf(0.0328f);
        Float fValueOf10 = Float.valueOf(0.2392f);
        Pair pair = new Pair("coeffBox", fValueOf10);
        Pair pair2 = new Pair("winningChip", Float.valueOf(0.1268f));
        Pair pair3 = new Pair("space1", Float.valueOf(0.0207f));
        Pair pair4 = new Pair("amountBox", fValueOf10);
        Pair pair5 = new Pair("space2", Float.valueOf(0.105f));
        Pair pair6 = new Pair("CTABox", Float.valueOf(0.2691f));
        Float fValueOf11 = Float.valueOf(0.0f);
        Pair pair7 = new Pair("topPadding", fValueOf11);
        Pair pair8 = new Pair("bottomPadding", fValueOf11);
        Float fValueOf12 = Float.valueOf(0.01f);
        Pair pair9 = new Pair("bottomMargin", fValueOf12);
        Pair pair10 = new Pair("coeffBoxTitleHeight", Float.valueOf(0.18f));
        Float fValueOf13 = Float.valueOf(0.047f);
        Map mapF = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair("NetxButtonHeight", fValueOf13));
        float f2 = i / f;
        if (f2 >= 2.1f) {
            return kpu.f(new Pair("coeffBox", fValueOf6), new Pair("winningChip", Float.valueOf(0.1f)), new Pair("space1", fValueOf9), new Pair("amountBox", fValueOf6), new Pair("space2", Float.valueOf(0.0958f)), new Pair("CTABox", Float.valueOf(0.212f)), new Pair("topPadding", Float.valueOf(0.045f)), new Pair("bottomPadding", fValueOf8), new Pair("bottomMargin", fValueOf12), new Pair("coeffBoxTitleHeight", fValueOf7), new Pair("NetxButtonHeight", fValueOf13));
        }
        if (f2 >= 2.0f) {
            return kpu.f(new Pair("coeffBox", fValueOf5), new Pair("winningChip", Float.valueOf(0.09f)), new Pair("space1", fValueOf9), new Pair("amountBox", fValueOf5), new Pair("space2", fValueOf4), new Pair("CTABox", fValueOf3), new Pair("topPadding", fValueOf2), new Pair("bottomPadding", fValueOf8), new Pair("bottomMargin", fValueOf12), new Pair("coeffBoxTitleHeight", fValueOf7), new Pair("NetxButtonHeight", fValueOf13));
        }
        return f2 >= 1.5f ? kpu.f(new Pair("coeffBox", fValueOf), new Pair("winningChip", Float.valueOf(0.11f)), new Pair("space1", fValueOf9), new Pair("amountBox", fValueOf), new Pair("space2", fValueOf4), new Pair("CTABox", fValueOf3), new Pair("topPadding", fValueOf2), new Pair("bottomPadding", fValueOf8), new Pair("bottomMargin", fValueOf12), new Pair("coeffBoxTitleHeight", fValueOf7), new Pair("NetxButtonHeight", fValueOf13)) : mapF;
    }

    public static Map c(int i, float f) {
        Float fValueOf = Float.valueOf(0.065f);
        Float fValueOf2 = Float.valueOf(1.6f);
        Float fValueOf3 = Float.valueOf(6.0f);
        float f2 = i / f;
        Pair pair = new Pair("roundHistoryItemCount", Float.valueOf(8.0f));
        Float fValueOf4 = Float.valueOf(100.0f);
        Map mapF = kpu.f(pair, new Pair("ChatActivityHeightParam", fValueOf4), new Pair("heightMultiplier", Float.valueOf(1.82f)));
        if (f2 >= 2.2f) {
            return kpu.f(new Pair("roundHistoryItemCount", fValueOf3), new Pair("ChatActivityHeightParam", fValueOf4), new Pair("heightMultiplier", fValueOf2), new Pair("cashoutToastHeight", fValueOf));
        }
        if (f2 >= 1.89f) {
            return kpu.f(new Pair("roundHistoryItemCount", fValueOf3), new Pair("ChatActivityHeightParam", fValueOf4), new Pair("heightMultiplier", fValueOf2), new Pair("cashoutToastHeight", fValueOf));
        }
        return f2 >= 1.5f ? kpu.f(new Pair("roundHistoryItemCount", Float.valueOf(5.0f)), new Pair("ChatActivityHeightParam", Float.valueOf(150.0f)), new Pair("heightMultiplier", Float.valueOf(1.9f)), new Pair("cashoutToastHeight", Float.valueOf(0.085f))) : mapF;
    }
}
