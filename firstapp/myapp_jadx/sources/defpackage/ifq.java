package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes6.dex */
public final class ifq implements qx80 {
    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fC1 = mmdVar.C1(2.0f);
        float fC2 = mmdVar.C1(10.0f);
        j90 j90VarA = m90.a();
        Path path = j90VarA.a;
        j90VarA.a(0.0f, fC1);
        float f = 2.0f * fC1;
        RectF rectF = j90VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            j90VarA.b = rectF;
        }
        rectF.set(0.0f, 0.0f, f, f);
        RectF rectF2 = j90VarA.b;
        rectF2.getClass();
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        int i = (int) (j >> 32);
        j90VarA.c(Float.intBitsToFloat(i) - fC1, 0.0f);
        float fIntBitsToFloat = Float.intBitsToFloat(i) - f;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        RectF rectF3 = j90VarA.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            j90VarA.b = rectF3;
        }
        rectF3.set(fIntBitsToFloat, 0.0f, fIntBitsToFloat2, f);
        RectF rectF4 = j90VarA.b;
        rectF4.getClass();
        path.arcTo(rectF4, 270.0f, 90.0f, false);
        int i2 = (int) (j & 4294967295L);
        j90VarA.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - fC2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - fC2;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) - fC2;
        float fIntBitsToFloat5 = Float.intBitsToFloat(i) + fC2;
        float fIntBitsToFloat6 = Float.intBitsToFloat(i2) + fC2;
        RectF rectF5 = j90VarA.b;
        if (rectF5 == null) {
            rectF5 = new RectF();
            j90VarA.b = rectF5;
        }
        rectF5.set(fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6);
        RectF rectF6 = j90VarA.b;
        rectF6.getClass();
        path.arcTo(rectF6, 270.0f, -90.0f, false);
        j90VarA.c(fC2, Float.intBitsToFloat(i2));
        float f2 = -fC2;
        float fIntBitsToFloat7 = Float.intBitsToFloat(i2) - fC2;
        float fIntBitsToFloat8 = Float.intBitsToFloat(i2) + fC2;
        RectF rectF7 = j90VarA.b;
        if (rectF7 == null) {
            rectF7 = new RectF();
            j90VarA.b = rectF7;
        }
        rectF7.set(f2, fIntBitsToFloat7, fC2, fIntBitsToFloat8);
        RectF rectF8 = j90VarA.b;
        rectF8.getClass();
        path.arcTo(rectF8, 0.0f, -90.0f, false);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
