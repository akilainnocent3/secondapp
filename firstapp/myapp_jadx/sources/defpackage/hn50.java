package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class hn50 {
    public static final void a(final int i, fk4 fk4Var, a aVar, Function0 function0) {
        int i2;
        final fk4 fk4Var2;
        final Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(422964627);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(fk4Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ti4 ti4Var = ti4.w0;
            fk4Var2 = fk4Var;
            function1 = function0;
            xi4.a(c.c(ti4Var.b0, new String[0], bVarI), c.c(ti4Var.c0, new String[0], bVarI), c.c(ti4Var.d0, new String[0], bVarI), c.c(ti4Var.e0, new String[0], bVarI), function1, fk4Var2, bVarI, (i2 << 12) & 516096);
        } else {
            fk4Var2 = fk4Var;
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gn50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hn50.a(qj40.a(i | 1), fk4Var2, (a) obj, function1);
                    return Unit.a;
                }
            };
        }
    }
}
