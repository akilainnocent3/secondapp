package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class tzd0 {
    public static final void a(final qzd0 qzd0Var, a aVar, final int i) {
        final long j;
        float f;
        qzd0Var.getClass();
        b bVarI = aVar.i(-938746040);
        int i2 = (bVarI.d(qzd0Var.ordinal()) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = qzd0Var.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(-191808477);
                j = ((lib0) bVarI.O(oib0.a)).S;
                bVarI.X(false);
            } else {
                if (iOrdinal != 1) {
                    throw igf0.a(bVarI, -191810035, false);
                }
                bVarI.N(-191806507);
                j = ((lib0) bVarI.O(oib0.a)).V;
                bVarI.X(false);
            }
            int iOrdinal2 = qzd0Var.ordinal();
            if (iOrdinal2 == 0) {
                f = 0.0f;
            } else {
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return;
                }
                f = 180.0f;
            }
            d dVarA = p1a.a(j.t(d.a.b, 10.0f, 4.0f), f);
            boolean zE = bVarI.e(j);
            Object objY = bVarI.y();
            if (zE || objY == a.C0041a.a) {
                objY = new Function1() { // from class: rzd0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        j90 j90VarA = m90.a();
                        j90VarA.a(0.0f, fIntBitsToFloat2);
                        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
                        j90VarA.c(fIntBitsToFloat / 2.0f, 0.0f);
                        j90VarA.close();
                        tcf.Q1(tcfVar, j90VarA, j, 0.0f, null, 60);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVarA, (Function1) objY, bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: szd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    tzd0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
