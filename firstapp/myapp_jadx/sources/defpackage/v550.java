package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class v550 {
    public static final void a(w550 w550Var, a aVar, int i) {
        w550Var.getClass();
        b bVarI = aVar.i(-1968451738);
        int i2 = 2;
        int i3 = (bVarI.M(w550Var) ? 4 : 2) | i;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            d dVarG = h.g(j.i(j.g(d.a.b, 1.0f), 80.0f), 2.0f, 2.0f);
            long j = j58.b;
            ihe0.a(lx80.d(dVarG, 2.0f, null, false, j, j, 6), null, c68.a(R.color.bg_secondary_d_lighter, bVarI), 0L, 0.0f, 0.0f, null, pp8.b(-433956757, new mm(w550Var, i2), bVarI), bVarI, 12582918, 122);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new nm(w550Var, i);
        }
    }
}
