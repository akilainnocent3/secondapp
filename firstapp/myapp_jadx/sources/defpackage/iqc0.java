package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class iqc0 {
    public static final void a(final qcn qcnVar, final Function1 function1, final jqc0 jqc0Var, a aVar, final int i) {
        int i2;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> lp40Var;
        final enc0 enc0Var;
        Object next;
        qcn<enc0> qcnVar2;
        qcn<enc0> qcnVar3;
        b bVarI = aVar.i(-1116958987);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(jqc0Var) : bVarI.A(jqc0Var) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Iterator<E> it = qcnVar.iterator();
            while (true) {
                enc0Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                qcn<enc0> qcnVar4 = ((bdc0) next).d;
                if (qcnVar4 != null && qcnVar4.size() >= 4) {
                    break;
                }
            }
            bdc0 bdc0Var = (bdc0) next;
            final enc0 enc0Var2 = (bdc0Var == null || (qcnVar3 = bdc0Var.d) == null) ? null : (enc0) CollectionsKt.V(3, qcnVar3);
            if (bdc0Var != null && (qcnVar2 = bdc0Var.d) != null) {
                enc0Var = (enc0) CollectionsKt.V(0, qcnVar2);
            }
            if (bdc0Var == null || enc0Var2 == null || enc0Var == null) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    lp40Var = new Function2() { // from class: gqc0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            iqc0.a(qcnVar, function1, jqc0Var, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            } else if (jqc0Var.a) {
                bVarI.N(2082563812);
                boolean z = (i2 & 112) == 32;
                Object objY = bVarI.y();
                if (z || objY == a.C0041a.a) {
                    objY = new Function0() { // from class: hqc0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(com.sportybet.android.instantwin.presentation.legends.b.v.c.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                u60.a((Function0) objY, new yle(false, false, 3), pp8.b(-1936406370, new Function2() { // from class: spc0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarJ = h.j(j.e(d.a.b, 1.0f), 0.0f, 44.0f, 0.0f, 0.0f, 13);
                            final Function1 function2 = function1;
                            boolean zM = aVar2.M(function2);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == a.C0041a.a) {
                                objY2 = new gnr(function2, 1);
                                aVar2.r(objY2);
                            }
                            d dVarF = g3w.f(dVarJ, true, (Function0) objY2);
                            long jC = j58.c(0.2f, j58.b);
                            final enc0 enc0Var3 = enc0Var2;
                            final enc0 enc0Var4 = enc0Var;
                            final jqc0 jqc0Var2 = jqc0Var;
                            ihe0.a(dVarF, zk40.a, jC, 0L, 0.0f, 0.0f, null, pp8.b(1840211449, new Function2() { // from class: tpc0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    yka.a.C1350a c1350a;
                                    tsr.a aVar3;
                                    yka.a.C1350a c1350a2;
                                    final jqc0 jqc0Var3 = jqc0Var2;
                                    kqc0 kqc0Var = jqc0Var3.b;
                                    a aVar4 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d.a aVar5 = d.a.b;
                                        d dVarH = h.h(j.g(aVar5, 1.0f), 0.0f, 8.0f, 1);
                                        Object objY3 = aVar4.y();
                                        if (objY3 == a.C0041a.a) {
                                            objY3 = new c2n(3);
                                            aVar4.r(objY3);
                                        }
                                        d dVarB = xa80.b(dVarH, false, (Function1) objY3);
                                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar4, 48);
                                        int iHashCode = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO = aVar4.o();
                                        d dVarC = c.c(aVar4, dVarB);
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
                                        yka.a.C1350a c1350a3 = yka.a.g;
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                                            j3c.a(iHashCode, aVar4, iHashCode, c1350a3);
                                        }
                                        yka.a.c cVar = yka.a.d;
                                        hlh0.a(aVar4, dVarC, cVar);
                                        kqc0 kqc0Var2 = kqc0.c;
                                        d dVarK = g3w.k(aVar5, kqc0Var == kqc0Var2);
                                        kw0.j jVar = kw0.a;
                                        n54.b bVar2 = ht.a.k;
                                        d160 d160VarA = b160.a(jVar, bVar2, aVar4, 48);
                                        int iHashCode2 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO2 = aVar4.o();
                                        d dVarC2 = c.c(aVar4, dVarK);
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
                                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a3);
                                        }
                                        hlh0.a(aVar4, dVarC2, cVar);
                                        lbc0 lbc0Var = lbc0.e;
                                        final enc0 enc0Var5 = enc0Var3;
                                        jjc0.a(null, rdc0.a(enc0Var5, lbc0Var), "home", null, null, aVar4, 448, 25);
                                        h9n.a(erz.a(R.drawable.img_sporty_legends_vs, 0, aVar4), "vs", g3w.k(j.w(j.i(h.h(aVar5, 12.0f, 0.0f, 2), 190.0f), 48.0f), false), null, null, 0.0f, null, aVar4, 432, 120);
                                        lbc0 lbc0Var2 = lbc0.d;
                                        final enc0 enc0Var6 = enc0Var4;
                                        jjc0.a(null, rdc0.a(enc0Var6, lbc0Var2), "away", null, null, aVar4, 448, 25);
                                        aVar4.s();
                                        d dVarG = j.g(aVar5, 1.0f);
                                        aiv aivVarC = g75.c(ht.a.a, false);
                                        int iHashCode3 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO3 = aVar4.o();
                                        d dVarC3 = c.c(aVar4, dVarG);
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
                                        hlh0.a(aVar4, aivVarC, bVar);
                                        hlh0.a(aVar4, ne00VarO3, dVar);
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                            c1350a = c1350a3;
                                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a);
                                        } else {
                                            c1350a = c1350a3;
                                        }
                                        hlh0.a(aVar4, dVarC3, cVar);
                                        d dVarH2 = h.h(j.g(aVar5, 1.0f), 20.0f, 0.0f, 2);
                                        d160 d160VarA2 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar2, aVar4, 54);
                                        int iHashCode4 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO4 = aVar4.o();
                                        d dVarC4 = c.c(aVar4, dVarH2);
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
                                            j3c.a(iHashCode4, aVar4, iHashCode4, c1350a);
                                        }
                                        hlh0.a(aVar4, dVarC4, cVar);
                                        d dVarK2 = g3w.k(aVar5, kqc0Var == kqc0Var2);
                                        yka.a.C1350a c1350a4 = c1350a;
                                        boolean z2 = kqc0Var == kqc0Var2;
                                        fpc0 fpc0Var = fpc0.b;
                                        final Function1 function3 = function2;
                                        cac0.a(dVarK2, z2, fpc0Var, 0.0f, false, 0.0f, pp8.b(-243888787, new Function2() { // from class: upc0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                a aVar7 = (a) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                int i3 = 1;
                                                int i4 = 2;
                                                if (aVar7.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    String strA = cb40.a(R.string.page_instant_virtual__click_confirm_to_view_betting_options_and_place_your_bet, new Object[0], aVar7);
                                                    d dVarG2 = h.g(g3w.k(d.a.b, jqc0Var3.b == kqc0.c), 8.0f, 4.0f);
                                                    final Function1 function4 = function3;
                                                    boolean zM2 = aVar7.M(function4);
                                                    Object objY4 = aVar7.y();
                                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                                    if (zM2 || objY4 == c0042a) {
                                                        objY4 = new y2n(function4, i4);
                                                        aVar7.r(objY4);
                                                    }
                                                    Function0 function0 = (Function0) objY4;
                                                    boolean zM3 = aVar7.M(function4);
                                                    Object objY5 = aVar7.y();
                                                    if (zM3 || objY5 == c0042a) {
                                                        objY5 = new kbw(function4, i3);
                                                        aVar7.r(objY5);
                                                    }
                                                    Function0 function5 = (Function0) objY5;
                                                    boolean zM4 = aVar7.M(function4);
                                                    Object objY6 = aVar7.y();
                                                    if (zM4 || objY6 == c0042a) {
                                                        objY6 = new Function0() { // from class: aqc0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                function4.invoke(com.sportybet.android.instantwin.presentation.legends.b.v.c.a);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar7.r(objY6);
                                                    }
                                                    iqc0.b(dVarG2, 3, strA, function0, function5, (Function0) objY6, 0L, aVar7, 432, 128);
                                                } else {
                                                    aVar7.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar4), pp8.b(1095146135, new gaj() { // from class: vpc0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                d dVar2 = (d) obj5;
                                                a aVar7 = (a) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                dVar2.getClass();
                                                if ((iIntValue3 & 6) == 0) {
                                                    iIntValue3 |= aVar7.M(dVar2) ? 4 : 2;
                                                }
                                                if (aVar7.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                    d dVarK3 = g3w.k(dVar2, jqc0Var3.b == kqc0.c);
                                                    if (1.0f <= 0.0d) {
                                                        ukn.a("invalid weight; must be greater than zero");
                                                    }
                                                    d dVarH3 = g3w.h(j.i(dVarK3.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 36.0f), "sporty_legends_tutorial_confirm_button");
                                                    Object objY4 = aVar7.y();
                                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                                    if (objY4 == c0042a) {
                                                        objY4 = new ypc0();
                                                        aVar7.r(objY4);
                                                    }
                                                    d dVarB2 = androidx.compose.ui.draw.a.b(dVarH3, (Function1) objY4);
                                                    alb0 alb0Var = sya.a;
                                                    ak5 ak5VarA = sya.a(0L, 0L, c68.a(R.color.bg_snackbar, aVar7), c68.a(R.color.text_disabled_action, aVar7), aVar7, 24576, 3);
                                                    Object objY5 = aVar7.y();
                                                    if (objY5 == c0042a) {
                                                        objY5 = new zpc0();
                                                        aVar7.r(objY5);
                                                    }
                                                    xya.b(dVarB2, true, ak5VarA, null, null, 0.0f, null, (Function0) objY5, gt9.a, aVar7, 113246256, 120);
                                                } else {
                                                    aVar7.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar4), aVar4, 14156160, 56);
                                        kqc0 kqc0Var3 = kqc0.b;
                                        cac0.a(g3w.k(aVar5, kqc0Var == kqc0Var3), kqc0Var == kqc0Var3, fpc0Var, 0.0f, false, 0.0f, pp8.b(-685109674, new s94(1, jqc0Var3, function3), aVar4), gt9.c, aVar4, 14156160, 56);
                                        aVar4.s();
                                        aVar4.s();
                                        d dVarG2 = h.g(g3w.k(j.g(aVar5, 1.0f), false), 20.0f, 13.0f);
                                        d160 d160VarA3 = b160.a(kw0.e, bVar2, aVar4, 54);
                                        int iHashCode5 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO5 = aVar4.o();
                                        d dVarC5 = c.c(aVar4, dVarG2);
                                        if (aVar4.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar4.D();
                                        if (aVar4.g()) {
                                            aVar3 = aVar6;
                                            aVar4.F(aVar3);
                                        } else {
                                            aVar3 = aVar6;
                                            aVar4.p();
                                        }
                                        hlh0.a(aVar4, d160VarA3, bVar);
                                        hlh0.a(aVar4, ne00VarO5, dVar);
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode5))) {
                                            c1350a2 = c1350a4;
                                            j3c.a(iHashCode5, aVar4, iHashCode5, c1350a2);
                                        } else {
                                            c1350a2 = c1350a4;
                                        }
                                        hlh0.a(aVar4, dVarC5, cVar);
                                        yka.a.C1350a c1350a5 = c1350a2;
                                        tsr.a aVar7 = aVar3;
                                        h9n.a(erz.a(R.drawable.ic_football_16dp, 0, aVar4), "football", g3w.h(h.j(aVar5, 0.0f, 0.0f, 4.0f, 0.0f, 11), "sporty_legends_tutorial_pick_match_football_icon"), null, null, 0.0f, new gf4(c68.a(R.color.icon_inverse_primary, aVar4), 5), aVar4, 432, 56);
                                        lkf0.d(cb40.a(R.string.page_instant_virtual__pick_your_own_match_and_bet_instantly, new Object[0], aVar4), g3w.h(aVar5, "sporty_legends_tutorial_pick_match_title_text"), c68.a(R.color.text_inverse_primary, aVar4), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar4), aVar4, 48, 0, 130040);
                                        aVar4.s();
                                        kqc0 kqc0Var4 = kqc0.a;
                                        d dVarJ2 = h.j(j.g(g3w.k(aVar5, kqc0Var == kqc0Var4), 1.0f), 0.0f, 50.0f, 0.0f, 0.0f, 13);
                                        aiv aivVarC2 = g75.c(ht.a.d, false);
                                        int iHashCode6 = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO6 = aVar4.o();
                                        d dVarC6 = c.c(aVar4, dVarJ2);
                                        if (aVar4.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar4.D();
                                        if (aVar4.g()) {
                                            aVar4.F(aVar7);
                                        } else {
                                            aVar4.p();
                                        }
                                        hlh0.a(aVar4, aivVarC2, bVar);
                                        hlh0.a(aVar4, ne00VarO6, dVar);
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode6))) {
                                            j3c.a(iHashCode6, aVar4, iHashCode6, c1350a5);
                                        }
                                        hlh0.a(aVar4, dVarC6, cVar);
                                        cac0.a(null, kqc0Var == kqc0Var4, fpc0.a, 0.0f, false, 0.0f, pp8.b(1263092794, new t94(1, jqc0Var3, function3), aVar4), pp8.b(1784637540, new gaj() { // from class: wpc0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                d dVar2 = (d) obj5;
                                                a aVar8 = (a) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                dVar2.getClass();
                                                if ((iIntValue3 & 6) == 0) {
                                                    iIntValue3 |= aVar8.M(dVar2) ? 4 : 2;
                                                }
                                                if (aVar8.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                    d.a aVar9 = d.a.b;
                                                    d dVarG3 = j.g(aVar9, 1.0f);
                                                    i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar8, 6);
                                                    int iHashCode7 = Long.hashCode(aVar8.m());
                                                    ne00 ne00VarO7 = aVar8.o();
                                                    d dVarC7 = c.c(aVar8, dVarG3);
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
                                                    hlh0.a(aVar8, i78VarA2, yka.a.f);
                                                    hlh0.a(aVar8, ne00VarO7, yka.a.e);
                                                    yka.a.C1350a c1350a6 = yka.a.g;
                                                    if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode7))) {
                                                        j3c.a(iHashCode7, aVar8, iHashCode7, c1350a6);
                                                    }
                                                    hlh0.a(aVar8, dVarC7, yka.a.d);
                                                    d dVarJ3 = h.j(j.g(dVar2, 0.5f), 16.0f, 0.0f, 10.0f, 0.0f, 10);
                                                    Object objY4 = aVar8.y();
                                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                                    if (objY4 == c0042a) {
                                                        objY4 = new bqc0();
                                                        aVar8.r(objY4);
                                                    }
                                                    inc0.a(androidx.compose.foundation.d.d(dVarJ3, true, null, null, (Function0) objY4, 14), enc0Var6, c68.a(R.color.icon_info_secondary, aVar8), aVar8, 64);
                                                    d dVarA = k78.a(ht.a.o, h.j(j.g(aVar9, 0.5f), 10.0f, 8.0f, 16.0f, 0.0f, 8));
                                                    Object objY5 = aVar8.y();
                                                    if (objY5 == c0042a) {
                                                        objY5 = new cqc0();
                                                        aVar8.r(objY5);
                                                    }
                                                    inc0.a(androidx.compose.foundation.d.d(dVarA, true, null, null, (Function0) objY5, 14), enc0Var5, c68.a(R.color.bg_brand_main_primary, aVar8), aVar8, 64);
                                                    aVar8.s();
                                                } else {
                                                    aVar8.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar4), aVar4, 14156160, 57);
                                        h9n.a(erz.a(R.drawable.ic_iv_tutorial_tap, 0, aVar4), "swipe_tap", g3w.h(androidx.compose.foundation.layout.d.a.b(j.w(j.i(h.j(aVar5, 0.0f, 20.0f, 70.0f, 0.0f, 9), 82.0f), 63.0f), ht.a.b), "sporty_legends_tutorial_first_team_tap_icon"), null, null, 0.0f, null, aVar4, 48, 120);
                                        aVar4.s();
                                        h9n.a(erz.a(R.drawable.ic_iv_tutorial_tap, 0, aVar4), "swipe_tap", g3w.h(g.d(j.w(j.i(h.j(g3w.k(aVar5, kqc0Var == kqc0Var4), 0.0f, 0.0f, 10.0f, 0.0f, 11), 82.0f), 63.0f).n(new HorizontalAlignElement(ht.a.o)), 0.0f, -40.0f, 1), "sporty_legends_tutorial_second_team_tap_icon"), null, null, 0.0f, null, aVar4, 48, 120);
                                        aVar4.s();
                                    } else {
                                        aVar4.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 12607920, 104);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 432, 0);
                bVarI.X(false);
            } else {
                bVarI.N(2098871021);
                bVarI.X(false);
            }
            eVarZ.d = lp40Var;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            lp40Var = new lp40(i, 1, function1, qcnVar, jqc0Var);
            eVarZ.d = lp40Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:107:0x021d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0223  */
    /* JADX WARN: Code duplicated, block: B:112:0x0231  */
    /* JADX WARN: Code duplicated, block: B:114:0x023f  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:121:0x0314  */
    /* JADX WARN: Code duplicated, block: B:124:0x0319  */
    /* JADX WARN: Code duplicated, block: B:125:0x031b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0376  */
    /* JADX WARN: Code duplicated, block: B:131:0x037a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0387  */
    /* JADX WARN: Code duplicated, block: B:136:0x0395  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x0415  */
    /* JADX WARN: Code duplicated, block: B:149:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x0505  */
    /* JADX WARN: Code duplicated, block: B:153:0x0568  */
    /* JADX WARN: Code duplicated, block: B:154:0x056a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0577  */
    /* JADX WARN: Code duplicated, block: B:163:0x05af  */
    /* JADX WARN: Code duplicated, block: B:165:0x05d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:169:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:171:0x0604  */
    /* JADX WARN: Code duplicated, block: B:174:0x0613  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0124  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:80:0x013e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0148  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f  */
    /* JADX WARN: Code duplicated, block: B:90:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bd  */
    public static final void b(d dVar, final int i, final String str, Function0 function0, Function0 function1, final Function0 function2, long j, a aVar, final int i2, final int i3) {
        d dVar2;
        int i4;
        Function0 function3;
        int i5;
        int i6;
        int i7;
        boolean z;
        final Function0 function4;
        final d dVar3;
        final Function0 function5;
        final long j2;
        e eVarZ;
        int i8;
        d.a aVar2;
        Function0 function6;
        int i9;
        final long jA;
        n54.a aVar3;
        int iHashCode;
        int i10;
        tsr.a aVar4;
        yka.a.C1350a c1350a;
        Function0 function7;
        a.C0041a.C0042a c0042a;
        int i11;
        int iHashCode2;
        yka.a.C1350a c1350a2;
        n54.b bVar;
        long j3;
        int iHashCode3;
        f160 f160Var;
        yka.a.C1350a c1350a3;
        b bVar2;
        boolean zM;
        Object objY;
        a.C0041a.C0042a c0042a2;
        boolean z2;
        d.a aVar5;
        a.C0041a.C0042a c0042a3;
        int iHashCode4;
        d.a aVar6;
        float f;
        f160 f160Var2;
        boolean zM2;
        Object objY2;
        boolean z3;
        n54.b bVar3;
        int i12;
        b bVar4;
        final String strA;
        boolean z4;
        Object objY3;
        Function0 function8;
        final long j4;
        boolean zE;
        Object objY4;
        float f2;
        float f3;
        n54.a aVar7;
        boolean zE2;
        Object objY5;
        int i13;
        b bVarI = aVar.i(1007439686);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i2 | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i4 = (bVarI.M(dVar2) ? 4 : 2) | i2;
        }
        int i15 = i4 | (bVarI.M(str) ? 2048 : 1024);
        int i16 = i3 & 16;
        if (i16 == 0) {
            if ((i2 & 24576) == 0) {
                function3 = function0;
                i15 |= bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    if (bVarI.A(function1)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i15 |= i6;
                }
                if ((1572864 & i2) == 0) {
                    if (bVarI.A(function2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i15 |= i13;
                }
                i7 = i15 | 4194304;
                if ((4793491 & i7) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i7 & 1, z)) {
                    bVarI.A0();
                    i8 = i2 & 1;
                    aVar2 = d.a.b;
                    if (i8 != 0 || bVarI.h0()) {
                        if (i14 != 0) {
                            dVar2 = aVar2;
                        }
                        if (i16 != 0) {
                            function3 = null;
                        }
                        function6 = i5 == 0 ? function1 : null;
                        i9 = i7 & (-29360129);
                        jA = c68.a(R.color.bg_primary_d_lightest, bVarI);
                    } else {
                        bVarI.G();
                        int i17 = i7 & (-29360129);
                        jA = j;
                        i9 = i17;
                        function6 = function1;
                    }
                    bVarI.Y();
                    d dVarG = j.g(dVar2, 1.0f);
                    kw0.k kVar = kw0.c;
                    aVar3 = ht.a.m;
                    d dVar4 = dVar2;
                    i78 i78VarA = g78.a(kVar, aVar3, bVarI, 0);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarG);
                    yka.k.getClass();
                    i10 = i9;
                    aVar4 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    yka.a.b bVar5 = yka.a.f;
                    hlh0.a(bVarI, i78VarA, bVar5);
                    yka.a.d dVar5 = yka.a.e;
                    hlh0.a(bVarI, ne00VarS, dVar5);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        function7 = function6;
                    } else {
                        function7 = function6;
                        if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(bVarI, dVarC, cVar);
                        c0042a = a.C0041a.a;
                        if (i != 1) {
                            bVarI.N(1380219002);
                            if (i == 2) {
                                f2 = 0.0f;
                            } else {
                                f2 = 50.0f;
                            }
                            if (i == 2) {
                                f3 = 50.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            if (i == 2) {
                                aVar7 = ht.a.o;
                            } else {
                                aVar7 = aVar3;
                            }
                            d dVarA = k78.a(aVar7, h.j(j.i(aVar2, 10.0f), f2, 0.0f, f3, 0.0f, 10));
                            zE2 = bVarI.e(jA);
                            objY5 = bVarI.y();
                            if (zE2 || objY5 == c0042a) {
                                objY5 = new Function1() { // from class: xpc0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        tcf tcfVar = (tcf) obj;
                                        tcfVar.getClass();
                                        float fC1 = tcfVar.C1(10.0f);
                                        float fC2 = tcfVar.C1(12.0f);
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                        j90 j90VarA = m90.a();
                                        float f4 = fC2 / 2.0f;
                                        j90VarA.a(fIntBitsToFloat - f4, fC1);
                                        j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                        j90VarA.c(fIntBitsToFloat, 0.0f);
                                        j90VarA.close();
                                        tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                        return Unit.a;
                                    }
                                };
                                bVarI.r(objY5);
                            }
                            i11 = 0;
                            rxo.b(dVarA, (Function1) objY5, bVarI, 0);
                            bVarI.X(false);
                        } else {
                            i11 = 0;
                            bVarI.N(1381122342);
                            bVarI.X(false);
                        }
                        d dVarB = androidx.compose.foundation.a.b(aVar2, jA, j060.c(2.0f));
                        i78 i78VarA2 = g78.a(kVar, aVar3, bVarI, i11);
                        iHashCode2 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS2 = bVarI.S();
                        d dVarC2 = c.c(bVarI, dVarB);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, i78VarA2, bVar5);
                        hlh0.a(bVarI, ne00VarS2, dVar5);
                        if (bVarI.S && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                            c1350a2 = c1350a;
                        } else {
                            c1350a2 = c1350a;
                            n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                        }
                        hlh0.a(bVarI, dVarC2, cVar);
                        d dVarJ = h.j(aVar2, 12.0f, 8.0f, 12.0f, 0.0f, 8);
                        kw0.g gVar = kw0.g;
                        bVar = ht.a.k;
                        j3 = jA;
                        d160 d160VarA = b160.a(gVar, bVar, bVarI, 54);
                        iHashCode3 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS3 = bVarI.S();
                        d dVarC3 = c.c(bVarI, dVarJ);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA, bVar5);
                        hlh0.a(bVarI, ne00VarS3, dVar5);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                            n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                        }
                        hlh0.a(bVarI, dVarC3, cVar);
                        imf0 imf0VarB = imf0.b(mla.l(R.style.B2_M, bVarI), c68.a(R.color.text_inverse_tertiary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                        f160Var = f160.a;
                        c1350a3 = c1350a2;
                        lkf0.d(str, g3w.h(f160Var.a(0.8f, aVar2, true), "tooltip_title_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, imf0VarB, bVarI, (i10 >> 9) & 14, 24576, 114684);
                        bVar2 = bVarI;
                        if (function2 == null) {
                            bVar2.N(2067097152);
                            bVar2.X(false);
                            aVar5 = aVar2;
                            c0042a3 = c0042a;
                        } else {
                            bVar2.N(2067097153);
                            crz crzVarA = erz.a(R.drawable.ic_cancel, 0, bVar2);
                            d dVarR = j.r(aVar2, 16.0f);
                            zM = bVar2.M(function2);
                            objY = bVar2.y();
                            if (zM) {
                                c0042a2 = c0042a;
                            } else {
                                c0042a2 = c0042a;
                                if (objY == c0042a2) {
                                    z2 = true;
                                }
                                aVar5 = aVar2;
                                c0042a3 = c0042a2;
                                h6n.b(crzVarA, "Close icon", g3w.h(g3w.f(dVarR, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                                Unit unit = Unit.a;
                                bVar2.X(false);
                            }
                            z2 = true;
                            objY = new s3n(function2, 1);
                            bVar2.r(objY);
                            aVar5 = aVar2;
                            c0042a3 = c0042a2;
                            h6n.b(crzVarA, "Close icon", g3w.h(g3w.f(dVarR, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                            Unit unit2 = Unit.a;
                            bVar2.X(false);
                        }
                        bVar2.X(true);
                        d160 d160VarA2 = b160.a(gVar, bVar, bVar2, 54);
                        iHashCode4 = Long.hashCode(bVar2.T);
                        ne00 ne00VarS4 = bVar2.S();
                        d dVarC4 = c.c(bVar2, aVar5);
                        bVar2.D();
                        aVar6 = aVar5;
                        if (bVar2.S) {
                            bVar2.F(aVar4);
                        } else {
                            bVar2.p();
                        }
                        hlh0.a(bVar2, d160VarA2, bVar5);
                        hlh0.a(bVar2, ne00VarS4, dVar5);
                        if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode4))) {
                            n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                        }
                        hlh0.a(bVar2, dVarC4, cVar);
                        if (function3 == null) {
                            bVar2.N(-1556976574);
                            i12 = 0;
                            bVar2.X(false);
                            bVar3 = bVar;
                            f = 12.0f;
                            f160Var2 = f160Var;
                        } else {
                            bVar2.N(-1556976573);
                            String strA2 = cb40.a(R.string.common_functions__back, new Object[0], bVar2);
                            imf0 imf0VarB2 = imf0.b(mla.l(R.style.B2_M, bVar2), c68.a(R.color.bg_brand_sub_primary_d_base, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                            f = 12.0f;
                            f160Var2 = f160Var;
                            d dVarB2 = f160Var2.b(h.j(aVar6, 12.0f, 0.0f, 0.0f, 0.0f, 14), bVar);
                            zM2 = bVar2.M(function3);
                            objY2 = bVar2.y();
                            if (!zM2 || objY2 == c0042a3) {
                                z3 = true;
                                objY2 = new ccw(function3, 1);
                                bVar2.r(objY2);
                            } else {
                                z3 = true;
                            }
                            bVar3 = bVar;
                            lkf0.d(strA2, g3w.h(g3w.f(dVarB2, z3, (Function0) objY2), "tooltip_back_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarB2, bVar2, 0, 0, 130044);
                            bVar2 = bVar2;
                            Unit unit3 = Unit.a;
                            i12 = 0;
                            bVar2.X(false);
                        }
                        bVar4 = bVar2;
                        lkf0.d(i + " " + cb40.a(R.string.common_functions__of, new Object[i12], bVar2) + " 3", g3w.h(f160Var2.b(f160Var2.a(1.0f, aVar6, true), bVar3), "tooltip_step_count_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.C1_R, bVar2), c68.a(R.color.text_secondary, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVar4, 0, 0, 130044);
                        if (i == 3) {
                            bVar4.N(-1555648130);
                            strA = cb40.a(R.string.common_functions__done, new Object[0], bVar4);
                            bVar4.X(false);
                        } else {
                            bVar4.N(-1555555874);
                            strA = cb40.a(R.string.common_functions__next, new Object[0], bVar4);
                            bVar4.X(false);
                        }
                        i060 i060VarC = j060.c(2.0f);
                        alb0 alb0VarA = alb0.a(sya.e, null, new umz(f, 0.0f, f, 0.0f), 0L, 0.0f, 27);
                        ak5 ak5VarA = sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVar4), 0L, 0L, 0L, bVar4, 24576, 14);
                        d dVarH = g3w.h(h.j(aVar6, 0.0f, 8.0f, f, 8.0f, 1), "tooltip_action_button");
                        if ((i10 & 458752) == 131072) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objY3 = bVar4.y();
                        if (!z4 || objY3 == c0042a3) {
                            function8 = function7;
                            objY3 = new oa4(function8, 2);
                            bVar4.r(objY3);
                        } else {
                            function8 = function7;
                        }
                        xya.b(dVarH, false, ak5VarA, alb0VarA, i060VarC, Float.NaN, null, (Function0) objY3, pp8.b(-501882249, new gaj() { // from class: dqc0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                a aVar8 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((e160) obj).getClass();
                                if (aVar8.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    lkf0.d(strA, g3w.h(d.a.b, "tooltip_action_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar8), c68.a(R.color.text_inverse_primary, aVar8), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar8, 48, 0, 131068);
                                } else {
                                    aVar8.G();
                                }
                                return Unit.a;
                            }
                        }, bVar4), bVar4, 100859904, 66);
                        bVarI = bVar4;
                        bVarI.X(true);
                        bVarI.X(true);
                        if (i == 1) {
                            bVarI.N(1385495202);
                            d dVarA2 = k78.a(aVar3, h.j(j.i(aVar6, 10.0f), 50.0f, 0.0f, 0.0f, 0.0f, 14));
                            j4 = j3;
                            zE = bVarI.e(j4);
                            objY4 = bVarI.y();
                            if (zE || objY4 == c0042a3) {
                                objY4 = new Function1() { // from class: eqc0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        tcf tcfVar = (tcf) obj;
                                        tcfVar.getClass();
                                        float fC1 = tcfVar.C1(10.0f);
                                        float fC2 = tcfVar.C1(12.0f);
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                        j90 j90VarA = m90.a();
                                        float f4 = fC2 / 2.0f;
                                        j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                        j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                        j90VarA.c(fIntBitsToFloat, fC1);
                                        j90VarA.close();
                                        tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                        return Unit.a;
                                    }
                                };
                                bVarI.r(objY4);
                            }
                            rxo.b(dVarA2, (Function1) objY4, bVarI, 0);
                            bVarI.X(false);
                        } else {
                            j4 = j3;
                            bVarI.N(1386144838);
                            bVarI.X(false);
                        }
                        bVarI.X(true);
                        function5 = function3;
                        j2 = j4;
                        dVar3 = dVar4;
                        function4 = function8;
                    }
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    yka.a.c cVar2 = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar2);
                    c0042a = a.C0041a.a;
                    if (i != 1) {
                        bVarI.N(1380219002);
                        if (i == 2) {
                            f2 = 0.0f;
                        } else {
                            f2 = 50.0f;
                        }
                        if (i == 2) {
                            f3 = 50.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (i == 2) {
                            aVar7 = ht.a.o;
                        } else {
                            aVar7 = aVar3;
                        }
                        d dVarA3 = k78.a(aVar7, h.j(j.i(aVar2, 10.0f), f2, 0.0f, f3, 0.0f, 10));
                        zE2 = bVarI.e(jA);
                        objY5 = bVarI.y();
                        if (zE2) {
                            objY5 = new Function1() { // from class: xpc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, fC1);
                                    j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                    j90VarA.c(fIntBitsToFloat, 0.0f);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        } else {
                            objY5 = new Function1() { // from class: xpc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, fC1);
                                    j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                    j90VarA.c(fIntBitsToFloat, 0.0f);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        }
                        i11 = 0;
                        rxo.b(dVarA3, (Function1) objY5, bVarI, 0);
                        bVarI.X(false);
                    } else {
                        i11 = 0;
                        bVarI.N(1381122342);
                        bVarI.X(false);
                    }
                    d dVarB3 = androidx.compose.foundation.a.b(aVar2, jA, j060.c(2.0f));
                    i78 i78VarA3 = g78.a(kVar, aVar3, bVarI, i11);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS5 = bVarI.S();
                    d dVarC5 = c.c(bVarI, dVarB3);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA3, bVar5);
                    hlh0.a(bVarI, ne00VarS5, dVar5);
                    if (bVarI.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC5, cVar2);
                    d dVarJ2 = h.j(aVar2, 12.0f, 8.0f, 12.0f, 0.0f, 8);
                    kw0.g gVar2 = kw0.g;
                    bVar = ht.a.k;
                    j3 = jA;
                    d160 d160VarA3 = b160.a(gVar2, bVar, bVarI, 54);
                    iHashCode3 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS6 = bVarI.S();
                    d dVarC6 = c.c(bVarI, dVarJ2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA3, bVar5);
                    hlh0.a(bVarI, ne00VarS6, dVar5);
                    if (bVarI.S) {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC6, cVar2);
                    imf0 imf0VarB3 = imf0.b(mla.l(R.style.B2_M, bVarI), c68.a(R.color.text_inverse_tertiary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                    f160Var = f160.a;
                    c1350a3 = c1350a2;
                    lkf0.d(str, g3w.h(f160Var.a(0.8f, aVar2, true), "tooltip_title_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, imf0VarB3, bVarI, (i10 >> 9) & 14, 24576, 114684);
                    bVar2 = bVarI;
                    if (function2 == null) {
                        bVar2.N(2067097152);
                        bVar2.X(false);
                        aVar5 = aVar2;
                        c0042a3 = c0042a;
                    } else {
                        bVar2.N(2067097153);
                        crz crzVarA2 = erz.a(R.drawable.ic_cancel, 0, bVar2);
                        d dVarR2 = j.r(aVar2, 16.0f);
                        zM = bVar2.M(function2);
                        objY = bVar2.y();
                        if (zM) {
                            c0042a2 = c0042a;
                            if (objY == c0042a2) {
                                z2 = true;
                            }
                            aVar5 = aVar2;
                            c0042a3 = c0042a2;
                            h6n.b(crzVarA2, "Close icon", g3w.h(g3w.f(dVarR2, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                            Unit unit4 = Unit.a;
                            bVar2.X(false);
                        } else {
                            c0042a2 = c0042a;
                        }
                        z2 = true;
                        objY = new s3n(function2, 1);
                        bVar2.r(objY);
                        aVar5 = aVar2;
                        c0042a3 = c0042a2;
                        h6n.b(crzVarA2, "Close icon", g3w.h(g3w.f(dVarR2, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        Unit unit5 = Unit.a;
                        bVar2.X(false);
                    }
                    bVar2.X(true);
                    d160 d160VarA4 = b160.a(gVar2, bVar, bVar2, 54);
                    iHashCode4 = Long.hashCode(bVar2.T);
                    ne00 ne00VarS7 = bVar2.S();
                    d dVarC7 = c.c(bVar2, aVar5);
                    bVar2.D();
                    aVar6 = aVar5;
                    if (bVar2.S) {
                        bVar2.F(aVar4);
                    } else {
                        bVar2.p();
                    }
                    hlh0.a(bVar2, d160VarA4, bVar5);
                    hlh0.a(bVar2, ne00VarS7, dVar5);
                    if (bVar2.S) {
                        n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                    } else {
                        n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                    }
                    hlh0.a(bVar2, dVarC7, cVar2);
                    if (function3 == null) {
                        bVar2.N(-1556976574);
                        i12 = 0;
                        bVar2.X(false);
                        bVar3 = bVar;
                        f = 12.0f;
                        f160Var2 = f160Var;
                    } else {
                        bVar2.N(-1556976573);
                        String strA3 = cb40.a(R.string.common_functions__back, new Object[0], bVar2);
                        imf0 imf0VarB4 = imf0.b(mla.l(R.style.B2_M, bVar2), c68.a(R.color.bg_brand_sub_primary_d_base, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                        f = 12.0f;
                        f160Var2 = f160Var;
                        d dVarB4 = f160Var2.b(h.j(aVar6, 12.0f, 0.0f, 0.0f, 0.0f, 14), bVar);
                        zM2 = bVar2.M(function3);
                        objY2 = bVar2.y();
                        if (zM2) {
                            z3 = true;
                            objY2 = new ccw(function3, 1);
                            bVar2.r(objY2);
                        } else {
                            z3 = true;
                            objY2 = new ccw(function3, 1);
                            bVar2.r(objY2);
                        }
                        bVar3 = bVar;
                        lkf0.d(strA3, g3w.h(g3w.f(dVarB4, z3, (Function0) objY2), "tooltip_back_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarB4, bVar2, 0, 0, 130044);
                        bVar2 = bVar2;
                        Unit unit6 = Unit.a;
                        i12 = 0;
                        bVar2.X(false);
                    }
                    bVar4 = bVar2;
                    lkf0.d(i + " " + cb40.a(R.string.common_functions__of, new Object[i12], bVar2) + " 3", g3w.h(f160Var2.b(f160Var2.a(1.0f, aVar6, true), bVar3), "tooltip_step_count_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.C1_R, bVar2), c68.a(R.color.text_secondary, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVar4, 0, 0, 130044);
                    if (i == 3) {
                        bVar4.N(-1555648130);
                        strA = cb40.a(R.string.common_functions__done, new Object[0], bVar4);
                        bVar4.X(false);
                    } else {
                        bVar4.N(-1555555874);
                        strA = cb40.a(R.string.common_functions__next, new Object[0], bVar4);
                        bVar4.X(false);
                    }
                    i060 i060VarC2 = j060.c(2.0f);
                    alb0 alb0VarA2 = alb0.a(sya.e, null, new umz(f, 0.0f, f, 0.0f), 0L, 0.0f, 27);
                    ak5 ak5VarA2 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVar4), 0L, 0L, 0L, bVar4, 24576, 14);
                    d dVarH2 = g3w.h(h.j(aVar6, 0.0f, 8.0f, f, 8.0f, 1), "tooltip_action_button");
                    if ((i10 & 458752) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objY3 = bVar4.y();
                    if (z4) {
                        function8 = function7;
                        objY3 = new oa4(function8, 2);
                        bVar4.r(objY3);
                    } else {
                        function8 = function7;
                        objY3 = new oa4(function8, 2);
                        bVar4.r(objY3);
                    }
                    xya.b(dVarH2, false, ak5VarA2, alb0VarA2, i060VarC2, Float.NaN, null, (Function0) objY3, pp8.b(-501882249, new gaj() { // from class: dqc0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar8 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((e160) obj).getClass();
                            if (aVar8.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                lkf0.d(strA, g3w.h(d.a.b, "tooltip_action_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar8), c68.a(R.color.text_inverse_primary, aVar8), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar8, 48, 0, 131068);
                            } else {
                                aVar8.G();
                            }
                            return Unit.a;
                        }
                    }, bVar4), bVar4, 100859904, 66);
                    bVarI = bVar4;
                    bVarI.X(true);
                    bVarI.X(true);
                    if (i == 1) {
                        bVarI.N(1385495202);
                        d dVarA4 = k78.a(aVar3, h.j(j.i(aVar6, 10.0f), 50.0f, 0.0f, 0.0f, 0.0f, 14));
                        j4 = j3;
                        zE = bVarI.e(j4);
                        objY4 = bVarI.y();
                        if (zE) {
                            objY4 = new Function1() { // from class: eqc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                    j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                    j90VarA.c(fIntBitsToFloat, fC1);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY4);
                        } else {
                            objY4 = new Function1() { // from class: eqc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                    j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                    j90VarA.c(fIntBitsToFloat, fC1);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY4);
                        }
                        rxo.b(dVarA4, (Function1) objY4, bVarI, 0);
                        bVarI.X(false);
                    } else {
                        j4 = j3;
                        bVarI.N(1386144838);
                        bVarI.X(false);
                    }
                    bVarI.X(true);
                    function5 = function3;
                    j2 = j4;
                    dVar3 = dVar4;
                    function4 = function8;
                } else {
                    bVarI.G();
                    function4 = function1;
                    dVar3 = dVar2;
                    function5 = function3;
                    j2 = j;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: fqc0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            iqc0.b(dVar3, i, str, function5, function4, function2, j2, (a) obj, qj40.a(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i15 |= 196608;
            if ((1572864 & i2) == 0) {
                if (bVarI.A(function2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i15 |= i13;
            }
            i7 = i15 | 4194304;
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                bVarI.A0();
                i8 = i2 & 1;
                aVar2 = d.a.b;
                if (i8 != 0) {
                    if (i14 != 0) {
                        dVar2 = aVar2;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    }
                    if (i5 == 0) {
                    }
                    i9 = i7 & (-29360129);
                    jA = c68.a(R.color.bg_primary_d_lightest, bVarI);
                } else {
                    if (i14 != 0) {
                        dVar2 = aVar2;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    }
                    if (i5 == 0) {
                    }
                    i9 = i7 & (-29360129);
                    jA = c68.a(R.color.bg_primary_d_lightest, bVarI);
                }
                bVarI.Y();
                d dVarG2 = j.g(dVar2, 1.0f);
                kw0.k kVar2 = kw0.c;
                aVar3 = ht.a.m;
                d dVar6 = dVar2;
                i78 i78VarA4 = g78.a(kVar2, aVar3, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS8 = bVarI.S();
                d dVarC8 = c.c(bVarI, dVarG2);
                yka.k.getClass();
                i10 = i9;
                aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar6 = yka.a.f;
                hlh0.a(bVarI, i78VarA4, bVar6);
                yka.a.d dVar7 = yka.a.e;
                hlh0.a(bVarI, ne00VarS8, dVar7);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    function7 = function6;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar3 = yka.a.d;
                    hlh0.a(bVarI, dVarC8, cVar3);
                    c0042a = a.C0041a.a;
                    if (i != 1) {
                        bVarI.N(1380219002);
                        if (i == 2) {
                            f2 = 0.0f;
                        } else {
                            f2 = 50.0f;
                        }
                        if (i == 2) {
                            f3 = 50.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (i == 2) {
                            aVar7 = ht.a.o;
                        } else {
                            aVar7 = aVar3;
                        }
                        d dVarA5 = k78.a(aVar7, h.j(j.i(aVar2, 10.0f), f2, 0.0f, f3, 0.0f, 10));
                        zE2 = bVarI.e(jA);
                        objY5 = bVarI.y();
                        if (zE2) {
                            objY5 = new Function1() { // from class: xpc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, fC1);
                                    j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                    j90VarA.c(fIntBitsToFloat, 0.0f);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        } else {
                            objY5 = new Function1() { // from class: xpc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, fC1);
                                    j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                    j90VarA.c(fIntBitsToFloat, 0.0f);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        }
                        i11 = 0;
                        rxo.b(dVarA5, (Function1) objY5, bVarI, 0);
                        bVarI.X(false);
                    } else {
                        i11 = 0;
                        bVarI.N(1381122342);
                        bVarI.X(false);
                    }
                    d dVarB5 = androidx.compose.foundation.a.b(aVar2, jA, j060.c(2.0f));
                    i78 i78VarA5 = g78.a(kVar2, aVar3, bVarI, i11);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS9 = bVarI.S();
                    d dVarC9 = c.c(bVarI, dVarB5);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA5, bVar6);
                    hlh0.a(bVarI, ne00VarS9, dVar7);
                    if (bVarI.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC9, cVar3);
                    d dVarJ3 = h.j(aVar2, 12.0f, 8.0f, 12.0f, 0.0f, 8);
                    kw0.g gVar3 = kw0.g;
                    bVar = ht.a.k;
                    j3 = jA;
                    d160 d160VarA5 = b160.a(gVar3, bVar, bVarI, 54);
                    iHashCode3 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS10 = bVarI.S();
                    d dVarC10 = c.c(bVarI, dVarJ3);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA5, bVar6);
                    hlh0.a(bVarI, ne00VarS10, dVar7);
                    if (bVarI.S) {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC10, cVar3);
                    imf0 imf0VarB5 = imf0.b(mla.l(R.style.B2_M, bVarI), c68.a(R.color.text_inverse_tertiary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                    f160Var = f160.a;
                    c1350a3 = c1350a2;
                    lkf0.d(str, g3w.h(f160Var.a(0.8f, aVar2, true), "tooltip_title_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, imf0VarB5, bVarI, (i10 >> 9) & 14, 24576, 114684);
                    bVar2 = bVarI;
                    if (function2 == null) {
                        bVar2.N(2067097152);
                        bVar2.X(false);
                        aVar5 = aVar2;
                        c0042a3 = c0042a;
                    } else {
                        bVar2.N(2067097153);
                        crz crzVarA3 = erz.a(R.drawable.ic_cancel, 0, bVar2);
                        d dVarR3 = j.r(aVar2, 16.0f);
                        zM = bVar2.M(function2);
                        objY = bVar2.y();
                        if (zM) {
                            c0042a2 = c0042a;
                            if (objY == c0042a2) {
                                z2 = true;
                            }
                            aVar5 = aVar2;
                            c0042a3 = c0042a2;
                            h6n.b(crzVarA3, "Close icon", g3w.h(g3w.f(dVarR3, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                            Unit unit7 = Unit.a;
                            bVar2.X(false);
                        } else {
                            c0042a2 = c0042a;
                        }
                        z2 = true;
                        objY = new s3n(function2, 1);
                        bVar2.r(objY);
                        aVar5 = aVar2;
                        c0042a3 = c0042a2;
                        h6n.b(crzVarA3, "Close icon", g3w.h(g3w.f(dVarR3, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        Unit unit8 = Unit.a;
                        bVar2.X(false);
                    }
                    bVar2.X(true);
                    d160 d160VarA6 = b160.a(gVar3, bVar, bVar2, 54);
                    iHashCode4 = Long.hashCode(bVar2.T);
                    ne00 ne00VarS11 = bVar2.S();
                    d dVarC11 = c.c(bVar2, aVar5);
                    bVar2.D();
                    aVar6 = aVar5;
                    if (bVar2.S) {
                        bVar2.F(aVar4);
                    } else {
                        bVar2.p();
                    }
                    hlh0.a(bVar2, d160VarA6, bVar6);
                    hlh0.a(bVar2, ne00VarS11, dVar7);
                    if (bVar2.S) {
                        n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                    } else {
                        n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                    }
                    hlh0.a(bVar2, dVarC11, cVar3);
                    if (function3 == null) {
                        bVar2.N(-1556976574);
                        i12 = 0;
                        bVar2.X(false);
                        bVar3 = bVar;
                        f = 12.0f;
                        f160Var2 = f160Var;
                    } else {
                        bVar2.N(-1556976573);
                        String strA4 = cb40.a(R.string.common_functions__back, new Object[0], bVar2);
                        imf0 imf0VarB6 = imf0.b(mla.l(R.style.B2_M, bVar2), c68.a(R.color.bg_brand_sub_primary_d_base, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                        f = 12.0f;
                        f160Var2 = f160Var;
                        d dVarB6 = f160Var2.b(h.j(aVar6, 12.0f, 0.0f, 0.0f, 0.0f, 14), bVar);
                        zM2 = bVar2.M(function3);
                        objY2 = bVar2.y();
                        if (zM2) {
                            z3 = true;
                            objY2 = new ccw(function3, 1);
                            bVar2.r(objY2);
                        } else {
                            z3 = true;
                            objY2 = new ccw(function3, 1);
                            bVar2.r(objY2);
                        }
                        bVar3 = bVar;
                        lkf0.d(strA4, g3w.h(g3w.f(dVarB6, z3, (Function0) objY2), "tooltip_back_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarB6, bVar2, 0, 0, 130044);
                        bVar2 = bVar2;
                        Unit unit9 = Unit.a;
                        i12 = 0;
                        bVar2.X(false);
                    }
                    bVar4 = bVar2;
                    lkf0.d(i + " " + cb40.a(R.string.common_functions__of, new Object[i12], bVar2) + " 3", g3w.h(f160Var2.b(f160Var2.a(1.0f, aVar6, true), bVar3), "tooltip_step_count_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.C1_R, bVar2), c68.a(R.color.text_secondary, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVar4, 0, 0, 130044);
                    if (i == 3) {
                        bVar4.N(-1555648130);
                        strA = cb40.a(R.string.common_functions__done, new Object[0], bVar4);
                        bVar4.X(false);
                    } else {
                        bVar4.N(-1555555874);
                        strA = cb40.a(R.string.common_functions__next, new Object[0], bVar4);
                        bVar4.X(false);
                    }
                    i060 i060VarC3 = j060.c(2.0f);
                    alb0 alb0VarA3 = alb0.a(sya.e, null, new umz(f, 0.0f, f, 0.0f), 0L, 0.0f, 27);
                    ak5 ak5VarA3 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVar4), 0L, 0L, 0L, bVar4, 24576, 14);
                    d dVarH3 = g3w.h(h.j(aVar6, 0.0f, 8.0f, f, 8.0f, 1), "tooltip_action_button");
                    if ((i10 & 458752) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objY3 = bVar4.y();
                    if (z4) {
                        function8 = function7;
                        objY3 = new oa4(function8, 2);
                        bVar4.r(objY3);
                    } else {
                        function8 = function7;
                        objY3 = new oa4(function8, 2);
                        bVar4.r(objY3);
                    }
                    xya.b(dVarH3, false, ak5VarA3, alb0VarA3, i060VarC3, Float.NaN, null, (Function0) objY3, pp8.b(-501882249, new gaj() { // from class: dqc0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar8 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((e160) obj).getClass();
                            if (aVar8.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                lkf0.d(strA, g3w.h(d.a.b, "tooltip_action_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar8), c68.a(R.color.text_inverse_primary, aVar8), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar8, 48, 0, 131068);
                            } else {
                                aVar8.G();
                            }
                            return Unit.a;
                        }
                    }, bVar4), bVar4, 100859904, 66);
                    bVarI = bVar4;
                    bVarI.X(true);
                    bVarI.X(true);
                    if (i == 1) {
                        bVarI.N(1385495202);
                        d dVarA6 = k78.a(aVar3, h.j(j.i(aVar6, 10.0f), 50.0f, 0.0f, 0.0f, 0.0f, 14));
                        j4 = j3;
                        zE = bVarI.e(j4);
                        objY4 = bVarI.y();
                        if (zE) {
                            objY4 = new Function1() { // from class: eqc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                    j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                    j90VarA.c(fIntBitsToFloat, fC1);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY4);
                        } else {
                            objY4 = new Function1() { // from class: eqc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                    j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                    j90VarA.c(fIntBitsToFloat, fC1);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY4);
                        }
                        rxo.b(dVarA6, (Function1) objY4, bVarI, 0);
                        bVarI.X(false);
                    } else {
                        j4 = j3;
                        bVarI.N(1386144838);
                        bVarI.X(false);
                    }
                    bVarI.X(true);
                    function5 = function3;
                    j2 = j4;
                    dVar3 = dVar6;
                    function4 = function8;
                } else {
                    function7 = function6;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar4 = yka.a.d;
                hlh0.a(bVarI, dVarC8, cVar4);
                c0042a = a.C0041a.a;
                if (i != 1) {
                    bVarI.N(1380219002);
                    if (i == 2) {
                        f2 = 0.0f;
                    } else {
                        f2 = 50.0f;
                    }
                    if (i == 2) {
                        f3 = 50.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (i == 2) {
                        aVar7 = ht.a.o;
                    } else {
                        aVar7 = aVar3;
                    }
                    d dVarA7 = k78.a(aVar7, h.j(j.i(aVar2, 10.0f), f2, 0.0f, f3, 0.0f, 10));
                    zE2 = bVarI.e(jA);
                    objY5 = bVarI.y();
                    if (zE2) {
                        objY5 = new Function1() { // from class: xpc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, fC1);
                                j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                j90VarA.c(fIntBitsToFloat, 0.0f);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: xpc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, fC1);
                                j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                j90VarA.c(fIntBitsToFloat, 0.0f);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    i11 = 0;
                    rxo.b(dVarA7, (Function1) objY5, bVarI, 0);
                    bVarI.X(false);
                } else {
                    i11 = 0;
                    bVarI.N(1381122342);
                    bVarI.X(false);
                }
                d dVarB7 = androidx.compose.foundation.a.b(aVar2, jA, j060.c(2.0f));
                i78 i78VarA6 = g78.a(kVar2, aVar3, bVarI, i11);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS12 = bVarI.S();
                d dVarC12 = c.c(bVarI, dVarB7);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA6, bVar6);
                hlh0.a(bVarI, ne00VarS12, dVar7);
                if (bVarI.S) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC12, cVar4);
                d dVarJ4 = h.j(aVar2, 12.0f, 8.0f, 12.0f, 0.0f, 8);
                kw0.g gVar4 = kw0.g;
                bVar = ht.a.k;
                j3 = jA;
                d160 d160VarA7 = b160.a(gVar4, bVar, bVarI, 54);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS13 = bVarI.S();
                d dVarC13 = c.c(bVarI, dVarJ4);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA7, bVar6);
                hlh0.a(bVarI, ne00VarS13, dVar7);
                if (bVarI.S) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                }
                hlh0.a(bVarI, dVarC13, cVar4);
                imf0 imf0VarB7 = imf0.b(mla.l(R.style.B2_M, bVarI), c68.a(R.color.text_inverse_tertiary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                f160Var = f160.a;
                c1350a3 = c1350a2;
                lkf0.d(str, g3w.h(f160Var.a(0.8f, aVar2, true), "tooltip_title_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, imf0VarB7, bVarI, (i10 >> 9) & 14, 24576, 114684);
                bVar2 = bVarI;
                if (function2 == null) {
                    bVar2.N(2067097152);
                    bVar2.X(false);
                    aVar5 = aVar2;
                    c0042a3 = c0042a;
                } else {
                    bVar2.N(2067097153);
                    crz crzVarA4 = erz.a(R.drawable.ic_cancel, 0, bVar2);
                    d dVarR4 = j.r(aVar2, 16.0f);
                    zM = bVar2.M(function2);
                    objY = bVar2.y();
                    if (zM) {
                        c0042a2 = c0042a;
                        if (objY == c0042a2) {
                            z2 = true;
                        }
                        aVar5 = aVar2;
                        c0042a3 = c0042a2;
                        h6n.b(crzVarA4, "Close icon", g3w.h(g3w.f(dVarR4, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        Unit unit10 = Unit.a;
                        bVar2.X(false);
                    } else {
                        c0042a2 = c0042a;
                    }
                    z2 = true;
                    objY = new s3n(function2, 1);
                    bVar2.r(objY);
                    aVar5 = aVar2;
                    c0042a3 = c0042a2;
                    h6n.b(crzVarA4, "Close icon", g3w.h(g3w.f(dVarR4, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                    Unit unit11 = Unit.a;
                    bVar2.X(false);
                }
                bVar2.X(true);
                d160 d160VarA8 = b160.a(gVar4, bVar, bVar2, 54);
                iHashCode4 = Long.hashCode(bVar2.T);
                ne00 ne00VarS14 = bVar2.S();
                d dVarC14 = c.c(bVar2, aVar5);
                bVar2.D();
                aVar6 = aVar5;
                if (bVar2.S) {
                    bVar2.F(aVar4);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, d160VarA8, bVar6);
                hlh0.a(bVar2, ne00VarS14, dVar7);
                if (bVar2.S) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                } else {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                }
                hlh0.a(bVar2, dVarC14, cVar4);
                if (function3 == null) {
                    bVar2.N(-1556976574);
                    i12 = 0;
                    bVar2.X(false);
                    bVar3 = bVar;
                    f = 12.0f;
                    f160Var2 = f160Var;
                } else {
                    bVar2.N(-1556976573);
                    String strA5 = cb40.a(R.string.common_functions__back, new Object[0], bVar2);
                    imf0 imf0VarB8 = imf0.b(mla.l(R.style.B2_M, bVar2), c68.a(R.color.bg_brand_sub_primary_d_base, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                    f = 12.0f;
                    f160Var2 = f160Var;
                    d dVarB8 = f160Var2.b(h.j(aVar6, 12.0f, 0.0f, 0.0f, 0.0f, 14), bVar);
                    zM2 = bVar2.M(function3);
                    objY2 = bVar2.y();
                    if (zM2) {
                        z3 = true;
                        objY2 = new ccw(function3, 1);
                        bVar2.r(objY2);
                    } else {
                        z3 = true;
                        objY2 = new ccw(function3, 1);
                        bVar2.r(objY2);
                    }
                    bVar3 = bVar;
                    lkf0.d(strA5, g3w.h(g3w.f(dVarB8, z3, (Function0) objY2), "tooltip_back_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarB8, bVar2, 0, 0, 130044);
                    bVar2 = bVar2;
                    Unit unit12 = Unit.a;
                    i12 = 0;
                    bVar2.X(false);
                }
                bVar4 = bVar2;
                lkf0.d(i + " " + cb40.a(R.string.common_functions__of, new Object[i12], bVar2) + " 3", g3w.h(f160Var2.b(f160Var2.a(1.0f, aVar6, true), bVar3), "tooltip_step_count_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.C1_R, bVar2), c68.a(R.color.text_secondary, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVar4, 0, 0, 130044);
                if (i == 3) {
                    bVar4.N(-1555648130);
                    strA = cb40.a(R.string.common_functions__done, new Object[0], bVar4);
                    bVar4.X(false);
                } else {
                    bVar4.N(-1555555874);
                    strA = cb40.a(R.string.common_functions__next, new Object[0], bVar4);
                    bVar4.X(false);
                }
                i060 i060VarC4 = j060.c(2.0f);
                alb0 alb0VarA4 = alb0.a(sya.e, null, new umz(f, 0.0f, f, 0.0f), 0L, 0.0f, 27);
                ak5 ak5VarA4 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVar4), 0L, 0L, 0L, bVar4, 24576, 14);
                d dVarH4 = g3w.h(h.j(aVar6, 0.0f, 8.0f, f, 8.0f, 1), "tooltip_action_button");
                if ((i10 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objY3 = bVar4.y();
                if (z4) {
                    function8 = function7;
                    objY3 = new oa4(function8, 2);
                    bVar4.r(objY3);
                } else {
                    function8 = function7;
                    objY3 = new oa4(function8, 2);
                    bVar4.r(objY3);
                }
                xya.b(dVarH4, false, ak5VarA4, alb0VarA4, i060VarC4, Float.NaN, null, (Function0) objY3, pp8.b(-501882249, new gaj() { // from class: dqc0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar8 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar8.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            lkf0.d(strA, g3w.h(d.a.b, "tooltip_action_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar8), c68.a(R.color.text_inverse_primary, aVar8), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar8, 48, 0, 131068);
                        } else {
                            aVar8.G();
                        }
                        return Unit.a;
                    }
                }, bVar4), bVar4, 100859904, 66);
                bVarI = bVar4;
                bVarI.X(true);
                bVarI.X(true);
                if (i == 1) {
                    bVarI.N(1385495202);
                    d dVarA8 = k78.a(aVar3, h.j(j.i(aVar6, 10.0f), 50.0f, 0.0f, 0.0f, 0.0f, 14));
                    j4 = j3;
                    zE = bVarI.e(j4);
                    objY4 = bVarI.y();
                    if (zE) {
                        objY4 = new Function1() { // from class: eqc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                j90VarA.c(fIntBitsToFloat, fC1);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    } else {
                        objY4 = new Function1() { // from class: eqc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                j90VarA.c(fIntBitsToFloat, fC1);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    rxo.b(dVarA8, (Function1) objY4, bVarI, 0);
                    bVarI.X(false);
                } else {
                    j4 = j3;
                    bVarI.N(1386144838);
                    bVarI.X(false);
                }
                bVarI.X(true);
                function5 = function3;
                j2 = j4;
                dVar3 = dVar6;
                function4 = function8;
            } else {
                bVarI.G();
                function4 = function1;
                dVar3 = dVar2;
                function5 = function3;
                j2 = j;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: fqc0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iqc0.b(dVar3, i, str, function5, function4, function2, j2, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i15 |= 24576;
        function3 = function0;
        i5 = i3 & 32;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                if (bVarI.A(function1)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i15 |= i6;
            }
            if ((1572864 & i2) == 0) {
                if (bVarI.A(function2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i15 |= i13;
            }
            i7 = i15 | 4194304;
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                bVarI.A0();
                i8 = i2 & 1;
                aVar2 = d.a.b;
                if (i8 != 0) {
                    if (i14 != 0) {
                        dVar2 = aVar2;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    }
                    if (i5 == 0) {
                    }
                    i9 = i7 & (-29360129);
                    jA = c68.a(R.color.bg_primary_d_lightest, bVarI);
                } else {
                    if (i14 != 0) {
                        dVar2 = aVar2;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    }
                    if (i5 == 0) {
                    }
                    i9 = i7 & (-29360129);
                    jA = c68.a(R.color.bg_primary_d_lightest, bVarI);
                }
                bVarI.Y();
                d dVarG3 = j.g(dVar2, 1.0f);
                kw0.k kVar3 = kw0.c;
                aVar3 = ht.a.m;
                d dVar8 = dVar2;
                i78 i78VarA7 = g78.a(kVar3, aVar3, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS15 = bVarI.S();
                d dVarC15 = c.c(bVarI, dVarG3);
                yka.k.getClass();
                i10 = i9;
                aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar7 = yka.a.f;
                hlh0.a(bVarI, i78VarA7, bVar7);
                yka.a.d dVar9 = yka.a.e;
                hlh0.a(bVarI, ne00VarS15, dVar9);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    function7 = function6;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar5 = yka.a.d;
                    hlh0.a(bVarI, dVarC15, cVar5);
                    c0042a = a.C0041a.a;
                    if (i != 1) {
                        bVarI.N(1380219002);
                        if (i == 2) {
                            f2 = 0.0f;
                        } else {
                            f2 = 50.0f;
                        }
                        if (i == 2) {
                            f3 = 50.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (i == 2) {
                            aVar7 = ht.a.o;
                        } else {
                            aVar7 = aVar3;
                        }
                        d dVarA9 = k78.a(aVar7, h.j(j.i(aVar2, 10.0f), f2, 0.0f, f3, 0.0f, 10));
                        zE2 = bVarI.e(jA);
                        objY5 = bVarI.y();
                        if (zE2) {
                            objY5 = new Function1() { // from class: xpc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, fC1);
                                    j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                    j90VarA.c(fIntBitsToFloat, 0.0f);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        } else {
                            objY5 = new Function1() { // from class: xpc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, fC1);
                                    j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                    j90VarA.c(fIntBitsToFloat, 0.0f);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        }
                        i11 = 0;
                        rxo.b(dVarA9, (Function1) objY5, bVarI, 0);
                        bVarI.X(false);
                    } else {
                        i11 = 0;
                        bVarI.N(1381122342);
                        bVarI.X(false);
                    }
                    d dVarB9 = androidx.compose.foundation.a.b(aVar2, jA, j060.c(2.0f));
                    i78 i78VarA8 = g78.a(kVar3, aVar3, bVarI, i11);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS16 = bVarI.S();
                    d dVarC16 = c.c(bVarI, dVarB9);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA8, bVar7);
                    hlh0.a(bVarI, ne00VarS16, dVar9);
                    if (bVarI.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC16, cVar5);
                    d dVarJ5 = h.j(aVar2, 12.0f, 8.0f, 12.0f, 0.0f, 8);
                    kw0.g gVar5 = kw0.g;
                    bVar = ht.a.k;
                    j3 = jA;
                    d160 d160VarA9 = b160.a(gVar5, bVar, bVarI, 54);
                    iHashCode3 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS17 = bVarI.S();
                    d dVarC17 = c.c(bVarI, dVarJ5);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA9, bVar7);
                    hlh0.a(bVarI, ne00VarS17, dVar9);
                    if (bVarI.S) {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC17, cVar5);
                    imf0 imf0VarB9 = imf0.b(mla.l(R.style.B2_M, bVarI), c68.a(R.color.text_inverse_tertiary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                    f160Var = f160.a;
                    c1350a3 = c1350a2;
                    lkf0.d(str, g3w.h(f160Var.a(0.8f, aVar2, true), "tooltip_title_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, imf0VarB9, bVarI, (i10 >> 9) & 14, 24576, 114684);
                    bVar2 = bVarI;
                    if (function2 == null) {
                        bVar2.N(2067097152);
                        bVar2.X(false);
                        aVar5 = aVar2;
                        c0042a3 = c0042a;
                    } else {
                        bVar2.N(2067097153);
                        crz crzVarA5 = erz.a(R.drawable.ic_cancel, 0, bVar2);
                        d dVarR5 = j.r(aVar2, 16.0f);
                        zM = bVar2.M(function2);
                        objY = bVar2.y();
                        if (zM) {
                            c0042a2 = c0042a;
                            if (objY == c0042a2) {
                                z2 = true;
                            }
                            aVar5 = aVar2;
                            c0042a3 = c0042a2;
                            h6n.b(crzVarA5, "Close icon", g3w.h(g3w.f(dVarR5, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                            Unit unit13 = Unit.a;
                            bVar2.X(false);
                        } else {
                            c0042a2 = c0042a;
                        }
                        z2 = true;
                        objY = new s3n(function2, 1);
                        bVar2.r(objY);
                        aVar5 = aVar2;
                        c0042a3 = c0042a2;
                        h6n.b(crzVarA5, "Close icon", g3w.h(g3w.f(dVarR5, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        Unit unit14 = Unit.a;
                        bVar2.X(false);
                    }
                    bVar2.X(true);
                    d160 d160VarA10 = b160.a(gVar5, bVar, bVar2, 54);
                    iHashCode4 = Long.hashCode(bVar2.T);
                    ne00 ne00VarS18 = bVar2.S();
                    d dVarC18 = c.c(bVar2, aVar5);
                    bVar2.D();
                    aVar6 = aVar5;
                    if (bVar2.S) {
                        bVar2.F(aVar4);
                    } else {
                        bVar2.p();
                    }
                    hlh0.a(bVar2, d160VarA10, bVar7);
                    hlh0.a(bVar2, ne00VarS18, dVar9);
                    if (bVar2.S) {
                        n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                    } else {
                        n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                    }
                    hlh0.a(bVar2, dVarC18, cVar5);
                    if (function3 == null) {
                        bVar2.N(-1556976574);
                        i12 = 0;
                        bVar2.X(false);
                        bVar3 = bVar;
                        f = 12.0f;
                        f160Var2 = f160Var;
                    } else {
                        bVar2.N(-1556976573);
                        String strA6 = cb40.a(R.string.common_functions__back, new Object[0], bVar2);
                        imf0 imf0VarB10 = imf0.b(mla.l(R.style.B2_M, bVar2), c68.a(R.color.bg_brand_sub_primary_d_base, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                        f = 12.0f;
                        f160Var2 = f160Var;
                        d dVarB10 = f160Var2.b(h.j(aVar6, 12.0f, 0.0f, 0.0f, 0.0f, 14), bVar);
                        zM2 = bVar2.M(function3);
                        objY2 = bVar2.y();
                        if (zM2) {
                            z3 = true;
                            objY2 = new ccw(function3, 1);
                            bVar2.r(objY2);
                        } else {
                            z3 = true;
                            objY2 = new ccw(function3, 1);
                            bVar2.r(objY2);
                        }
                        bVar3 = bVar;
                        lkf0.d(strA6, g3w.h(g3w.f(dVarB10, z3, (Function0) objY2), "tooltip_back_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarB10, bVar2, 0, 0, 130044);
                        bVar2 = bVar2;
                        Unit unit15 = Unit.a;
                        i12 = 0;
                        bVar2.X(false);
                    }
                    bVar4 = bVar2;
                    lkf0.d(i + " " + cb40.a(R.string.common_functions__of, new Object[i12], bVar2) + " 3", g3w.h(f160Var2.b(f160Var2.a(1.0f, aVar6, true), bVar3), "tooltip_step_count_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.C1_R, bVar2), c68.a(R.color.text_secondary, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVar4, 0, 0, 130044);
                    if (i == 3) {
                        bVar4.N(-1555648130);
                        strA = cb40.a(R.string.common_functions__done, new Object[0], bVar4);
                        bVar4.X(false);
                    } else {
                        bVar4.N(-1555555874);
                        strA = cb40.a(R.string.common_functions__next, new Object[0], bVar4);
                        bVar4.X(false);
                    }
                    i060 i060VarC5 = j060.c(2.0f);
                    alb0 alb0VarA5 = alb0.a(sya.e, null, new umz(f, 0.0f, f, 0.0f), 0L, 0.0f, 27);
                    ak5 ak5VarA5 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVar4), 0L, 0L, 0L, bVar4, 24576, 14);
                    d dVarH5 = g3w.h(h.j(aVar6, 0.0f, 8.0f, f, 8.0f, 1), "tooltip_action_button");
                    if ((i10 & 458752) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objY3 = bVar4.y();
                    if (z4) {
                        function8 = function7;
                        objY3 = new oa4(function8, 2);
                        bVar4.r(objY3);
                    } else {
                        function8 = function7;
                        objY3 = new oa4(function8, 2);
                        bVar4.r(objY3);
                    }
                    xya.b(dVarH5, false, ak5VarA5, alb0VarA5, i060VarC5, Float.NaN, null, (Function0) objY3, pp8.b(-501882249, new gaj() { // from class: dqc0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar8 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((e160) obj).getClass();
                            if (aVar8.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                lkf0.d(strA, g3w.h(d.a.b, "tooltip_action_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar8), c68.a(R.color.text_inverse_primary, aVar8), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar8, 48, 0, 131068);
                            } else {
                                aVar8.G();
                            }
                            return Unit.a;
                        }
                    }, bVar4), bVar4, 100859904, 66);
                    bVarI = bVar4;
                    bVarI.X(true);
                    bVarI.X(true);
                    if (i == 1) {
                        bVarI.N(1385495202);
                        d dVarA10 = k78.a(aVar3, h.j(j.i(aVar6, 10.0f), 50.0f, 0.0f, 0.0f, 0.0f, 14));
                        j4 = j3;
                        zE = bVarI.e(j4);
                        objY4 = bVarI.y();
                        if (zE) {
                            objY4 = new Function1() { // from class: eqc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                    j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                    j90VarA.c(fIntBitsToFloat, fC1);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY4);
                        } else {
                            objY4 = new Function1() { // from class: eqc0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    tcf tcfVar = (tcf) obj;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(10.0f);
                                    float fC2 = tcfVar.C1(12.0f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                    j90 j90VarA = m90.a();
                                    float f4 = fC2 / 2.0f;
                                    j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                    j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                    j90VarA.c(fIntBitsToFloat, fC1);
                                    j90VarA.close();
                                    tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY4);
                        }
                        rxo.b(dVarA10, (Function1) objY4, bVarI, 0);
                        bVarI.X(false);
                    } else {
                        j4 = j3;
                        bVarI.N(1386144838);
                        bVarI.X(false);
                    }
                    bVarI.X(true);
                    function5 = function3;
                    j2 = j4;
                    dVar3 = dVar8;
                    function4 = function8;
                } else {
                    function7 = function6;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar6 = yka.a.d;
                hlh0.a(bVarI, dVarC15, cVar6);
                c0042a = a.C0041a.a;
                if (i != 1) {
                    bVarI.N(1380219002);
                    if (i == 2) {
                        f2 = 0.0f;
                    } else {
                        f2 = 50.0f;
                    }
                    if (i == 2) {
                        f3 = 50.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (i == 2) {
                        aVar7 = ht.a.o;
                    } else {
                        aVar7 = aVar3;
                    }
                    d dVarA11 = k78.a(aVar7, h.j(j.i(aVar2, 10.0f), f2, 0.0f, f3, 0.0f, 10));
                    zE2 = bVarI.e(jA);
                    objY5 = bVarI.y();
                    if (zE2) {
                        objY5 = new Function1() { // from class: xpc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, fC1);
                                j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                j90VarA.c(fIntBitsToFloat, 0.0f);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: xpc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, fC1);
                                j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                j90VarA.c(fIntBitsToFloat, 0.0f);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    i11 = 0;
                    rxo.b(dVarA11, (Function1) objY5, bVarI, 0);
                    bVarI.X(false);
                } else {
                    i11 = 0;
                    bVarI.N(1381122342);
                    bVarI.X(false);
                }
                d dVarB11 = androidx.compose.foundation.a.b(aVar2, jA, j060.c(2.0f));
                i78 i78VarA9 = g78.a(kVar3, aVar3, bVarI, i11);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS19 = bVarI.S();
                d dVarC19 = c.c(bVarI, dVarB11);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA9, bVar7);
                hlh0.a(bVarI, ne00VarS19, dVar9);
                if (bVarI.S) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC19, cVar6);
                d dVarJ6 = h.j(aVar2, 12.0f, 8.0f, 12.0f, 0.0f, 8);
                kw0.g gVar6 = kw0.g;
                bVar = ht.a.k;
                j3 = jA;
                d160 d160VarA11 = b160.a(gVar6, bVar, bVarI, 54);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS110 = bVarI.S();
                d dVarC110 = c.c(bVarI, dVarJ6);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA11, bVar7);
                hlh0.a(bVarI, ne00VarS110, dVar9);
                if (bVarI.S) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                }
                hlh0.a(bVarI, dVarC110, cVar6);
                imf0 imf0VarB11 = imf0.b(mla.l(R.style.B2_M, bVarI), c68.a(R.color.text_inverse_tertiary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                f160Var = f160.a;
                c1350a3 = c1350a2;
                lkf0.d(str, g3w.h(f160Var.a(0.8f, aVar2, true), "tooltip_title_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, imf0VarB11, bVarI, (i10 >> 9) & 14, 24576, 114684);
                bVar2 = bVarI;
                if (function2 == null) {
                    bVar2.N(2067097152);
                    bVar2.X(false);
                    aVar5 = aVar2;
                    c0042a3 = c0042a;
                } else {
                    bVar2.N(2067097153);
                    crz crzVarA6 = erz.a(R.drawable.ic_cancel, 0, bVar2);
                    d dVarR6 = j.r(aVar2, 16.0f);
                    zM = bVar2.M(function2);
                    objY = bVar2.y();
                    if (zM) {
                        c0042a2 = c0042a;
                        if (objY == c0042a2) {
                            z2 = true;
                        }
                        aVar5 = aVar2;
                        c0042a3 = c0042a2;
                        h6n.b(crzVarA6, "Close icon", g3w.h(g3w.f(dVarR6, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        Unit unit16 = Unit.a;
                        bVar2.X(false);
                    } else {
                        c0042a2 = c0042a;
                    }
                    z2 = true;
                    objY = new s3n(function2, 1);
                    bVar2.r(objY);
                    aVar5 = aVar2;
                    c0042a3 = c0042a2;
                    h6n.b(crzVarA6, "Close icon", g3w.h(g3w.f(dVarR6, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                    Unit unit17 = Unit.a;
                    bVar2.X(false);
                }
                bVar2.X(true);
                d160 d160VarA12 = b160.a(gVar6, bVar, bVar2, 54);
                iHashCode4 = Long.hashCode(bVar2.T);
                ne00 ne00VarS111 = bVar2.S();
                d dVarC111 = c.c(bVar2, aVar5);
                bVar2.D();
                aVar6 = aVar5;
                if (bVar2.S) {
                    bVar2.F(aVar4);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, d160VarA12, bVar7);
                hlh0.a(bVar2, ne00VarS111, dVar9);
                if (bVar2.S) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                } else {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                }
                hlh0.a(bVar2, dVarC111, cVar6);
                if (function3 == null) {
                    bVar2.N(-1556976574);
                    i12 = 0;
                    bVar2.X(false);
                    bVar3 = bVar;
                    f = 12.0f;
                    f160Var2 = f160Var;
                } else {
                    bVar2.N(-1556976573);
                    String strA7 = cb40.a(R.string.common_functions__back, new Object[0], bVar2);
                    imf0 imf0VarB12 = imf0.b(mla.l(R.style.B2_M, bVar2), c68.a(R.color.bg_brand_sub_primary_d_base, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                    f = 12.0f;
                    f160Var2 = f160Var;
                    d dVarB12 = f160Var2.b(h.j(aVar6, 12.0f, 0.0f, 0.0f, 0.0f, 14), bVar);
                    zM2 = bVar2.M(function3);
                    objY2 = bVar2.y();
                    if (zM2) {
                        z3 = true;
                        objY2 = new ccw(function3, 1);
                        bVar2.r(objY2);
                    } else {
                        z3 = true;
                        objY2 = new ccw(function3, 1);
                        bVar2.r(objY2);
                    }
                    bVar3 = bVar;
                    lkf0.d(strA7, g3w.h(g3w.f(dVarB12, z3, (Function0) objY2), "tooltip_back_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarB12, bVar2, 0, 0, 130044);
                    bVar2 = bVar2;
                    Unit unit18 = Unit.a;
                    i12 = 0;
                    bVar2.X(false);
                }
                bVar4 = bVar2;
                lkf0.d(i + " " + cb40.a(R.string.common_functions__of, new Object[i12], bVar2) + " 3", g3w.h(f160Var2.b(f160Var2.a(1.0f, aVar6, true), bVar3), "tooltip_step_count_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.C1_R, bVar2), c68.a(R.color.text_secondary, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVar4, 0, 0, 130044);
                if (i == 3) {
                    bVar4.N(-1555648130);
                    strA = cb40.a(R.string.common_functions__done, new Object[0], bVar4);
                    bVar4.X(false);
                } else {
                    bVar4.N(-1555555874);
                    strA = cb40.a(R.string.common_functions__next, new Object[0], bVar4);
                    bVar4.X(false);
                }
                i060 i060VarC6 = j060.c(2.0f);
                alb0 alb0VarA6 = alb0.a(sya.e, null, new umz(f, 0.0f, f, 0.0f), 0L, 0.0f, 27);
                ak5 ak5VarA6 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVar4), 0L, 0L, 0L, bVar4, 24576, 14);
                d dVarH6 = g3w.h(h.j(aVar6, 0.0f, 8.0f, f, 8.0f, 1), "tooltip_action_button");
                if ((i10 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objY3 = bVar4.y();
                if (z4) {
                    function8 = function7;
                    objY3 = new oa4(function8, 2);
                    bVar4.r(objY3);
                } else {
                    function8 = function7;
                    objY3 = new oa4(function8, 2);
                    bVar4.r(objY3);
                }
                xya.b(dVarH6, false, ak5VarA6, alb0VarA6, i060VarC6, Float.NaN, null, (Function0) objY3, pp8.b(-501882249, new gaj() { // from class: dqc0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar8 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar8.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            lkf0.d(strA, g3w.h(d.a.b, "tooltip_action_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar8), c68.a(R.color.text_inverse_primary, aVar8), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar8, 48, 0, 131068);
                        } else {
                            aVar8.G();
                        }
                        return Unit.a;
                    }
                }, bVar4), bVar4, 100859904, 66);
                bVarI = bVar4;
                bVarI.X(true);
                bVarI.X(true);
                if (i == 1) {
                    bVarI.N(1385495202);
                    d dVarA12 = k78.a(aVar3, h.j(j.i(aVar6, 10.0f), 50.0f, 0.0f, 0.0f, 0.0f, 14));
                    j4 = j3;
                    zE = bVarI.e(j4);
                    objY4 = bVarI.y();
                    if (zE) {
                        objY4 = new Function1() { // from class: eqc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                j90VarA.c(fIntBitsToFloat, fC1);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    } else {
                        objY4 = new Function1() { // from class: eqc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                j90VarA.c(fIntBitsToFloat, fC1);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    rxo.b(dVarA12, (Function1) objY4, bVarI, 0);
                    bVarI.X(false);
                } else {
                    j4 = j3;
                    bVarI.N(1386144838);
                    bVarI.X(false);
                }
                bVarI.X(true);
                function5 = function3;
                j2 = j4;
                dVar3 = dVar8;
                function4 = function8;
            } else {
                bVarI.G();
                function4 = function1;
                dVar3 = dVar2;
                function5 = function3;
                j2 = j;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: fqc0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iqc0.b(dVar3, i, str, function5, function4, function2, j2, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i15 |= 196608;
        if ((1572864 & i2) == 0) {
            if (bVarI.A(function2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i15 |= i13;
        }
        i7 = i15 | 4194304;
        if ((4793491 & i7) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i7 & 1, z)) {
            bVarI.A0();
            i8 = i2 & 1;
            aVar2 = d.a.b;
            if (i8 != 0) {
                if (i14 != 0) {
                    dVar2 = aVar2;
                }
                if (i16 != 0) {
                    function3 = null;
                }
                if (i5 == 0) {
                }
                i9 = i7 & (-29360129);
                jA = c68.a(R.color.bg_primary_d_lightest, bVarI);
            } else {
                if (i14 != 0) {
                    dVar2 = aVar2;
                }
                if (i16 != 0) {
                    function3 = null;
                }
                if (i5 == 0) {
                }
                i9 = i7 & (-29360129);
                jA = c68.a(R.color.bg_primary_d_lightest, bVarI);
            }
            bVarI.Y();
            d dVarG4 = j.g(dVar2, 1.0f);
            kw0.k kVar4 = kw0.c;
            aVar3 = ht.a.m;
            d dVar10 = dVar2;
            i78 i78VarA10 = g78.a(kVar4, aVar3, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS112 = bVarI.S();
            d dVarC112 = c.c(bVarI, dVarG4);
            yka.k.getClass();
            i10 = i9;
            aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar8 = yka.a.f;
            hlh0.a(bVarI, i78VarA10, bVar8);
            yka.a.d dVar11 = yka.a.e;
            hlh0.a(bVarI, ne00VarS112, dVar11);
            c1350a = yka.a.g;
            if (bVarI.S) {
                function7 = function6;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                yka.a.c cVar7 = yka.a.d;
                hlh0.a(bVarI, dVarC112, cVar7);
                c0042a = a.C0041a.a;
                if (i != 1) {
                    bVarI.N(1380219002);
                    if (i == 2) {
                        f2 = 0.0f;
                    } else {
                        f2 = 50.0f;
                    }
                    if (i == 2) {
                        f3 = 50.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (i == 2) {
                        aVar7 = ht.a.o;
                    } else {
                        aVar7 = aVar3;
                    }
                    d dVarA13 = k78.a(aVar7, h.j(j.i(aVar2, 10.0f), f2, 0.0f, f3, 0.0f, 10));
                    zE2 = bVarI.e(jA);
                    objY5 = bVarI.y();
                    if (zE2) {
                        objY5 = new Function1() { // from class: xpc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, fC1);
                                j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                j90VarA.c(fIntBitsToFloat, 0.0f);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: xpc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, fC1);
                                j90VarA.c(f4 + fIntBitsToFloat, fC1);
                                j90VarA.c(fIntBitsToFloat, 0.0f);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    i11 = 0;
                    rxo.b(dVarA13, (Function1) objY5, bVarI, 0);
                    bVarI.X(false);
                } else {
                    i11 = 0;
                    bVarI.N(1381122342);
                    bVarI.X(false);
                }
                d dVarB13 = androidx.compose.foundation.a.b(aVar2, jA, j060.c(2.0f));
                i78 i78VarA11 = g78.a(kVar4, aVar3, bVarI, i11);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS113 = bVarI.S();
                d dVarC113 = c.c(bVarI, dVarB13);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA11, bVar8);
                hlh0.a(bVarI, ne00VarS113, dVar11);
                if (bVarI.S) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC113, cVar7);
                d dVarJ7 = h.j(aVar2, 12.0f, 8.0f, 12.0f, 0.0f, 8);
                kw0.g gVar7 = kw0.g;
                bVar = ht.a.k;
                j3 = jA;
                d160 d160VarA13 = b160.a(gVar7, bVar, bVarI, 54);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS114 = bVarI.S();
                d dVarC114 = c.c(bVarI, dVarJ7);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA13, bVar8);
                hlh0.a(bVarI, ne00VarS114, dVar11);
                if (bVarI.S) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                }
                hlh0.a(bVarI, dVarC114, cVar7);
                imf0 imf0VarB13 = imf0.b(mla.l(R.style.B2_M, bVarI), c68.a(R.color.text_inverse_tertiary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                f160Var = f160.a;
                c1350a3 = c1350a2;
                lkf0.d(str, g3w.h(f160Var.a(0.8f, aVar2, true), "tooltip_title_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, imf0VarB13, bVarI, (i10 >> 9) & 14, 24576, 114684);
                bVar2 = bVarI;
                if (function2 == null) {
                    bVar2.N(2067097152);
                    bVar2.X(false);
                    aVar5 = aVar2;
                    c0042a3 = c0042a;
                } else {
                    bVar2.N(2067097153);
                    crz crzVarA7 = erz.a(R.drawable.ic_cancel, 0, bVar2);
                    d dVarR7 = j.r(aVar2, 16.0f);
                    zM = bVar2.M(function2);
                    objY = bVar2.y();
                    if (zM) {
                        c0042a2 = c0042a;
                        if (objY == c0042a2) {
                            z2 = true;
                        }
                        aVar5 = aVar2;
                        c0042a3 = c0042a2;
                        h6n.b(crzVarA7, "Close icon", g3w.h(g3w.f(dVarR7, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        Unit unit19 = Unit.a;
                        bVar2.X(false);
                    } else {
                        c0042a2 = c0042a;
                    }
                    z2 = true;
                    objY = new s3n(function2, 1);
                    bVar2.r(objY);
                    aVar5 = aVar2;
                    c0042a3 = c0042a2;
                    h6n.b(crzVarA7, "Close icon", g3w.h(g3w.f(dVarR7, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                    Unit unit110 = Unit.a;
                    bVar2.X(false);
                }
                bVar2.X(true);
                d160 d160VarA14 = b160.a(gVar7, bVar, bVar2, 54);
                iHashCode4 = Long.hashCode(bVar2.T);
                ne00 ne00VarS115 = bVar2.S();
                d dVarC115 = c.c(bVar2, aVar5);
                bVar2.D();
                aVar6 = aVar5;
                if (bVar2.S) {
                    bVar2.F(aVar4);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, d160VarA14, bVar8);
                hlh0.a(bVar2, ne00VarS115, dVar11);
                if (bVar2.S) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                } else {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                }
                hlh0.a(bVar2, dVarC115, cVar7);
                if (function3 == null) {
                    bVar2.N(-1556976574);
                    i12 = 0;
                    bVar2.X(false);
                    bVar3 = bVar;
                    f = 12.0f;
                    f160Var2 = f160Var;
                } else {
                    bVar2.N(-1556976573);
                    String strA8 = cb40.a(R.string.common_functions__back, new Object[0], bVar2);
                    imf0 imf0VarB14 = imf0.b(mla.l(R.style.B2_M, bVar2), c68.a(R.color.bg_brand_sub_primary_d_base, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                    f = 12.0f;
                    f160Var2 = f160Var;
                    d dVarB14 = f160Var2.b(h.j(aVar6, 12.0f, 0.0f, 0.0f, 0.0f, 14), bVar);
                    zM2 = bVar2.M(function3);
                    objY2 = bVar2.y();
                    if (zM2) {
                        z3 = true;
                        objY2 = new ccw(function3, 1);
                        bVar2.r(objY2);
                    } else {
                        z3 = true;
                        objY2 = new ccw(function3, 1);
                        bVar2.r(objY2);
                    }
                    bVar3 = bVar;
                    lkf0.d(strA8, g3w.h(g3w.f(dVarB14, z3, (Function0) objY2), "tooltip_back_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarB14, bVar2, 0, 0, 130044);
                    bVar2 = bVar2;
                    Unit unit111 = Unit.a;
                    i12 = 0;
                    bVar2.X(false);
                }
                bVar4 = bVar2;
                lkf0.d(i + " " + cb40.a(R.string.common_functions__of, new Object[i12], bVar2) + " 3", g3w.h(f160Var2.b(f160Var2.a(1.0f, aVar6, true), bVar3), "tooltip_step_count_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.C1_R, bVar2), c68.a(R.color.text_secondary, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVar4, 0, 0, 130044);
                if (i == 3) {
                    bVar4.N(-1555648130);
                    strA = cb40.a(R.string.common_functions__done, new Object[0], bVar4);
                    bVar4.X(false);
                } else {
                    bVar4.N(-1555555874);
                    strA = cb40.a(R.string.common_functions__next, new Object[0], bVar4);
                    bVar4.X(false);
                }
                i060 i060VarC7 = j060.c(2.0f);
                alb0 alb0VarA7 = alb0.a(sya.e, null, new umz(f, 0.0f, f, 0.0f), 0L, 0.0f, 27);
                ak5 ak5VarA7 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVar4), 0L, 0L, 0L, bVar4, 24576, 14);
                d dVarH7 = g3w.h(h.j(aVar6, 0.0f, 8.0f, f, 8.0f, 1), "tooltip_action_button");
                if ((i10 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objY3 = bVar4.y();
                if (z4) {
                    function8 = function7;
                    objY3 = new oa4(function8, 2);
                    bVar4.r(objY3);
                } else {
                    function8 = function7;
                    objY3 = new oa4(function8, 2);
                    bVar4.r(objY3);
                }
                xya.b(dVarH7, false, ak5VarA7, alb0VarA7, i060VarC7, Float.NaN, null, (Function0) objY3, pp8.b(-501882249, new gaj() { // from class: dqc0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar8 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar8.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            lkf0.d(strA, g3w.h(d.a.b, "tooltip_action_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar8), c68.a(R.color.text_inverse_primary, aVar8), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar8, 48, 0, 131068);
                        } else {
                            aVar8.G();
                        }
                        return Unit.a;
                    }
                }, bVar4), bVar4, 100859904, 66);
                bVarI = bVar4;
                bVarI.X(true);
                bVarI.X(true);
                if (i == 1) {
                    bVarI.N(1385495202);
                    d dVarA14 = k78.a(aVar3, h.j(j.i(aVar6, 10.0f), 50.0f, 0.0f, 0.0f, 0.0f, 14));
                    j4 = j3;
                    zE = bVarI.e(j4);
                    objY4 = bVarI.y();
                    if (zE) {
                        objY4 = new Function1() { // from class: eqc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                j90VarA.c(fIntBitsToFloat, fC1);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    } else {
                        objY4 = new Function1() { // from class: eqc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(10.0f);
                                float fC2 = tcfVar.C1(12.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                j90 j90VarA = m90.a();
                                float f4 = fC2 / 2.0f;
                                j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                                j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                                j90VarA.c(fIntBitsToFloat, fC1);
                                j90VarA.close();
                                tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    rxo.b(dVarA14, (Function1) objY4, bVarI, 0);
                    bVarI.X(false);
                } else {
                    j4 = j3;
                    bVarI.N(1386144838);
                    bVarI.X(false);
                }
                bVarI.X(true);
                function5 = function3;
                j2 = j4;
                dVar3 = dVar10;
                function4 = function8;
            } else {
                function7 = function6;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            yka.a.c cVar8 = yka.a.d;
            hlh0.a(bVarI, dVarC112, cVar8);
            c0042a = a.C0041a.a;
            if (i != 1) {
                bVarI.N(1380219002);
                if (i == 2) {
                    f2 = 0.0f;
                } else {
                    f2 = 50.0f;
                }
                if (i == 2) {
                    f3 = 50.0f;
                } else {
                    f3 = 0.0f;
                }
                if (i == 2) {
                    aVar7 = ht.a.o;
                } else {
                    aVar7 = aVar3;
                }
                d dVarA15 = k78.a(aVar7, h.j(j.i(aVar2, 10.0f), f2, 0.0f, f3, 0.0f, 10));
                zE2 = bVarI.e(jA);
                objY5 = bVarI.y();
                if (zE2) {
                    objY5 = new Function1() { // from class: xpc0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fC1 = tcfVar.C1(10.0f);
                            float fC2 = tcfVar.C1(12.0f);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                            j90 j90VarA = m90.a();
                            float f4 = fC2 / 2.0f;
                            j90VarA.a(fIntBitsToFloat - f4, fC1);
                            j90VarA.c(f4 + fIntBitsToFloat, fC1);
                            j90VarA.c(fIntBitsToFloat, 0.0f);
                            j90VarA.close();
                            tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    objY5 = new Function1() { // from class: xpc0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fC1 = tcfVar.C1(10.0f);
                            float fC2 = tcfVar.C1(12.0f);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                            j90 j90VarA = m90.a();
                            float f4 = fC2 / 2.0f;
                            j90VarA.a(fIntBitsToFloat - f4, fC1);
                            j90VarA.c(f4 + fIntBitsToFloat, fC1);
                            j90VarA.c(fIntBitsToFloat, 0.0f);
                            j90VarA.close();
                            tcf.Q1(tcfVar, j90VarA, jA, 0.0f, null, 60);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                i11 = 0;
                rxo.b(dVarA15, (Function1) objY5, bVarI, 0);
                bVarI.X(false);
            } else {
                i11 = 0;
                bVarI.N(1381122342);
                bVarI.X(false);
            }
            d dVarB15 = androidx.compose.foundation.a.b(aVar2, jA, j060.c(2.0f));
            i78 i78VarA12 = g78.a(kVar4, aVar3, bVarI, i11);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS116 = bVarI.S();
            d dVarC116 = c.c(bVarI, dVarB15);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA12, bVar8);
            hlh0.a(bVarI, ne00VarS116, dVar11);
            if (bVarI.S) {
                c1350a2 = c1350a;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            } else {
                c1350a2 = c1350a;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC116, cVar8);
            d dVarJ8 = h.j(aVar2, 12.0f, 8.0f, 12.0f, 0.0f, 8);
            kw0.g gVar8 = kw0.g;
            bVar = ht.a.k;
            j3 = jA;
            d160 d160VarA15 = b160.a(gVar8, bVar, bVarI, 54);
            iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS117 = bVarI.S();
            d dVarC117 = c.c(bVarI, dVarJ8);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA15, bVar8);
            hlh0.a(bVarI, ne00VarS117, dVar11);
            if (bVarI.S) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC117, cVar8);
            imf0 imf0VarB15 = imf0.b(mla.l(R.style.B2_M, bVarI), c68.a(R.color.text_inverse_tertiary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
            f160Var = f160.a;
            c1350a3 = c1350a2;
            lkf0.d(str, g3w.h(f160Var.a(0.8f, aVar2, true), "tooltip_title_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, imf0VarB15, bVarI, (i10 >> 9) & 14, 24576, 114684);
            bVar2 = bVarI;
            if (function2 == null) {
                bVar2.N(2067097152);
                bVar2.X(false);
                aVar5 = aVar2;
                c0042a3 = c0042a;
            } else {
                bVar2.N(2067097153);
                crz crzVarA8 = erz.a(R.drawable.ic_cancel, 0, bVar2);
                d dVarR8 = j.r(aVar2, 16.0f);
                zM = bVar2.M(function2);
                objY = bVar2.y();
                if (zM) {
                    c0042a2 = c0042a;
                    if (objY == c0042a2) {
                        z2 = true;
                    }
                    aVar5 = aVar2;
                    c0042a3 = c0042a2;
                    h6n.b(crzVarA8, "Close icon", g3w.h(g3w.f(dVarR8, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                    Unit unit112 = Unit.a;
                    bVar2.X(false);
                } else {
                    c0042a2 = c0042a;
                }
                z2 = true;
                objY = new s3n(function2, 1);
                bVar2.r(objY);
                aVar5 = aVar2;
                c0042a3 = c0042a2;
                h6n.b(crzVarA8, "Close icon", g3w.h(g3w.f(dVarR8, z2, (Function0) objY), "tooltip_close_icon"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                Unit unit113 = Unit.a;
                bVar2.X(false);
            }
            bVar2.X(true);
            d160 d160VarA16 = b160.a(gVar8, bVar, bVar2, 54);
            iHashCode4 = Long.hashCode(bVar2.T);
            ne00 ne00VarS118 = bVar2.S();
            d dVarC118 = c.c(bVar2, aVar5);
            bVar2.D();
            aVar6 = aVar5;
            if (bVar2.S) {
                bVar2.F(aVar4);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, d160VarA16, bVar8);
            hlh0.a(bVar2, ne00VarS118, dVar11);
            if (bVar2.S) {
                n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
            } else {
                n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
            }
            hlh0.a(bVar2, dVarC118, cVar8);
            if (function3 == null) {
                bVar2.N(-1556976574);
                i12 = 0;
                bVar2.X(false);
                bVar3 = bVar;
                f = 12.0f;
                f160Var2 = f160Var;
            } else {
                bVar2.N(-1556976573);
                String strA9 = cb40.a(R.string.common_functions__back, new Object[0], bVar2);
                imf0 imf0VarB16 = imf0.b(mla.l(R.style.B2_M, bVar2), c68.a(R.color.bg_brand_sub_primary_d_base, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                f = 12.0f;
                f160Var2 = f160Var;
                d dVarB16 = f160Var2.b(h.j(aVar6, 12.0f, 0.0f, 0.0f, 0.0f, 14), bVar);
                zM2 = bVar2.M(function3);
                objY2 = bVar2.y();
                if (zM2) {
                    z3 = true;
                    objY2 = new ccw(function3, 1);
                    bVar2.r(objY2);
                } else {
                    z3 = true;
                    objY2 = new ccw(function3, 1);
                    bVar2.r(objY2);
                }
                bVar3 = bVar;
                lkf0.d(strA9, g3w.h(g3w.f(dVarB16, z3, (Function0) objY2), "tooltip_back_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarB16, bVar2, 0, 0, 130044);
                bVar2 = bVar2;
                Unit unit114 = Unit.a;
                i12 = 0;
                bVar2.X(false);
            }
            bVar4 = bVar2;
            lkf0.d(i + " " + cb40.a(R.string.common_functions__of, new Object[i12], bVar2) + " 3", g3w.h(f160Var2.b(f160Var2.a(1.0f, aVar6, true), bVar3), "tooltip_step_count_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.C1_R, bVar2), c68.a(R.color.text_secondary, bVar2), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVar4, 0, 0, 130044);
            if (i == 3) {
                bVar4.N(-1555648130);
                strA = cb40.a(R.string.common_functions__done, new Object[0], bVar4);
                bVar4.X(false);
            } else {
                bVar4.N(-1555555874);
                strA = cb40.a(R.string.common_functions__next, new Object[0], bVar4);
                bVar4.X(false);
            }
            i060 i060VarC8 = j060.c(2.0f);
            alb0 alb0VarA8 = alb0.a(sya.e, null, new umz(f, 0.0f, f, 0.0f), 0L, 0.0f, 27);
            ak5 ak5VarA8 = sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVar4), 0L, 0L, 0L, bVar4, 24576, 14);
            d dVarH8 = g3w.h(h.j(aVar6, 0.0f, 8.0f, f, 8.0f, 1), "tooltip_action_button");
            if ((i10 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            objY3 = bVar4.y();
            if (z4) {
                function8 = function7;
                objY3 = new oa4(function8, 2);
                bVar4.r(objY3);
            } else {
                function8 = function7;
                objY3 = new oa4(function8, 2);
                bVar4.r(objY3);
            }
            xya.b(dVarH8, false, ak5VarA8, alb0VarA8, i060VarC8, Float.NaN, null, (Function0) objY3, pp8.b(-501882249, new gaj() { // from class: dqc0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar8 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar8.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(strA, g3w.h(d.a.b, "tooltip_action_text"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar8), c68.a(R.color.text_inverse_primary, aVar8), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar8, 48, 0, 131068);
                    } else {
                        aVar8.G();
                    }
                    return Unit.a;
                }
            }, bVar4), bVar4, 100859904, 66);
            bVarI = bVar4;
            bVarI.X(true);
            bVarI.X(true);
            if (i == 1) {
                bVarI.N(1385495202);
                d dVarA16 = k78.a(aVar3, h.j(j.i(aVar6, 10.0f), 50.0f, 0.0f, 0.0f, 0.0f, 14));
                j4 = j3;
                zE = bVarI.e(j4);
                objY4 = bVarI.y();
                if (zE) {
                    objY4 = new Function1() { // from class: eqc0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fC1 = tcfVar.C1(10.0f);
                            float fC2 = tcfVar.C1(12.0f);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                            j90 j90VarA = m90.a();
                            float f4 = fC2 / 2.0f;
                            j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                            j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                            j90VarA.c(fIntBitsToFloat, fC1);
                            j90VarA.close();
                            tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                } else {
                    objY4 = new Function1() { // from class: eqc0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fC1 = tcfVar.C1(10.0f);
                            float fC2 = tcfVar.C1(12.0f);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                            j90 j90VarA = m90.a();
                            float f4 = fC2 / 2.0f;
                            j90VarA.a(fIntBitsToFloat - f4, 0.0f);
                            j90VarA.c(f4 + fIntBitsToFloat, 0.0f);
                            j90VarA.c(fIntBitsToFloat, fC1);
                            j90VarA.close();
                            tcf.Q1(tcfVar, j90VarA, j4, 0.0f, null, 60);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                rxo.b(dVarA16, (Function1) objY4, bVarI, 0);
                bVarI.X(false);
            } else {
                j4 = j3;
                bVarI.N(1386144838);
                bVarI.X(false);
            }
            bVarI.X(true);
            function5 = function3;
            j2 = j4;
            dVar3 = dVar10;
            function4 = function8;
        } else {
            bVarI.G();
            function4 = function1;
            dVar3 = dVar2;
            function5 = function3;
            j2 = j;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fqc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iqc0.b(dVar3, i, str, function5, function4, function2, j2, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }
}
