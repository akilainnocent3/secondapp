package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n6c0 {
    public static final void a(final int i, long j, a aVar, final d dVar, String str, final Function0 function0) {
        int i2;
        final long j2;
        final String str2;
        final long jA;
        int i3;
        String str3;
        function0.getClass();
        b bVarI = aVar.i(-1263492679);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i4 & 1, (i4 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                jA = c68.a(R.color.brand_tertiary, bVarI);
                i3 = i4 & (-113);
                str3 = "close_button";
            } else {
                bVarI.G();
                i3 = i4 & (-113);
                jA = j;
                str3 = str;
            }
            bVarI.Y();
            c6n.a(function0, g3w.h(dVar, str3), false, null, null, pp8.b(747071835, new Function2() { // from class: l6c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h6n.b(erz.a(R.drawable.ic_close_white_24dp, 0, aVar2), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(d.a.b, 24.0f), jA, aVar2, 432, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i3 >> 9) & 14) | 1572864, 60);
            str2 = str3;
            j2 = jA;
        } else {
            bVarI.G();
            j2 = j;
            str2 = str;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m6c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n6c0.a(qj40.a(i | 1), j2, (a) obj, dVar, str2, function0);
                    return Unit.a;
                }
            };
        }
    }
}
