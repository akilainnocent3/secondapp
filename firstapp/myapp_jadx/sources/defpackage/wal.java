package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.sportystories.domain.entity.StoryWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class wal {
    public static final void a(final StoryWidget.c cVar, final int i, a aVar, final int i2) {
        int i3;
        b bVar;
        b bVarI = aVar.i(212890491);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? bVarI.M(cVar) : bVarI.A(cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d dVarG = j.g(d.a.b, 1.0f);
            int i4 = i3;
            String str = cVar.a;
            long jM = mla.m(32.0f, bVarI);
            long jM2 = mla.m(40.0f, bVarI);
            bVar = bVarI;
            lkf0.d(str, dVarG, c68.a(R.color.text_inverse_primary, bVarI), null, jM, null, t9i.E, null, 0L, null, new gdf0(i), jM2, 0, false, 0, 0, null, imf0.b((imf0) bVarI.O(lkf0.a), 0L, 0L, null, null, null, 0L, null, new ix80(mla.b(10.0f, bVarI), j58.c(0.25f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L)), null, 0, 0L, null, null, 16769023), bVar, 1572912, (i4 >> 3) & 14, 127912);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: val
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    wal.a(cVar, i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
