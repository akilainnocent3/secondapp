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

/* JADX INFO: loaded from: classes7.dex */
public final class z51 {
    public static final void a(final int i, final i91 i91Var, a aVar, final d dVar, final Function1 function1) {
        int i2;
        i91Var.getClass();
        b bVarI = aVar.i(128372094);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(i91Var) : bVarI.A(i91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarH = g3w.h(h.f(androidx.compose.foundation.a.b(j.g(dVar, 1.0f), c68.a(R.color.bg_surface_secondary, bVarI), j060.c(2.0f)), 12.0f), "auto_bet_completed_card_" + i91Var.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            d dVarH2 = g3w.h(j.g(aVar3, 1.0f), "auto_bet_completed_header");
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(vch0.a(i91Var.e, bVarI), g3w.h(aVar3, "auto_bet_completed_order_type"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 48, 0, 131064);
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            lkf0.d(vch0.a(i91Var.d, bVarI), g3w.h(h.g(androidx.compose.foundation.a.b(aVar3, c68.a(R.color.bg_disabled, bVarI), j060.c(2.0f)), 8.0f, 2.0f), "auto_bet_completed_status_badge"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131064);
            d040.a(1.0f, true, bVarI);
            r5y.a(1, 48, bVarI, null);
            bVarI.X(true);
            ute.b(h.h(aVar3, 0.0f, 10.0f, 1), 1.0f, c68.a(R.color.bg_secondary_d_lighter, bVarI), bVarI, 54, 0);
            bVarI = bVarI;
            okf0.a(g3w.h(aVar3, "auto_bet_completed_match_row"), cb40.a(R.string.component_betslip__match, new Object[0], bVarI), i91Var.g, 0, 0, null, bVarI, 6, 56);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_completed_market_row"), cb40.a(R.string.common_functions__market, new Object[0], bVarI), i91Var.h, 0, 0, null, bVarI, 6, 56);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_completed_outcome_row"), cb40.a(R.string.component_betslip__outcome, new Object[0], bVarI), null, 0, 0, pp8.b(1158740039, new Function2() { // from class: w51
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    i91 i91Var2;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d160 d160VarA2 = b160.a(kw0.a, ht.a.k, aVar4, 48);
                        int iHashCode3 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d.a aVar5 = d.a.b;
                        d dVarC3 = c.c(aVar4, aVar5);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, d160VarA2, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC3, yka.a.d);
                        i91 i91Var3 = i91Var;
                        String str = i91Var3.j;
                        if (str == null || str.length() <= 0) {
                            i91Var2 = i91Var3;
                            aVar4.N(-1050211340);
                            h6n.b(erz.a(R.drawable.ic_sport_default, 0, aVar4), null, j.r(aVar5, 16.0f), c68.a(R.color.icon_primary, aVar4), aVar4, 432, 0);
                            aVar4.H();
                        } else {
                            aVar4.N(-1050723708);
                            i91Var2 = i91Var3;
                            mw90.b(i91Var3.j, null, j.r(aVar5, 16.0f), null, erz.a(R.drawable.ic_sport_default, 0, aVar4), null, null, null, d0b.a.b, 0.0f, new gf4(c68.a(R.color.icon_primary, aVar4), 5), aVar4, 432, 6, 27624);
                            aVar4 = aVar4;
                            aVar4.H();
                        }
                        ty0.a(aVar4, j.w(aVar5, 2.0f));
                        a aVar7 = aVar4;
                        lkf0.d(i91Var2.i, null, c68.a(R.color.text_primary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar4), aVar7, 0, 0, 131066);
                        aVar7.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196614, 28);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_completed_stake_row"), cb40.a(R.string.common_functions__stake, new Object[0], bVarI), i91Var.k, 0, R.style.B1_B, null, bVarI, 6, 40);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_completed_current_odds_row"), cb40.a(R.string.component_betslip__current_odds, new Object[0], bVarI), i91Var.l, 0, R.style.B1_B, null, bVarI, 6, 40);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_completed_target_odds_row"), cb40.a(R.string.component_betslip__target_odds, new Object[0], bVarI), i91Var.m, 0, R.style.B1_B, null, bVarI, 6, 40);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_completed_ticket_details_row"), cb40.a(R.string.component_betslip__sim_ticket_details, new Object[0], bVarI), null, 0, R.style.B1_B, pp8.b(1726711115, new x51(0, i91Var, function1), bVarI), bVarI, 196614, 12);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y51
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z51.a(qj40.a(i | 1), i91Var, (a) obj, dVar, function1);
                    return Unit.a;
                }
            };
        }
    }
}
