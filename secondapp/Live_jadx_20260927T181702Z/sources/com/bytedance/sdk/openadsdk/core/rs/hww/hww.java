package com.bytedance.sdk.openadsdk.core.rs.hww;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    @NonNull
    public static Pair<Float, Float> hww(Window window, int i10) {
        View decorView = window.getDecorView();
        float[] fArrHww = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrHww[0] = wdz.sd(window.getContext(), fArrHww[0]);
        float fSd = wdz.sd(window.getContext(), fArrHww[1]);
        fArrHww[1] = fSd;
        if (fArrHww[0] < 10.0f || fSd < 10.0f) {
            fArrHww = hww(window.getContext(), wdz.sd(window.getContext(), wdz.hww()), i10);
        }
        float fMax = Math.max(fArrHww[0], fArrHww[1]);
        float fMin = Math.min(fArrHww[0], fArrHww[1]);
        if (i10 == 1) {
            fArrHww[0] = fMin;
            fArrHww[1] = fMax;
        } else {
            fArrHww[0] = fMax;
            fArrHww[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrHww[0]), Float.valueOf(fArrHww[1]));
    }

    public static float tq(Context context) {
        return wdz.sd(context, wdz.ed(context));
    }

    private static float[] hww(Context context, int i10, int i11) {
        float fHww = hww(context);
        float fTq = tq(context);
        if ((i11 == 1) != (fHww > fTq)) {
            float f10 = fHww + fTq;
            fTq = f10 - fTq;
            fHww = f10 - fTq;
        }
        if (i11 == 1) {
            fHww -= i10;
        } else {
            fTq -= i10;
        }
        return new float[]{fTq, fHww};
    }

    public static float hww(Context context) {
        return wdz.sd(context, wdz.ny(context));
    }
}
