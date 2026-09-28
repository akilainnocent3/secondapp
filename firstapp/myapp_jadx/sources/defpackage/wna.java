package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes6.dex */
public final class wna implements qx80 {
    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fC1 = mmdVar.C1(10.0f);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float fMin = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)) / 2.0f;
        if (fC1 > fMin) {
            fC1 = fMin;
        }
        j90 j90VarA = m90.a();
        Path path = j90VarA.a;
        j90VarA.a(0.0f, 0.0f);
        j90VarA.c(Float.intBitsToFloat(i), 0.0f);
        j90VarA.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - fC1);
        float fIntBitsToFloat = Float.intBitsToFloat(i) - fC1;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - fC1;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) + fC1;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) + fC1;
        RectF rectF = j90VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            j90VarA.b = rectF;
        }
        rectF.set(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
        RectF rectF2 = j90VarA.b;
        rectF2.getClass();
        path.arcTo(rectF2, 270.0f, -90.0f, false);
        j90VarA.c(fC1, Float.intBitsToFloat(i2));
        float f = -fC1;
        float fIntBitsToFloat5 = Float.intBitsToFloat(i2) - fC1;
        float fIntBitsToFloat6 = Float.intBitsToFloat(i2) + fC1;
        RectF rectF3 = j90VarA.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            j90VarA.b = rectF3;
        }
        rectF3.set(f, fIntBitsToFloat5, fC1, fIntBitsToFloat6);
        RectF rectF4 = j90VarA.b;
        rectF4.getClass();
        path.arcTo(rectF4, 0.0f, -90.0f, false);
        j90VarA.c(0.0f, 0.0f);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
