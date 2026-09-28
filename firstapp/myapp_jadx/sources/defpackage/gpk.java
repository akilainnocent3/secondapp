package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class gpk {
    public static final void a(final List list, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function2 function5, a aVar, final int i) {
        int i2;
        final Function1 function6;
        Function1 function7;
        Function1 function8;
        Function2 function9;
        b bVar;
        Object obj;
        list.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(-135318773);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(list) : bVarI.A(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            function6 = function2;
            i2 |= bVarI.A(function6) ? 256 : 128;
        } else {
            function6 = function2;
        }
        if ((i & 3072) == 0) {
            function7 = function3;
            i2 |= bVarI.A(function7) ? 2048 : 1024;
        } else {
            function7 = function3;
        }
        if ((i & 24576) == 0) {
            function8 = function4;
            i2 |= bVarI.A(function8) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function8 = function4;
        }
        int i3 = 196608 & i;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 |= bVarI.M(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function9 = function5;
            i2 |= bVarI.A(function9) ? 1048576 : 524288;
        } else {
            function9 = function5;
        }
        if (bVarI.q(i2 & 1, (599171 & i2) != 599170)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                obj = objY;
                m6a0 m6a0Var = new m6a0();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m6a0Var.put(((zsk) it.next()).b, Boolean.TRUE);
                }
                bVarI.r(m6a0Var);
                obj = m6a0Var;
            }
            obj = objY;
            final m6a0 m6a0Var2 = (m6a0) obj;
            d dVarE = j.e(aVar2, 1.0f);
            umz umzVarA = h.a(2, 16.0f, 0.0f);
            boolean z = ((3670016 & i2) == 1048576) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(list))) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                final Function1 function10 = function7;
                final Function1 function11 = function8;
                final Function2 function12 = function9;
                Function1 function13 = new Function1() { // from class: xok
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        szr szrVar = (szr) obj2;
                        szrVar.getClass();
                        final Function2 function14 = function12;
                        if (function14 != null) {
                            szr.h(szrVar, "header", new op8(556196827, new gaj() { // from class: zok
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar3 = (a) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    ((gwr) obj3).getClass();
                                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        function14.invoke(aVar3, 0);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 2);
                        }
                        for (final zsk zskVar : list) {
                            mjk mjkVar = zskVar.b;
                            final m6a0 m6a0Var3 = m6a0Var2;
                            Boolean bool = (Boolean) m6a0Var3.get(mjkVar);
                            final boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                            szr.h(szrVar, zskVar.a, new op8(-340689543, new gaj() { // from class: apk
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar3 = (a) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    ((gwr) obj3).getClass();
                                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        final zsk zskVar2 = zskVar;
                                        boolean zM = aVar3.M(zskVar2);
                                        final boolean z2 = zBooleanValue;
                                        boolean zB = zM | aVar3.b(z2);
                                        Object objY3 = aVar3.y();
                                        if (zB || objY3 == a.C0041a.a) {
                                            final m6a0 m6a0Var4 = m6a0Var3;
                                            objY3 = new Function0() { // from class: cpk
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    m6a0Var4.put(zskVar2.b, Boolean.valueOf(!z2));
                                                    return Unit.a;
                                                }
                                            };
                                            aVar3.r(objY3);
                                        }
                                        ysk.a(zskVar2, z2, (Function0) objY3, null, aVar3, 0);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 2);
                            if (zBooleanValue) {
                                ArrayList arrayList = zskVar.g;
                                szrVar.d(arrayList.size(), new dpk(new bpk(), arrayList), new epk(arrayList), new op8(802480018, new fpk(arrayList, function6, function10, function11), true));
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function13);
                objY2 = function13;
            }
            b bVar2 = bVarI;
            aur.a(dVarE, null, umzVarA, false, null, null, null, false, null, (Function1) objY2, bVar2, 384, 506);
            bVar = bVar2;
        } else {
            b bVar3 = bVarI;
            bVar3.G();
            bVar = bVar3;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yok
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    gpk.a(list, function1, function2, function3, function4, function5, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
