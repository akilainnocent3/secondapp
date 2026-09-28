package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class r1g0 implements qx80 {
    public final float a;
    public final float b;
    public final float c;

    public r1g0(float f, float f2, float f3) {
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
        float f = this.a;
        float f2 = this.c;
        float f3 = (fIntBitsToFloat - f) - f2;
        j90 j90VarA = m90.a();
        float f4 = this.b;
        j90VarA.a(0.0f, f4);
        j90VarA.c(f3, f4);
        float f5 = f4 * 0.13075f;
        j90VarA.c((0.37341666f * f) + f3, f5);
        float f6 = (-0.0435625f) * f4;
        j90VarA.b((0.4483125f * f) + f3, f6, (0.55168754f * f) + f3, f6, (f * 0.62658334f) + f3, f5);
        j90VarA.c(fIntBitsToFloat - f2, f4);
        j90VarA.c(fIntBitsToFloat, f4);
        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
        j90VarA.c(0.0f, fIntBitsToFloat2);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
