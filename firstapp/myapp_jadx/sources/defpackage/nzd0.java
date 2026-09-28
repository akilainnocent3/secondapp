package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nzd0 {
    public static final void a(s7j0 s7j0Var, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(-1058623361);
        int i2 = i | (bVarI.M(s7j0Var) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(aVar2, 164.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new mzd0();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarI, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            String strA = cb40.a(R.string.page_instant_virtual__win_probability, new Object[0], bVarI);
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            lkf0.d(strA, g3w.h(h.h(androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var)).r, zk40.a), 0.0f, 4.0f, 1), "sporty_legends_win_probability_title_text"), ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 130040);
            bVar = bVarI;
            r7j0.d(h.g(j.e(aVar2, 1.0f), 41.0f, 10.0f), s7j0Var, bVar, (i2 << 3) & 112);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new hhe(s7j0Var, i);
        }
    }
}
