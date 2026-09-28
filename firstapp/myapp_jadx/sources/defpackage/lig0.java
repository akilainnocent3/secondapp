package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class lig0 {
    public static final void a(final int i, final op8 op8Var, a aVar) {
        b bVarI = aVar.i(-9634395);
        int i2 = 1;
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            q75.a(j.g(d.a.b, 1.0f), null, false, pp8.b(903528187, new itv(op8Var, i2), bVarI), bVarI, 3078, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var) { // from class: jig0
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lig0.a(qj40.a(7), this.a, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
