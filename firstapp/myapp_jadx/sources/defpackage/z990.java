package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class z990 {
    public static final void a(final qcn qcnVar, final Function0 function0, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(631737855);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(qcnVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(op8Var) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), zk40.a);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ = h.j(op70.c(aVar2, op70.a(bVarI), 14), 0.0f, 0.0f, 0.0f, 110.0f, 7);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            int i3 = i2;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            op8Var.invoke(bVarI, Integer.valueOf((i3 >> 6) & 14));
            rae.a(h.j(aVar2, 24.0f, 8.0f, 24.0f, 0.0f, 8), qcnVar, bVarI, ((i3 << 3) & 112) | 6, 0);
            bVarI.X(true);
            b(i3 & 112, bVarI, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), function0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y990
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    z990.a(qcnVar, function0, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, a aVar, d dVar, Function0 function0) {
        int i2;
        final d dVar2;
        final Function0 function1;
        b bVar;
        b bVarI = aVar.i(1645362859);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d dVarB = androidx.compose.foundation.a.b(lx80.d(dVar, 8.0f, null, false, 0L, 0L, 30), c68.a(R.color.background_general_primary, bVarI), zk40.a);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            bVar = bVarI;
            dVar2 = dVar;
            function1 = function0;
            xya.b(h.g(j.g(d.a.b, 1.0f), 24.0f, 20.0f), false, null, null, null, 0.0f, null, function1, dp9.b, bVar, (29360128 & (i3 << 18)) | 100663302, WebSocketProtocol.PAYLOAD_SHORT);
            bVar.X(true);
        } else {
            dVar2 = dVar;
            function1 = function0;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u990
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z990.b(qj40.a(i | 1), (a) obj, dVar2, function1);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final qcn<ybs> qcnVar, final qcn<? extends UiText> qcnVar2, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        qcnVar.getClass();
        qcnVar2.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1922144893);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(qcnVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            a(qcnVar2, function0, pp8.b(-445396498, new Function2() { // from class: w990
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Iterator<E> it = qcnVar.iterator();
                        while (it.hasNext()) {
                            uu90.a(h.f(d.a.b, 16.0f), (ybs) it.next(), aVar2, 6);
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i3 & 112) | (i3 & 14) | 384);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: x990
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    z990.c(qcnVar, qcnVar2, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final Map<Integer, ? extends List<ybs>> map, qcn<? extends UiText> qcnVar, Function0<Unit> function0, a aVar, int i) {
        int i2;
        map.getClass();
        qcnVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(579707650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(map) : bVarI.A(map) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(qcnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            a(qcnVar, function0, pp8.b(2056456045, new Function2() { // from class: v990
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        for (Map.Entry entry : map.entrySet()) {
                            ymw.a(h.f(d.a.b, 16.0f), cb40.a(((Number) entry.getKey()).intValue(), new Object[0], aVar2), (List) entry.getValue(), aVar2, 390);
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i3 & 112) | (i3 & 14) | 384);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new mpr(map, qcnVar, function0, i);
        }
    }
}
