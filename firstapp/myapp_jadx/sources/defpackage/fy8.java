package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fy8 implements gaj {
    public final /* synthetic */ int a;

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                tmz tmzVar = (tmz) obj;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tmzVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar.M(tmzVar) ? 4 : 2;
                }
                if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d.a aVar2 = d.a.b;
                    d dVarE = j.e(h.e(aVar2, tmzVar), 1.0f);
                    qyd0 qyd0Var = ejb0.a;
                    d dVarH = h.h(dVarE, 0.0f, ((cjb0) aVar.O(qyd0Var)).g, 1);
                    i78 i78VarA = g78.a(kw0.e, ht.a.n, aVar, 54);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarH);
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
                    h9n.a(erz.a(R.drawable.no_events_available, 0, aVar), null, j.r(aVar2, 180.0f), null, null, 0.0f, null, aVar, 432, 120);
                    ty0.a(aVar, j.i(aVar2, ((cjb0) aVar.O(qyd0Var)).e));
                    lkf0.d(cb40.a(R.string.dedicated_team_page__no_data_available_for_this_team, new Object[0], aVar), null, ((lib0) aVar.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).i, aVar, 0, 0, 130042);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                bxz bxzVar = (bxz) obj;
                yw90 yw90Var = (yw90) obj2;
                bxzVar.getClass();
                ((asr) obj3).getClass();
                bxzVar.a(Float.intBitsToFloat((int) (yw90Var.a >> 32)) * 0.8f, 0.0f);
                long j = yw90Var.a;
                int i = (int) (j >> 32);
                bxzVar.c(Float.intBitsToFloat(i), 0.0f);
                int i2 = (int) (j & 4294967295L);
                bxzVar.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                bxzVar.c(Float.intBitsToFloat(i) * 0.2f, Float.intBitsToFloat(i2));
                bxzVar.close();
                return Unit.a;
        }
    }
}
