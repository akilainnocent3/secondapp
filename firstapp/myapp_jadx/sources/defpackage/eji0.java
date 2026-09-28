package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class eji0 {
    public static final void a(final String str, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(858856884);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarG = j.g(d.a.b, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            bVar = bVarI;
            lkf0.d(str, h.j(dVarG, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).f, 0.0f, 8), ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).k, bVar, i2 & 14, 0, 130040);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: dji0
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    eji0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
