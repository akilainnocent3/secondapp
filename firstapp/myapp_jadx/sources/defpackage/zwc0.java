package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class zwc0 {
    public static final void a(final d dVar, final String str, final qcn qcnVar, final Function1 function1, final Function2 function2, final Function1 function3, final Function2 function4, final Function2 function5, a aVar, final int i) {
        int i2;
        Function1 function6;
        Function2 function7;
        Function1 function8;
        Function2 function9;
        Function2 function10;
        b bVar;
        int i3;
        ved vedVar;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        b bVarI = aVar.i(-1337710241);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function6 = function1;
            i2 |= bVarI.A(function6) ? 2048 : 1024;
        } else {
            function6 = function1;
        }
        if ((i & 24576) == 0) {
            function7 = function2;
            i2 |= bVarI.A(function7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function7 = function2;
        }
        if ((196608 & i) == 0) {
            function8 = function3;
            i2 |= bVarI.A(function8) ? 131072 : 65536;
        } else {
            function8 = function3;
        }
        if ((1572864 & i) == 0) {
            function9 = function4;
            i2 |= bVarI.A(function9) ? 1048576 : 524288;
        } else {
            function9 = function4;
        }
        if ((12582912 & i) == 0) {
            function10 = function5;
            i2 |= bVarI.A(function10) ? 8388608 : 4194304;
        } else {
            function10 = function5;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                Iterator<E> it = qcnVar.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (((axc0) it.next()).a.equals(str)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                objY = Integer.valueOf(i4);
                bVarI.r(objY);
            }
            int iIntValue = ((Number) objY).intValue();
            int i5 = i2 & 896;
            boolean z2 = i5 == 256 || ((i2 & 512) != 0 && bVarI.A(qcnVar));
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                i3 = 2;
                objY2 = new agw(qcnVar, 2);
                bVarI.r(objY2);
            } else {
                i3 = 2;
            }
            ved vedVarB = eqz.b(iIntValue, (Function0) objY2, bVarI, 0, i3);
            Integer numValueOf = Integer.valueOf(vedVarB.q());
            boolean zD = bVarI.d(iIntValue) | bVarI.M(vedVarB) | (i5 == 256 || ((i2 & 512) != 0 && bVarI.A(qcnVar))) | ((i2 & 7168) == 2048);
            Object objY3 = bVarI.y();
            if (zD || objY3 == c0042a) {
                objY3 = new twc0(iIntValue, vedVarB, qcnVar, function6, null);
                vedVar = vedVarB;
                bVarI.r(objY3);
            } else {
                vedVar = vedVarB;
            }
            xvf.e(bVarI, numValueOf, (Function2) objY3);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            boolean zD2 = bVarI.d(iIntValue) | bVarI.M(vedVar);
            Object objY4 = bVarI.y();
            if (zD2 || objY4 == c0042a) {
                objY4 = new uwc0(iIntValue, null, vedVar);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, numValueOf2, (Function2) objY4);
            final Function2 function11 = function7;
            final Function1 function12 = function8;
            final Function2 function13 = function9;
            final Function2 function14 = function10;
            bVar = bVarI;
            dpz.a(0.0f, 0, 0, 16380, null, pp8.b(-1242500034, new iaj() { // from class: qwc0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue2 = ((Integer) obj2).intValue();
                    a aVar2 = (a) obj3;
                    int iIntValue3 = ((Integer) obj4).intValue();
                    ((opz) obj).getClass();
                    if ((iIntValue3 & 48) == 0) {
                        iIntValue3 |= aVar2.d(iIntValue2) ? 32 : 16;
                    }
                    if (aVar2.q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                        final axc0 axc0Var = (axc0) qcnVar.get(iIntValue2);
                        final String str2 = axc0Var.a;
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), ((lib0) aVar2.O(oib0.a)).i0, zk40.a);
                        boolean zA = aVar2.A(axc0Var);
                        final Function2 function15 = function11;
                        boolean zM = zA | aVar2.M(function15) | aVar2.M(str2);
                        final Function1 function16 = function12;
                        boolean zM2 = zM | aVar2.M(function16);
                        final Function2 function17 = function13;
                        boolean zM3 = zM2 | aVar2.M(function17);
                        final Function2 function18 = function14;
                        boolean zM4 = aVar2.M(function18) | zM3;
                        Object objY5 = aVar2.y();
                        if (zM4 || objY5 == a.C0041a.a) {
                            objY5 = new Function1() { // from class: swc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    szr szrVar = (szr) obj5;
                                    szrVar.getClass();
                                    qcn<vyc0> qcnVar2 = axc0Var.b;
                                    szrVar.d(qcnVar2.size(), null, new xwc0(qcnVar2), new op8(802480018, new ywc0(qcnVar2, function15, str2, function16, function17, function18), true));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY5);
                        }
                        aur.a(dVarB, null, null, false, null, null, null, false, null, (Function1) objY5, aVar2, 0, 510);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, null, vedVar, null, null, bVar, j.e(dVar, 1.0f), null, false);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rwc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zwc0.a(dVar, str, qcnVar, function1, function2, function3, function4, function5, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
