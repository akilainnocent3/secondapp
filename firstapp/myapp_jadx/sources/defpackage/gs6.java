package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class gs6 {
    public static final void a(final int i, a aVar, final Function0 function0, final boolean z) {
        int i2;
        b bVarI = aVar.i(-1847852183);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            aza.a(c9j.c(g3w.h(h.h(j.g(d.a.b, 1.0f), 12.0f, 0.0f, 2), "cashout_success_single_add_to_betslip_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "open_bets__cashout_success_popup_add_to_betslip"), null, z ? uxs.ENABLE : uxs.DISABLE, null, sya.b, null, null, null, function0, du8.a, bVarI, 805306368 | ((i2 << 21) & 234881024), 234);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: es6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gs6.a(qj40.a(i | 1), (a) obj, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final ln6 ln6Var, Function0<Unit> function0, final Function0<Unit> function1, final Function1<? super String, Unit> function2, Function0<Unit> function3, final Function0<Unit> function4, a aVar, final int i) {
        int i2;
        Function0<Unit> function5;
        Function0<Unit> function6;
        d.a aVar2;
        boolean z;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(320270733);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(ln6Var) ? 4 : 2) | i;
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
            d.a aVar3 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), fjb0.b(bVarI).i0, zk40.a);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new wr6(0);
                bVarI.r(objY);
            }
            d dVarC = c9j.c(g3w.h(xa80.b(dVarB, false, (Function1) objY), "cashout_success_single_bottom_sheet"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "open_bets__cashout_success_popup");
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarJ = h.j(j.g(aVar3, 1.0f), 0.0f, fjb0.d(bVarI).g, 0.0f, 0.0f, 13);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            String str = ln6Var.a;
            Set<String> set = ln6Var.e;
            List<pt90> list = ln6Var.d;
            afe0.a(str, bVarI, 0);
            if (ln6Var.f) {
                bVarI.N(-968605589);
                ty0.a(bVarI, j.i(aVar3, fjb0.d(bVarI).f));
                d(0, bVarI);
                bVarI.X(false);
            } else {
                if (list.isEmpty()) {
                    bVarI.N(-968429664);
                    ty0.a(bVarI, j.i(aVar3, fjb0.d(bVarI).f));
                    e(function4, bVarI, (i2 >> 15) & 14);
                    bVarI.X(false);
                } else {
                    bVarI.N(-968204046);
                    ty0.a(bVarI, j.i(aVar3, fjb0.d(bVarI).e));
                    aVar2 = aVar3;
                    ute.b(g3w.h(h.h(aVar3, 22.0f, 0.0f, 2), "cashout_success_single_divider"), 0.0f, fjb0.b(bVarI).A, bVarI, 6, 2);
                    ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).e));
                    kpg.a(i2 & 896, bVarI, ln6Var.b, function1, ln6Var.c);
                    ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).e));
                    f(list, set, function2, bVarI, (i2 >> 3) & 896);
                    ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).c));
                    lkf0.d(cb40.a(R.string.cashout__remaining_single_bet_selection_odds_info_text, new Object[0], bVarI), g3w.h(h.h(j.g(aVar2, 1.0f), 22.0f, 0.0f, 2), "cashout_success_single_disclaimer"), fjb0.b(bVarI).n, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVarI, 48, 0, 130040);
                    bVarI = bVarI;
                    ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).e));
                    z = true;
                    function6 = function3;
                    a((i2 >> 9) & 112, bVarI, function6, !set.isEmpty());
                    bVarI.X(false);
                }
                iib0.a(aVar2, fjb0.d(bVarI).e, bVarI, z);
                function5 = function0;
                c((i2 >> 3) & 14, bVarI, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.c), function5);
                bVarI.X(z);
            }
            function6 = function3;
            aVar2 = aVar3;
            z = true;
            iib0.a(aVar2, fjb0.d(bVarI).e, bVarI, z);
            function5 = function0;
            c((i2 >> 3) & 14, bVarI, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.c), function5);
            bVarI.X(z);
        } else {
            function5 = function0;
            function6 = function3;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0<Unit> function7 = function5;
            final Function0<Unit> function8 = function6;
            eVarZ.d = new Function2() { // from class: xr6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gs6.b(ln6Var, function7, function1, function2, function8, function4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, a aVar, final d dVar, final Function0 function0) {
        int i2;
        b bVarI = aVar.i(581765631);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            crz crzVarA = pib0.a(R.drawable.ic__cancel, 0, bVarI);
            long j = ((lib0) bVarI.O(oib0.a)).P;
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: as6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            h6n.b(crzVarA, "Close", c9j.c(g3w.h(j.r(h.f(androidx.compose.foundation.d.d(dVar, false, null, null, (Function0) objY, 15), ((cjb0) bVarI.O(ejb0.a)).f), 16.0f), "cashout_success_single_close_btn"), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "open_bets__cashout_success_popup_close"), j, bVarI, 48, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bs6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gs6.c(qj40.a(i | 1), (a) obj, dVar, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, a aVar) {
        b bVarI = aVar.i(-1590246481);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(j.i(h.h(j.g(aVar2, 1.0f), 22.0f, 0.0f, 2), 110.0f), "cashout_success_single_loading");
            aiv aivVarC = g75.c(ht.a.e, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            q330.a(g3w.h(aVar2, "cashout_success_single_loading_indicator"), ((lib0) bVarI.O(oib0.a)).c0, 0.0f, 0L, 0, 0.0f, bVarI, 6, 60);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ds6();
        }
    }

    public static final void e(final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-527228940);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            aza.a(g3w.h(h.h(j.g(d.a.b, 1.0f), 12.0f, 0.0f, 2), "cashout_success_single_ok_btn"), null, uxs.ENABLE, null, sya.b, null, null, null, function0, du8.b, bVarI, 805306758 | ((i2 << 24) & 234881024), 234);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cs6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    gs6.e(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final List<pt90> list, final Set<String> set, final Function1<? super String, Unit> function1, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1195900518);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(list) : bVarI.A(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(set) : bVarI.A(set) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            q75.a(g3w.h(h.h(j.g(d.a.b, 1.0f), 12.0f, 0.0f, 2), "cashout_success_single_outcomes_row"), null, false, pp8.b(-243132592, new gaj() { // from class: yr6
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = r75Var.d();
                        qyd0 qyd0Var = ejb0.a;
                        float f = (fD - (((cjb0) aVar2.O(qyd0Var)).c * 2.0f)) / 3.0f;
                        d.a aVar3 = d.a.b;
                        d dVarG = j.g(aVar3, 1.0f);
                        d160 d160VarA = b160.a(new kw0.i(((cjb0) aVar2.O(qyd0Var)).c, true, new iw0(ht.a.n)), ht.a.j, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        aVar2.N(963581035);
                        int i3 = 0;
                        for (Object obj4 : list) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            pt90 pt90Var = (pt90) obj4;
                            String strA = vga.a(i3, "_", tx5.a(pt90Var.a.a, "_", pt90Var.b.a, "_", pt90Var.c.a));
                            boolean zContains = set.contains(strA);
                            Function1 function2 = function1;
                            boolean zM = aVar2.M(function2) | aVar2.M(strA);
                            Object objY = aVar2.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new fs6(function2, strA, 0);
                                aVar2.r(objY);
                            }
                            ev90.b(pt90Var, zContains, (Function0) objY, g3w.h(j.w(aVar3, f), "cashout_success_single_outcome"), aVar2, 0);
                            i3 = i4;
                        }
                        aVar2.H();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zr6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    gs6.f(list, set, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
