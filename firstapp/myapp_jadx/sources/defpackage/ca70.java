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
public final class ca70 {
    public static final void a(Function0<Unit> function0, a aVar, final int i) {
        int i2;
        final Function0<Unit> function1 = function0;
        function1.getClass();
        b bVarI = aVar.i(1723590236);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.A(function1) ? 4 : 2);
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
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            d dVarJ = h.j(j.i(j.g(aVar2, 1.0f), 40.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            qyd0 qyd0Var2 = ajb0.a;
            int i3 = i2;
            g75.a(androidx.compose.foundation.a.b(ls7.a(dVarJ, j060.e(((zib0) bVarI.O(qyd0Var2)).d, ((zib0) bVarI.O(qyd0Var2)).d, 0.0f, 0.0f, 12)), ((lib0) bVarI.O(qyd0Var)).n0, aVar3), bVarI, 0);
            d dVarH = h.h(androidx.compose.foundation.a.b(zqu.a(1.0f, j.g(aVar2, 1.0f), true), ((lib0) bVarI.O(qyd0Var)).n0, aVar3), 0.0f, 32.0f, 1);
            i78 i78VarA2 = g78.a(new kw0.i(13.0f, true, new hw0()), ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            mw90.a("https://s.sporty.net/cms/resync_b0f0bb2462.png", null, j.t(aVar2, 158.0f, 156.0f), null, null, null, null, bVarI, 438, 2040);
            bVarI = bVarI;
            lkf0.d(cb40.a(R.string.page_instant_virtual__no_matchdays, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).j, bVarI, 0, 0, 130042);
            function1 = function0;
            nk5.a(function1, j.b(aVar2, 0.0f, 36.0f, 1), false, j060.c(((zib0) bVarI.O(qyd0Var2)).b), sya.a(0L, 0L, 0L, 0L, bVarI, 24576, 15), null, null, new umz(12.0f, 8.0f, 12.0f, 8.0f), null, vn9.a, bVarI, (i3 & 14) | 817889328, 356);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ba70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    ca70.a(function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
