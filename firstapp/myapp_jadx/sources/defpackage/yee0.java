package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class yee0 {
    public static final void a(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final uxs uxsVar, final Function0 function0, final Function0 function1, a aVar, final int i) {
        int i2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        float f;
        int i3;
        qn4.b(str, str2, str3, str5, str6);
        uxsVar.getClass();
        b bVarI = aVar.i(825418625);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(str5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(str6) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.d(uxsVar.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.A(function1) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (bVarI.q(i4 & 1, (i4 & 38347923) != 38347922)) {
            boolean zC = gky.c((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            d.a aVar3 = d.a.b;
            d dVarH = g3w.h(j.g(aVar3, 1.0f), "auto_bet_success_content");
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarH2 = g3w.h(androidx.compose.foundation.a.b(j.i(j.g(aVar3, 1.0f), 64.0f), c68.a(R.color.bg_surface_primary, bVarI), zk40.a), "auto_bet_success_header");
            kw0.c cVar2 = kw0.e;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(cVar2, bVar2, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar5;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar5;
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h9n.a(erz.a(R.drawable.ic__feature__match_status_won, 0, bVarI), null, g3w.h(j.r(aVar3, 24.0f), "auto_bet_success_icon"), null, null, 0.0f, null, bVarI, 432, 120);
            ty0.a(bVarI, j.w(aVar3, 8.0f));
            lkf0.d(cb40.a(R.string.component_betslip__auto_bet_set, new Object[0], bVarI), g3w.h(aVar3, "auto_bet_success_title"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 131064);
            bVarI.X(true);
            tsr.a aVar6 = aVar2;
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
            d dVarH3 = g3w.h(h.h(j.g(aVar3, 1.0f), 24.0f, 0.0f, 2), "auto_bet_success_detail");
            i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarH3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            ty0.a(bVarI, j.i(aVar3, 24.0f));
            yka.a.C1350a c1350a3 = c1350a;
            okf0.a(g3w.h(aVar3, "auto_bet_success_match_row"), cb40.a(R.string.component_betslip__match, new Object[0], bVarI), str, 0, 0, null, bVarI, ((i4 << 6) & 896) | 6, 56);
            ty0.a(bVarI, j.i(aVar3, 8.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_success_market_row"), cb40.a(R.string.common_functions__market, new Object[0], bVarI), str2, 0, 0, null, bVarI, ((i4 << 3) & 896) | 6, 56);
            ty0.a(bVarI, j.i(aVar3, 8.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_completed_outcome_row"), cb40.a(R.string.component_betslip__outcome, new Object[0], bVarI), null, 0, 0, pp8.b(749088418, new Function2() { // from class: wee0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    d.a aVar7;
                    a aVar8 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar8.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d160 d160VarA2 = b160.a(kw0.a, ht.a.k, aVar8, 48);
                        int iHashCode4 = Long.hashCode(aVar8.m());
                        ne00 ne00VarO = aVar8.o();
                        d.a aVar9 = d.a.b;
                        d dVarC4 = c.c(aVar8, aVar9);
                        yka.k.getClass();
                        tsr.a aVar10 = yka.a.b;
                        if (aVar8.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar8.D();
                        if (aVar8.g()) {
                            aVar8.F(aVar10);
                        } else {
                            aVar8.p();
                        }
                        hlh0.a(aVar8, d160VarA2, yka.a.f);
                        hlh0.a(aVar8, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a4 = yka.a.g;
                        if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode4))) {
                            j3c.a(iHashCode4, aVar8, iHashCode4, c1350a4);
                        }
                        hlh0.a(aVar8, dVarC4, yka.a.d);
                        String str7 = str4;
                        if (str7 == null || str7.length() <= 0) {
                            aVar7 = aVar9;
                            aVar8.N(366569709);
                            h6n.b(erz.a(R.drawable.ic_sport_default, 0, aVar8), null, j.r(aVar7, 16.0f), c68.a(R.color.icon_primary, aVar8), aVar8, 432, 0);
                            aVar8.H();
                        } else {
                            aVar8.N(366025721);
                            aVar7 = aVar9;
                            mw90.b(str7, null, j.r(aVar9, 16.0f), null, erz.a(R.drawable.ic_sport_default, 0, aVar8), null, null, null, d0b.a.b, 0.0f, new gf4(c68.a(R.color.icon_primary, aVar8), 5), aVar8, 432, 6, 27624);
                            aVar8 = aVar8;
                            aVar8.H();
                        }
                        ty0.a(aVar8, j.w(aVar7, 2.0f));
                        a aVar11 = aVar8;
                        lkf0.d(str3, null, c68.a(R.color.text_primary, aVar8), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar8), aVar11, 0, 0, 131066);
                        aVar11.s();
                    } else {
                        aVar8.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196614, 28);
            ty0.a(bVarI, j.i(aVar3, 8.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_success_stake_row"), cb40.a(R.string.common_functions__stake, new Object[0], bVarI), str5, 0, R.style.B1_B, null, bVarI, ((i4 >> 6) & 896) | 6, 40);
            ty0.a(bVarI, j.i(aVar3, 8.0f));
            okf0.a(g3w.h(aVar3, "auto_bet_success_target_odds_row"), cb40.a(R.string.component_betslip__target_odds, new Object[0], bVarI), str6, 0, R.style.B1_B, null, bVarI, ((i4 >> 9) & 896) | 6, 40);
            ty0.a(bVarI, j.i(aVar3, 12.0f));
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
            bVarI = bVarI;
            ty0.a(bVarI, j.i(aVar3, 12.0f));
            if (zC) {
                bVarI.N(-1104219551);
                f = 1.0f;
                lkf0.d(cb40.a(R.string.component_betslip__auto_bet_american_odds_display_note, new Object[0], bVarI), g3w.h(aVar3, "auto_bet_american_odds_note"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
                i3 = 0;
                iib0.a(aVar3, 4.0f, bVarI, false);
            } else {
                f = 1.0f;
                i3 = 0;
                bVarI.N(-1103777491);
                bVarI.X(false);
            }
            lkf0.d(cb40.a(R.string.component_betslip__auto_bet_fail_note, new Object[i3], bVarI), g3w.h(aVar3, "auto_bet_success_note"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
            ty0.a(bVarI, j.i(aVar3, 20.0f));
            d160 d160VarA2 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar2, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            if (f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarH4 = g3w.h(new LayoutWeightElement(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, true), "negative_button");
            alb0 alb0Var = sya.a;
            p9z.a(dVarH4, null, uxsVar, null, null, alb0.a(alb0Var, new g7f(44.0f), null, 0L, 0.0f, 29), null, function0, rv9.a, bVarI, ((i4 >> 12) & 896) | 100663296 | (i4 & 29360128), 90);
            if (f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            aza.a(g3w.h(new LayoutWeightElement(f <= Float.MAX_VALUE ? f : Float.MAX_VALUE, true), "positive_button"), cb40.a(R.string.component_betslip__view_bet_list, new Object[0], bVarI), uxs.ENABLE, null, alb0.a(alb0Var, new g7f(44.0f), null, 0L, 0.0f, 29), null, null, null, function1, null, bVarI, 384 | (i4 & 234881024), 744);
            szg.a(bVarI, true, aVar3, 16.0f, bVarI);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xee0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yee0.a(str, str2, str3, str4, str5, str6, uxsVar, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
