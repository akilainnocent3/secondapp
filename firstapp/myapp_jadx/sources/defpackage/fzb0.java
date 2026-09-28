package defpackage;

import com.appsflyer.internal.AFj1rSDK;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.sportyherov2.remote.models.DetailResponseData;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fzb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fzb0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    @Override // java.lang.Runnable
    public final void run() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                q1c0 q1c0Var = (q1c0) obj2;
                bq40 bq40Var = (bq40) obj;
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                Float fValueOf = w3c0Var != null ? Float.valueOf(w3c0Var.b0.getHeight()) : null;
                w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                Float fValueOf2 = w3c0Var2 != null ? Float.valueOf(w3c0Var2.P.getHeight()) : null;
                w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                Float fValueOf3 = w3c0Var3 != null ? Float.valueOf(w3c0Var3.c0.getHeight()) : null;
                w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                Float fValueOf4 = w3c0Var4 != null ? Float.valueOf(w3c0Var4.Q.getHeight()) : null;
                w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                Float fValueOf5 = w3c0Var5 != null ? Float.valueOf(w3c0Var5.l0.getHeight()) : null;
                w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                Float fValueOf6 = w3c0Var6 != null ? Float.valueOf(w3c0Var6.r0.getHeight()) : null;
                w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                Float fValueOf7 = w3c0Var7 != null ? Float.valueOf(w3c0Var7.d.getHeight()) : null;
                if (fValueOf != null) {
                    float fFloatValue = fValueOf.floatValue();
                    if (fValueOf2 != null) {
                        float fFloatValue2 = fValueOf2.floatValue();
                        if (fFloatValue > 0.0f) {
                            f3 = fFloatValue2 / fFloatValue;
                        } else {
                            f3 = 0.0f;
                        }
                    } else {
                        f3 = 0.0f;
                    }
                    if (fValueOf3 != null) {
                        float fFloatValue3 = fValueOf3.floatValue();
                        if (fFloatValue > 0.0f) {
                            f4 = fFloatValue3 / fFloatValue;
                        } else {
                            f4 = 0.0f;
                        }
                    } else {
                        f4 = 0.0f;
                    }
                    if (fValueOf4 != null) {
                        float fFloatValue4 = fValueOf4.floatValue();
                        if (fFloatValue > 0.0f) {
                            f5 = fFloatValue4 / fFloatValue;
                        } else {
                            f5 = 0.0f;
                        }
                    } else {
                        f5 = 0.0f;
                    }
                    if (fValueOf5 != null) {
                        float fFloatValue5 = fValueOf5.floatValue();
                        if (fFloatValue > 0.0f) {
                            f6 = fFloatValue5 / fFloatValue;
                        } else {
                            f6 = 0.0f;
                        }
                    } else {
                        f6 = 0.0f;
                    }
                    if (fValueOf6 != null) {
                        float fFloatValue6 = fValueOf6.floatValue();
                        if (fFloatValue > 0.0f) {
                            f7 = fFloatValue6 / fFloatValue;
                        } else {
                            f7 = 0.0f;
                        }
                    } else {
                        f7 = 0.0f;
                    }
                    if (fValueOf7 != null) {
                        float fFloatValue7 = fValueOf7.floatValue();
                        if (fFloatValue > 0.0f) {
                            f8 = fFloatValue7 / fFloatValue;
                        } else {
                            f8 = 0.0f;
                        }
                    } else {
                        f8 = 0.0f;
                    }
                    float f9 = 0.335f * f8;
                    f2 = f8 - f9;
                    DetailResponseData detailResponseData = q1c0Var.F;
                    if (detailResponseData != null && Intrinsics.g(detailResponseData.getIsSideBetsEnabled(), Boolean.FALSE)) {
                        f6 /= 2.1f;
                    }
                    f = f9 + 0.004f + f3 + f4 + f5 + 0.0f + f6 + f7;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
                q1c0Var.f1 = true;
                GameDetails gameDetails = q1c0Var.W1;
                if (gameDetails != null) {
                    DetailResponseData detailResponseData2 = q1c0Var.F;
                    q1c0Var.b3(bq40Var.a, kpu.f(new Pair("SH_IS_SIDE_BETS_ENABLED", Float.valueOf((detailResponseData2 == null || !Intrinsics.g(detailResponseData2.getIsSideBetsEnabled(), Boolean.TRUE)) ? 0.0f : 1.0f)), new Pair("SH_ONBOARDING_VALENTINES_THEME", Float.valueOf(q1c0Var.a1 ? 1.0f : 0.0f)), new Pair("top_percent", Float.valueOf(f)), new Pair("container_height", Float.valueOf(f2))), gameDetails);
                }
                w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                if (w3c0Var8 != null) {
                    w3c0Var8.X.setVisibility(0);
                }
                break;
            default:
                ((AFj1rSDK) obj2).getCurrencyIso4217Code((Runnable) obj);
                break;
        }
    }
}
