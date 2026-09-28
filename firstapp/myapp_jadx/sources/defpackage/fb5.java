package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class fb5 implements qx80 {
    public final float a;
    public final b120 b;
    public final float c;

    public fb5(float f, b120 b120Var, float f2) {
        b120Var.getClass();
        this.a = f;
        this.b = b120Var;
        this.c = f2;
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fC1 = mmdVar.C1(this.a);
        if (fC1 < 0.0f) {
            fC1 = 0.0f;
        }
        float fC2 = mmdVar.C1(16.0f);
        float f = fC2 < 0.0f ? 0.0f : fC2;
        float fC3 = mmdVar.C1(12.0f);
        float f2 = fC3 < 0.0f ? 0.0f : fC3;
        float fC4 = mmdVar.C1(this.c);
        b120 b120Var = this.b;
        float f3 = b120Var.b() ? f2 : 0.0f;
        if (b120Var.a()) {
            fIntBitsToFloat2 -= f2;
        }
        lz50 lz50VarD = bys.d(0.0f, f3, fIntBitsToFloat, fIntBitsToFloat2, (((long) Float.floatToRawIntBits(fC1)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fC1))));
        j90 j90VarA = m90.a();
        bxz.s(j90VarA, lz50VarD);
        if (b120Var != b120.a && b120Var != b120.c) {
            fC4 += fIntBitsToFloat - f;
        }
        float f4 = (fIntBitsToFloat - fC1) - f;
        if (f4 < fC1) {
            f4 = fC1;
        }
        float fD = f.d(fC4, fC1, f4);
        float f5 = f + fD;
        float f6 = (fD + f5) / 2.0f;
        if (b120Var.a()) {
            float f7 = lz50VarD.d;
            j90VarA.a(f6, f2 + f7);
            j90VarA.c(f5, f7);
            j90VarA.c(fD, f7);
            j90VarA.close();
        } else {
            float f8 = lz50VarD.b;
            j90VarA.a(f6, f8 - f2);
            j90VarA.c(f5, f8);
            j90VarA.c(fD, f8);
            j90VarA.close();
        }
        return new b9z.a(j90VarA);
    }
}
