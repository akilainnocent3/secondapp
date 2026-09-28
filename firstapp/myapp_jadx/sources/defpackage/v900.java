package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v900 {
    public static final void a(final uxs uxsVar, final d dVar, String str, final Function0<Unit> function0, a aVar, final int i, final int i2) {
        int i3;
        final String strA;
        b bVar;
        uxsVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(643282205);
        if ((i & 6) == 0) {
            i3 = (bVarI.d(uxsVar.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                strA = str;
                int i4 = bVarI.M(strA) ? 256 : 128;
                i3 |= i4;
            } else {
                strA = str;
            }
            i3 |= i4;
        } else {
            strA = str;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                strA = cb40.a(R.string.common_functions__top_up_now, new Object[0], bVarI);
                i3 &= -897;
            }
            bVarI.Y();
            boolean z = (i3 & 7168) == 2048;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: t900
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            bVar = bVarI;
            aza.a(j.g(dVar, 1.0f), strA, uxsVar, null, null, null, null, null, mla.d((Function0) objY, bVarI, 0), null, bVar, ((i3 >> 3) & 112) | ((i3 << 6) & 896), 760);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u900
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v900.a(uxsVar, dVar, strA, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
