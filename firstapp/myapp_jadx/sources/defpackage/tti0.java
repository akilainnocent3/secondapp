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

/* JADX INFO: loaded from: classes7.dex */
public final class tti0 {
    public static final void a(final d dVar, final float f, final float f2, final op8 op8Var, a aVar, final int i) {
        int i2;
        dVar.getClass();
        b bVarI = aVar.i(1422530086);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final int iA = (int) i7f.a(f, bVarI);
            final int iA2 = (int) i7f.a(f2, bVarI);
            boolean zD = bVarI.d(iA) | bVarI.d(iA2);
            Object objY = bVarI.y();
            if (zD || objY == a.C0041a.a) {
                Function2 function2 = new Function2() { // from class: pti0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        rce0 rce0Var = (rce0) obj;
                        final kxa kxaVar = (kxa) obj2;
                        rce0Var.getClass();
                        final float f3 = f2;
                        final float f4 = f;
                        final float f5 = f3 / f4;
                        int iH = kxa.h(kxaVar.a);
                        long j = kxaVar.a;
                        final int i3 = iH / kxa.i(j);
                        long j2 = kxaVar.a;
                        int i4 = kxa.i(j2);
                        final int i5 = iA;
                        int iMax = Math.max(i4, i5);
                        int iH2 = kxa.h(j);
                        final int i6 = iA2;
                        long jB = kxa.b(0, iMax, 0, Math.max(iH2, i6), 5, j2);
                        int iH3 = (i6 - kxa.h(j)) / 2;
                        Integer numValueOf = Integer.valueOf(iH3);
                        if (iH3 <= 0) {
                            numValueOf = null;
                        }
                        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        int i7 = (i5 - kxa.i(j)) / 2;
                        Integer numValueOf2 = i7 > 0 ? Integer.valueOf(i7) : null;
                        final int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                        final op8 op8Var2 = op8Var;
                        final int i8 = iIntValue;
                        final y yVarD0 = ((vhv) CollectionsKt.T(rce0Var.K("content", new op8(-578855151, new Function2() { // from class: rti0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                d dVarC;
                                long j3 = kxaVar.a;
                                a aVar2 = (a) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (aVar2.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
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
                                    yka.a.d dVar2 = yka.a.e;
                                    hlh0.a(aVar2, ne00VarO, dVar2);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar2, dVarC2, cVar);
                                    float f6 = i3;
                                    float f7 = f5;
                                    float f8 = f4;
                                    if (f6 < f7) {
                                        aVar2.N(1007360884);
                                        aVar2.H();
                                        d dVarT = j.t(aVar3, f8, f3);
                                        float fH = kxa.h(j3) / i6;
                                        dVarC = bz60.a(dVarT, fH, fH);
                                    } else {
                                        aVar2.N(1007679874);
                                        float fI = kxa.i(j3) / i5;
                                        dVarC = j.c(bz60.a(j.t(aVar3, f8, ((mmd) aVar2.O(kna.h)).v1(kxa.h(j3) / fI)), fI, fI), 1.0f);
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
                                    hlh0.a(aVar2, ne00VarO2, dVar2);
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
                        return t.z1(rce0Var, kxa.i(j), kxa.h(j), new Function1() { // from class: sti0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                y.a aVar2 = (y.a) obj3;
                                aVar2.getClass();
                                aVar2.s(yVarD0, iIntValue2 * (-1), i8 * (-1), 0.0f);
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(function2);
                objY = function2;
            }
            f0.a(dVar, (Function2) objY, bVarI, i2 & 14, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qti0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tti0.a(dVar, f, f2, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
