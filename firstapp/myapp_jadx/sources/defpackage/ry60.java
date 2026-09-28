package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.recyclerview.widget.r;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class ry60 implements y2b {
    public static final ry60 a = new ry60();

    public static final void a(wf40 wf40Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        wf40Var.cancel(cancellationException);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x079a  */
    /* JADX WARN: Code duplicated, block: B:102:0x079f  */
    /* JADX WARN: Code duplicated, block: B:105:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:106:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:110:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:113:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:115:0x07db  */
    /* JADX WARN: Code duplicated, block: B:118:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:122:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0802  */
    /* JADX WARN: Code duplicated, block: B:126:0x080e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0813  */
    /* JADX WARN: Code duplicated, block: B:130:0x081f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0826  */
    /* JADX WARN: Code duplicated, block: B:135:0x0833  */
    /* JADX WARN: Code duplicated, block: B:136:0x083a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0846  */
    /* JADX WARN: Code duplicated, block: B:140:0x084b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0857  */
    /* JADX WARN: Code duplicated, block: B:146:0x0b86 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:147:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:22:0x063f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0644  */
    /* JADX WARN: Code duplicated, block: B:26:0x064f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0654  */
    /* JADX WARN: Code duplicated, block: B:30:0x065f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0664  */
    /* JADX WARN: Code duplicated, block: B:34:0x066f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0674  */
    /* JADX WARN: Code duplicated, block: B:38:0x067f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0684  */
    /* JADX WARN: Code duplicated, block: B:42:0x068f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0694  */
    /* JADX WARN: Code duplicated, block: B:46:0x069f  */
    /* JADX WARN: Code duplicated, block: B:47:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x06af  */
    /* JADX WARN: Code duplicated, block: B:52:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:64:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0704  */
    /* JADX WARN: Code duplicated, block: B:72:0x0711  */
    /* JADX WARN: Code duplicated, block: B:73:0x0718  */
    /* JADX WARN: Code duplicated, block: B:76:0x0725  */
    /* JADX WARN: Code duplicated, block: B:77:0x072a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0737  */
    /* JADX WARN: Code duplicated, block: B:81:0x073c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0749  */
    /* JADX WARN: Code duplicated, block: B:86:0x0750  */
    /* JADX WARN: Code duplicated, block: B:89:0x075e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0765  */
    /* JADX WARN: Code duplicated, block: B:93:0x0772  */
    /* JADX WARN: Code duplicated, block: B:94:0x0779  */
    /* JADX WARN: Code duplicated, block: B:97:0x0786  */
    /* JADX WARN: Code duplicated, block: B:98:0x078d  */
    public static List b(int i, Context context, boolean z) {
        char c;
        float f;
        Object obj;
        Object obj2;
        Object obj3;
        Map[] mapArr;
        Float f2;
        float fFloatValue;
        Float f3;
        float fFloatValue2;
        Float f4;
        float fFloatValue3;
        Float f5;
        float fFloatValue4;
        Float f6;
        float fFloatValue5;
        Float f7;
        float fFloatValue6;
        Float f8;
        float fFloatValue7;
        Float f9;
        float fFloatValue8;
        Float f10;
        float fFloatValue9;
        Float f11;
        float fFloatValue10;
        Float f12;
        float fFloatValue11;
        Float f13;
        float fFloatValue12;
        Float f14;
        float fFloatValue13;
        Float f15;
        float fFloatValue14;
        Float f16;
        float fFloatValue15;
        Float f17;
        float fFloatValue16;
        Float f18;
        float fFloatValue17;
        Float f19;
        float fFloatValue18;
        Float f20;
        float fFloatValue19;
        Float f21;
        float fFloatValue20;
        Float f22;
        float fFloatValue21;
        Float f23;
        float fFloatValue22;
        Float f24;
        float fFloatValue23;
        Float f25;
        float fFloatValue24;
        Float f26;
        float fFloatValue25;
        Float f27;
        float fFloatValue26;
        Float f28;
        float fFloatValue27;
        Float f29;
        float fFloatValue28;
        Float f30;
        float fFloatValue29;
        List listK;
        Float fValueOf = Float.valueOf(0.68f);
        Float fValueOf2 = Float.valueOf(0.74f);
        Float fValueOf3 = Float.valueOf(0.15f);
        Float fValueOf4 = Float.valueOf(0.645f);
        Float fValueOf5 = Float.valueOf(0.22f);
        Float fValueOf6 = Float.valueOf(0.655f);
        Float fValueOf7 = Float.valueOf(0.76f);
        Float fValueOf8 = Float.valueOf(0.47f);
        Float fValueOf9 = Float.valueOf(0.49f);
        Float fValueOf10 = Float.valueOf(-0.2f);
        Float fValueOf11 = Float.valueOf(0.1f);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f31 = displayMetrics.density;
        int i2 = displayMetrics.widthPixels;
        float f32 = i;
        float f33 = ((0.25f * f32) / 5.0f) / f31;
        int i3 = (i / 50) + (i2 / r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        float dimension = context.getResources().getDimension(R.dimen._6sdp);
        float f34 = i2;
        Map mapB = qi8.b(i, f34);
        Float fValueOf12 = Float.valueOf(0.32f);
        Float fValueOf13 = Float.valueOf(0.88f);
        float f35 = f32 / f34;
        Float fValueOf14 = Float.valueOf(4.8f);
        Pair pair = new Pair("imagePercentXRatio", fValueOf14);
        Float fValueOf15 = Float.valueOf(0.91f);
        Pair pair2 = new Pair("titlePercentYArrow", fValueOf15);
        Float fValueOf16 = Float.valueOf(0.78f);
        Pair pair3 = new Pair("imagePercentYArrow", fValueOf16);
        Float fValueOf17 = Float.valueOf(0.4f);
        Pair pair4 = new Pair("imagePercentXRatio", fValueOf14);
        Float fValueOf18 = Float.valueOf(0.92f);
        Pair pair5 = new Pair("CTARowPosition", fValueOf18);
        Float fValueOf19 = Float.valueOf(0.7f);
        Float fValueOf20 = Float.valueOf(0.52f);
        Pair pair6 = new Pair("CTARowPosition", fValueOf20);
        Float fValueOf21 = Float.valueOf(0.67f);
        Pair pair7 = new Pair("boxWidth", fValueOf21);
        Pair pair8 = new Pair("imagePercentYArrow", fValueOf16);
        Float fValueOf22 = Float.valueOf(0.3f);
        Pair pair9 = new Pair("CTARowPosition", fValueOf20);
        Float fValueOf23 = Float.valueOf(0.8f);
        Pair pair10 = new Pair("imagePercentYArrow", fValueOf23);
        Float fValueOf24 = Float.valueOf(0.65f);
        Pair pair11 = new Pair("CTARowPosition", fValueOf18);
        Float fValueOf25 = Float.valueOf(0.12f);
        Pair pair12 = new Pair("whiteBoxWidth", fValueOf25);
        Float fValueOf26 = Float.valueOf(0.067f);
        Pair pair13 = new Pair("titlePercentY", fValueOf26);
        Float fValueOf27 = Float.valueOf(0.08f);
        Pair pair14 = new Pair("imagePercentYArrow", fValueOf27);
        Float fValueOf28 = Float.valueOf(0.73f);
        Map[] mapArr2 = {kpu.f(pair, pair2, pair3, new Pair("imagePercentXArrow", fValueOf17)), kpu.f(pair4, pair5, new Pair("imagePercentYArrow", fValueOf19), new Pair("imagePercentXArrow", fValueOf17)), kpu.f(pair6, pair7, pair8, new Pair("imagePercentXArrow", fValueOf22)), kpu.f(pair9, pair10, new Pair("imagePercentXArrow", fValueOf24)), kpu.f(pair11, pair12, pair13, pair14, new Pair("imagePercentXArrow", fValueOf28))};
        if (f35 < 2.2f) {
            if (f35 < 2.0f) {
                c = 4;
                f = 2.0f;
                obj = "titlePercentYArrow";
                if (f35 >= 1.89f) {
                    mapArr = new Map[]{kpu.f(new Pair("imagePercentXRatio", fValueOf12), new Pair("CTARowPosition", fValueOf18), new Pair(obj, fValueOf15), new Pair("imagePercentYArrow", fValueOf16), new Pair("imagePercentXArrow", fValueOf17)), kpu.f(new Pair("imagePercentXRatio", fValueOf12), new Pair("CTARowPosition", fValueOf18), new Pair("imagePercentYArrow", fValueOf19), new Pair("imagePercentXArrow", fValueOf17)), kpu.f(new Pair("imagePercentXRatio", fValueOf5), new Pair("whiteBoxYTopPadding", fValueOf10), new Pair("CTARowPosition", fValueOf20), new Pair("boxWidth", Float.valueOf(0.688f)), new Pair("imagePercentYArrow", fValueOf16), new Pair("imagePercentXArrow", fValueOf22)), kpu.f(new Pair("whiteBoxYTopPadding", fValueOf10), new Pair("whiteBoxXLeftPadding", fValueOf4), new Pair("CTARowPosition", fValueOf20), new Pair("imagePercentYArrow", fValueOf23), new Pair("imagePercentXArrow", fValueOf24)), kpu.f(new Pair("CTARowPosition", fValueOf18), new Pair("whiteBoxWidth", fValueOf3), new Pair("titlePercentY", fValueOf26), new Pair("imagePercentYArrow", fValueOf27), new Pair("imagePercentXArrow", fValueOf28))};
                    obj3 = "titlePercentY";
                } else if (f35 >= 1.58f) {
                    obj2 = obj;
                    mapArr = new Map[]{kpu.f(new Pair("imagePercentXRatio", fValueOf9), new Pair("CTARowPosition", fValueOf13), new Pair("imagePercentYArrow", fValueOf2), new Pair("imagePercentXArrow", fValueOf17), new Pair(obj2, fValueOf13)), kpu.f(new Pair("imagePercentXRatio", fValueOf9), new Pair("CTARowPosition", fValueOf13), new Pair("imagePercentYArrow", fValueOf21), new Pair("imagePercentXArrow", fValueOf17)), kpu.f(new Pair("imagePercentXRatio", fValueOf12), new Pair("whiteBoxYTopPadding", fValueOf11), new Pair("CTARowPosition", fValueOf8), new Pair("boxWidth", fValueOf), new Pair("imagePercentYArrow", fValueOf7), new Pair("imagePercentXArrow", fValueOf22)), kpu.f(new Pair("whiteBoxYTopPadding", fValueOf11), new Pair("whiteBoxXLeftPadding", fValueOf6), new Pair("CTARowPosition", fValueOf8), new Pair("imagePercentYArrow", fValueOf7), new Pair("imagePercentXArrow", fValueOf24)), kpu.f(new Pair("CTARowPosition", fValueOf13), new Pair("whiteBoxWidth", fValueOf25), new Pair("titlePercentY", fValueOf26), new Pair("imagePercentYArrow", fValueOf27), new Pair("imagePercentXArrow", fValueOf28))};
                    obj3 = "titlePercentY";
                } else {
                    obj2 = obj;
                    if (f35 >= 1.5f) {
                        obj3 = "titlePercentY";
                        mapArr = new Map[]{kpu.f(new Pair("imagePercentXRatio", fValueOf9), new Pair("CTARowPosition", fValueOf13), new Pair("imagePercentYArrow", fValueOf2), new Pair("imagePercentXArrow", fValueOf17), new Pair(obj2, fValueOf13)), kpu.f(new Pair("imagePercentXRatio", fValueOf9), new Pair("CTARowPosition", fValueOf13), new Pair("imagePercentYArrow", fValueOf21), new Pair("imagePercentXArrow", fValueOf17)), kpu.f(new Pair("imagePercentXRatio", fValueOf12), new Pair("whiteBoxYTopPadding", fValueOf11), new Pair("CTARowPosition", fValueOf8), new Pair("boxWidth", fValueOf), new Pair("imagePercentYArrow", fValueOf7), new Pair("imagePercentXArrow", fValueOf22)), kpu.f(new Pair("whiteBoxYTopPadding", fValueOf11), new Pair("whiteBoxXLeftPadding", fValueOf6), new Pair("CTARowPosition", fValueOf8), new Pair("imagePercentYArrow", fValueOf7), new Pair("imagePercentXArrow", fValueOf24)), kpu.f(new Pair("CTARowPosition", fValueOf13), new Pair("whiteBoxWidth", fValueOf11), new Pair(obj3, Float.valueOf(0.072f)), new Pair("imagePercentYArrow", fValueOf27), new Pair("imagePercentXArrow", fValueOf28))};
                    } else {
                        obj3 = "titlePercentY";
                    }
                }
                f2 = (Float) mapB.get("coeffBox");
                if (f2 != null) {
                    fFloatValue = f2.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                f3 = (Float) mapB.get("winningChip");
                if (f3 != null) {
                    fFloatValue2 = f3.floatValue();
                } else {
                    fFloatValue2 = 0.0f;
                }
                f4 = (Float) mapB.get("space1");
                if (f4 != null) {
                    fFloatValue3 = f4.floatValue();
                } else {
                    fFloatValue3 = 0.0f;
                }
                f5 = (Float) mapB.get("amountBox");
                if (f5 != null) {
                    fFloatValue4 = f5.floatValue();
                } else {
                    fFloatValue4 = 0.0f;
                }
                f6 = (Float) mapB.get("space2");
                if (f6 != null) {
                    fFloatValue5 = f6.floatValue();
                } else {
                    fFloatValue5 = 0.0f;
                }
                f7 = (Float) mapB.get("CTABox");
                if (f7 != null) {
                    fFloatValue6 = f7.floatValue();
                } else {
                    fFloatValue6 = 0.0f;
                }
                f8 = (Float) mapB.get("topPadding");
                if (f8 != null) {
                    fFloatValue7 = f8.floatValue();
                } else {
                    fFloatValue7 = 0.0f;
                }
                f9 = (Float) mapB.get("bottomPadding");
                if (f9 != null) {
                    fFloatValue8 = f9.floatValue();
                } else {
                    fFloatValue8 = 0.0f;
                }
                f10 = (Float) mapB.get("bottomMargin");
                if (f10 != null) {
                    fFloatValue9 = f10.floatValue();
                } else {
                    fFloatValue9 = 0.0f;
                }
                float f36 = fFloatValue;
                f11 = (Float) mapB.get("NetxButtonHeight");
                if (f11 != null) {
                    fFloatValue10 = f11.floatValue();
                } else {
                    fFloatValue10 = 0.0f;
                }
                f12 = (Float) mapArr[0].get(obj2);
                if (f12 != null) {
                    fFloatValue11 = f12.floatValue();
                } else {
                    fFloatValue11 = 0.9f;
                }
                f13 = (Float) mapArr[0].get("imagePercentYArrow");
                if (f13 != null) {
                    fFloatValue12 = f13.floatValue();
                } else {
                    fFloatValue12 = 0.9f;
                }
                f14 = (Float) mapArr[0].get("imagePercentXArrow");
                if (f14 != null) {
                    fFloatValue13 = f14.floatValue();
                } else {
                    fFloatValue13 = 0.9f;
                }
                f15 = (Float) mapArr[1].get("imagePercentYArrow");
                if (f15 != null) {
                    fFloatValue14 = f15.floatValue();
                } else {
                    fFloatValue14 = 0.9f;
                }
                f16 = (Float) mapArr[1].get("imagePercentXArrow");
                if (f16 != null) {
                    fFloatValue15 = f16.floatValue();
                } else {
                    fFloatValue15 = 0.9f;
                }
                f17 = (Float) mapArr[2].get("imagePercentYArrow");
                if (f17 != null) {
                    fFloatValue16 = f17.floatValue();
                } else {
                    fFloatValue16 = 0.9f;
                }
                float f37 = fFloatValue14;
                f18 = (Float) mapArr[2].get("imagePercentXArrow");
                if (f18 != null) {
                    fFloatValue17 = f18.floatValue();
                } else {
                    fFloatValue17 = 0.9f;
                }
                f19 = (Float) mapArr[3].get("imagePercentYArrow");
                if (f19 != null) {
                    fFloatValue18 = f19.floatValue();
                } else {
                    fFloatValue18 = 0.9f;
                }
                f20 = (Float) mapArr[3].get("imagePercentXArrow");
                if (f20 != null) {
                    fFloatValue19 = f20.floatValue();
                } else {
                    fFloatValue19 = 0.9f;
                }
                f21 = (Float) mapArr[c].get("imagePercentYArrow");
                if (f21 != null) {
                    fFloatValue20 = f21.floatValue();
                } else {
                    fFloatValue20 = 0.9f;
                }
                f22 = (Float) mapArr[c].get("imagePercentXArrow");
                if (f22 != null) {
                    fFloatValue21 = f22.floatValue();
                } else {
                    fFloatValue21 = 0.9f;
                }
                f23 = (Float) mapArr[0].get("CTARowPosition");
                if (f23 != null) {
                    fFloatValue22 = f23.floatValue();
                } else {
                    fFloatValue22 = 0.84f;
                }
                f24 = (Float) mapArr[1].get("CTARowPosition");
                if (f24 != null) {
                    fFloatValue23 = f24.floatValue();
                } else {
                    fFloatValue23 = 0.84f;
                }
                float f38 = fFloatValue20;
                f25 = (Float) mapArr[2].get("CTARowPosition");
                if (f25 != null) {
                    fFloatValue24 = f25.floatValue();
                } else {
                    fFloatValue24 = 0.84f;
                }
                f26 = (Float) mapArr[3].get("CTARowPosition");
                if (f26 != null) {
                    fFloatValue25 = f26.floatValue();
                } else {
                    fFloatValue25 = 0.84f;
                }
                f27 = (Float) mapArr[c].get("CTARowPosition");
                if (f27 != null) {
                    fFloatValue26 = f27.floatValue();
                } else {
                    fFloatValue26 = 0.84f;
                }
                f28 = (Float) mapArr[0].get("imagePercentXRatio");
                if (f28 != null) {
                    fFloatValue27 = f28.floatValue();
                } else {
                    fFloatValue27 = 0.0f;
                }
                float f39 = fFloatValue26;
                f29 = (Float) mapArr[1].get("imagePercentXRatio");
                if (f29 != null) {
                    fFloatValue28 = f29.floatValue();
                } else {
                    fFloatValue28 = 0.0f;
                }
                f30 = (Float) mapArr[2].get("imagePercentXRatio");
                if (f30 != null) {
                    fFloatValue29 = f30.floatValue();
                } else {
                    fFloatValue29 = 0.0f;
                }
                Float f40 = (Float) mapArr[c].get(obj3);
                float fFloatValue30 = f40 != null ? f40.floatValue() : 0.7f;
                float f41 = fFloatValue29;
                float fApplyDimension = (f34 - ((i2 / 15) * f)) - (TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics()) * 3.0f);
                float fApplyDimension2 = (TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics()) * f) + (f34 / 15.0f);
                float fA = qi8.a(i, i2);
                float f42 = f32 * fA;
                float f43 = i3;
                float f44 = ((i2 - i3) * 0.04f) + f43;
                float f45 = f34 - (f * f44);
                float f46 = f45 / f34;
                op5 op5Var = op5.a;
                String string = context.getString(R.string.onboarding_target_coefficient_cms);
                float f47 = fFloatValue9;
                String strA = at6.a(string, context, R.string.onboarding_target_coefficient_text, op5Var, string);
                String string2 = context.getString(R.string.onboarding_brand_left_half_cms);
                string2.getClass();
                float f48 = fFloatValue2;
                float f49 = f47 * f32;
                float f50 = f49 * fA;
                float f51 = f46 * fFloatValue27;
                float f52 = 1.0f - fA;
                float f53 = fFloatValue7 * fA;
                tpy tpyVar = new tpy(strA, op5.c(op5Var, string2, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f44)) << 32) | (((long) Float.floatToRawIntBits(f42 - (fFloatValue7 * f42))) & 4294967295L), (((long) Float.floatToRawIntBits(f45)) << 32) | (((long) Float.floatToRawIntBits((f42 * f36) - f50)) & 4294967295L)), f51, (f47 / f) + f52 + f53, fFloatValue13, fFloatValue12, 0.3f, 0.0f, 0.6f, 0.6f, -0.05f, fFloatValue11, -1.0f, 0.9f, fFloatValue22, fFloatValue10);
                String string3 = context.getString(R.string.onboarding_enter_bet_amount_cms);
                float f54 = fFloatValue21;
                String strA2 = at6.a(string3, context, R.string.onboarding_enter_bet_amount_text, op5Var, string3);
                String string4 = context.getString(R.string.onboarding_brand_left_half_cms);
                string4.getClass();
                float f55 = fFloatValue7 + f36 + f48 + fFloatValue3;
                tpy tpyVar2 = new tpy(strA2, op5.c(op5Var, string4, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f44)) << 32) | (((long) Float.floatToRawIntBits((f42 - (f55 * f42)) + f50)) & 4294967295L), (((long) Float.floatToRawIntBits(f45)) << 32) | (((long) Float.floatToRawIntBits(f42 * fFloatValue4 * 0.94f)) & 4294967295L)), f46 * fFloatValue28, (f47 * fA) + (fFloatValue3 * fA) + (f48 * fA) + (f36 * fA) + f53 + f52, fFloatValue15, f37, 0.3f, 0.1f, 0.69f, 0.5f, 0.27f, 0.67f, 1.0f, 0.6f, fFloatValue23, fFloatValue10);
                String string5 = context.getString(R.string.onboarding_place_bet_cms);
                String strA3 = at6.a(string5, context, R.string.onboarding_place_bet_text, op5Var, string5);
                String string6 = context.getString(R.string.onboarding_brand_left_full_cms);
                string6.getClass();
                int i4 = i3 * 2;
                float f56 = i2 - i4;
                float f57 = (0.185f * fFloatValue5 * f42) + (fFloatValue6 * f42) + (fFloatValue8 * f42) + f49;
                float f58 = ((0.42f * fFloatValue5) + fFloatValue6) * f42;
                tpy tpyVar3 = new tpy(strA3, op5.c(op5Var, string6, ""), new hlc(f33, (((long) Float.floatToRawIntBits((0.0825f * f56) + (f43 * 1.0f))) << 32) | (((long) Float.floatToRawIntBits(f57)) & 4294967295L), (((long) Float.floatToRawIntBits((f56 * 0.845f) * 0.66f)) << 32) | (((long) Float.floatToRawIntBits(f58)) & 4294967295L)), f46 * f41, 1.15f, fFloatValue17, fFloatValue16, 0.5f, 0.1f, 0.83f, 0.6f, 0.0f, 0.75f, 1.0f, 0.6f, fFloatValue24, fFloatValue10);
                String string7 = context.getString(R.string.onboarding_place_auto_bet_cms);
                String strA4 = at6.a(string7, context, R.string.onboarding_place_auto_bet_text, op5Var, string7);
                String string8 = context.getString(R.string.onboarding_brand_right_half_cms);
                string8.getClass();
                float f59 = f * dimension;
                float fA2 = hxa.a(f56, f59, 0.08f, (dimension + f43) * 1.0f);
                float f60 = f34 - (i4 + f59);
                tpy tpyVar4 = new tpy(strA4, op5.c(op5Var, string8, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f34 - (((0.84f * f60) * 0.32f) + fA2))) << 32) | (((long) Float.floatToRawIntBits(f57)) & 4294967295L), (((long) Float.floatToRawIntBits((f60 * 0.845f) * 0.34f)) << 32) | (((long) Float.floatToRawIntBits(f58)) & 4294967295L)), 0.1f, ((f32 - (f42 - (((fFloatValue5 * 0.75f) + (f55 + fFloatValue4)) * f42))) - 0.0f) / f32, fFloatValue19, fFloatValue18, 0.32f, 0.6f, 0.82f, 0.9f, 0.2f, 0.775f, 1.0f, 0.8f, fFloatValue25, fFloatValue10);
                String string9 = context.getString(R.string.onboarding_chat_cms);
                String strA5 = at6.a(string9, context, R.string.onboarding_chat_text, op5Var, string9);
                String string10 = context.getString(R.string.onboarding_brand_up_full_cms);
                string10.getClass();
                listK = b.k(tpyVar, tpyVar2, tpyVar3, tpyVar4, new tpy(strA5, op5.c(op5Var, string10, ""), new hlc(f33 / 4.0f, (((long) Float.floatToRawIntBits(fApplyDimension)) << 32) | (((long) Float.floatToRawIntBits(f32 * 0.99f)) & 4294967295L), (((long) Float.floatToRawIntBits(fApplyDimension2)) << 32) | (((long) Float.floatToRawIntBits(f32 * 0.058f)) & 4294967295L)), 0.08f, 0.7f, f54, f38, 0.6f, -0.125f, fFloatValue30, 0.9f, 0.0f, 0.23f, -1.0f, 0.9f, f39, fFloatValue10));
                if (z) {
                    return listK;
                }
                return CollectionsKt.P(listK);
            }
            c = 4;
            f = 2.0f;
            obj = "titlePercentYArrow";
            obj3 = "titlePercentY";
            mapArr = new Map[]{kpu.f(new Pair("imagePercentXRatio", fValueOf12), new Pair("CTARowPosition", fValueOf18), new Pair("titlePercentYArrow", fValueOf15), new Pair("imagePercentYArrow", fValueOf16), new Pair("imagePercentXArrow", fValueOf17)), kpu.f(new Pair("imagePercentXRatio", fValueOf12), new Pair("CTARowPosition", fValueOf18), new Pair("imagePercentYArrow", fValueOf19), new Pair("imagePercentXArrow", fValueOf17)), kpu.f(new Pair("imagePercentXRatio", fValueOf5), new Pair("whiteBoxYTopPadding", fValueOf10), new Pair("CTARowPosition", fValueOf20), new Pair("boxWidth", fValueOf6), new Pair("imagePercentYArrow", fValueOf16), new Pair("imagePercentXArrow", fValueOf22)), kpu.f(new Pair("whiteBoxYTopPadding", fValueOf10), new Pair("whiteBoxXLeftPadding", fValueOf4), new Pair("CTARowPosition", fValueOf20), new Pair("imagePercentYArrow", fValueOf23), new Pair("imagePercentXArrow", fValueOf24)), kpu.f(new Pair("CTARowPosition", fValueOf18), new Pair("whiteBoxWidth", fValueOf3), new Pair(obj3, Float.valueOf(0.055f)), new Pair("imagePercentYArrow", fValueOf27), new Pair("imagePercentXArrow", fValueOf28))};
            obj2 = obj;
            f2 = (Float) mapB.get("coeffBox");
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            f3 = (Float) mapB.get("winningChip");
            if (f3 != null) {
                fFloatValue2 = f3.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            f4 = (Float) mapB.get("space1");
            if (f4 != null) {
                fFloatValue3 = f4.floatValue();
            } else {
                fFloatValue3 = 0.0f;
            }
            f5 = (Float) mapB.get("amountBox");
            if (f5 != null) {
                fFloatValue4 = f5.floatValue();
            } else {
                fFloatValue4 = 0.0f;
            }
            f6 = (Float) mapB.get("space2");
            if (f6 != null) {
                fFloatValue5 = f6.floatValue();
            } else {
                fFloatValue5 = 0.0f;
            }
            f7 = (Float) mapB.get("CTABox");
            if (f7 != null) {
                fFloatValue6 = f7.floatValue();
            } else {
                fFloatValue6 = 0.0f;
            }
            f8 = (Float) mapB.get("topPadding");
            if (f8 != null) {
                fFloatValue7 = f8.floatValue();
            } else {
                fFloatValue7 = 0.0f;
            }
            f9 = (Float) mapB.get("bottomPadding");
            if (f9 != null) {
                fFloatValue8 = f9.floatValue();
            } else {
                fFloatValue8 = 0.0f;
            }
            f10 = (Float) mapB.get("bottomMargin");
            if (f10 != null) {
                fFloatValue9 = f10.floatValue();
            } else {
                fFloatValue9 = 0.0f;
            }
            float f310 = fFloatValue;
            f11 = (Float) mapB.get("NetxButtonHeight");
            if (f11 != null) {
                fFloatValue10 = f11.floatValue();
            } else {
                fFloatValue10 = 0.0f;
            }
            f12 = (Float) mapArr[0].get(obj2);
            if (f12 != null) {
                fFloatValue11 = f12.floatValue();
            } else {
                fFloatValue11 = 0.9f;
            }
            f13 = (Float) mapArr[0].get("imagePercentYArrow");
            if (f13 != null) {
                fFloatValue12 = f13.floatValue();
            } else {
                fFloatValue12 = 0.9f;
            }
            f14 = (Float) mapArr[0].get("imagePercentXArrow");
            if (f14 != null) {
                fFloatValue13 = f14.floatValue();
            } else {
                fFloatValue13 = 0.9f;
            }
            f15 = (Float) mapArr[1].get("imagePercentYArrow");
            if (f15 != null) {
                fFloatValue14 = f15.floatValue();
            } else {
                fFloatValue14 = 0.9f;
            }
            f16 = (Float) mapArr[1].get("imagePercentXArrow");
            if (f16 != null) {
                fFloatValue15 = f16.floatValue();
            } else {
                fFloatValue15 = 0.9f;
            }
            f17 = (Float) mapArr[2].get("imagePercentYArrow");
            if (f17 != null) {
                fFloatValue16 = f17.floatValue();
            } else {
                fFloatValue16 = 0.9f;
            }
            float f311 = fFloatValue14;
            f18 = (Float) mapArr[2].get("imagePercentXArrow");
            if (f18 != null) {
                fFloatValue17 = f18.floatValue();
            } else {
                fFloatValue17 = 0.9f;
            }
            f19 = (Float) mapArr[3].get("imagePercentYArrow");
            if (f19 != null) {
                fFloatValue18 = f19.floatValue();
            } else {
                fFloatValue18 = 0.9f;
            }
            f20 = (Float) mapArr[3].get("imagePercentXArrow");
            if (f20 != null) {
                fFloatValue19 = f20.floatValue();
            } else {
                fFloatValue19 = 0.9f;
            }
            f21 = (Float) mapArr[c].get("imagePercentYArrow");
            if (f21 != null) {
                fFloatValue20 = f21.floatValue();
            } else {
                fFloatValue20 = 0.9f;
            }
            f22 = (Float) mapArr[c].get("imagePercentXArrow");
            if (f22 != null) {
                fFloatValue21 = f22.floatValue();
            } else {
                fFloatValue21 = 0.9f;
            }
            f23 = (Float) mapArr[0].get("CTARowPosition");
            if (f23 != null) {
                fFloatValue22 = f23.floatValue();
            } else {
                fFloatValue22 = 0.84f;
            }
            f24 = (Float) mapArr[1].get("CTARowPosition");
            if (f24 != null) {
                fFloatValue23 = f24.floatValue();
            } else {
                fFloatValue23 = 0.84f;
            }
            float f312 = fFloatValue20;
            f25 = (Float) mapArr[2].get("CTARowPosition");
            if (f25 != null) {
                fFloatValue24 = f25.floatValue();
            } else {
                fFloatValue24 = 0.84f;
            }
            f26 = (Float) mapArr[3].get("CTARowPosition");
            if (f26 != null) {
                fFloatValue25 = f26.floatValue();
            } else {
                fFloatValue25 = 0.84f;
            }
            f27 = (Float) mapArr[c].get("CTARowPosition");
            if (f27 != null) {
                fFloatValue26 = f27.floatValue();
            } else {
                fFloatValue26 = 0.84f;
            }
            f28 = (Float) mapArr[0].get("imagePercentXRatio");
            if (f28 != null) {
                fFloatValue27 = f28.floatValue();
            } else {
                fFloatValue27 = 0.0f;
            }
            float f313 = fFloatValue26;
            f29 = (Float) mapArr[1].get("imagePercentXRatio");
            if (f29 != null) {
                fFloatValue28 = f29.floatValue();
            } else {
                fFloatValue28 = 0.0f;
            }
            f30 = (Float) mapArr[2].get("imagePercentXRatio");
            if (f30 != null) {
                fFloatValue29 = f30.floatValue();
            } else {
                fFloatValue29 = 0.0f;
            }
            Float f410 = (Float) mapArr[c].get(obj3);
            if (f410 != null) {
            }
            float f411 = fFloatValue29;
            float fApplyDimension3 = (f34 - ((i2 / 15) * f)) - (TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics()) * 3.0f);
            float fApplyDimension4 = (TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics()) * f) + (f34 / 15.0f);
            float fA3 = qi8.a(i, i2);
            float f412 = f32 * fA3;
            float f413 = i3;
            float f414 = ((i2 - i3) * 0.04f) + f413;
            float f415 = f34 - (f * f414);
            float f416 = f415 / f34;
            op5 op5Var2 = op5.a;
            String string11 = context.getString(R.string.onboarding_target_coefficient_cms);
            float f417 = fFloatValue9;
            String strA6 = at6.a(string11, context, R.string.onboarding_target_coefficient_text, op5Var2, string11);
            String string12 = context.getString(R.string.onboarding_brand_left_half_cms);
            string12.getClass();
            float f418 = fFloatValue2;
            float f419 = f417 * f32;
            float f510 = f419 * fA3;
            float f511 = f416 * fFloatValue27;
            float f512 = 1.0f - fA3;
            float f513 = fFloatValue7 * fA3;
            tpy tpyVar5 = new tpy(strA6, op5.c(op5Var2, string12, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f414)) << 32) | (((long) Float.floatToRawIntBits(f412 - (fFloatValue7 * f412))) & 4294967295L), (((long) Float.floatToRawIntBits(f415)) << 32) | (((long) Float.floatToRawIntBits((f412 * f310) - f510)) & 4294967295L)), f511, (f417 / f) + f512 + f513, fFloatValue13, fFloatValue12, 0.3f, 0.0f, 0.6f, 0.6f, -0.05f, fFloatValue11, -1.0f, 0.9f, fFloatValue22, fFloatValue10);
            String string13 = context.getString(R.string.onboarding_enter_bet_amount_cms);
            float f514 = fFloatValue21;
            String strA7 = at6.a(string13, context, R.string.onboarding_enter_bet_amount_text, op5Var2, string13);
            String string14 = context.getString(R.string.onboarding_brand_left_half_cms);
            string14.getClass();
            float f515 = fFloatValue7 + f310 + f418 + fFloatValue3;
            tpy tpyVar6 = new tpy(strA7, op5.c(op5Var2, string14, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f414)) << 32) | (((long) Float.floatToRawIntBits((f412 - (f515 * f412)) + f510)) & 4294967295L), (((long) Float.floatToRawIntBits(f415)) << 32) | (((long) Float.floatToRawIntBits(f412 * fFloatValue4 * 0.94f)) & 4294967295L)), f416 * fFloatValue28, (f417 * fA3) + (fFloatValue3 * fA3) + (f418 * fA3) + (f310 * fA3) + f513 + f512, fFloatValue15, f311, 0.3f, 0.1f, 0.69f, 0.5f, 0.27f, 0.67f, 1.0f, 0.6f, fFloatValue23, fFloatValue10);
            String string15 = context.getString(R.string.onboarding_place_bet_cms);
            String strA8 = at6.a(string15, context, R.string.onboarding_place_bet_text, op5Var2, string15);
            String string16 = context.getString(R.string.onboarding_brand_left_full_cms);
            string16.getClass();
            int i5 = i3 * 2;
            float f516 = i2 - i5;
            float f517 = (0.185f * fFloatValue5 * f412) + (fFloatValue6 * f412) + (fFloatValue8 * f412) + f419;
            float f518 = ((0.42f * fFloatValue5) + fFloatValue6) * f412;
            tpy tpyVar7 = new tpy(strA8, op5.c(op5Var2, string16, ""), new hlc(f33, (((long) Float.floatToRawIntBits((0.0825f * f516) + (f413 * 1.0f))) << 32) | (((long) Float.floatToRawIntBits(f517)) & 4294967295L), (((long) Float.floatToRawIntBits((f516 * 0.845f) * 0.66f)) << 32) | (((long) Float.floatToRawIntBits(f518)) & 4294967295L)), f416 * f411, 1.15f, fFloatValue17, fFloatValue16, 0.5f, 0.1f, 0.83f, 0.6f, 0.0f, 0.75f, 1.0f, 0.6f, fFloatValue24, fFloatValue10);
            String string17 = context.getString(R.string.onboarding_place_auto_bet_cms);
            String strA9 = at6.a(string17, context, R.string.onboarding_place_auto_bet_text, op5Var2, string17);
            String string18 = context.getString(R.string.onboarding_brand_right_half_cms);
            string18.getClass();
            float f519 = f * dimension;
            float fA4 = hxa.a(f516, f519, 0.08f, (dimension + f413) * 1.0f);
            float f61 = f34 - (i5 + f519);
            tpy tpyVar8 = new tpy(strA9, op5.c(op5Var2, string18, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f34 - (((0.84f * f61) * 0.32f) + fA4))) << 32) | (((long) Float.floatToRawIntBits(f517)) & 4294967295L), (((long) Float.floatToRawIntBits((f61 * 0.845f) * 0.34f)) << 32) | (((long) Float.floatToRawIntBits(f518)) & 4294967295L)), 0.1f, ((f32 - (f412 - (((fFloatValue5 * 0.75f) + (f515 + fFloatValue4)) * f412))) - 0.0f) / f32, fFloatValue19, fFloatValue18, 0.32f, 0.6f, 0.82f, 0.9f, 0.2f, 0.775f, 1.0f, 0.8f, fFloatValue25, fFloatValue10);
            String string19 = context.getString(R.string.onboarding_chat_cms);
            String strA10 = at6.a(string19, context, R.string.onboarding_chat_text, op5Var2, string19);
            String string110 = context.getString(R.string.onboarding_brand_up_full_cms);
            string110.getClass();
            listK = b.k(tpyVar5, tpyVar6, tpyVar7, tpyVar8, new tpy(strA10, op5.c(op5Var2, string110, ""), new hlc(f33 / 4.0f, (((long) Float.floatToRawIntBits(fApplyDimension3)) << 32) | (((long) Float.floatToRawIntBits(f32 * 0.99f)) & 4294967295L), (((long) Float.floatToRawIntBits(fApplyDimension4)) << 32) | (((long) Float.floatToRawIntBits(f32 * 0.058f)) & 4294967295L)), 0.08f, 0.7f, f514, f312, 0.6f, -0.125f, fFloatValue30, 0.9f, 0.0f, 0.23f, -1.0f, 0.9f, f313, fFloatValue10));
            if (z) {
                return listK;
            }
            return CollectionsKt.P(listK);
        }
        c = 4;
        f = 2.0f;
        obj2 = "titlePercentYArrow";
        obj3 = "titlePercentY";
        mapArr = mapArr2;
        f2 = (Float) mapB.get("coeffBox");
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        f3 = (Float) mapB.get("winningChip");
        if (f3 != null) {
            fFloatValue2 = f3.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        f4 = (Float) mapB.get("space1");
        if (f4 != null) {
            fFloatValue3 = f4.floatValue();
        } else {
            fFloatValue3 = 0.0f;
        }
        f5 = (Float) mapB.get("amountBox");
        if (f5 != null) {
            fFloatValue4 = f5.floatValue();
        } else {
            fFloatValue4 = 0.0f;
        }
        f6 = (Float) mapB.get("space2");
        if (f6 != null) {
            fFloatValue5 = f6.floatValue();
        } else {
            fFloatValue5 = 0.0f;
        }
        f7 = (Float) mapB.get("CTABox");
        if (f7 != null) {
            fFloatValue6 = f7.floatValue();
        } else {
            fFloatValue6 = 0.0f;
        }
        f8 = (Float) mapB.get("topPadding");
        if (f8 != null) {
            fFloatValue7 = f8.floatValue();
        } else {
            fFloatValue7 = 0.0f;
        }
        f9 = (Float) mapB.get("bottomPadding");
        if (f9 != null) {
            fFloatValue8 = f9.floatValue();
        } else {
            fFloatValue8 = 0.0f;
        }
        f10 = (Float) mapB.get("bottomMargin");
        if (f10 != null) {
            fFloatValue9 = f10.floatValue();
        } else {
            fFloatValue9 = 0.0f;
        }
        float f314 = fFloatValue;
        f11 = (Float) mapB.get("NetxButtonHeight");
        if (f11 != null) {
            fFloatValue10 = f11.floatValue();
        } else {
            fFloatValue10 = 0.0f;
        }
        f12 = (Float) mapArr[0].get(obj2);
        if (f12 != null) {
            fFloatValue11 = f12.floatValue();
        } else {
            fFloatValue11 = 0.9f;
        }
        f13 = (Float) mapArr[0].get("imagePercentYArrow");
        if (f13 != null) {
            fFloatValue12 = f13.floatValue();
        } else {
            fFloatValue12 = 0.9f;
        }
        f14 = (Float) mapArr[0].get("imagePercentXArrow");
        if (f14 != null) {
            fFloatValue13 = f14.floatValue();
        } else {
            fFloatValue13 = 0.9f;
        }
        f15 = (Float) mapArr[1].get("imagePercentYArrow");
        if (f15 != null) {
            fFloatValue14 = f15.floatValue();
        } else {
            fFloatValue14 = 0.9f;
        }
        f16 = (Float) mapArr[1].get("imagePercentXArrow");
        if (f16 != null) {
            fFloatValue15 = f16.floatValue();
        } else {
            fFloatValue15 = 0.9f;
        }
        f17 = (Float) mapArr[2].get("imagePercentYArrow");
        if (f17 != null) {
            fFloatValue16 = f17.floatValue();
        } else {
            fFloatValue16 = 0.9f;
        }
        float f315 = fFloatValue14;
        f18 = (Float) mapArr[2].get("imagePercentXArrow");
        if (f18 != null) {
            fFloatValue17 = f18.floatValue();
        } else {
            fFloatValue17 = 0.9f;
        }
        f19 = (Float) mapArr[3].get("imagePercentYArrow");
        if (f19 != null) {
            fFloatValue18 = f19.floatValue();
        } else {
            fFloatValue18 = 0.9f;
        }
        f20 = (Float) mapArr[3].get("imagePercentXArrow");
        if (f20 != null) {
            fFloatValue19 = f20.floatValue();
        } else {
            fFloatValue19 = 0.9f;
        }
        f21 = (Float) mapArr[c].get("imagePercentYArrow");
        if (f21 != null) {
            fFloatValue20 = f21.floatValue();
        } else {
            fFloatValue20 = 0.9f;
        }
        f22 = (Float) mapArr[c].get("imagePercentXArrow");
        if (f22 != null) {
            fFloatValue21 = f22.floatValue();
        } else {
            fFloatValue21 = 0.9f;
        }
        f23 = (Float) mapArr[0].get("CTARowPosition");
        if (f23 != null) {
            fFloatValue22 = f23.floatValue();
        } else {
            fFloatValue22 = 0.84f;
        }
        f24 = (Float) mapArr[1].get("CTARowPosition");
        if (f24 != null) {
            fFloatValue23 = f24.floatValue();
        } else {
            fFloatValue23 = 0.84f;
        }
        float f316 = fFloatValue20;
        f25 = (Float) mapArr[2].get("CTARowPosition");
        if (f25 != null) {
            fFloatValue24 = f25.floatValue();
        } else {
            fFloatValue24 = 0.84f;
        }
        f26 = (Float) mapArr[3].get("CTARowPosition");
        if (f26 != null) {
            fFloatValue25 = f26.floatValue();
        } else {
            fFloatValue25 = 0.84f;
        }
        f27 = (Float) mapArr[c].get("CTARowPosition");
        if (f27 != null) {
            fFloatValue26 = f27.floatValue();
        } else {
            fFloatValue26 = 0.84f;
        }
        f28 = (Float) mapArr[0].get("imagePercentXRatio");
        if (f28 != null) {
            fFloatValue27 = f28.floatValue();
        } else {
            fFloatValue27 = 0.0f;
        }
        float f317 = fFloatValue26;
        f29 = (Float) mapArr[1].get("imagePercentXRatio");
        if (f29 != null) {
            fFloatValue28 = f29.floatValue();
        } else {
            fFloatValue28 = 0.0f;
        }
        f30 = (Float) mapArr[2].get("imagePercentXRatio");
        if (f30 != null) {
            fFloatValue29 = f30.floatValue();
        } else {
            fFloatValue29 = 0.0f;
        }
        Float f4110 = (Float) mapArr[c].get(obj3);
        if (f4110 != null) {
        }
        float f4111 = fFloatValue29;
        float fApplyDimension5 = (f34 - ((i2 / 15) * f)) - (TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics()) * 3.0f);
        float fApplyDimension6 = (TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics()) * f) + (f34 / 15.0f);
        float fA5 = qi8.a(i, i2);
        float f4112 = f32 * fA5;
        float f4113 = i3;
        float f4114 = ((i2 - i3) * 0.04f) + f4113;
        float f4115 = f34 - (f * f4114);
        float f4116 = f4115 / f34;
        op5 op5Var3 = op5.a;
        String string111 = context.getString(R.string.onboarding_target_coefficient_cms);
        float f4117 = fFloatValue9;
        String strA11 = at6.a(string111, context, R.string.onboarding_target_coefficient_text, op5Var3, string111);
        String string112 = context.getString(R.string.onboarding_brand_left_half_cms);
        string112.getClass();
        float f4118 = fFloatValue2;
        float f4119 = f4117 * f32;
        float f5110 = f4119 * fA5;
        float f5111 = f4116 * fFloatValue27;
        float f5112 = 1.0f - fA5;
        float f5113 = fFloatValue7 * fA5;
        tpy tpyVar9 = new tpy(strA11, op5.c(op5Var3, string112, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f4114)) << 32) | (((long) Float.floatToRawIntBits(f4112 - (fFloatValue7 * f4112))) & 4294967295L), (((long) Float.floatToRawIntBits(f4115)) << 32) | (((long) Float.floatToRawIntBits((f4112 * f314) - f5110)) & 4294967295L)), f5111, (f4117 / f) + f5112 + f5113, fFloatValue13, fFloatValue12, 0.3f, 0.0f, 0.6f, 0.6f, -0.05f, fFloatValue11, -1.0f, 0.9f, fFloatValue22, fFloatValue10);
        String string113 = context.getString(R.string.onboarding_enter_bet_amount_cms);
        float f5114 = fFloatValue21;
        String strA12 = at6.a(string113, context, R.string.onboarding_enter_bet_amount_text, op5Var3, string113);
        String string114 = context.getString(R.string.onboarding_brand_left_half_cms);
        string114.getClass();
        float f5115 = fFloatValue7 + f314 + f4118 + fFloatValue3;
        tpy tpyVar10 = new tpy(strA12, op5.c(op5Var3, string114, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f4114)) << 32) | (((long) Float.floatToRawIntBits((f4112 - (f5115 * f4112)) + f5110)) & 4294967295L), (((long) Float.floatToRawIntBits(f4115)) << 32) | (((long) Float.floatToRawIntBits(f4112 * fFloatValue4 * 0.94f)) & 4294967295L)), f4116 * fFloatValue28, (f4117 * fA5) + (fFloatValue3 * fA5) + (f4118 * fA5) + (f314 * fA5) + f5113 + f5112, fFloatValue15, f315, 0.3f, 0.1f, 0.69f, 0.5f, 0.27f, 0.67f, 1.0f, 0.6f, fFloatValue23, fFloatValue10);
        String string115 = context.getString(R.string.onboarding_place_bet_cms);
        String strA13 = at6.a(string115, context, R.string.onboarding_place_bet_text, op5Var3, string115);
        String string116 = context.getString(R.string.onboarding_brand_left_full_cms);
        string116.getClass();
        int i6 = i3 * 2;
        float f5116 = i2 - i6;
        float f5117 = (0.185f * fFloatValue5 * f4112) + (fFloatValue6 * f4112) + (fFloatValue8 * f4112) + f4119;
        float f5118 = ((0.42f * fFloatValue5) + fFloatValue6) * f4112;
        tpy tpyVar11 = new tpy(strA13, op5.c(op5Var3, string116, ""), new hlc(f33, (((long) Float.floatToRawIntBits((0.0825f * f5116) + (f4113 * 1.0f))) << 32) | (((long) Float.floatToRawIntBits(f5117)) & 4294967295L), (((long) Float.floatToRawIntBits((f5116 * 0.845f) * 0.66f)) << 32) | (((long) Float.floatToRawIntBits(f5118)) & 4294967295L)), f4116 * f4111, 1.15f, fFloatValue17, fFloatValue16, 0.5f, 0.1f, 0.83f, 0.6f, 0.0f, 0.75f, 1.0f, 0.6f, fFloatValue24, fFloatValue10);
        String string117 = context.getString(R.string.onboarding_place_auto_bet_cms);
        String strA14 = at6.a(string117, context, R.string.onboarding_place_auto_bet_text, op5Var3, string117);
        String string118 = context.getString(R.string.onboarding_brand_right_half_cms);
        string118.getClass();
        float f5119 = f * dimension;
        float fA6 = hxa.a(f5116, f5119, 0.08f, (dimension + f4113) * 1.0f);
        float f62 = f34 - (i6 + f5119);
        tpy tpyVar12 = new tpy(strA14, op5.c(op5Var3, string118, ""), new hlc(f33, (((long) Float.floatToRawIntBits(f34 - (((0.84f * f62) * 0.32f) + fA6))) << 32) | (((long) Float.floatToRawIntBits(f5117)) & 4294967295L), (((long) Float.floatToRawIntBits((f62 * 0.845f) * 0.34f)) << 32) | (((long) Float.floatToRawIntBits(f5118)) & 4294967295L)), 0.1f, ((f32 - (f4112 - (((fFloatValue5 * 0.75f) + (f5115 + fFloatValue4)) * f4112))) - 0.0f) / f32, fFloatValue19, fFloatValue18, 0.32f, 0.6f, 0.82f, 0.9f, 0.2f, 0.775f, 1.0f, 0.8f, fFloatValue25, fFloatValue10);
        String string119 = context.getString(R.string.onboarding_chat_cms);
        String strA15 = at6.a(string119, context, R.string.onboarding_chat_text, op5Var3, string119);
        String string1110 = context.getString(R.string.onboarding_brand_up_full_cms);
        string1110.getClass();
        listK = b.k(tpyVar9, tpyVar10, tpyVar11, tpyVar12, new tpy(strA15, op5.c(op5Var3, string1110, ""), new hlc(f33 / 4.0f, (((long) Float.floatToRawIntBits(fApplyDimension5)) << 32) | (((long) Float.floatToRawIntBits(f32 * 0.99f)) & 4294967295L), (((long) Float.floatToRawIntBits(fApplyDimension6)) << 32) | (((long) Float.floatToRawIntBits(f32 * 0.058f)) & 4294967295L)), 0.08f, 0.7f, f5114, f316, 0.6f, -0.125f, fFloatValue30, 0.9f, 0.0f, 0.23f, -1.0f, 0.9f, f317, fFloatValue10));
        if (z) {
            return listK;
        }
        return CollectionsKt.P(listK);
    }

    @Override // defpackage.y2b
    public Object convert(Object obj) {
        return Long.valueOf(((ResponseBody) obj).string());
    }
}
