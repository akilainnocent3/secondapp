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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class myn {
    public static final void a(final d dVar, final String str, final List list, final Function2 function2, final Function2 function3, final gaj gajVar, final Function2 function4, a aVar, final int i) {
        int i2;
        Function2 function5;
        Function2 function6;
        gaj gajVar2;
        Function2 function7;
        b bVar;
        function2.getClass();
        function3.getClass();
        gajVar.getClass();
        function4.getClass();
        b bVarI = aVar.i(2091707213);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(list) : bVarI.A(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function5 = function2;
            i2 |= bVarI.A(function5) ? 2048 : 1024;
        } else {
            function5 = function2;
        }
        if ((i & 24576) == 0) {
            function6 = function3;
            i2 |= bVarI.A(function6) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function6 = function3;
        }
        if ((196608 & i) == 0) {
            gajVar2 = gajVar;
            i2 |= bVarI.A(gajVar2) ? 131072 : 65536;
        } else {
            gajVar2 = gajVar;
        }
        if ((1572864 & i) == 0) {
            function7 = function4;
            i2 |= bVarI.A(function7) ? 1048576 : 524288;
        } else {
            function7 = function4;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (Intrinsics.g(((yyn) it.next()).a(), str)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 < 0) {
                i3 = 0;
            }
            boolean z = (i2 & 896) == 256 || ((i2 & 512) != 0 && bVarI.A(list));
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new t10(list, 1);
                bVarI.r(objY);
            }
            ved vedVarB = eqz.b(i3, (Function0) objY, bVarI, 0, 2);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zM = bVarI.M(vedVarB) | bVarI.d(i3);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new lyn(i3, null, vedVarB);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY2);
            final Function2 function8 = function5;
            final Function2 function9 = function6;
            final gaj gajVar3 = gajVar2;
            final Function2 function10 = function7;
            bVar = bVarI;
            dpz.a(0.0f, 0, 100663296, 16124, null, pp8.b(-189097876, new iaj() { // from class: jyn
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    a aVar2 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((opz) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= aVar2.d(iIntValue) ? 32 : 16;
                    }
                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        yyn yynVar = (yyn) list.get(iIntValue);
                        if (yynVar instanceof hzn) {
                            aVar2.N(-1334428766);
                            gzn.a((hzn) yynVar, function8, aVar2, 0);
                            aVar2.H();
                        } else if (yynVar instanceof syn) {
                            aVar2.N(-1334422218);
                            ryn.a((syn) yynVar, function9, aVar2, 0);
                            aVar2.H();
                        } else if (yynVar instanceof lxn) {
                            aVar2.N(-1334415494);
                            kxn.a((lxn) yynVar, gajVar3, aVar2, 0);
                            aVar2.H();
                        } else {
                            if (!(yynVar instanceof vxn)) {
                                throw rg.a(-1334430885, aVar2);
                            }
                            aVar2.N(-1334407552);
                            uxn.a((vxn) yynVar, function10, aVar2, 0);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, null, vedVarB, null, null, bVar, j.e(dVar, 1.0f), null, false);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kyn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    myn.a(dVar, str, list, function2, function3, gajVar, function4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
