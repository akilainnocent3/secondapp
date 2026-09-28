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

/* JADX INFO: loaded from: classes8.dex */
public final class wai0 {
    public static final void a(final int i, final int i2, final op8 op8Var, a aVar, final boolean z) {
        int i3;
        b bVarI = aVar.i(-1607404544);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                z = false;
            }
            q75.a(j.g(d.a.b, 1.0f), null, false, pp8.b(-1878374186, new gaj() { // from class: uai0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5;
                    boolean z2;
                    vu30 vu30Var;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        qyd0 qyd0Var = kna.h;
                        float fC1 = ((mmd) aVar2.O(qyd0Var)).C1(r75Var.d());
                        float fC2 = ((mmd) aVar2.O(qyd0Var)).C1(400.0f);
                        d dVarB = androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), r58.d(4278453510L), j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12));
                        if (z) {
                            z2 = false;
                            i5 = 12;
                            vu30Var = new vu30(kotlin.collections.b.k(new j58(r58.b(451986529)), new j58(j58.l)), null, (((long) Float.floatToRawIntBits(fC1 / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((-fC2) * 0.3f)) & 4294967295L), fC2);
                        } else {
                            i5 = 12;
                            z2 = false;
                            vu30Var = new vu30(kotlin.collections.b.k(new j58(r58.b(451986529)), new j58(r58.b(0))), null, (((long) Float.floatToRawIntBits(fC1 / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), fC2);
                        }
                        d dVarF = h.f(androidx.compose.foundation.a.a(dVarB, vu30Var, j060.e(16.0f, 16.0f, 0.0f, 0.0f, i5), 0.0f, 4), 0.5f);
                        aiv aivVarC = g75.c(ht.a.a, z2);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarF);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        fc0.a(0, op8Var, aVar2);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vai0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wai0.a(qj40.a(i | 1), i2, op8Var, (a) obj, z);
                    return Unit.a;
                }
            };
        }
    }
}
