package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes4.dex */
public final class j1g0 implements qx80 {
    public final float a;
    public final float b;
    public final float c;

    public j1g0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        int iOrdinal = asrVar.ordinal();
        float f = this.c;
        float f2 = this.a;
        if (iOrdinal == 0) {
            f = (fIntBitsToFloat - f) - f2;
        } else if (iOrdinal != 1) {
            uhc.a();
            return null;
        }
        float f3 = fIntBitsToFloat - f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float fD = f.d(f, 0.0f, f3);
        j90 j90VarA = m90.a();
        float f4 = this.b;
        j90VarA.a(0.0f, f4);
        j90VarA.c(fD, f4);
        j90VarA.c((f2 / 2.0f) + fD, 0.0f);
        j90VarA.c(f2 + fD, f4);
        j90VarA.c(fIntBitsToFloat, f4);
        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
        j90VarA.c(0.0f, fIntBitsToFloat2);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
