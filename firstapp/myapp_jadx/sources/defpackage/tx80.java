package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tx80 {
    public static final boolean a(bxz bxzVar, float f, float f2) {
        lk40 lk40Var = new lk40(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        j90 j90VarA = m90.a();
        bxz.o(j90VarA, lk40Var);
        j90 j90VarA2 = m90.a();
        j90VarA2.u(bxzVar, j90VarA, 1);
        boolean zIsEmpty = j90VarA2.a.isEmpty();
        j90VarA2.reset();
        j90VarA.reset();
        return !zIsEmpty;
    }

    public static final boolean b(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
