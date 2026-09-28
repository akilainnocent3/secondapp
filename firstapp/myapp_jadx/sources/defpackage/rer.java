package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class rer {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d dVar, mer merVar, a aVar, int i) {
        Pair pair;
        merVar.getClass();
        b bVarI = aVar.i(-1914793900);
        int i2 = (bVarI.M(merVar) ? 32 : 16) | i;
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.G();
        } else if (merVar.equals(mer.c.a)) {
            bVarI.N(2130682572);
            bVarI.X(false);
        } else {
            mer.a aVar2 = mer.a.a;
            if (!merVar.equals(aVar2) && !merVar.equals(mer.b.a)) {
                throw igf0.a(bVarI, -1870931751, false);
            }
            bVarI.N(2130768194);
            if (merVar.equals(aVar2)) {
                bVarI.N(-1870925567);
                pair = new Pair(new j58(fjb0.b(bVarI).q0), new j58(fjb0.b(bVarI).O));
                bVarI.X(false);
            } else {
                if (!merVar.equals(mer.b.a)) {
                    throw igf0.a(bVarI, -1870927314, false);
                }
                bVarI.N(-1870922678);
                pair = new Pair(new j58(fjb0.b(bVarI).H0), new j58(fjb0.b(bVarI).a0));
                bVarI.X(false);
            }
            long j = ((j58) pair.a).a;
            h6n.b(erz.a(R.drawable.ic__live, 0, bVarI), "live", h.f(androidx.compose.foundation.a.b(j.r(dVar, 24.0f), j, j060.c(4.0f)), fjb0.d(bVarI).c), ((j58) pair.b).a, bVarI, 48, 0);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new qer(dVar, i, 0, merVar);
        }
    }
}
