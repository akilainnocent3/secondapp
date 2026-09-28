package defpackage;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class ri8 {
    public static Map a(int i, float f) {
        Float fValueOf = Float.valueOf(3.56f);
        Float fValueOf2 = Float.valueOf(0.4f);
        float f2 = i / f;
        Float fValueOf3 = Float.valueOf(-0.01f);
        Pair pair = new Pair("defaultOffsetX", fValueOf3);
        Float fValueOf4 = Float.valueOf(0.087f);
        Pair pair2 = new Pair("defaultOffsetY", fValueOf4);
        Pair pair3 = new Pair("ongoingOffsetX", Float.valueOf(0.41f));
        Float fValueOf5 = Float.valueOf(-0.1f);
        Pair pair4 = new Pair("ongoingOffsetY", fValueOf5);
        Float fValueOf6 = Float.valueOf(1.0f);
        Pair pair5 = new Pair("endOffsetX", fValueOf6);
        Float fValueOf7 = Float.valueOf(-0.25f);
        Pair pair6 = new Pair("endOffsetY", fValueOf7);
        Float fValueOf8 = Float.valueOf(3.1f);
        Pair pair7 = new Pair("heroScaleX", fValueOf8);
        Pair pair8 = new Pair("heroScaleY", fValueOf8);
        Float fValueOf9 = Float.valueOf(30.0f);
        Map mapF = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("extraBoxHeight", fValueOf9));
        if (f2 >= 2.0f) {
            return kpu.f(new Pair("defaultOffsetX", fValueOf3), new Pair("defaultOffsetY", fValueOf4), new Pair("ongoingOffsetX", fValueOf2), new Pair("ongoingOffsetY", fValueOf5), new Pair("endOffsetX", fValueOf6), new Pair("endOffsetY", fValueOf7), new Pair("heroScaleX", fValueOf8), new Pair("heroScaleY", fValueOf8), new Pair("extraBoxHeight", fValueOf9));
        }
        if (f2 >= 1.89f) {
            return kpu.f(new Pair("defaultOffsetX", Float.valueOf(-0.03f)), new Pair("defaultOffsetY", Float.valueOf(0.085f)), new Pair("ongoingOffsetX", fValueOf2), new Pair("ongoingOffsetY", fValueOf5), new Pair("endOffsetX", fValueOf6), new Pair("endOffsetY", fValueOf7), new Pair("heroScaleX", fValueOf8), new Pair("heroScaleY", fValueOf8), new Pair("extraBoxHeight", fValueOf9));
        }
        return f2 >= 1.5f ? kpu.f(new Pair("defaultOffsetX", Float.valueOf(-0.04f)), new Pair("defaultOffsetY", Float.valueOf(0.053f)), new Pair("ongoingOffsetX", Float.valueOf(0.36f)), new Pair("ongoingOffsetY", fValueOf5), new Pair("endOffsetX", fValueOf6), new Pair("endOffsetY", Float.valueOf(-0.2f)), new Pair("heroScaleX", fValueOf), new Pair("heroScaleY", fValueOf), new Pair("extraBoxHeight", Float.valueOf(10.0f))) : mapF;
    }

    public static final String b(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }
}
