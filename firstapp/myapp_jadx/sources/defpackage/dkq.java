package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dkq {
    public static final void a(final LayoutWeightElement layoutWeightElement, a aVar, final int i) {
        b bVarI = aVar.i(-1925906610);
        int i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, layoutWeightElement);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d.a aVar3 = d.a.b;
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar3, 1.0f), 32.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar3, 1.0f), 16.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
            ute.b(null, 1.0f, ((lib0) bVarI.O(oib0.a)).A, bVarI, 48, 1);
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar3, 1.0f), 16.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: ckq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dkq.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, a aVar, final int i) {
        dVar.getClass();
        b bVarI = aVar.i(-1152057490);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            g75.a(androidx.compose.foundation.a.a(j.t(d.a.b, 24.0f, 32.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
            a(new LayoutWeightElement(1.0f, true), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: bkq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dkq.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
