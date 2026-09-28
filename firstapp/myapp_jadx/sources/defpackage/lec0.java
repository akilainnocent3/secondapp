package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lec0 {
    public static final void a(final int i, final qcn qcnVar, a aVar, final String str, final Function1 function1) {
        int i2;
        qcnVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-501299222);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (!bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVarI.G();
        } else {
            if (qcnVar.isEmpty()) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: eec0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lec0.a(qj40.a(i | 1), qcnVar, (a) obj, str, function1);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            Iterator<E> it = qcnVar.iterator();
            final int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((mec0) it.next()).a.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 < 0) {
                i3 = 0;
            }
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var)).i0, zk40.a);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new fec0();
                bVarI.r(objY);
            }
            d dVarB2 = xa80.b(dVarB, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            d dVarI = j.i(aVar2, 48.0f);
            long j = j58.l;
            mfc.a(i3, dVarI, j, j, 0.0f, 0.0f, false, pp8.b(162145602, new gaj() { // from class: gec0
                /* JADX WARN: Code duplicated, block: B:23:0x006c  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list = (List) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    list.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                    }
                    if (!aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        aVar4.G();
                    } else if (list.isEmpty()) {
                        aVar4.N(-1358128448);
                        aVar4.H();
                    } else {
                        int size = list.size();
                        int i4 = i3;
                        if (i4 < size) {
                            aVar4.N(-1358463837);
                            h2f0.a.b(h2f0.c((y1f0) list.get(i4)), 4.0f, ((lib0) aVar4.O(oib0.a)).x0, aVar4, 3120, 0);
                            aVar4.H();
                        } else {
                            aVar4.N(-1358128448);
                            aVar4.H();
                        }
                    }
                    return Unit.a;
                }
            }, bVarI), rs9.a, pp8.b(-825043134, new Function2() { // from class: hec0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        for (final mec0 mec0Var : qcnVar) {
                            final boolean zEquals = mec0Var.a.equals(str);
                            boolean zB = aVar4.b(zEquals);
                            final Function1 function2 = function1;
                            boolean zM = zB | aVar4.M(function2) | aVar4.A(mec0Var);
                            Object objY2 = aVar4.y();
                            if (zM || objY2 == a.C0041a.a) {
                                objY2 = new Function0() { // from class: jec0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        if (!zEquals) {
                                            function2.invoke(mec0Var.a);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY2);
                            }
                            w1f0.b(zEquals, (Function0) objY2, g3w.h(j.c(d.a.b, 1.0f), "market_category_" + mec0Var.a + "_tab"), false, pp8.b(200118760, new Function2() { // from class: kec0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    imf0 imf0Var;
                                    a aVar5 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        mec0 mec0Var2 = mec0Var;
                                        String str2 = mec0Var2.b;
                                        d dVarH = g3w.h(d.a.b, "market_category_" + mec0Var2.a + "_text");
                                        long j2 = ((lib0) aVar5.O(oib0.a)).a;
                                        gdf0 gdf0Var = new gdf0(3);
                                        if (zEquals) {
                                            aVar5.N(-959385717);
                                            imf0Var = ((ijb0) aVar5.O(kjb0.a)).i;
                                        } else {
                                            aVar5.N(-959385077);
                                            imf0Var = ((ijb0) aVar5.O(kjb0.a)).j;
                                        }
                                        aVar5.H();
                                        lkf0.d(str2, dVarH, j2, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, imf0Var, aVar5, 0, 0, 130040);
                                    } else {
                                        aVar5.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar4), 0L, 0L, aVar4, 24576, 488);
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 918777264, 64);
            bVarI = bVarI;
            ute.b(j.g(aVar2, 1.0f), ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 6, 0);
            bVarI.X(true);
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: iec0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lec0.a(qj40.a(i | 1), qcnVar, (a) obj, str, function1);
                    return Unit.a;
                }
            };
        }
    }
}
