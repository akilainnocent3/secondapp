package defpackage;

import androidx.compose.foundation.layout.h;
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
public final class b870 {
    public static final void a(final c870 c870Var, final boolean z, a aVar, final int i) {
        imf0 imf0Var;
        b bVarI = aVar.i(-628599208);
        int i2 = (bVarI.M(c870Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(aVar2, 12.0f, 0.0f, 2);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            mw90.a(c870Var.b, null, j.r(aVar2, 16.0f), null, null, null, null, bVarI, 432, 2040);
            String str = c870Var.c;
            long j = ((lib0) bVarI.O(oib0.a)).o;
            gdf0 gdf0Var = new gdf0(3);
            if (z) {
                bVarI.N(-1044560713);
                imf0Var = ((ijb0) bVarI.O(kjb0.a)).i;
            } else {
                bVarI.N(-1044560073);
                imf0Var = ((ijb0) bVarI.O(kjb0.a)).j;
            }
            bVarI.X(false);
            lkf0.d(str, null, j, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: a870
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    b870.a(c870Var, z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final qcn<c870> qcnVar, final String str, final Function1<? super String, Unit> function1, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        b bVar;
        final d dVar3;
        qcnVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1859854574);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        }
        int i5 = i3 | (bVarI.M(qcnVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            dVar3 = i4 != 0 ? d.a.b : dVar2;
            Iterator<c870> it = qcnVar.iterator();
            int i6 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i6 = -1;
                    break;
                } else if (Intrinsics.g(it.next().a, str)) {
                    break;
                } else {
                    i6++;
                }
            }
            final int i7 = i6 < 0 ? 0 : i6;
            d dVarB = androidx.compose.foundation.a.b(j.i(dVar3, 48.0f), ((lib0) bVarI.O(oib0.a)).d1, zk40.a);
            long j = j58.l;
            bVar = bVarI;
            mfc.a(i7, dVarB, j, j, 0.0f, 56.0f, true, pp8.b(1409977712, new gaj() { // from class: u770
                /* JADX WARN: Code duplicated, block: B:23:0x006c  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list = (List) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    list.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                    }
                    if (!aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        aVar2.G();
                    } else if (list.isEmpty()) {
                        aVar2.N(-133785518);
                        aVar2.H();
                    } else {
                        int size = list.size();
                        int i8 = i7;
                        if (i8 < size) {
                            aVar2.N(-134028651);
                            h2f0.a.b(h2f0.c((y1f0) list.get(i8)), 4.0f, ((lib0) aVar2.O(oib0.a)).D, aVar2, 3120, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(-133785518);
                            aVar2.H();
                        }
                    }
                    return Unit.a;
                }
            }, bVarI), rn9.a, pp8.b(1571822448, new Function2() { // from class: v770
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        for (final c870 c870Var : qcnVar) {
                            final String str2 = c870Var.a;
                            final boolean zG = Intrinsics.g(str2, str);
                            final Function1 function2 = function1;
                            boolean zM = aVar2.M(function2) | aVar2.M(str2);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zM || objY == c0042a) {
                                objY = new Function0() { // from class: x770
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(str2);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            Function0 function0 = (Function0) objY;
                            d dVarC = j.c(d.a.b, 1.0f);
                            Object objY2 = aVar2.y();
                            if (objY2 == c0042a) {
                                objY2 = new y770();
                                aVar2.r(objY2);
                            }
                            w1f0.a(zG, function0, g3w.h(xa80.b(dVarC, false, (Function1) objY2), "league_tab"), false, 0L, 0L, pp8.b(-388851697, new gaj() { // from class: z770
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar3 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((j78) obj3).getClass();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        b870.a(c870Var, zG, aVar3, 0);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 12582912, 120);
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 920350080, 0);
        } else {
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w770
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b870.b(dVar3, qcnVar, str, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
