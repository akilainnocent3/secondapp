package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jmj0 {
    public static final void a(d dVar, final fpg0 fpg0Var, final List list, final Function0 function0, a aVar, final int i) {
        fpg0Var.getClass();
        list.getClass();
        b bVarI = aVar.i(2066879299);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(fpg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(list) : bVarI.A(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            ac8.c(48, 1, pp8.b(-1299938978, new awp(fpg0Var, list, function0), bVarI), bVarI, false);
            dVar = d.a.b;
        } else {
            bVarI.G();
        }
        final d dVar2 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: imj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jmj0.a(dVar2, fpg0Var, list, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
