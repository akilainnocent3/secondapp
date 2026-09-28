package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wsq {
    public static final void a(final int i, final int i2, a aVar, d dVar, final Function0 function0) {
        d dVar2;
        int i3;
        final d dVar3;
        function0.getClass();
        b bVarI = aVar.i(-1619447846);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            dVar3 = i4 != 0 ? d.a.b : dVar2;
            d dVarR = j.r(dVar3, 12.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            h6n.b(erz.a(R.drawable.ic__info_circle, 0, bVarI), "quick_pick_info", androidx.compose.foundation.d.b(dVarR, (psw) objY, ut50.b(5.0f, 5, 0L, false), false, null, mla.d(function0, bVarI, i3 & 112), 28), ((lib0) bVarI.O(oib0.a)).P, bVarI, 48, 0);
        } else {
            bVarI.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vsq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wsq.a(qj40.a(i | 1), i2, (a) obj, dVar3, function0);
                    return Unit.a;
                }
            };
        }
    }
}
