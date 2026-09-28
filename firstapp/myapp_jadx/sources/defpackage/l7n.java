package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class l7n {
    public static final void a(final float f, final float f2, a aVar, final int i) {
        b bVarI = aVar.i(2074811693);
        int i2 = i & 1;
        if (bVarI.q(i2, i2 != 0)) {
            ty0.a(bVarI, j.i(j.g(d.a.b, 1.0f), 200.0f));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k7n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    l7n.a(f, f2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
