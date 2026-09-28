package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class p4l {
    public static final void a(Function0 function0, final op8 op8Var, a aVar, final int i) {
        int i2;
        final Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(450812402);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            function1 = function0;
            u60.a(function1, null, pp8.b(-1331799749, new n4l(op8Var, function0), bVarI), bVarI, (i2 & 14) | 384, 2);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: o4l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    p4l.a(function1, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
