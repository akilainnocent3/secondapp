package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class jmm {
    public static final void a(final boolean z, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        int i2;
        b bVarA = v2g.a(function0, function1, aVar, -1103044755);
        if ((i & 6) == 0) {
            i2 = (bVarA.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function1) ? 256 : 128;
        }
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objY = bVarA.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: gmm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z) {
                            function0.invoke();
                        } else {
                            function1.invoke();
                        }
                        return Unit.a;
                    }
                };
                bVarA.r(objY);
            }
            cje.a(0.92f, 0.08f, 0.0f, (Function0) objY, h59.a, bVarA, 24630, 4);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hmm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jmm.a(z, function0, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
