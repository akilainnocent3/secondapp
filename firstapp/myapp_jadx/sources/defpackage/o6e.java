package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class o6e {
    public static final void a(final d dVar, final x3e x3eVar, final Function1 function1, a aVar, final int i) {
        x3eVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(1528976808);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(x3eVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Ctry ctry = x3eVar.a;
            Unit unit = Unit.a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new n6e(function1, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            d dVarJ = h.j(dVar, 0.0f, ((cjb0) bVarI.O(ejb0.a)).f, 0.0f, 0.0f, 13);
            Ctry.a aVar2 = ctry.b;
            Ctry.b bVar = ctry.c;
            boolean z2 = bVar != null;
            boolean z3 = i3 == 256;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: k6e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(w3e.b.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            e6e.a(dVarJ, aVar2, z2, (Function0) objY2, bVarI, 0);
            if (!x3eVar.b || bVar == null) {
                bVarI.N(1620801882);
                bVarI.X(false);
            } else {
                bVarI.N(1620614487);
                boolean z4 = i3 == 256;
                Object objY3 = bVarI.y();
                if (z4 || objY3 == c0042a) {
                    objY3 = new l6e(function1, 0);
                    bVarI.r(objY3);
                }
                j6e.a(null, bVar, (Function0) objY3, bVarI, 0);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(x3eVar, function1, i) { // from class: m6e
                public final /* synthetic */ x3e b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    o6e.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
