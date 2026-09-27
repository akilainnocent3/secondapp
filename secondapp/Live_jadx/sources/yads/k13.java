package yads;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class k13 {
    public static final float a(g13 g13Var, RectF rectF, RectF rectF2) {
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float fHeight2 = rectF2.height();
        float fWidth2 = rectF2.width();
        if (fHeight == 0.0f || fWidth == 0.0f || fHeight2 == 0.0f || fWidth2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        float fMin = Math.min(1.0f, fWidth2 / fHeight2 > fWidth / fHeight ? fHeight / fHeight2 : fWidth / fWidth2);
        float f10 = g13Var.f149344c * fMin;
        if (fWidth < ((int) f10) || fHeight < ((int) (g13Var.f149345d * fMin))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(fHeight - (g13Var.f149345d * fMin)) + Math.abs(fWidth - f10);
    }
}
