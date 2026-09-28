package defpackage;

import androidx.compose.foundation.layout.h;
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
public final class cne {
    public static final void a(final aue aueVar, final int i, final Function1<? super wae, Unit> function1, a aVar, final int i2) {
        int i3;
        lme lmeVar;
        function1.getClass();
        b bVarI = aVar.i(-1652983011);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(aueVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i != 0) {
                lmeVar = i != 1 ? lme.a : lme.d;
            } else {
                lmeVar = lme.c;
            }
            voe.a(null, lmeVar, pp8.b(-405876264, new Function2() { // from class: ane
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(j.g(h.j(h.h(aVar3, 24.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), r58.b(452984831), j060.c(8.0f));
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
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
                        pue.c(j.g(h.f(aVar3, 16.0f), 1.0f), aueVar, cst.b, function1, aVar2, 6);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 384, 1);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bne
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    cne.a(aueVar, i, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
