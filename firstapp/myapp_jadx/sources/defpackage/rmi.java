package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rmi {
    public static final void a(int i, final op8 op8Var, a aVar) {
        b bVarI = aVar.i(-2050746093);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            uf00<zg4> uf00Var = cbi.a;
            final int iB = (int) mla.b(360.0f, bVarI);
            final int iB2 = (int) mla.b(640.0f, bVarI);
            boolean zD = bVarI.d(iB) | bVarI.d(iB2);
            Object objY = bVarI.y();
            if (zD || objY == a.C0041a.a) {
                objY = new Function2() { // from class: nmi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        rce0 rce0Var = (rce0) obj;
                        final kxa kxaVar = (kxa) obj2;
                        rce0Var.getClass();
                        uf00<zg4> uf00Var2 = cbi.a;
                        int iH = kxa.h(kxaVar.a);
                        long j = kxaVar.a;
                        final int i2 = iH / kxa.i(j);
                        long j2 = kxaVar.a;
                        int i3 = kxa.i(j2);
                        final int i4 = iB;
                        int iMax = Math.max(i3, i4);
                        int iH2 = kxa.h(j);
                        final int i5 = iB2;
                        long jB = kxa.b(0, iMax, 0, Math.max(iH2, i5), 5, j2);
                        int iH3 = (i5 - kxa.h(j)) / 2;
                        Integer numValueOf = Integer.valueOf(iH3);
                        if (iH3 <= 0) {
                            numValueOf = null;
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        final op8 op8Var2 = op8Var;
                        final y yVarD0 = ((vhv) CollectionsKt.T(rce0Var.K("content", new op8(26485630, new Function2() { // from class: pmi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                d dVarC;
                                long j3 = kxaVar.a;
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    d.a aVar3 = d.a.b;
                                    d dVarE = j.e(aVar3, 1.0f);
                                    aiv aivVarC = g75.c(ht.a.e, false);
                                    int iHashCode = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO = aVar2.o();
                                    d dVarC2 = c.c(aVar2, dVarE);
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
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar2, aivVarC, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar2, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar2, dVarC2, cVar);
                                    if (i2 < 1.7777778f) {
                                        aVar2.N(191966593);
                                        aVar2.H();
                                        uf00<zg4> uf00Var3 = cbi.a;
                                        d dVarT = j.t(aVar3, 360.0f, 640.0f);
                                        float fH = kxa.h(j3) / i5;
                                        dVarC = bz60.a(dVarT, fH, fH);
                                    } else {
                                        aVar2.N(192321791);
                                        float fI = kxa.i(j3) / i4;
                                        uf00<zg4> uf00Var4 = cbi.a;
                                        dVarC = j.c(bz60.a(j.t(aVar3, 360.0f, mla.e(kxa.h(j3) / fI, aVar2)), fI, fI), 1.0f);
                                        aVar2.H();
                                    }
                                    aiv aivVarC2 = g75.c(ht.a.a, false);
                                    int iHashCode2 = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO2 = aVar2.o();
                                    d dVarC3 = c.c(aVar2, dVarC);
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
                                    hlh0.a(aVar2, aivVarC2, bVar);
                                    hlh0.a(aVar2, ne00VarO2, dVar);
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar2, dVarC3, cVar);
                                    op8Var2.invoke(aVar2, 0);
                                    aVar2.s();
                                    aVar2.s();
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true)))).d0(jB);
                        return t.z1(rce0Var, kxa.i(j), kxa.h(j), new Function1() { // from class: qmi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                y.a aVar2 = (y.a) obj3;
                                aVar2.getClass();
                                aVar2.s(yVarD0, 0, iIntValue * (-1), 0.0f);
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(objY);
            }
            f0.a(null, (Function2) objY, bVarI, 0, 1);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new omi(op8Var, i, 0);
        }
    }
}
