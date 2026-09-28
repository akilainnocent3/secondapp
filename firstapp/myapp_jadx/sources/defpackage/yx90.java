package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yx90 {
    public static final void a(final d dVar, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-686782325);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            g75.a(androidx.compose.foundation.a.a(h.f(androidx.compose.foundation.a.b(h.f(j.i(androidx.compose.foundation.a.a(dVar, m590.a(null, bVarI, 3), j060.c(2.0f), 0.0f, 4), 48.0f), 1.0f), c68.a(R.color.background_general_primary, bVarI), j060.c(2.0f)), 10.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xx90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    yx90.a(dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
