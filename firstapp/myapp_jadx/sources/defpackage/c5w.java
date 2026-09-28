package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c5w {
    public static final void a(final int i, a aVar, d dVar, final Function0 function0) {
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(1307899445);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), "more_options_button");
            alb0 alb0Var = qdf0.a;
            ddd0.b(dVarH, false, null, qdf0.a(384, 2, c68.a(R.color.text_type1_secondary, bVarI), bVarI), null, 0.0f, false, null, null, function0, ff9.a, null, ff9.b, bVarI, (i2 << 24) & 1879048192, 390, 2550);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b5w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c5w.a(qj40.a(i | 1), (a) obj, dVar2, function0);
                    return Unit.a;
                }
            };
        }
    }
}
