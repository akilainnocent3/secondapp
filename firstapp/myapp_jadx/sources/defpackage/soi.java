package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;

/* JADX INFO: loaded from: classes6.dex */
public final class soi implements roi {
    @Override // defpackage.roi
    public final void a(koi koiVar, a aVar, int i) {
        int i2;
        b bVarI = aVar.i(292145549);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(koiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            kpi.f(koiVar, bVarI, i2 & 14);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new g25(this, i, 1, koiVar);
        }
    }
}
