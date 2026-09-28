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
public final /* synthetic */ class w1a implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j78) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            kw0.i iVar = new kw0.i(fjb0.d(aVar).f, true, new hw0());
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(h.h(j.g(aVar2, 1.0f), fjb0.d(aVar).h, 0.0f, 2), 0.0f, 0.0f, 0.0f, fjb0.d(aVar).h, 7);
            n54.a aVar3 = ht.a.n;
            i78 i78VarA = g78.a(iVar, aVar3, aVar, 48);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarJ);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar4);
            } else {
                aVar.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(aVar, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(aVar, ne00VarO, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(aVar, dVarC, cVar);
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_sportytv_redirect_title, new Object[0], aVar), j.g(aVar2, 1.0f), fjb0.b(aVar).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(aVar).d, aVar, 48, 0, 130040);
            kw0.i iVar2 = new kw0.i(fjb0.d(aVar).g, true, new hw0());
            d dVarJ2 = h.j(j.g(aVar2, 1.0f), 0.0f, fjb0.d(aVar).g, 0.0f, 0.0f, 13);
            i78 i78VarA2 = g78.a(iVar2, aVar3, aVar, 48);
            int iHashCode2 = Long.hashCode(aVar.m());
            ne00 ne00VarO2 = aVar.o();
            d dVarC2 = c.c(aVar, dVarJ2);
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar4);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, i78VarA2, bVar);
            hlh0.a(aVar, ne00VarO2, dVar);
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
            }
            hlh0.a(aVar, dVarC2, cVar);
            q330.a(j.r(aVar2, 40.0f), fjb0.b(aVar).R, 4.0f, 0L, 0, 0.0f, aVar, 390, 56);
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_sportytv_redirect_body, new Object[0], aVar), null, fjb0.b(aVar).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(aVar).j, aVar, 0, 0, 130042);
            q3k0.a(0, aVar);
            aVar.s();
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_sportytv_redirect_footer, new Object[0], aVar), null, fjb0.b(aVar).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(aVar).j, aVar, 0, 0, 130042);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
