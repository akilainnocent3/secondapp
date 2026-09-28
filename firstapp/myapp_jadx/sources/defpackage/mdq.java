package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes6.dex */
public final class mdq implements qx80 {
    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fC1 = mmdVar.C1(2.0f);
        float fC2 = mmdVar.C1(10.0f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        j90 j90VarA = m90.a();
        Path path = j90VarA.a;
        j90VarA.a(0.0f, fC2);
        float f = -fC2;
        RectF rectF = j90VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            j90VarA.b = rectF;
        }
        rectF.set(f, f, fC2, fC2);
        RectF rectF2 = j90VarA.b;
        rectF2.getClass();
        path.arcTo(rectF2, 90.0f, -90.0f, false);
        float f2 = fIntBitsToFloat - fC2;
        j90VarA.c(f2, 0.0f);
        float f3 = fIntBitsToFloat + fC2;
        RectF rectF3 = j90VarA.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            j90VarA.b = rectF3;
        }
        rectF3.set(f2, f, f3, fC2);
        RectF rectF4 = j90VarA.b;
        rectF4.getClass();
        path.arcTo(rectF4, 180.0f, -90.0f, false);
        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2 - fC1);
        float f4 = 2.0f * fC1;
        float f5 = fIntBitsToFloat - f4;
        float f6 = fIntBitsToFloat2 - f4;
        RectF rectF5 = j90VarA.b;
        if (rectF5 == null) {
            rectF5 = new RectF();
            j90VarA.b = rectF5;
        }
        rectF5.set(f5, f6, fIntBitsToFloat, fIntBitsToFloat2);
        RectF rectF6 = j90VarA.b;
        rectF6.getClass();
        path.arcTo(rectF6, 0.0f, 90.0f, false);
        j90VarA.c(fC1, fIntBitsToFloat2);
        RectF rectF7 = j90VarA.b;
        if (rectF7 == null) {
            rectF7 = new RectF();
            j90VarA.b = rectF7;
        }
        rectF7.set(0.0f, f6, f4, fIntBitsToFloat2);
        RectF rectF8 = j90VarA.b;
        rectF8.getClass();
        path.arcTo(rectF8, 90.0f, 90.0f, false);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
