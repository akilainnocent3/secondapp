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
public final class b970 {
    public static final void a(final int i, final qcn qcnVar, a aVar, final String str, final Function1 function1) {
        qcnVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(2066480471);
        int i2 = (bVarI.M(qcnVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Iterator<E> it = qcnVar.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (Intrinsics.g(((d970) it.next()).a, str)) {
                    break;
                } else {
                    i3++;
                }
            }
            final int i4 = i3 < 0 ? 0 : i3;
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).n0;
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(aVar3, j, aVar2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            ute.b(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.h), ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 0, 0);
            d dVarI = j.i(aVar3, 48.0f);
            long j2 = j58.l;
            mfc.a(i4, dVarI, j2, j2, 0.0f, 0.0f, true, pp8.b(464540607, new gaj() { // from class: x870
                /* JADX WARN: Code duplicated, block: B:23:0x006c  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list = (List) obj;
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    list.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar5.M(list) : aVar5.A(list) ? 4 : 2;
                    }
                    if (!aVar5.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        aVar5.G();
                    } else if (list.isEmpty()) {
                        aVar5.N(745048771);
                        aVar5.H();
                    } else {
                        int size = list.size();
                        int i5 = i4;
                        if (i5 < size) {
                            aVar5.N(744710499);
                            h2f0.a.b(h2f0.c((y1f0) list.get(i5)), 4.0f, ((lib0) aVar5.O(oib0.a)).y0, aVar5, 3120, 0);
                            aVar5.H();
                        } else {
                            aVar5.N(745048771);
                            aVar5.H();
                        }
                    }
                    return Unit.a;
                }
            }, bVarI), tn9.a, pp8.b(2014021055, new Function2() { // from class: y870
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar5 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        for (final d970 d970Var : qcnVar) {
                            String str2 = d970Var.a;
                            final boolean zG = Intrinsics.g(str2, str);
                            Function1 function2 = function1;
                            boolean zM = aVar5.M(function2) | aVar5.M(str2);
                            Object objY = aVar5.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zM || objY == c0042a) {
                                objY = new jzp(2, function2, str2);
                                aVar5.r(objY);
                            }
                            Function0 function0 = (Function0) objY;
                            d dVarC2 = j.c(d.a.b, 1.0f);
                            Object objY2 = aVar5.y();
                            if (objY2 == c0042a) {
                                objY2 = new gdb(1);
                                aVar5.r(objY2);
                            }
                            w1f0.b(zG, function0, g3w.h(xa80.b(dVarC2, false, (Function1) objY2), "market_tab"), false, pp8.b(737312192, new Function2() { // from class: a970
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    imf0 imf0Var;
                                    a aVar6 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        String str3 = d970Var.b;
                                        long j3 = ((lib0) aVar6.O(oib0.a)).a;
                                        if (zG) {
                                            aVar6.N(-112579901);
                                            imf0Var = ((ijb0) aVar6.O(kjb0.a)).i;
                                        } else {
                                            aVar6.N(-112579261);
                                            imf0Var = ((ijb0) aVar6.O(kjb0.a)).j;
                                        }
                                        aVar6.H();
                                        lkf0.d(str3, null, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar6, 0, 0, 131066);
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar5), 0L, 0L, aVar5, 24576, 488);
                        }
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 920350128, 0);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z870
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b970.a(qj40.a(i | 1), qcnVar, (a) obj, str, function1);
                    return Unit.a;
                }
            };
        }
    }
}
