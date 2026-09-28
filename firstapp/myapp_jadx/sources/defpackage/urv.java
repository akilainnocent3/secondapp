package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class urv {
    public static final void a(d dVar, final long j, final i060 i060Var, long j2, final op8 op8Var, a aVar, final int i) {
        d dVar2;
        final long j3;
        int i2;
        long j4;
        b bVarI = aVar.i(2092660916);
        int i3 = i | (bVarI.e(j) ? 32 : 16) | (bVarI.M(i060Var) ? 2048 : 1024) | 8192;
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                i2 = i3 & (-57345);
                j4 = ((ast) bVarI.O(cst.e)).j;
            } else {
                bVarI.G();
                i2 = i3 & (-57345);
                j4 = j2;
            }
            bVarI.Y();
            dVar2 = dVar;
            rg6.a(d35.a(dVar2, 0.5f, j, i060Var), i060Var, gg6.b(j4, 0L, bVarI, 24576, 14), null, null, pp8.b(858804482, new gaj() { // from class: srv
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        op8Var.invoke(aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 112) | 196608, 24);
            bVarI = bVarI;
            j3 = j4;
        } else {
            dVar2 = dVar;
            bVarI.G();
            j3 = j2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2(j, i060Var, j3, op8Var, i) { // from class: trv
                public final /* synthetic */ long b;
                public final /* synthetic */ i060 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ op8 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(196999);
                    urv.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
