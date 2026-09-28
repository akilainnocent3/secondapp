package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ifi {
    public static final void a(final int i, final qcn qcnVar, a aVar, final String str, final Function1 function1) {
        int i2;
        b bVar;
        qcnVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-2089066186);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
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
                } else if (((jfi) it.next()).a.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            final int i4 = i3 < 0 ? 0 : i3;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(d.a.b, 1.0f), 48.0f), ((lib0) bVarI.O(oib0.a)).d1, zk40.a);
            long j = j58.l;
            bVar = bVarI;
            mfc.a(i4, dVarB, j, j, 0.0f, 56.0f, true, pp8.b(-104665452, new gaj() { // from class: dfi
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
                        aVar2.N(58138446);
                        aVar2.H();
                    } else {
                        int size = list.size();
                        int i5 = i4;
                        if (i5 < size) {
                            aVar2.N(57884742);
                            h2f0.a.b(h2f0.c((y1f0) list.get(i5)), 4.0f, ((lib0) aVar2.O(oib0.a)).y0, aVar2, 3120, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(58138446);
                            aVar2.H();
                        }
                    }
                    return Unit.a;
                }
            }, bVarI), n29.a, pp8.b(-530613100, new Function2() { // from class: efi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        for (final jfi jfiVar : qcnVar) {
                            final String str2 = jfiVar.a;
                            final boolean zEquals = str2.equals(str);
                            boolean zB = aVar2.b(zEquals);
                            final Function1 function2 = function1;
                            boolean zM = zB | aVar2.M(function2) | aVar2.M(str2);
                            Object objY = aVar2.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: gfi
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        if (!zEquals) {
                                            function2.invoke(str2);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            w1f0.b(zEquals, (Function0) objY, null, false, pp8.b(-75905723, new Function2() { // from class: hfi
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    imf0 imf0Var;
                                    a aVar3 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        String strG = jfiVar.b.g((Context) aVar3.O(AndroidCompositionLocals_androidKt.b));
                                        long j2 = ((lib0) aVar3.O(oib0.a)).o;
                                        gdf0 gdf0Var = new gdf0(3);
                                        if (zEquals) {
                                            aVar3.N(69053160);
                                            imf0Var = ((ijb0) aVar3.O(kjb0.a)).i;
                                        } else {
                                            aVar3.N(69053800);
                                            imf0Var = ((ijb0) aVar3.O(kjb0.a)).j;
                                        }
                                        aVar3.H();
                                        lkf0.d(strG, null, j2, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, imf0Var, aVar3, 0, 0, 130042);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), 0L, 0L, aVar2, 24576, 492);
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
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ffi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ifi.a(qj40.a(i | 1), qcnVar, (a) obj, str, function1);
                    return Unit.a;
                }
            };
        }
    }
}
