package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z7v {
    public static final void a(final wlc0 wlc0Var, a aVar, final int i) {
        int i2;
        final wlc0 wlc0Var2;
        b bVarI = aVar.i(-1454739553);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(wlc0Var == null ? -1 : wlc0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            wlc0Var2 = wlc0Var;
            bVarI.G();
        } else {
            if (wlc0Var == null) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: w7v
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            z7v.a(wlc0Var, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(d.a.b, 1.0f), 32.0f), ((j58) hw90.a(c68.a(wlc0Var.c, bVarI), yi0.e(0, 0, null, 7), "BackgroundColorAnimation", bVarI, 432, 8).getValue()).a, zk40.a);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new x7v();
                bVarI.r(objY);
            }
            wlc0Var2 = wlc0Var;
            androidx.compose.animation.a.b(wlc0Var2, null, (Function1) objY, n54Var, "", null, ke9.a, bVarI, (i2 & 14) | 1600896, 34);
            bVarI = bVarI;
            bVarI.X(true);
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: y7v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    z7v.a(wlc0Var2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
