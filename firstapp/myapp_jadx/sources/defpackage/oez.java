package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class oez implements qx80 {
    public final List<lk40> a;
    public final float b;

    public oez(List<lk40> list, float f) {
        list.getClass();
        this.a = list;
        this.b = f;
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        asrVar.getClass();
        mmdVar.getClass();
        j90 j90VarA = m90.a();
        j90VarA.h(1);
        bxz.o(j90VarA, pk40.b(0L, j));
        for (lk40 lk40Var : this.a) {
            float f = this.b;
            bxz.s(j90VarA, bys.e(lk40Var, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)));
        }
        return new b9z.a(j90VarA);
    }
}
