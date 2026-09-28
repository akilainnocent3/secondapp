package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d370 {
    public static final void a(Function0<Unit> function0, a aVar, final int i) {
        int i2;
        final Function0<Unit> function1 = function0;
        function1.getClass();
        b bVarI = aVar.i(160553148);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).d1;
            zk40.a aVar3 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarE, j, aVar3);
            n54.a aVar4 = ht.a.m;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ = h.j(j.i(h.j(j.g(aVar2, 1.0f), 0.0f, 48.0f, 0.0f, 0.0f, 13), 40.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            qyd0 qyd0Var2 = ajb0.a;
            int i3 = i2;
            g75.a(androidx.compose.foundation.a.b(ls7.a(dVarJ, j060.e(((zib0) bVarI.O(qyd0Var2)).d, ((zib0) bVarI.O(qyd0Var2)).d, 0.0f, 0.0f, 12)), ((lib0) bVarI.O(qyd0Var)).n0, aVar3), bVarI, 0);
            d dVarB2 = androidx.compose.foundation.a.b(zqu.a(1.0f, j.g(aVar2, 1.0f), true), ((lib0) bVarI.O(qyd0Var)).i0, aVar3);
            i78 i78VarA2 = g78.a(kVar, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], bVarI), h.j(aVar2, 0.0f, 72.0f, 0.0f, 0.0f, 13), ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 48, 0, 131064);
            function1 = function0;
            vuc0.a(h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), false, null, null, function1, null, g9z.d, null, null, jn9.a, bVarI, (57344 & (i3 << 12)) | 805306374, 430);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c370
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    d370.a(function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
