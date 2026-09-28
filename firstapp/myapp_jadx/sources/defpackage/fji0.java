package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class fji0 {
    public static final void a(String str, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(-1917886222);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarG = j.g(d.a.b, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            bVar = bVarI;
            lkf0.d(str, h.j(dVarG, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).f, 0.0f, 8), ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).c, bVar, i2 & 14, 0, 130040);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new hmo(i, 2, str);
        }
    }
}
