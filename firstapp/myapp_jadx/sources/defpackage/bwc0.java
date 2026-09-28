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
public final class bwc0 {
    public static final void a(Function0<Unit> function0, a aVar, final int i) {
        int i2;
        final Function0<Unit> function1 = function0;
        function1.getClass();
        b bVarI = aVar.i(1339862359);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.A(function1) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).i0;
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
            d dVarI = j.i(j.g(androidx.compose.foundation.a.b(aVar2, ((lib0) bVarI.O(qyd0Var)).b1, aVar3), 1.0f), 228.0f);
            i78 i78VarA2 = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarI);
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
            lkf0.d(cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            function1 = function0;
            vuc0.a(h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), false, null, null, function1, null, g9z.d, null, null, mt9.a, bVarI, ((i3 << 12) & 57344) | 805306374, 430);
            bVarI.X(true);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 48.0f), ((lib0) bVarI.O(qyd0Var)).q0, aVar3), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: awc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bwc0.a(function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
