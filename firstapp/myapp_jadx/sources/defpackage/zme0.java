package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.r;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class zme0 {
    public static final void a(final d dVar, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-423580795);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarH = g3w.h(dVar, "switch_bank_no_match_screen");
            aiv aivVarC = g75.c(ht.a.e, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.page_payment__no_matches_found, new Object[0], bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rme0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    zme0.a(dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final List list, final int i, final Function1 function1, a aVar, final int i2) {
        b bVarI = aVar.i(-1949415874);
        int i3 = i2 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(list) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Integer numValueOf = Integer.valueOf(i);
            boolean zM = ((i3 & 896) == 256) | bVarI.M(zzrVarA);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new ume0(i, null, zzrVarA);
                bVarI.r(objY);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY);
            if (list.isEmpty()) {
                bVarI.N(1499902073);
                a(dVar, bVarI, i3 & 14);
                bVarI.X(false);
            } else {
                bVarI.N(1499993151);
                d dVarH = g3w.h(dVar, "switch_bank_content_item_list");
                boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
                Object objY2 = bVarI.y();
                if (z || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: mme0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            szr szrVar = (szr) obj;
                            szrVar.getClass();
                            List list2 = list;
                            szrVar.d(list2.size(), null, new vme0(list2), new op8(802480018, new wme0(list2, function1), true));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                aur.a(dVarH, zzrVarA, null, false, null, null, null, false, null, (Function1) objY2, bVarI, 0, 508);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(list, i, function1, i2) { // from class: nme0
                public final /* synthetic */ List b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zme0.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final aoe0.a aVar, final Function1 function1, a aVar2, final int i) {
        b bVarI = aVar2.i(1678765773);
        int i2 = (bVarI.M(aVar) ? 32 : 16) | i | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: sme0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(aVar);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarH = g3w.h(h.h(j.k(g3w.f(dVar, true, (Function0) objY), 48.0f, 0.0f, 2), 16.0f, 0.0f, 2), "switch_bank_content_item");
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d.a aVar4 = d.a.b;
            h9n.a(erz.a(R.drawable.ic_check, 0, bVarI), null, g3w.h(aVar4, "switch_bank_content_item_check_icon"), null, null, aVar.f ? 1.0f : 0.0f, new gf4(c68.a(R.color.brand_secondary, bVarI), 5), bVarI, 432, 24);
            ty0.a(bVarI, j.w(aVar4, 16.0f));
            ((yhj0) bVarI.O(bij0.a)).getClass();
            mw90.b(aVar.c, "pic", g3w.h(j.r(aVar4, 24.0f), "switch_bank_content_item_bank_icon"), erz.a(R.drawable.icon_default, 0, bVarI), erz.a(R.drawable.icon_default, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 48, 0, 32736);
            ty0.a(bVarI, j.w(aVar4, 16.0f));
            d dVarH2 = g3w.h(j.g(aVar4, 1.0f), "switch_bank_content_item_text");
            String str = aVar.b;
            if (str == null) {
                str = "";
            }
            lkf0.d(str, dVarH2, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(aVar, function1, i) { // from class: tme0
                public final /* synthetic */ aoe0.a b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    zme0.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final fme0 fme0Var, final Function0 function0, final Function1 function1, final Function1 function2, final Function0 function3, final Function0 function4, a aVar, final int i) {
        int i2;
        fme0Var.getClass();
        b bVarI = aVar.i(-901405440);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(fme0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function4) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            ac8.h(0.0f, null, function0, pp8.b(-155120698, new Function2() { // from class: jme0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final Function0 function5 = function0;
                        final fme0 fme0Var2 = fme0Var;
                        final Function0 function6 = function3;
                        final Function0 function7 = function4;
                        final Function1 function8 = function2;
                        final Function1 function9 = function1;
                        ac8.k(null, 0L, pp8.b(2099528526, new Function2() { // from class: lme0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long jA = c68.a(R.color.background_type1_secondary, aVar3);
                                    zk40.a aVar4 = zk40.a;
                                    d.a aVar5 = d.a.b;
                                    d dVarB = v8j0.b(v8j0.a(j.e(androidx.compose.foundation.a.b(aVar5, jA, aVar4), 1.0f)));
                                    Object objY = aVar3.y();
                                    if (objY == a.C0041a.a) {
                                        objY = new hme0();
                                        aVar3.r(objY);
                                    }
                                    d dVarA = androidx.compose.ui.platform.d.a(xa80.b(dVarB, false, (Function1) objY), "TAG_SWITCH_BANK_ITEM_DIALOG");
                                    i78 i78VarA = g78.a(kw0.e, ht.a.m, aVar3, 54);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarA);
                                    yka.k.getClass();
                                    tsr.a aVar6 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar6);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, i78VarA, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC, yka.a.d);
                                    ac8.d(j.g(aVar5, 1.0f), cb40.a(R.string.page_payment__select_a_bank, new Object[0], aVar3), null, function5, false, true, false, aVar3, 196614, 84);
                                    fme0 fme0Var3 = fme0Var2;
                                    zme0.f(null, fme0Var3.d, fme0Var3.e, function6, function7, function8, aVar3, 0);
                                    ac8.f(0, 1, aVar3, null);
                                    zme0.b(zqu.a(1.0f, j.g(aVar5, 1.0f), true), fme0Var3.b, fme0Var3.c, function9, aVar3, 0);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 384, 3);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 << 3) & 896) | 3072, 3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kme0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zme0.d(fme0Var, function0, function1, function2, function3, function4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(gme0 gme0Var, Function0 function0, Function1 function1, a aVar, final int i) {
        final Function0 function2;
        final Function1 function3;
        b bVar;
        a.C0041a.C0042a c0042a;
        int i2;
        final gme0 gme0Var2 = gme0Var;
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-397442542);
        int i3 = 2;
        int i4 = (bVarI.A(gme0Var2) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            ytw ytwVarC = wyh.c(gme0Var2.c, bVarI, 0, 7);
            if (((fme0) ytwVarC.getValue()).a) {
                bVarI.N(1014379421);
                fme0 fme0Var = (fme0) ytwVarC.getValue();
                int i5 = (i4 & 14) ^ 6;
                boolean z = (i5 > 4 && bVarI.A(gme0Var2)) || (i4 & 6) == 4;
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                if (z || objY == c0042a2) {
                    objY = new ttj(gme0Var2, i3);
                    bVarI.r(objY);
                }
                Function1 function4 = (Function1) objY;
                boolean z2 = (i5 > 4 && bVarI.A(gme0Var2)) || (i4 & 6) == 4;
                Object objY2 = bVarI.y();
                if (z2 || objY2 == c0042a2) {
                    c0042a = c0042a2;
                    i2 = i5;
                    xme0 xme0Var = new xme0(0, gme0Var2, gme0.class, "searchModeOn", "searchModeOn()V", 0);
                    bVarI.r(xme0Var);
                    objY2 = xme0Var;
                } else {
                    i2 = i5;
                    c0042a = c0042a2;
                }
                Function0 function5 = (Function0) ((chp) objY2);
                boolean z3 = (i2 > 4 && bVarI.A(gme0Var2)) || (i4 & 6) == 4;
                Object objY3 = bVarI.y();
                if (z3 || objY3 == c0042a) {
                    objY3 = new yme0(0, gme0Var2, gme0.class, "searchModeOff", "searchModeOff()V", 0);
                    bVarI.r(objY3);
                }
                function2 = function0;
                function3 = function1;
                bVar = bVarI;
                d(fme0Var, function2, function3, function4, function5, (Function0) ((chp) objY3), bVar, i4 & 1008);
                bVar.X(false);
            } else {
                gme0Var2 = gme0Var2;
                function2 = function0;
                function3 = function1;
                bVar = bVarI;
                bVar.N(1014735952);
                bVar.X(false);
            }
        } else {
            gme0Var2 = gme0Var2;
            function2 = function0;
            function3 = function1;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function3, i) { // from class: ime0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    zme0.e(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(d dVar, final ijf0 ijf0Var, final boolean z, final Function0 function0, final Function0 function1, final Function1 function2, a aVar, final int i) {
        final d dVar2;
        b bVarI = aVar.i(-583624114);
        int i2 = i | 6 | (bVarI.M(ijf0Var) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function2) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = Integer.valueOf(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
                bVarI.r(objY);
            }
            int iIntValue = ((Number) objY).intValue();
            final twd0 twd0VarA = xe0.a(z ? 26.0f : 0.0f, yi0.e(iIntValue, 0, null, 6), "arrowWidth", bVarI, 432, 8);
            final k4i k4iVar = (k4i) bVarI.O(kna.i);
            d.a aVar2 = d.a.b;
            d dVarG = h.g(aVar2, 16.0f, 12.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int i3 = i2 >> 3;
            f160 f160Var = f160.a;
            hh0.d(f160Var, z, aVar2, f.f(yi0.e(iIntValue, 0, null, 6), 2), f.g(yi0.e(iIntValue, 0, null, 6), 2), null, pp8.b(-324345966, new gaj() { // from class: ome0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                        d dVarJ = h.j(j.i(j.w(d.a.b, ((g7f) twd0VarA.getValue()).a), 18.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                        final k4i k4iVar2 = k4iVar;
                        boolean zA = aVar4.A(k4iVar2);
                        final Function0 function3 = function1;
                        boolean zM = zA | aVar4.M(function3);
                        Object objY2 = aVar4.y();
                        if (zM || objY2 == a.C0041a.a) {
                            objY2 = new Function0() { // from class: qme0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    k4iVar2.t(false);
                                    function3.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar4.r(objY2);
                        }
                        h9n.a(erz.a(R.drawable.ic_arrow_left, 0, aVar4), null, g3w.h(g3w.f(dVarJ, true, (Function0) objY2), "switch_bank_search_row_back_icon"), null, null, 0.0f, new gf4(c68.a(R.color.brand_secondary, aVar4), 5), aVar4, 48, 56);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1600902 | (i3 & 112), 16);
            bVarI = bVarI;
            boolean z2 = (i2 & 7168) == 2048;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new a8f(1, function0);
                bVarI.r(objY2);
            }
            jr7.a(g3w.h(j.i(f160Var.a(1.0f, androidx.compose.ui.focus.a.a(aVar2, (Function1) objY2), true), 48.0f), "switch_bank_search_row_input_field"), ijf0Var, vv9.a, false, null, false, null, cb40.a(R.string.page_payment__bank_name, new Object[0], bVarI), null, null, null, 0, null, null, function2, bVarI, (i2 & 112) | 384, i3 & 57344, 16248);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ijf0Var, z, function0, function1, function2, i) { // from class: pme0
                public final /* synthetic */ ijf0 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zme0.f(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
