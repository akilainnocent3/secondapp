package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public final class ufq {
    public static final void a(final qcn qcnVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        qcnVar.getClass();
        b bVarI = aVar.i(1989495668);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(8.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            q75.a(aVar2, null, false, pp8.b(-288692770, new gaj() { // from class: sfq
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fD;
                    r75 r75Var = (r75) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(r75Var) ? 4 : 2;
                    }
                    int i4 = 0;
                    boolean z = true;
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float f = 44.0f;
                        if (Float.compare(r75Var.d(), 332.0f) <= 0) {
                            f = ((g7f) f.i(new g7f((r75Var.d() - 24.0f) / 7.0f), new g7f(36.0f), new g7f(44.0f))).a;
                            fD = 4.0f;
                        } else {
                            fD = (r75Var.d() - 308.0f) / 6.0f;
                        }
                        ArrayList arrayListL = CollectionsKt.L(qcnVar, 7);
                        d.a aVar4 = d.a.b;
                        d dVarG = j.g(aVar4, 1.0f);
                        i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, aVar3, 0);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarG);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, i78VarA, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        aVar3.N(522307036);
                        int size = arrayListL.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj4 = arrayListL.get(i5);
                            i5++;
                            List list = (List) obj4;
                            d dVarG2 = j.g(aVar4, 1.0f);
                            d160 d160VarA = b160.a(new kw0.i(fD, z, new hw0()), ht.a.j, aVar3, i4);
                            int iHashCode2 = Long.hashCode(aVar3.m());
                            int i6 = i4;
                            ne00 ne00VarO2 = aVar3.o();
                            d dVarC2 = c.c(aVar3, dVarG2);
                            yka.k.getClass();
                            tsr.a aVar6 = yka.a.b;
                            if (aVar3.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar3.D();
                            if (aVar3.g()) {
                                aVar3.F(aVar6);
                            } else {
                                aVar3.p();
                            }
                            hlh0.a(aVar3, d160VarA, yka.a.f);
                            hlh0.a(aVar3, ne00VarO2, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                            }
                            hlh0.a(aVar3, dVarC2, yka.a.d);
                            aVar3.N(-1763919671);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                op8Var.d(it.next(), new g7f(f), aVar3, Integer.valueOf(i6));
                            }
                            aVar3.H();
                            aVar3.s();
                            i4 = i6;
                            z = true;
                        }
                        aVar3.H();
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 14) | 3072, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tfq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    ufq.a(qcnVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
