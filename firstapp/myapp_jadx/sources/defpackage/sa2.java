package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sa2 {
    public static final void a(final d dVar, final androidx.compose.runtime.d dVar2, final op8 op8Var, a aVar, final int i) {
        int i2;
        op8 op8Var2 = ky8.a;
        b bVarI = aVar.i(-714464401);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(op8Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = m.a(null, epx.a);
                bVarI.r(objY);
            }
            ka2 ka2VarB = b((i2 >> 6) & 14, op8Var2, bVarI);
            hna.a(dVar2.a(ka2VarB), pp8.b(274270255, new qa2(dVar, (ytw) objY, op8Var, ka2VarB), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: na2
                {
                    op8 op8Var3 = ky8.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    op8 op8Var3 = ky8.a;
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    sa2.a(dVar, dVar2, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final ka2 b(int i, op8 op8Var, a aVar) {
        boolean z = (((i & 14) ^ 6) > 4 && aVar.M(op8Var)) || (i & 6) == 4;
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (z || objY == obj) {
            objY = new ka2(op8Var);
            aVar.r(objY);
        }
        final ka2 ka2Var = (ka2) objY;
        boolean zM = aVar.M(ka2Var);
        Object objY2 = aVar.y();
        if (zM || objY2 == obj) {
            objY2 = new Function1() { // from class: ma2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return new ra2(ka2Var);
                }
            };
            aVar.r(objY2);
        }
        xvf.c(ka2Var, (Function1) objY2, aVar);
        return ka2Var;
    }
}
