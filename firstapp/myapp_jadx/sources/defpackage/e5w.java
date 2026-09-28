package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e5w {
    public static final void a(final z6z.a aVar, final Function0<Unit> function0, Function1<? super OtpSelection, Unit> function1, a aVar2, final int i) {
        int i2;
        final Function1<? super OtpSelection, Unit> function2;
        function0.getClass();
        function1.getClass();
        b bVarI = aVar2.i(-57731396);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            uf00<OtpSelection> uf00Var = aVar.b;
            boolean z = aVar.g;
            if (uf00Var.isEmpty()) {
                bVarI.N(-1888738746);
                bVarI.X(false);
            } else {
                bVarI.N(-1888904038);
                ute.b(h.h(d.a.b, 34.0f, 0.0f, 2), 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 6, 2);
                bVarI.X(false);
            }
            if (!uf00Var.isEmpty() && !aVar.a.isEmpty() && !z) {
                bVarI.N(-1888585947);
                c5w.a(i2 & 112, bVarI, null, function0);
                bVarI.X(false);
            } else if (z || uf00Var.isEmpty()) {
                bVarI.N(-1888442696);
                function2 = function1;
                o5z.c(null, aVar.a, aVar.h, function2, bVarI, (i2 << 3) & 7168, 1);
                bVarI.X(false);
            } else {
                bVarI.N(-1888238778);
                bVarI.X(false);
            }
            function2 = function1;
        } else {
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d5w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    e5w.a(aVar, function0, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
