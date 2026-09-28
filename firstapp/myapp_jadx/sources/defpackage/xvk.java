package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public final class xvk implements qx80 {
    public final float a;

    public xvk(float f) {
        this.a = f;
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fC1 = mmdVar.C1(10.0f);
        float fC2 = mmdVar.C1(this.a);
        j90 j90VarA = m90.a();
        Path path = j90VarA.a;
        j90VarA.a(0.0f, 0.0f);
        int i = (int) (j >> 32);
        j90VarA.c(Float.intBitsToFloat(i), 0.0f);
        float f = fC2 - fC1;
        j90VarA.c(Float.intBitsToFloat(i), f);
        float fIntBitsToFloat = Float.intBitsToFloat(i) - fC1;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) + fC1;
        float f2 = fC2 + fC1;
        RectF rectF = j90VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            j90VarA.b = rectF;
        }
        rectF.set(fIntBitsToFloat, f, fIntBitsToFloat2, f2);
        RectF rectF2 = j90VarA.b;
        rectF2.getClass();
        path.arcTo(rectF2, 270.0f, -180.0f, false);
        int i2 = (int) (j & 4294967295L);
        j90VarA.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        j90VarA.c(0.0f, Float.intBitsToFloat(i2));
        j90VarA.c(0.0f, f2);
        float f3 = -fC1;
        RectF rectF3 = j90VarA.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            j90VarA.b = rectF3;
        }
        rectF3.set(f3, f, fC1, f2);
        RectF rectF4 = j90VarA.b;
        rectF4.getClass();
        path.arcTo(rectF4, 90.0f, -180.0f, false);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
