package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public final class cta0 implements qx80 {
    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fC1 = mmdVar.C1(5.0f);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float fMin = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)) / 2.0f;
        if (fC1 > fMin) {
            fC1 = fMin;
        }
        float fC2 = mmdVar.C1(9.0f);
        float fC3 = mmdVar.C1(6.0f);
        float f = fC2 / 2.0f;
        float fD = f.d(Float.intBitsToFloat(i) * 0.5f, f, Float.intBitsToFloat(i) - f);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float f2 = fIntBitsToFloat2 - fC3;
        j90 j90VarA = m90.a();
        float f3 = fC1 + 0.0f;
        Path path = j90VarA.a;
        j90VarA.a(f3, 0.0f);
        j90VarA.c(fIntBitsToFloat - fC1, 0.0f);
        float f4 = 2.0f * fC1;
        float f5 = fIntBitsToFloat - f4;
        float f6 = f4 + 0.0f;
        RectF rectF = j90VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            j90VarA.b = rectF;
        }
        rectF.set(f5, 0.0f, fIntBitsToFloat, f6);
        RectF rectF2 = j90VarA.b;
        rectF2.getClass();
        path.arcTo(rectF2, -90.0f, 90.0f, false);
        j90VarA.c(fIntBitsToFloat, f2 - fC1);
        float f7 = f2 - f4;
        RectF rectF3 = j90VarA.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            j90VarA.b = rectF3;
        }
        rectF3.set(f5, f7, fIntBitsToFloat, f2);
        RectF rectF4 = j90VarA.b;
        rectF4.getClass();
        path.arcTo(rectF4, 0.0f, 90.0f, false);
        j90VarA.c(fD + f, f2);
        j90VarA.c(fD, fIntBitsToFloat2);
        j90VarA.c(fD - f, f2);
        j90VarA.c(f3, f2);
        RectF rectF5 = j90VarA.b;
        if (rectF5 == null) {
            rectF5 = new RectF();
            j90VarA.b = rectF5;
        }
        rectF5.set(0.0f, f7, f6, f2);
        RectF rectF6 = j90VarA.b;
        rectF6.getClass();
        path.arcTo(rectF6, 90.0f, 90.0f, false);
        j90VarA.c(0.0f, f3);
        RectF rectF7 = j90VarA.b;
        if (rectF7 == null) {
            rectF7 = new RectF();
            j90VarA.b = rectF7;
        }
        rectF7.set(0.0f, 0.0f, f6, f6);
        RectF rectF8 = j90VarA.b;
        rectF8.getClass();
        path.arcTo(rectF8, 180.0f, 90.0f, false);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
