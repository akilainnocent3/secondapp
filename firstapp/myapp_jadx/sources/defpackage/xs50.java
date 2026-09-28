package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class xs50 implements qx80 {
    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        j90 j90VarA = m90.a();
        j90VarA.a(0.0f, 0.0f);
        j90VarA.c(fIntBitsToFloat, 0.0f);
        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
        j90VarA.c(fIntBitsToFloat / 2.0f, fIntBitsToFloat2 - (fIntBitsToFloat2 / 4.0f));
        j90VarA.c(0.0f, fIntBitsToFloat2);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }
}
