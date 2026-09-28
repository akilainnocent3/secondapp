package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nd70 {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-1988718758);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarJ = h.j(h.h(androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var)).i0, zk40.a), 24.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 24.0f, 5);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            lkf0.d(cb40.a(R.string.page_instant_virtual__no_stats, new Object[0], bVarI), h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13), ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVarI, 48, 0, 130040);
            bVarI = bVarI;
            mw90.a("https://s.sporty.net/cms/image_no_stats_28f8ce1bd8.png", null, h.j(j.w(aVar2, 60.0f), 0.0f, 16.0f, 0.0f, 24.0f, 5), null, null, null, null, bVarI, 438, 2040);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new md70();
        }
    }
}
