package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class rb30 {
    public static final void a(final int i, final int i2, a aVar, final d dVar, final String str, final Function0 function0) {
        int i3;
        b bVarI = aVar.i(340848034);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d dVarI = j.i(dVar, 40.0f);
            i060 i060VarC = j060.c(2.0f);
            umz umzVarA = h.a(2, 8.0f, 0.0f);
            l35 l35VarA = m35.a(1.0f, c68.a(R.color.line_type1_primary, bVarI));
            boolean z = i > 0;
            umz umzVar = ek5.a;
            nk5.b(function0, dVarI, z, i060VarC, ek5.a(c68.a(R.color.background_cashout_card, bVarI), c68.a(R.color.text_type1_primary, bVarI), c68.a(R.color.background_type1_tertiary, bVarI), c68.a(R.color.text_disable_type1_primary, bVarI), bVarI, 0), l35VarA, umzVarA, pp8.b(200334960, new gaj() { // from class: pb30
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(str, j.g(d.a.b, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 2, false, 2, 0, null, ((eah0) aVar2.O(gah0.a)).m, aVar2, 48, 24960, 109564);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i3 >> 9) & 14) | 817889280, 288);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qb30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    rb30.a(i, iA, (a) obj, dVar, str, function0);
                    return Unit.a;
                }
            };
        }
    }
}
