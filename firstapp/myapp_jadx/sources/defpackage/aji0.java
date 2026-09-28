package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class aji0 {
    public static final void a(final int i, a aVar, final String str, final Function0 function0) {
        function0.getClass();
        b bVarI = aVar.i(276496254);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(d.a.b, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            xya.a(h.i(dVarG, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).h), false, str, null, sya.b, null, null, null, null, function0, bVarI, ((i2 << 6) & 896) | ((i2 << 24) & 1879048192), 490);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0) { // from class: zii0
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = str;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aji0.a(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
