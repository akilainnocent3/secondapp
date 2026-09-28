package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gr90 {
    public static final void a(hr90 hr90Var, sf3 sf3Var, a aVar, int i) {
        int i2;
        b bVarI = aVar.i(-1348829587);
        int i3 = i | (bVarI.M(hr90Var) ? 4 : 2) | (bVarI.A(sf3Var) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).q0;
            zk40.a aVar3 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarG, j, aVar3);
            qyd0 qyd0Var2 = ejb0.a;
            d dVarJ = h.j(dVarB, 0.0f, ((cjb0) bVarI.O(qyd0Var2)).d, 0.0f, 52.0f, 5);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            d dVarG2 = j.g(aVar2, 1.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new hji(1, sf3Var, hr90Var);
                bVarI.r(objY);
            }
            d dVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.d.d(dVarG2, false, null, null, (Function0) objY, 15), ((lib0) bVarI.O(qyd0Var)).i0, aVar3);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            i2 = 1;
            lkf0.d(cb40.a(R.string.bet_history__check_transaction_history, new Object[0], bVarI), h.f(new LayoutWeightElement(1.0f, true), ((cjb0) bVarI.O(qyd0Var2)).f), ((lib0) bVarI.O(qyd0Var)).c, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).k, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            h6n.b(erz.a(R.drawable.right_arrow_normal, 0, bVarI), null, j.r(h.j(aVar2, 0.0f, 0.0f, ((cjb0) bVarI.O(qyd0Var2)).f, 0.0f, 11), 28.0f), ((lib0) bVarI.O(qyd0Var)).x0, bVarI, 48, 0);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            i2 = 1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new k710(hr90Var, sf3Var, i, i2);
        }
    }
}
