package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
public final class etp {
    public static final void a(final gtp.a aVar, final boolean z, final Function0 function0, final d dVar, a aVar2, final int i) {
        int i2;
        Function0 function1;
        aVar.getClass();
        function0.getClass();
        b bVarI = aVar2.i(-1695905275);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(aVar) : bVarI.A(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= bVarI.A(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(dVar) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            d dVarD = d.a.b;
            if (z) {
                dVarD = androidx.compose.foundation.d.d(dVarD, false, null, null, function1, 15);
            }
            d dVarN = dVar.n(dVarD);
            if (aVar instanceof gtp.a.b) {
                bVarI.N(-1013338451);
                lkf0.d(((gtp.a.b) aVar).a.g(context), dVarN, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 130040);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                if (!(aVar instanceof gtp.a.C0608a)) {
                    throw igf0.a(bVarI, -1972352535, false);
                }
                bVarI.N(-1012960902);
                gtp.a.C0608a c0608a = (gtp.a.C0608a) aVar;
                int i3 = c0608a.b;
                bt50.a(c.p(c0608a.a.g(context), String.valueOf(i3), pe4.b(i3, iKBWavCysVP.wPXyBJy, "</font>"), false), dVarN, null, imf0.b(mla.l(R.style.B1_R, bVarI), c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744414), new ct50(0L, null, dtp.a(Integer.valueOf(R.color.brand_secondary), "#0d9737"), new prz.b(), 15), bVarI, 0, 4);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ctp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    etp.a(aVar, z, function0, dVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
