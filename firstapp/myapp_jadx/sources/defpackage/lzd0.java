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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lzd0 {
    public static final void a(final hp1 hp1Var, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(572856283);
        int i2 = i | (bVarI.M(hp1Var) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.i(aVar2, 164.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new jzd0();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarJ, false, (Function1) objY);
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.n, bVarI, 54);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strA = cb40.a(R.string.page_instant_virtual__average_goals_scored, new Object[0], bVarI);
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            lkf0.d(strA, g3w.h(h.h(androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var)).r, zk40.a), 0.0f, 4.0f, 1), "sporty_legends_average_goals_scored_title_text"), ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 130040);
            bVar = bVarI;
            gp1.a(h.g(j.e(aVar2, 1.0f), 41.0f, 10.0f), hp1Var, bVar, (i2 << 3) & 112);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: kzd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lzd0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
