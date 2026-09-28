package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class du3 {
    public static final void a(final int i, final int i2, a aVar, final String str) {
        int i3;
        b bVar;
        str.getClass();
        b bVarI = aVar.i(-302152440);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new bu3();
                bVarI.r(objY);
            }
            bVar = bVarI;
            lkf0.d(str, g3w.h(xa80.b(d.a.b, false, (Function1) objY), "betslip_selection_odds_text"), c68.a(i, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).k, bVar, i3 & 14, 0, 131064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cu3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    du3.a(i, iA, (a) obj, str);
                    return Unit.a;
                }
            };
        }
    }
}
