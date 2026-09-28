package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t7r implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t7r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tsr.a aVar;
        yka.a.C1350a c1350a;
        long j;
        float f;
        yka.a.C1350a c1350a2;
        long j2;
        float f2;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj4;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d dVarR = j.r(h.j(d.a.b, 0.0f, 0.0f, ((cjb0) aVar2.O(ejb0.a)).d, 0.0f, 11), 24.0f);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = pr7.a(aVar2);
                    }
                    psw pswVar = (psw) objY;
                    xt50 xt50VarA = ut50.a(20.0f, j58.f, false);
                    boolean zM = aVar2.M(function1);
                    Object objY2 = aVar2.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new x7r(0, function1);
                        aVar2.r(objY2);
                    }
                    h6n.b(erz.a(R.drawable.ic_icon_sim_how_to_play, 0, aVar2), null, h.f(androidx.compose.foundation.d.b(dVarR, pswVar, xt50VarA, false, null, mla.d((Function0) objY2, aVar2, 0), 28), 1.9f), ((lib0) aVar2.O(oib0.a)).a0, aVar2, 48, 0);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                lgc0 lgc0Var = (lgc0) obj4;
                a aVar3 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    d.a aVar4 = d.a.b;
                    d dVarH = h.h(j.e(aVar4, 1.0f), 8.0f, 0.0f, 2);
                    kw0.j jVar = kw0.a;
                    n54.b bVar = ht.a.k;
                    d160 d160VarA = b160.a(jVar, bVar, aVar3, 48);
                    int iHashCode = Long.hashCode(aVar3.m());
                    ne00 ne00VarO = aVar3.o();
                    d dVarC = c.c(aVar3, dVarH);
                    yka.k.getClass();
                    tsr.a aVar5 = yka.a.b;
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar5);
                    } else {
                        aVar3.p();
                    }
                    yka.a.b bVar2 = yka.a.f;
                    hlh0.a(aVar3, d160VarA, bVar2);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar3, ne00VarO, dVar);
                    yka.a.C1350a c1350a3 = yka.a.g;
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar3, iHashCode, c1350a3);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar3, dVarC, cVar);
                    enc0 enc0Var = lgc0Var.a;
                    enc0 enc0Var2 = lgc0Var.b;
                    mw90.b(enc0Var.d, "team logo", g3w.h(j.r(aVar4, 32.0f), "sporty_legends_recommended_home_team_logo_icon"), erz.a(R.drawable.sporty_game_default_place_holder, 0, aVar3), null, null, null, null, null, 0.0f, null, aVar3, 432, 0, 32752);
                    ty0.a(aVar3, j.w(aVar4, 6.0f));
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    kw0.k kVar = kw0.c;
                    n54.a aVar6 = ht.a.m;
                    i78 i78VarA = g78.a(kVar, aVar6, aVar3, 0);
                    int iHashCode2 = Long.hashCode(aVar3.m());
                    ne00 ne00VarO2 = aVar3.o();
                    d dVarC2 = c.c(aVar3, layoutWeightElement);
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar = aVar5;
                        aVar3.F(aVar);
                    } else {
                        aVar = aVar5;
                        aVar3.p();
                    }
                    hlh0.a(aVar3, i78VarA, bVar2);
                    hlh0.a(aVar3, ne00VarO2, dVar);
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                        c1350a = c1350a3;
                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                    } else {
                        c1350a = c1350a3;
                    }
                    hlh0.a(aVar3, dVarC2, cVar);
                    String str = enc0Var.b;
                    boolean z = enc0Var.e;
                    if (z) {
                        aVar3.N(1991128504);
                        j = fjb0.b(aVar3).b1;
                        aVar3.H();
                    } else {
                        aVar3.N(1991209755);
                        j = fjb0.b(aVar3).o;
                        aVar3.H();
                    }
                    imf0 imf0VarL = mla.l(R.style.B2_B, aVar3);
                    aVar3.N(-1736872994);
                    long j3 = j;
                    d dVarG = j.g(j.i(aVar4, 22.0f), 1.0f);
                    ya5.a aVar7 = ya5.a;
                    if (z) {
                        aVar3.N(-1371642041);
                        f = 0.0f;
                        dVarG = androidx.compose.foundation.a.a(dVarG, ya5.a.h(aVar7, b.k(new j58(fjb0.b(aVar3).P0), new j58(fjb0.b(aVar3).a0), new j58(fjb0.b(aVar3).X0)), 0.0f, 0.0f, 14), null, 0.0f, 6);
                        aVar3.H();
                    } else {
                        f = 0.0f;
                        aVar3.N(-1371123752);
                        aVar3.H();
                    }
                    aVar3.H();
                    yka.a.C1350a c1350a4 = c1350a;
                    tsr.a aVar8 = aVar;
                    lkf0.d(str, g3w.h(j.A(h.h(dVarG, 8.0f, f, 2), bVar, 2), "sporty_legends_recommended_home_team_name_text"), j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar3, 0, 0, 131064);
                    aoc0.a(null, enc0Var.f, 0.0f, 0L, "sporty_legends_recommended_home_team_star", aVar3, 24576);
                    aVar3.s();
                    d dVarG2 = h.g(androidx.compose.foundation.a.b(j.c(aVar4, 1.0f), fjb0.b(aVar3).b1, zk40.a), 12.0f, 6.0f);
                    n54 n54Var = ht.a.e;
                    aiv aivVarC = g75.c(n54Var, false);
                    int iHashCode3 = Long.hashCode(aVar3.m());
                    ne00 ne00VarO3 = aVar3.o();
                    d dVarC3 = c.c(aVar3, dVarG2);
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar8);
                    } else {
                        aVar3.p();
                    }
                    hlh0.a(aVar3, aivVarC, bVar2);
                    hlh0.a(aVar3, ne00VarO3, dVar);
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                        c1350a2 = c1350a4;
                        j3c.a(iHashCode3, aVar3, iHashCode3, c1350a2);
                    } else {
                        c1350a2 = c1350a4;
                    }
                    hlh0.a(aVar3, dVarC3, cVar);
                    d dVarB = androidx.compose.foundation.a.b(j.r(aVar4, 24.0f), fjb0.b(aVar3).e1, j060.a);
                    aiv aivVarC2 = g75.c(n54Var, false);
                    int iHashCode4 = Long.hashCode(aVar3.m());
                    ne00 ne00VarO4 = aVar3.o();
                    d dVarC4 = c.c(aVar3, dVarB);
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar8);
                    } else {
                        aVar3.p();
                    }
                    hlh0.a(aVar3, aivVarC2, bVar2);
                    hlh0.a(aVar3, ne00VarO4, dVar);
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode4))) {
                        j3c.a(iHashCode4, aVar3, iHashCode4, c1350a2);
                    }
                    hlh0.a(aVar3, dVarC4, cVar);
                    yka.a.C1350a c1350a5 = c1350a2;
                    qb2.b(cb40.a(R.string.bet_history__vs, new Object[0], aVar3), g3w.h(aVar4, "sporty_legends_recommended_vs_text"), new imf0(fjb0.b(aVar3).a0, 0L, t9i.C, null, null, 0L, null, null, 3, 0L, new uk10(), null, 16220154), null, 0, false, 1, 0, new if1(d2l.f(10), d2l.f(12), d2l.d(0.25d)), aVar3, 1572912, 440);
                    aVar3.s();
                    aVar3.s();
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    i78 i78VarA2 = g78.a(kVar, aVar6, aVar3, 0);
                    int iHashCode5 = Long.hashCode(aVar3.m());
                    ne00 ne00VarO5 = aVar3.o();
                    d dVarC5 = c.c(aVar3, layoutWeightElement2);
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar8);
                    } else {
                        aVar3.p();
                    }
                    hlh0.a(aVar3, i78VarA2, bVar2);
                    hlh0.a(aVar3, ne00VarO5, dVar);
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode5))) {
                        j3c.a(iHashCode5, aVar3, iHashCode5, c1350a5);
                    }
                    hlh0.a(aVar3, dVarC5, cVar);
                    String str2 = enc0Var2.b;
                    boolean z2 = enc0Var2.e;
                    if (z2) {
                        aVar3.N(2021803439);
                        j2 = fjb0.b(aVar3).b1;
                        aVar3.H();
                    } else {
                        aVar3.N(2021884690);
                        j2 = fjb0.b(aVar3).o;
                        aVar3.H();
                    }
                    long j4 = j2;
                    imf0 imf0VarL2 = mla.l(R.style.B2_B, aVar3);
                    aVar3.N(1450705159);
                    d dVarG3 = j.g(j.i(aVar4, 22.0f), 1.0f);
                    if (z2) {
                        aVar3.N(278313406);
                        f2 = 0.0f;
                        dVarG3 = androidx.compose.foundation.a.a(dVarG3, ya5.a.h(aVar7, b.k(new j58(fjb0.b(aVar3).P0), new j58(fjb0.b(aVar3).a0), new j58(fjb0.b(aVar3).X0)), 0.0f, 0.0f, 14), null, 0.0f, 6);
                        aVar3.H();
                    } else {
                        f2 = 0.0f;
                        aVar3.N(278831695);
                        aVar3.H();
                    }
                    aVar3.H();
                    lkf0.d(str2, g3w.h(j.A(h.h(dVarG3, 8.0f, f2, 2), bVar, 2), "sporty_legends_recommended_away_team_name_text"), j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL2, aVar3, 0, 0, 131064);
                    aoc0.a(null, enc0Var2.f, 0.0f, 0L, "sporty_legends_recommended_away_team_star", aVar3, 24576);
                    aVar3.s();
                    ty0.a(aVar3, j.w(aVar4, 6.0f));
                    mw90.b(enc0Var2.d, "team logo", g3w.h(j.r(aVar4, 32.0f), "sporty_legends_recommended_away_team_logo_icon"), erz.a(R.drawable.sporty_game_default_place_holder, 0, aVar3), null, null, null, null, null, 0.0f, null, aVar3, 432, 0, 32752);
                    aVar3.s();
                } else {
                    aVar3.G();
                }
                return Unit.a;
        }
    }
}
