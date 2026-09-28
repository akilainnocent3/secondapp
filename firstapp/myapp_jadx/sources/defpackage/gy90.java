package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gy90 {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(1456022618);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            f160 f160Var = f160.a;
            b(48, 0, bVarI, f160Var.a(1.0f, aVar2, true), true);
            b(0, 2, bVarI, f160Var.a(1.0f, aVar2, true), false);
            b(0, 2, bVarI, f160Var.a(1.0f, aVar2, true), false);
            b(0, 2, bVarI, f160Var.a(1.0f, aVar2, true), false);
            b(0, 2, bVarI, f160Var.a(1.0f, aVar2, true), false);
            bVarI.X(true);
            g75.a(j.i(j.g(androidx.compose.foundation.a.a(aVar2, m590.a(null, bVarI, 3), null, 0.0f, 6), 1.0f), 1.0f), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new jp9(i);
        }
    }

    public static final void b(final int i, final int i2, a aVar, final d dVar, final boolean z) {
        b bVarI = aVar.i(1441926303);
        int i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                z = false;
            }
            d dVarI = j.i(dVar, 48.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
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
            d.a aVar3 = d.a.b;
            d dVarI2 = j.i(androidx.compose.foundation.a.a(h.h(j.g(aVar3, 1.0f), 12.0f, 0.0f, 2), m590.a(null, bVarI, 3), null, 0.0f, 6), 20.0f);
            n54 n54Var = ht.a.e;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            g75.a(dVar2.b(dVarI2, n54Var), bVarI, 0);
            if (z) {
                bVarI.N(-1102139470);
                g75.a(dVar2.b(j.i(j.g(androidx.compose.foundation.a.a(aVar3, m590.a(null, bVarI, 3), null, 0.0f, 6), 1.0f), 4.0f), ht.a.h), bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-1101902103);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fy90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gy90.b(qj40.a(i | 1), i2, (a) obj, dVar, z);
                    return Unit.a;
                }
            };
        }
    }
}
