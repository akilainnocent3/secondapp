package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class mwx {
    public static final void a(final Function0 function0, final d dVar, boolean z, qx80 qx80Var, final ak5 ak5Var, final umz umzVar, psw pswVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        final boolean z2;
        final qx80 qx80Var2;
        final psw pswVar2;
        final qx80 qx80Var3;
        final psw pswVar3;
        final boolean z3;
        function0.getClass();
        b bVarI = aVar.i(1383378489);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.M(ak5Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i4 = 1769472 | i3;
        if ((12582912 & i) == 0) {
            i4 |= bVarI.M(umzVar) ? 8388608 : 4194304;
        }
        int i5 = i4 | 100663296;
        if ((805306368 & i) == 0) {
            i5 |= bVarI.A(op8Var) ? 536870912 : 268435456;
        }
        if (bVarI.q(i5 & 1, (306783379 & i5) != 306783378)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                umz umzVar2 = ek5.a;
                qx80 qx80VarB = xy80.b(ok5.a, bVarI);
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = rzk.a(bVarI);
                }
                qx80Var3 = qx80VarB;
                pswVar3 = (psw) objY;
                z3 = true;
            } else {
                bVarI.G();
                z3 = z;
                qx80Var3 = qx80Var;
                pswVar3 = pswVar;
            }
            bVarI.Y();
            hna.a(zxo.c.a(Boolean.FALSE), pp8.b(2134532857, new Function2() { // from class: kwx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        nk5.c(function0, j.a(dVar, 1.0f, 1.0f), z3, qx80Var3, ak5Var, null, umzVar, pswVar3, op8Var, aVar2, 0, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
            z2 = z3;
            qx80Var2 = qx80Var3;
            pswVar2 = pswVar3;
        } else {
            bVarI.G();
            z2 = z;
            qx80Var2 = qx80Var;
            pswVar2 = pswVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lwx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mwx.a(function0, dVar, z2, qx80Var2, ak5Var, umzVar, pswVar2, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
