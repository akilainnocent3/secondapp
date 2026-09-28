package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fuc {
    public static final umz a = h.b(0.0f, 0.0f, 6.0f, 8.0f, 3);
    public static final float b = 8.0f;
    public static final float c = 12.0f;

    public static final void a(final Function0 function0, final op8 op8Var, d dVar, final Function2 function2, qx80 qx80Var, final gtc gtcVar, yle yleVar, final op8 op8Var2, a aVar, final int i) {
        int i2;
        final d dVar2;
        final yle yleVar2;
        final qx80 qx80Var2;
        qx80 qx80Var3;
        int i3;
        d dVar3;
        b bVarI = aVar.i(219718641);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i) == 0) {
            i5 |= bVarI.M(gtcVar) ? 1048576 : 524288;
        }
        int i6 = i5 | 12582912;
        if ((100663296 & i) == 0) {
            i6 |= bVarI.A(op8Var2) ? 67108864 : 33554432;
        }
        if (bVarI.q(i6 & 1, (38347923 & i6) != 38347922)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                ktc ktcVar = ktc.a;
                qx80 qx80VarB = xy80.b(dxc.c, bVarI);
                yleVar2 = new yle(false, false, 3);
                qx80Var3 = qx80VarB;
                i3 = i6 & (-57345);
                dVar3 = d.a.b;
            } else {
                bVarI.G();
                qx80Var3 = qx80Var;
                yleVar2 = yleVar;
                i3 = i6 & (-57345);
                dVar3 = dVar;
            }
            bVarI.Y();
            ys.d(function0, j.A(dVar3, null, 3), yleVar2, pp8.b(1108953335, new euc(qx80Var3, gtcVar, op8Var2, function2, op8Var), bVarI), bVarI, (i3 & 14) | 3072 | ((i3 >> 15) & 896));
            dVar2 = dVar3;
            qx80Var2 = qx80Var3;
        } else {
            bVarI.G();
            dVar2 = dVar;
            yleVar2 = yleVar;
            qx80Var2 = qx80Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: auc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fuc.a(function0, op8Var, dVar2, function2, qx80Var2, gtcVar, yleVar2, op8Var2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
