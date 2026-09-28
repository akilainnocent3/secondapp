package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nm90 {
    public static final void a(final LayoutWeightElement layoutWeightElement, final om90 om90Var, final zzr zzrVar, final Function0 function0, final pf3 pf3Var, a aVar, final int i) {
        int i2;
        zzrVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-753330362);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(om90Var) : bVarI.A(om90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(zzrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(pf3Var) ? 16384 : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            Integer numValueOf = Integer.valueOf(om90Var.a.size());
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new km90(zzrVar, function0, null);
                bVarI.r(objY);
            }
            xvf.g(zzrVar, numValueOf, (Function2) objY, bVarI);
            d dVarB = androidx.compose.foundation.a.b(layoutWeightElement, ((lib0) bVarI.O(oib0.a)).i0, zk40.a);
            boolean z2 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && bVarI.A(om90Var))) | ((57344 & i2) == 16384);
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: hm90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        ArrayList arrayList = om90Var.a;
                        szrVar.d(arrayList.size(), null, new lm90(arrayList), new op8(802480018, new mm90(arrayList, pf3Var), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            aur.a(dVarB, zzrVar, null, false, null, null, null, false, null, (Function1) objY2, bVarI, (i2 >> 3) & 112, 508);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: im90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nm90.a(layoutWeightElement, om90Var, zzrVar, function0, pf3Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
