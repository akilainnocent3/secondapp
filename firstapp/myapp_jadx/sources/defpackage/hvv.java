package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hvv {
    public static final void a(d dVar, final v0u v0uVar, final Function0<Unit> function0, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        Function0<Unit> function1;
        v0uVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-179890751);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(v0uVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i3 |= bVarI.A(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d dVar3 = i4 != 0 ? d.a.b : dVar2;
            ayh.a(function1, j.r(dVar3, 32.0f), j060.a, v0uVar.a, ((lib0) bVarI.O(oib0.a)).O, new pxh(0.0f, d6h.d, d6h.b, d6h.c), ue9.a, bVarI, ((i3 >> 6) & 14) | 12582912, 64);
            dVar2 = dVar3;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gvv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hvv.a(dVar2, v0uVar, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
