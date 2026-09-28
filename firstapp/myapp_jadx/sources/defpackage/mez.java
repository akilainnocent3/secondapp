package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class mez {
    public static final void a(final kod0 kod0Var, final op8 op8Var, a aVar, final int i) {
        b bVarI = aVar.i(98914107);
        int i2 = (bVarI.M(kod0Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            float f = kod0Var.e / kod0Var.j;
            float f2 = kod0Var.f / kod0Var.i;
            float f3 = kod0Var.a * f;
            float f4 = kod0Var.b * f2;
            float f5 = kod0Var.d * f;
            float f6 = kod0Var.c * f2;
            float fB = b(f3, bVarI);
            float fB2 = b(f4, bVarI);
            float fB3 = b(f5, bVarI);
            float fB4 = b(f6, bVarI);
            d dVarT = j.t(g.c(d.a.b, fB, fB2), fB3, fB4);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarT);
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
            op8Var.d(new g7f(fB3), new g7f(fB4), bVarI, 384);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(op8Var, i) { // from class: lez
                public final /* synthetic */ op8 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    mez.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final float b(float f, a aVar) {
        return ((mmd) aVar.O(kna.h)).v1(f);
    }
}
