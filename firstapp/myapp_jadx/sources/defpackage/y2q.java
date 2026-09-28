package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class y2q {
    public static final void a(final float f, final int i, final long j, a aVar, final d dVar) {
        int i2;
        b bVarI = aVar.i(1580821669);
        if ((i & 6) == 0) {
            i2 = (bVarI.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function1() { // from class: w2q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fMin = Math.min(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 16.0f, Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 17.0f);
                        float fIntBitsToFloat = (Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - (16.0f * fMin)) / 2.0f;
                        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (4294967295L & tcfVar.d())) - (17.0f * fMin)) / 2.0f;
                        float f2 = fMin * 2.8f;
                        float f3 = f;
                        j90 j90VarA = m90.a();
                        float f4 = ((((-5.2f) * f3) + 11.4f) * fMin) + fIntBitsToFloat2;
                        j90VarA.a((2.7f * fMin) + fIntBitsToFloat, f4);
                        j90VarA.c((8.0f * fMin) + fIntBitsToFloat, (((5.2f * f3) + 6.2f) * fMin) + fIntBitsToFloat2);
                        j90VarA.c((13.3f * fMin) + fIntBitsToFloat, f4);
                        tcf.Q1(tcfVar, j90VarA, j, 0.0f, new yae0(f2, 0.0f, 1, 1, null, 18), 52);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVar, (Function1) objY, bVarI, (i2 >> 3) & 14);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: x2q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    y2q.a(f, iA, j, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }
}
