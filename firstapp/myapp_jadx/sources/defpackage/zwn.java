package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zwn {
    public static final void a(final int i, final qcn qcnVar, a aVar, final String str, final Function1 function1) {
        int i2;
        b bVar;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        function1.getClass();
        b bVarI = aVar.i(1000470080);
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
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            if (qcnVar.isEmpty()) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: swn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            zwn.a(qj40.a(i | 1), qcnVar, (a) obj, str, function1);
                            return Unit.a;
                        }
                    };
                }
            } else {
                Iterator<E> it = qcnVar.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (((axn) it.next()).a.equals(str)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                final int i4 = i3 < 0 ? 0 : i3;
                d.a aVar2 = d.a.b;
                d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 48.0f), c68.a(R.color.bg_inverse_secondary, bVarI), zk40.a);
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new twn(0);
                    bVarI.r(objY);
                }
                d dVarB2 = xa80.b(dVarB, false, (Function1) objY);
                aiv aivVarC = g75.c(ht.a.e, false);
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
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                d dVarC2 = j.c(aVar2, 1.0f);
                long j = j58.l;
                mfc.a(i4, dVarC2, j, j, 0.0f, 56.0f, true, pp8.b(-1300810584, new gaj() { // from class: uwn
                    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
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
                            aVar4.N(1042219514);
                            aVar4.H();
                        } else {
                            int size = list.size();
                            int i5 = i4;
                            if (i5 < size) {
                                aVar4.N(1041917760);
                                h2f0.a.b(h2f0.c((y1f0) list.get(i5)), 4.0f, c68.a(R.color.bg_brand_sub_primary_d_lighter, aVar4), aVar4, 3120, 0);
                                aVar4.H();
                            } else {
                                aVar4.N(1042219514);
                                aVar4.H();
                            }
                        }
                        return Unit.a;
                    }
                }, bVarI), null, pp8.b(-1373346136, new Function2() { // from class: vwn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar4 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            for (final axn axnVar : qcnVar) {
                                final boolean zEquals = axnVar.a.equals(str);
                                boolean zB = aVar4.b(zEquals);
                                final Function1 function3 = function1;
                                boolean zM = zB | aVar4.M(function3) | aVar4.A(axnVar);
                                Object objY2 = aVar4.y();
                                if (zM || objY2 == a.C0041a.a) {
                                    objY2 = new Function0() { // from class: xwn
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            if (!zEquals) {
                                                function3.invoke(axnVar.a);
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY2);
                                }
                                w1f0.b(zEquals, (Function0) objY2, j.c(d.a.b, 1.0f), false, pp8.b(-1994298980, new Function2() { // from class: ywn
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar5 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lkf0.d(axnVar.b, g3w.h(d.a.b, "market_tab"), c68.a(R.color.text_inverse_primary, aVar5), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(zEquals ? R.style.B1_B : R.style.B1_M, aVar5), aVar5, 48, 0, 130040);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar4), 0L, 0L, aVar4, 24960, 488);
                            }
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 819686832, 256);
                bVar = bVarI;
                bVar.X(true);
            }
            eVarZ.d = function2;
        }
        bVar = bVarI;
        bVar.G();
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            function2 = new Function2() { // from class: wwn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zwn.a(qj40.a(i | 1), qcnVar, (a) obj, str, function1);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }
}
