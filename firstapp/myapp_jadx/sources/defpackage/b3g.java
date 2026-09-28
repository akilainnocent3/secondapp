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

/* JADX INFO: loaded from: classes6.dex */
public final class b3g {
    public static final void a(final String str, final String str2, a aVar, final int i) {
        str2.getClass();
        b bVarI = aVar.i(246730810);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            rrt.a(null, null, pp8.b(1577734994, new y2g(0, str, str2), bVarI), bVarI, 384, 3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z2g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    b3g.a(str, str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, a aVar, final int i) {
        b bVar;
        str2.getClass();
        b bVarI = aVar.i(1374663389);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVar = bVarI;
            lkf0.d(str, g3w.h(h.g(j.g(d.a.b, 1.0f), 56.0f, 12.0f), str2), r58.d(4293388265L), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVar, (i2 & 14) | 384, 0, 130040);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: a3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    b3g.b(str, str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
