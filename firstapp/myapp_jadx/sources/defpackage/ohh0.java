package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public final class ohh0 implements qx80 {
    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fC1 = mmdVar.C1(4.0f);
        float fC2 = mmdVar.C1(16.0f);
        float fC3 = mmdVar.C1(12.0f);
        float fC4 = mmdVar.C1(24.0f);
        float f = (fIntBitsToFloat - fC1) - fC2;
        if (f < fC1) {
            f = fC1;
        }
        float fD = f.d(fC4, fC1, f);
        j90 j90VarA = m90.a();
        bxz.s(j90VarA, bys.d(0.0f, fC3, fIntBitsToFloat, fIntBitsToFloat2, (((long) Float.floatToRawIntBits(fC1)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fC1)))));
        j90VarA.a((fC2 / 2.0f) + fD, 0.0f);
        j90VarA.c(fC2 + fD, fC3);
        j90VarA.c(fD, fC3);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
