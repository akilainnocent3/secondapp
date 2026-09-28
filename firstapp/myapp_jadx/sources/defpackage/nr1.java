package defpackage;

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
public final class nr1 {
    public static final void a(final long j, final omd0 omd0Var, final long j2, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(624954739);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(omd0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            mez.a(new kod0(33.0f, 6.0f, 22.0f, 16.0f, (int) (j >> 32), (int) (j & 4294967295L), (int) (j2 >> 32), (int) (4294967295L & j2), 768), pp8.b(400511224, new iaj() { // from class: lr1
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    g7f g7fVar = (g7f) obj2;
                    a aVar2 = (a) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= aVar2.c(g7fVar.a) ? 32 : 16;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 145) != 144)) {
                        d dVarD = j.D(j.i(d.a.b, g7fVar.a), null, 3);
                        Object objY = aVar2.y();
                        if (objY == a.C0041a.a) {
                            objY = pr7.a(aVar2);
                        }
                        d dVarB = androidx.compose.foundation.d.b(dVarD, (psw) objY, null, false, null, omd0Var, 28);
                        aiv aivVarC = g75.c(ht.a.b, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
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
                        mw90.a(com.sportygames.newcms.c.c(uld0.i0.m, new String[0], aVar2), null, null, null, null, d0b.a.c, null, aVar2, 1572912, 1980);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mr1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nr1.a(j, omd0Var, j2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
