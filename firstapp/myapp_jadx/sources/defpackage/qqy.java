package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportygames.newcms.c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class qqy {
    public static final void a(d dVar, final long j, a aVar, final int i) {
        final d dVar2;
        dVar.getClass();
        b bVarI = aVar.i(2102521546);
        int i2 = (bVarI.e(j) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final String strC = c.c(lu00.b2.l0, new String[0], bVarI);
            dVar2 = dVar;
            yu00.a(dVar2, r58.d(4293834610L), r58.d(4293074205L), false, pp8.b(944889966, new Function2() { // from class: oqy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarH = h.h(j.g(d.a.b, 1.0f), 0.0f, 4.0f, 1);
                        mxs mxsVarA = d1a.a(d9i.a(lu00.b2.h, aVar2));
                        List listK = kotlin.collections.b.k(new j58(r58.d(4294102025L)), new j58(r58.d(4294897508L)), new j58(r58.d(4294887941L)));
                        float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                        lkf0.b(strC, dVarH, 0L, j, null, null, mxsVarA, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), 0L, null, null, null, null, 0L, 33554430), aVar2, 48, 1572864, 64948);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 25014, 8);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, i) { // from class: pqy
                public final /* synthetic */ long b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    qqy.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
