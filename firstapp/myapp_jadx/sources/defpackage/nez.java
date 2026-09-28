package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nez implements qx80 {
    public final List<lk40> a;
    public final float b;

    public nez(List<lk40> list, float f) {
        list.getClass();
        this.a = list;
        this.b = f;
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        j90 j90VarA = m90.a();
        bxz.o(j90VarA, new lk40(0.0f, 0.0f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))));
        for (lk40 lk40Var : this.a) {
            float f = this.b;
            bxz.s(j90VarA, bys.e(lk40Var, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)));
        }
        j90VarA.h(1);
        return new b9z.a(j90VarA);
    }
}
