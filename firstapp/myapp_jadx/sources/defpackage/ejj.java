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

/* JADX INFO: loaded from: classes6.dex */
public final class ejj {
    public static final void a(wr50.c cVar, Function1<? super String, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function2, a aVar, final int i) {
        int i2;
        int i3;
        final wr50.c cVar2 = cVar;
        final Function1<? super String, Unit> function3 = function1;
        function3.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(521098817);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(cVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar3 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar3);
            d dVarG = j.g(aVar2, 1.0f);
            i060 i060VarC = j060.c(4.0f);
            qyd0 qyd0Var = cst.e;
            d dVarG2 = h.g(androidx.compose.foundation.a.b(dVarG, ((ast) bVarI.O(qyd0Var)).i, i060VarC), 24.0f, 16.0f);
            i78 i78VarA = g78.a(new kw0.i(16.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar3);
            int i4 = i2;
            lkf0.d(cb40.a(R.string.page_loyalty__vdate_game_reward_release, new Object[]{cVar2.a}, bVarI), null, c68.a(R.color.brand_tertiary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 0, 0, 131066);
            d dVarG3 = j.g(aVar2, 1.0f);
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar3);
            mw90.a("https://s.sporty.net/cms/aces_playing_cards_symbol_spades_with_purple_colors_isolated_purple_background_3d_icon_symbol_5_4a6cca8749.png", AnalyticsParam.HOME_NAV_ICON, j.r(aVar2, 40.0f), null, null, null, null, bVarI, 438, 2040);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            i78 i78VarA2 = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.o, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar3);
            d160 d160VarA2 = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar3);
            lkf0.d(cb40.a(R.string.page_loyalty__daily_game_rewards, new Object[0], bVarI), h.j(aVar2, 0.0f, 0.0f, 4.0f, 0.0f, 11), c68.a(R.color.brand_tertiary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 48, 0, 131064);
            d dVarA = ls7.a(j.r(aVar2, 16.0f), j060.a);
            boolean z = (i4 & 896) == 256;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                i3 = 0;
                objY = new zij(function0, 0);
                bVarI.r(objY);
            } else {
                i3 = 0;
            }
            h9n.a(erz.a(R.drawable.question_mark, i3, bVarI), AnalyticsParam.HOME_NAV_ICON, androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY, 15), null, null, 0.0f, new gf4(c68.a(R.color.brand_tertiary, bVarI), 5), bVarI, 48, 56);
            bVarI.X(true);
            d160 d160VarA3 = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).c, true, new hw0()), ht.a.l, bVarI, 48);
            int iHashCode6 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar3);
            cVar2 = cVar;
            lkf0.d(cVar2.b, new WithAlignmentLineElement(mt.a), j58.f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(0L, mla.m(16.0f, bVarI), new t9i(900), null, f8i.b, 0L, null, null, 0, mla.m(18.4f, bVarI), null, null, 16646105), bVarI, 384, 0, 131064);
            bVarI = bVarI;
            if (cVar2.e != null) {
                bVarI.N(1547735517);
                lkf0.d(cVar2.e, new WithAlignmentLineElement(mt.a), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((z0u) bVarI.O(b1u.a)).a, ((ast) bVarI.O(qyd0Var)).a, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVarI, 0, 0, 131068);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(1548027506);
                bVarI.X(false);
            }
            f30.a(bVarI, true, true, true);
            yij yijVar = cVar2.d;
            if (Intrinsics.g(yijVar, yij.a.a) || Intrinsics.g(yijVar, yij.d.a)) {
                bVarI.N(-1202938501);
                d dVarI = j.i(j.g(aVar2, 1.0f), 28.0f);
                alb0 alb0Var = sya.a;
                b bVar3 = bVarI;
                ak5 ak5VarA = sya.a(r58.d(4278251433L), 0L, 0L, 0L, bVar3, 24582, 14);
                String strA = inm.a("claim_reward_button_batchId_", cVar2.c);
                boolean z2 = ((i4 & 112) == 32) | ((i4 & 14) == 4);
                Object objY2 = bVar3.y();
                if (z2 || objY2 == c0042a) {
                    function3 = function1;
                    objY2 = new Function0() { // from class: ajj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            wr50.c cVar4 = cVar2;
                            if (Intrinsics.g(cVar4.d, yij.a.a)) {
                                function3.invoke(cVar4.c);
                            }
                            return Unit.a;
                        }
                    };
                    bVar3.r(objY2);
                } else {
                    function3 = function1;
                }
                xya.b(dVarI, false, ak5VarA, null, null, 0.0f, strA, (Function0) objY2, pp8.b(173101923, new gaj() { // from class: bjj
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (!aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            aVar4.G();
                        } else if (Intrinsics.g(cVar2.d, yij.a.a)) {
                            aVar4.N(-1376235170);
                            lkf0.d(cb40.a(R.string.page_loyalty__claim_reward, new Object[0], aVar4), null, r58.d(4281678405L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar4), aVar4, 384, 0, 131066);
                            aVar4.H();
                        } else {
                            aVar4.N(-1375848786);
                            q330.a(j.r(d.a.b, 16.0f), j58.b, 2.0f, 0L, 0, 0.0f, aVar4, 438, 56);
                            aVar4.H();
                        }
                        return Unit.a;
                    }
                }, bVar3), bVar3, 100663302, 58);
                bVarI = bVar3;
                bVarI.X(false);
            } else {
                if (Intrinsics.g(yijVar, yij.b.a)) {
                    bVarI.N(-1201331926);
                    d dVarK = j.k(j.g(aVar2, 1.0f), 28.0f, 0.0f, 2);
                    alb0 alb0Var2 = g9z.a;
                    f9z f9zVarB = g9z.b(r58.d(4278251433L), 0L, bVarI, 5);
                    e9z e9zVarA = g9z.a(r58.d(4278251433L), 0L, bVarI, 5);
                    alb0 alb0Var3 = g9z.e;
                    gdf0 gdf0Var = new gdf0(3);
                    boolean z3 = (i4 & 7168) == 2048;
                    Object objY3 = bVarI.y();
                    if (z3 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: cjj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function2.invoke();
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    b bVar4 = bVarI;
                    vuc0.b(dVarK, false, e9zVarA, alb0Var3, f9zVarB, "Claimed, go check total rewards ", gdf0Var, null, null, null, (Function0) objY3, bVar4, 196614, 0, 898);
                    bVarI = bVar4;
                    bVarI.X(false);
                } else {
                    bVarI.N(-1200501157);
                    bVarI.X(false);
                }
                function3 = function1;
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: djj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ejj.a(cVar2, function3, function0, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
