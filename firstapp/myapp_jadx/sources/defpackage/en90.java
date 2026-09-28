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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class en90 {
    public static final void a(final fn90 fn90Var, final vf3 vf3Var, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-1904230280);
        int i2 = (bVarI.M(fn90Var) ? 4 : 2) | i | (bVarI.A(vf3Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new cn90();
                bVarI.r(objY);
            }
            d dVarF = g3w.f(dVarE, true, (Function0) objY);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            at90.a(fn90Var.a, vf3Var, bVarI, i2 & 112);
            d dVarC2 = op70.c(h.h(androidx.compose.foundation.a.b(new LayoutWeightElement(1.0f, true), fjb0.b(bVarI).i0, zk40.a), fjb0.d(bVarI).f, 0.0f, 2), op70.a(bVarI), 14);
            i78 i78VarA2 = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarC2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            lkf0.d(cb40.a(R.string.component_betslip__sim_how_to_play_title, new Object[0], bVarI), h.j(j.g(aVar2, 1.0f), 0.0f, fjb0.d(bVarI).f, 0.0f, 0.0f, 13), fjb0.b(bVarI).c, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).g, bVarI, 0, 0, 131064);
            lkf0.d(cb40.a(R.string.component_betslip__sim_how_to_play_description, new Object[0], bVarI), h.j(j.g(aVar2, 1.0f), 0.0f, fjb0.d(bVarI).f, 0.0f, 0.0f, 13), fjb0.b(bVarI).c, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 0, 0, 131064);
            ty0.a(bVarI, j.i(aVar2, 44.0f));
            lkf0.d(cb40.a(R.string.component_betslip__sim_how_to_play_market_available_are, new Object[0], bVarI), j.g(aVar2, 1.0f), fjb0.b(bVarI).c, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 48, 0, 131064);
            ty0.a(bVarI, j.i(aVar2, 40.0f));
            lkf0.d(cb40.a(R.string.component_betslip__sim_how_to_play_available_market_list, new Object[0], bVarI), h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 28.0f, 7), fjb0.b(bVarI).c, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(vf3Var, i) { // from class: dn90
                public final /* synthetic */ vf3 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    en90.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
