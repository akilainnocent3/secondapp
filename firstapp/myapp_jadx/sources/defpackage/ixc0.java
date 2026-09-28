package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ixc0 {
    public static final void a(final int i, final qcn qcnVar, a aVar, final String str, final Function1 function1) {
        int i2;
        b bVar;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        qcnVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(598894925);
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
                    function2 = new Function2() { // from class: bxc0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ixc0.a(qj40.a(i | 1), qcnVar, (a) obj, str, function1);
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
                    } else if (((jxc0) it.next()).a.equals(str)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                final int i4 = i3 < 0 ? 0 : i3;
                bVar = bVarI;
                mfc.a(i4, j.i(d.a.b, 48.0f), ((lib0) bVarI.O(oib0.a)).i0, j58.l, 0.0f, 0.0f, false, pp8.b(782416943, new gaj() { // from class: cxc0
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
                            aVar2.N(196052147);
                            aVar2.H();
                        } else {
                            int size = list.size();
                            int i5 = i4;
                            if (i5 < size) {
                                aVar2.N(195743666);
                                h2f0.a.b(h2f0.c((y1f0) list.get(i5)), 4.0f, ((lib0) aVar2.O(oib0.a)).x0, aVar2, 3120, 0);
                                aVar2.H();
                            } else {
                                aVar2.N(196052147);
                                aVar2.H();
                            }
                        }
                        return Unit.a;
                    }
                }, bVarI), ot9.a, pp8.b(-656380369, new Function2() { // from class: dxc0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            for (final jxc0 jxc0Var : qcnVar) {
                                final boolean zEquals = jxc0Var.a.equals(str);
                                boolean zB = aVar2.b(zEquals);
                                final Function1 function3 = function1;
                                boolean zM = zB | aVar2.M(function3) | aVar2.A(jxc0Var);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zM || objY == c0042a) {
                                    objY = new Function0() { // from class: fxc0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            if (!zEquals) {
                                                function3.invoke(jxc0Var.a);
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                d dVarC = j.c(d.a.b, 1.0f);
                                Object objY2 = aVar2.y();
                                if (objY2 == c0042a) {
                                    objY2 = new gxc0(0);
                                    aVar2.r(objY2);
                                }
                                w1f0.b(zEquals, function0, g3w.h(xa80.b(dVarC, false, (Function1) objY2), "market_category_tab_".concat(jxc0Var.a)), false, pp8.b(-1258590312, new Function2() { // from class: hxc0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        imf0 imf0Var;
                                        a aVar3 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            String str2 = jxc0Var.b;
                                            long j = ((lib0) aVar3.O(oib0.a)).a;
                                            gdf0 gdf0Var = new gdf0(3);
                                            if (zEquals) {
                                                aVar3.N(1675496315);
                                                imf0Var = ((ijb0) aVar3.O(kjb0.a)).i;
                                            } else {
                                                aVar3.N(1675496955);
                                                imf0Var = ((ijb0) aVar3.O(kjb0.a)).j;
                                            }
                                            aVar3.H();
                                            lkf0.d(str2, null, j, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, imf0Var, aVar3, 0, 0, 130042);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), 0L, 0L, aVar2, 24576, 488);
                            }
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, 918776880, 64);
            }
            eVarZ.d = function2;
        }
        bVar = bVarI;
        bVar.G();
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            function2 = new Function2() { // from class: exc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ixc0.a(qj40.a(i | 1), qcnVar, (a) obj, str, function1);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }
}
