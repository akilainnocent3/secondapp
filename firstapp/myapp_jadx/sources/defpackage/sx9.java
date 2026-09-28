package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sx9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.e(aVar2, 1.0f), pi60.a(R.dimen._12sdp, 6, aVar), 80.0f, pi60.a(R.dimen._12sdp, 6, aVar), 0.0f, 8);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, aVar, 54);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar3);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, i78VarA, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            h9n.a(erz.a(R.drawable.dlg_no_data_chips, 0, aVar), "chips", j.t(aVar2, 100.0f, 72.0f), null, null, 0.0f, null, aVar, 432, 120);
            ty0.a(aVar, j.i(aVar2, 8.0f));
            lkf0.b(com.sportygames.newcms.c.d(v5g0.Z.q, "No bets have been placed yet", aVar), h.h(aVar2, pi60.a(R.dimen._13sdp, 6, aVar), 0.0f, 2), b6g0.f, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar.O(pi60.a)).b, R.dimen._13sdp, aVar), aVar, 384, 0, 65016);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
