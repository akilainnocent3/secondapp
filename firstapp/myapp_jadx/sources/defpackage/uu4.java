package defpackage;

import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uu4 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mr5 mr5Var = (mr5) obj;
        mr5Var.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mr5Var.a.d() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L));
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        final float fIntBitsToFloat3 = Float.intBitsToFloat((int) (mr5Var.a.d() >> 32)) / 2.0f;
        final float fIntBitsToFloat4 = Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L));
        long j = j58.f;
        final vu30 vu30Var = new vu30(b.k(new j58(j58.c(0.1f, j)), new j58(j58.c(0.0f, j))), null, jFloatToRawIntBits, fIntBitsToFloat3);
        return mr5Var.e(new Function1() { // from class: yu4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                float f = fIntBitsToFloat4;
                float f2 = fIntBitsToFloat3;
                long j2 = jFloatToRawIntBits;
                vu30 vu30Var2 = vu30Var;
                tcf tcfVar = (tcf) obj2;
                tcfVar.getClass();
                qc6.b bVarF1 = tcfVar.F1();
                long jD = bVarF1.d();
                bVarF1.a().p();
                try {
                    bVarF1.a.g(1.0f, f / f2, j2);
                    tcf.F(tcfVar, vu30Var2, f2, j2, null, 120);
                    return Unit.a;
                } finally {
                    hrh.a(bVarF1, jD);
                }
            }
        });
    }
}
