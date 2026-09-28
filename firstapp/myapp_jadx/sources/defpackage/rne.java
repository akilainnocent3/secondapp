package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class rne {
    public static final void a(final wr50.c cVar, final int i, final Function1<? super String, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function2, a aVar, final int i2) {
        int i3;
        lme lmeVar;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(-1693299748);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            d dVarG = j.g(d.a.b, 1.0f);
            if (i == 0) {
                lmeVar = lme.b;
            } else if (i != 1) {
                lmeVar = i != 2 ? lme.a : lme.d;
            } else {
                lmeVar = lme.c;
            }
            voe.a(dVarG, lmeVar, pp8.b(1372730839, new Function2() { // from class: lne
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarH = h.h(h.j(d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 24.0f, 0.0f, 2);
                        i060 i060VarC = j060.c(8.0f);
                        fg6 fg6VarB = gg6.b(((ast) aVar2.O(cst.e)).i, 0L, aVar2, 24576, 14);
                        l35 l35VarA = m35.a(1.0f, r58.b(872415231));
                        final wr50.c cVar2 = cVar;
                        final Function1 function3 = function1;
                        final Function0 function4 = function2;
                        final Function0 function5 = function0;
                        rg6.a(dVarH, i060VarC, fg6VarB, null, l35VarA, pp8.b(-346140379, new gaj() { // from class: nne
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                yka.a.C1350a c1350a;
                                int i4;
                                a aVar3;
                                a aVar4 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar5 = d.a.b;
                                    d dVarJ = h.j(h.h(aVar5, 24.0f, 0.0f, 2), 0.0f, 14.0f, 0.0f, 20.0f, 5);
                                    i78 i78VarA = g78.a(new kw0.i(16.0f, true, new hw0()), ht.a.m, aVar4, 6);
                                    int iHashCode = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO = aVar4.o();
                                    d dVarC = c.c(aVar4, dVarJ);
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
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar4, i78VarA, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar4, ne00VarO, dVar);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar4, iHashCode, c1350a2);
                                    }
                                    yka.a.c cVar3 = yka.a.d;
                                    hlh0.a(aVar4, dVarC, cVar3);
                                    final wr50.c cVar4 = cVar2;
                                    lkf0.d(cb40.a(R.string.page_loyalty__vdate_game_reward_release, new Object[]{cVar4.a}, aVar4), null, c68.a(R.color.brand_tertiary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, aVar4), aVar4, 0, 0, 131066);
                                    d dVarG2 = j.g(aVar5, 1.0f);
                                    kw0.j jVar = kw0.a;
                                    n54.b bVar2 = ht.a.k;
                                    d160 d160VarA = b160.a(jVar, bVar2, aVar4, 48);
                                    int iHashCode2 = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO2 = aVar4.o();
                                    d dVarC2 = c.c(aVar4, dVarG2);
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
                                    hlh0.a(aVar4, d160VarA, bVar);
                                    hlh0.a(aVar4, ne00VarO2, dVar);
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                                        c1350a = c1350a2;
                                        j3c.a(iHashCode2, aVar4, iHashCode2, c1350a);
                                    } else {
                                        c1350a = c1350a2;
                                    }
                                    hlh0.a(aVar4, dVarC2, cVar3);
                                    yka.a.C1350a c1350a3 = c1350a;
                                    mw90.a("https://s.sporty.net/cms/aces_playing_cards_symbol_spades_with_purple_colors_isolated_purple_background_3d_icon_symbol_5_4a6cca8749.png", AnalyticsParam.HOME_NAV_ICON, j.r(aVar5, 40.0f), null, null, null, null, aVar4, 438, 2040);
                                    if (1.0f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                    i78 i78VarA2 = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.o, aVar4, 54);
                                    int iHashCode3 = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO3 = aVar4.o();
                                    d dVarC3 = c.c(aVar4, layoutWeightElement);
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
                                    hlh0.a(aVar4, i78VarA2, bVar);
                                    hlh0.a(aVar4, ne00VarO3, dVar);
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar4, iHashCode3, c1350a3);
                                    }
                                    hlh0.a(aVar4, dVarC3, cVar3);
                                    d160 d160VarA2 = b160.a(jVar, bVar2, aVar4, 48);
                                    int iHashCode4 = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO4 = aVar4.o();
                                    d dVarC4 = c.c(aVar4, aVar5);
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
                                    hlh0.a(aVar4, d160VarA2, bVar);
                                    hlh0.a(aVar4, ne00VarO4, dVar);
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode4))) {
                                        j3c.a(iHashCode4, aVar4, iHashCode4, c1350a3);
                                    }
                                    hlh0.a(aVar4, dVarC4, cVar3);
                                    lkf0.d(cb40.a(R.string.page_loyalty__daily_game_rewards, new Object[0], aVar4), h.j(aVar5, 0.0f, 0.0f, 4.0f, 0.0f, 11), c68.a(R.color.brand_tertiary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar4), aVar4, 48, 0, 131064);
                                    d dVarA = ls7.a(j.r(aVar5, 16.0f), j060.a);
                                    Function0 function6 = function5;
                                    boolean zM = aVar4.M(function6);
                                    Object objY = aVar4.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zM || objY == c0042a) {
                                        i4 = 0;
                                        objY = new one(function6, 0);
                                        aVar4.r(objY);
                                    } else {
                                        i4 = 0;
                                    }
                                    h9n.a(erz.a(R.drawable.question_mark, i4, aVar4), AnalyticsParam.HOME_NAV_ICON, androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY, 15), null, null, 0.0f, new gf4(c68.a(R.color.brand_tertiary, aVar4), 5), aVar4, 48, 56);
                                    aVar4.s();
                                    d160 d160VarA3 = b160.a(new kw0.i(((cjb0) aVar4.O(ejb0.a)).c, true, new hw0()), ht.a.l, aVar4, 48);
                                    int iHashCode5 = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO5 = aVar4.o();
                                    d dVarC5 = c.c(aVar4, aVar5);
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
                                    hlh0.a(aVar4, d160VarA3, bVar);
                                    hlh0.a(aVar4, ne00VarO5, dVar);
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode5))) {
                                        j3c.a(iHashCode5, aVar4, iHashCode5, c1350a3);
                                    }
                                    hlh0.a(aVar4, dVarC5, cVar3);
                                    lkf0.d(cVar4.b, new WithAlignmentLineElement(mt.a), j58.f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(0L, mla.m(16.0f, aVar4), new t9i(900), null, f8i.b, 0L, null, null, 0, mla.m(18.4f, aVar4), null, null, 16646105), aVar4, 384, 0, 131064);
                                    a aVar7 = aVar4;
                                    if (cVar4.e != null) {
                                        aVar7.N(-395005683);
                                        lkf0.d(cVar4.e, new WithAlignmentLineElement(mt.a), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((z0u) aVar7.O(b1u.a)).a, ((ast) aVar7.O(cst.e)).b, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar7, 0, 0, 131068);
                                        aVar7 = aVar7;
                                        aVar7.H();
                                    } else {
                                        aVar7.N(-394669240);
                                        aVar7.H();
                                    }
                                    aVar7.s();
                                    aVar7.s();
                                    aVar7.s();
                                    yij yijVar = cVar4.d;
                                    if (Intrinsics.g(yijVar, yij.a.a) || Intrinsics.g(yijVar, yij.d.a)) {
                                        aVar7.N(1293429795);
                                        d dVarI = j.i(j.g(aVar5, 1.0f), 28.0f);
                                        alb0 alb0Var = sya.a;
                                        a aVar8 = aVar7;
                                        ak5 ak5VarA = sya.a(cst.b, r58.d(4281678405L), 0L, 0L, aVar8, 24624, 12);
                                        String strA = inm.a("claim_reward_button_batchId_", cVar4.c);
                                        Function1 function7 = function3;
                                        boolean zM2 = aVar8.M(function7) | aVar8.M(cVar4);
                                        Object objY2 = aVar8.y();
                                        if (zM2 || objY2 == c0042a) {
                                            objY2 = new xt0(1, function7, cVar4);
                                            aVar8.r(objY2);
                                        }
                                        op8 op8VarB = pp8.b(2100401933, new gaj() { // from class: pne
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                a aVar9 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                ((e160) obj6).getClass();
                                                if (!aVar9.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    aVar9.G();
                                                } else if (Intrinsics.g(cVar4.d, yij.a.a)) {
                                                    aVar9.N(-304440764);
                                                    lkf0.d(cb40.a(R.string.page_loyalty__claim_reward, new Object[0], aVar9), null, r58.d(4281678405L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar9), aVar9, 384, 0, 131066);
                                                    aVar9.H();
                                                } else {
                                                    aVar9.N(-303999324);
                                                    q330.a(j.r(d.a.b, 16.0f), j58.b, 2.0f, 0L, 0, 0.0f, aVar9, 438, 56);
                                                    aVar9.H();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar8);
                                        aVar3 = aVar8;
                                        xya.b(dVarI, false, ak5VarA, null, null, 0.0f, strA, (Function0) objY2, op8VarB, aVar3, 100663302, 58);
                                        aVar3.H();
                                    } else {
                                        if (Intrinsics.g(yijVar, yij.b.a)) {
                                            aVar7.N(1295163036);
                                            d dVarK = j.k(j.g(aVar5, 1.0f), 28.0f, 0.0f, 2);
                                            alb0 alb0Var2 = g9z.a;
                                            long j = cst.b;
                                            f9z f9zVarB = g9z.b(j, 0L, aVar7, 5);
                                            e9z e9zVarA = g9z.a(j, 0L, aVar7, 5);
                                            String strA2 = cb40.a(R.string.page_loyalty__game_reward_card_claimed_text, new Object[0], aVar7);
                                            alb0 alb0Var3 = g9z.e;
                                            gdf0 gdf0Var = new gdf0(3);
                                            final Function0 function8 = function4;
                                            boolean zM3 = aVar7.M(function8);
                                            Object objY3 = aVar7.y();
                                            if (zM3 || objY3 == c0042a) {
                                                objY3 = new Function0() { // from class: qne
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        function8.invoke();
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar7.r(objY3);
                                            }
                                            a aVar9 = aVar7;
                                            vuc0.b(dVarK, false, e9zVarA, alb0Var3, f9zVarB, strA2, gdf0Var, null, null, null, (Function0) objY3, aVar9, 6, 0, 898);
                                            aVar7 = aVar9;
                                            aVar7.H();
                                        } else {
                                            aVar7.N(1296167281);
                                            aVar7.H();
                                        }
                                        aVar3 = aVar7;
                                    }
                                    aVar3.s();
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 221190, 8);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 390, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mne
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rne.a(cVar, i, function1, function0, function2, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
