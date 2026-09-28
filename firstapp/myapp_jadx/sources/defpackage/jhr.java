package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jhr {
    public static final long a = r58.d(3426040389L);
    public static final float b = 8.0f;
    public static final uf00<ggr> c = a4h.a(new ggr(5, true), new ggr(12, true), new ggr(24, true), new ggr(36, true), new ggr(47, true), new ggr(9, false));
    public static final uf00<ggr> d = a4h.a(new ggr(3, true), new ggr(7, true), new ggr(11, true), new ggr(16, true), new ggr(22, true), new ggr(28, true), new ggr(34, true), new ggr(39, true), new ggr(43, true), new ggr(48, true), new ggr(52, true), new ggr(57, true), new ggr(61, true), new ggr(66, true), new ggr(70, true), new ggr(5, false));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ggr ggrVar, a aVar, final int i) {
        b bVar;
        Pair pair;
        b bVarI = aVar.i(-1718143037);
        int i2 = (bVarI.M(ggrVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            if (ggrVar.a) {
                bVarI.N(-2073856267);
                pair = new Pair(new j58(fjb0.b(bVarI).x0), new j58(fjb0.b(bVarI).o));
                bVarI.X(false);
            } else {
                bVarI.N(-2073777310);
                pair = new Pair(new j58(fjb0.b(bVarI).K0), new j58(fjb0.b(bVarI).j));
                bVarI.X(false);
            }
            long j = ((j58) pair.a).a;
            long j2 = ((j58) pair.b).a;
            d dVarB = androidx.compose.foundation.a.b(j.r(d.a.b, 16.0f), j, j060.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
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
            lkf0.d(String.valueOf(ggrVar.b), null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).n, bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: zgr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    jhr.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    public static final void b(final d dVar, final khr.c cVar, final Function1<? super ler, Unit> function1, a aVar, final int i) {
        int i2;
        a.C0041a.C0042a c0042a;
        int i3;
        boolean z;
        Object objY;
        b bVarI = aVar.i(-1637446746);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            hgr hgrVar = new hgr(cVar.a, cVar.b, cVar.f);
            Object objY2 = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (objY2 == c0042a2) {
                objY2 = new ngr();
                bVarI.r(objY2);
            }
            Function1 function2 = (Function1) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = new ogr();
                bVarI.r(objY3);
            }
            androidx.compose.animation.a.b(hgrVar, layoutWeightElement, function2, null, "ln_stream_ticket_content", (Function1) objY3, za9.a, bVarI, 1794432, 8);
            float f = ((cjb0) bVarI.O(ejb0.a)).d;
            d.a aVar3 = d.a.b;
            d dVarA = p1a.a(h.j(aVar3, f, 0.0f, 0.0f, 0.0f, 14), 180.0f);
            boolean z2 = cVar.d;
            int i4 = i2 & 896;
            boolean z3 = i4 == 256;
            Object objY4 = bVarI.y();
            if (z3) {
                c0042a = c0042a2;
            } else {
                c0042a = c0042a2;
                if (objY4 != c0042a) {
                    i3 = 0;
                }
                g(i3, bVarI, dVarA, (Function0) objY4, z2);
                a.C0041a.C0042a c0042a3 = c0042a;
                lkf0.d(cVar.c, h.h(aVar3, 4.0f, 0.0f, 2), ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVarI, 48, 24576, 114680);
                bVarI = bVarI;
                boolean z4 = cVar.e;
                if (i4 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objY = bVarI.y();
                if (z || objY == c0042a3) {
                    objY = new qgr(0, function1);
                    bVarI.r(objY);
                }
                g(6, bVarI, aVar3, (Function0) objY, z4);
                bVarI.X(true);
            }
            i3 = 0;
            objY4 = new pgr(0, function1);
            bVarI.r(objY4);
            g(i3, bVarI, dVarA, (Function0) objY4, z2);
            a.C0041a.C0042a c0042a4 = c0042a;
            lkf0.d(cVar.c, h.h(aVar3, 4.0f, 0.0f, 2), ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVarI, 48, 24576, 114680);
            bVarI = bVarI;
            boolean z5 = cVar.e;
            if (i4 == 256) {
                z = true;
            } else {
                z = false;
            }
            objY = bVarI.y();
            if (z) {
                objY = new qgr(0, function1);
                bVarI.r(objY);
            } else {
                objY = new qgr(0, function1);
                bVarI.r(objY);
            }
            g(6, bVarI, aVar3, (Function0) objY, z5);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rgr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jhr.b(dVar, cVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, a aVar) {
        b bVarI = aVar.i(-1133462207);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.t(aVar2, 34.0f, 32.0f), 2.0f, 0.0f, 0.0f, 0.0f, 14);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            d dVarA = p1a.a(j.r(aVar2, 12.0f), 180.0f);
            crz crzVarA = erz.a(R.drawable.ic__arrow_triangle_right, 0, bVarI);
            qyd0 qyd0Var = oib0.a;
            h6n.b(crzVarA, "triangle", dVarA, ((lib0) bVarI.O(qyd0Var)).a0, bVarI, 432, 0);
            h6n.b(erz.a(R.drawable.ic_number_ticket, 0, bVarI), "ticket", j.r(aVar2, 16.0f), ((lib0) bVarI.O(qyd0Var)).a0, bVarI, 432, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new u09(i);
        }
    }

    public static final void d(final khr khrVar, final float f, final Function1 function1, a aVar, final int i) {
        int i2;
        khrVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(449462347);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(khrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            q75.a(j.g(aVar2, 1.0f), null, false, pp8.b(-1636731999, new gaj() { // from class: jgr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final r75 r75Var = (r75) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(r75Var) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final khr khrVar2 = khrVar;
                        boolean z = (khrVar2 instanceof khr.b) || (khrVar2 instanceof khr.a);
                        Object objY = aVar3.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = m.b(khr.d.a);
                            aVar3.r(objY);
                        }
                        ytw ytwVar = (ytw) objY;
                        boolean zB = aVar3.b(z) | aVar3.M(khrVar2);
                        Object objY2 = aVar3.y();
                        if (zB || objY2 == c0042a) {
                            objY2 = new ihr(z, khrVar2, ytwVar, null);
                            aVar3.r(objY2);
                        }
                        xvf.e(aVar3, khrVar2, (Function2) objY2);
                        if (z) {
                            khrVar2 = (khr) ytwVar.getValue();
                        }
                        d dVarB = r75Var.b(d.a.b, ht.a.c);
                        boolean z2 = !z;
                        gzg0 gzg0VarE = yi0.e(220, 0, null, 6);
                        Object objY3 = aVar3.y();
                        if (objY3 == c0042a) {
                            objY3 = new qoz();
                            aVar3.r(objY3);
                        }
                        t9g t9gVarB = f.n(gzg0VarE, (Function1) objY3).b(f.f(yi0.e(220, 0, null, 6), 2));
                        gzg0 gzg0VarE2 = yi0.e(220, 0, null, 6);
                        Object objY4 = aVar3.y();
                        if (objY4 == c0042a) {
                            objY4 = new qoz();
                            aVar3.r(objY4);
                        }
                        owg owgVarB = f.r(gzg0VarE2, (Function1) objY4).b(f.g(yi0.e(220, 0, null, 6), 2));
                        final float f2 = f;
                        final Function1 function2 = function1;
                        hh0.e(z2, dVarB, t9gVarB, owgVarB, "ln_stream_ticket_window_visibility", pp8.b(-550003591, new gaj() { // from class: ahr
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a aVar4 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((jh0) obj4).getClass();
                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    jhr.j(r75Var.d(), f2, khrVar2, function2, aVar4, 0);
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, aVar3), aVar3, 224640, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sgr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jhr.d(khrVar, f, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(d dVar, a aVar, int i) {
        b bVarI = aVar.i(-1220919721);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            qyd0 qyd0Var = oib0.a;
            List listK = kotlin.collections.b.k(new j58(((lib0) bVarI.O(qyd0Var)).M), new j58(((lib0) bVarI.O(qyd0Var)).N), new j58(((lib0) bVarI.O(qyd0Var)).M));
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            d.a aVar3 = d.a.b;
            g75.a(androidx.compose.foundation.a.a(j.t(aVar3, 60.0f, 16.0f), m590.a(listK, bVarI, 2), null, 0.0f, 6), bVarI, 0);
            bVarI.N(407054530);
            for (int i2 = 0; i2 < 3; i2++) {
                g75.a(androidx.compose.foundation.a.a(j.r(aVar3, 16.0f), m590.a(listK, bVarI, 2), j060.a, 0.0f, 4), bVarI, 0);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new j14(i, 1, dVar);
        }
    }

    public static final void f(d dVar, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(607440682);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.page_lucky_numbers__streaming_hint_no_bets_placed, new Object[0], bVarI), dVar, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVar, 48, 24960, 110584);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new omh(dVar, i);
        }
    }

    public static final void g(final int i, a aVar, final d dVar, final Function0 function0, boolean z) {
        int i2;
        final boolean z2;
        b bVar;
        long j;
        b bVarI = aVar.i(175677744);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.d(R.drawable.ic__arrow_triangle_right) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d dVarR = j.r(dVar, 16.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            d dVarB = androidx.compose.foundation.d.b(dVarR, (psw) objY, ut50.a(16.0f, j58.f, false), z, null, mla.d(function0, bVarI, (i3 >> 6) & 112), 24);
            z2 = z;
            if (z2) {
                bVarI.N(-1948913215);
                j = ((lib0) bVarI.O(oib0.a)).a0;
                bVarI.X(false);
            } else {
                bVarI.N(-1948858655);
                j = ((lib0) bVarI.O(oib0.a)).g0;
                bVarI.X(false);
            }
            bVar = bVarI;
            h6n.b(erz.a(R.drawable.ic__arrow_triangle_right, (i3 >> 3) & 14, bVarI), "button", dVarB, j, bVar, 48, 0);
        } else {
            z2 = z;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wgr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jhr.g(qj40.a(i | 1), (a) obj, dVar, function0, z2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final d dVar, final float f, final khr.g gVar, final Function1<? super ler, Unit> function1, a aVar, final int i) {
        int i2;
        Object obj;
        b bVarI = aVar.i(-94921666);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = gVar;
            i2 |= bVarI.M(obj) ? 256 : 128;
        } else {
            obj = gVar;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            qyd0 qyd0Var = ejb0.a;
            d dVarI = h.i(dVar, f, ((cjb0) bVarI.O(qyd0Var)).d, f, ((cjb0) bVarI.O(qyd0Var)).d);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            d dVarR = j.r(h.j(d.a.b, 0.0f, 0.0f, ((cjb0) bVarI.O(qyd0Var)).d, 0.0f, 11), 16.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            xt50 xt50VarB = ut50.b(6.665f, 1, j58.f, false);
            boolean z = (i2 & 7168) == 2048;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new ghr(function1, i3);
                bVarI.r(objY2);
            }
            h6n.b(erz.a(R.drawable.ic_close_24dp, 0, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, androidx.compose.foundation.d.b(dVarR, pswVar, xt50VarB, false, null, mla.d((Function0) objY2, bVarI, 0), 28), ((lib0) bVarI.O(oib0.a)).c0, bVarI, 48, 0);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new hhr();
                bVarI.r(objY3);
            }
            Function1 function2 = (Function1) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new kgr();
                bVarI.r(objY4);
            }
            androidx.compose.animation.a.b(obj, layoutWeightElement, function2, null, "ln_stream_ticket_window_show_state", (Function1) objY4, pp8.b(434441412, new iaj() { // from class: lgr
                @Override // defpackage.iaj
                public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                    khr.g gVar2 = (khr.g) obj3;
                    a aVar3 = (a) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((pf0) obj2).getClass();
                    gVar2.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= aVar3.M(gVar2) ? 32 : 16;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 145) != 144)) {
                        boolean zEquals = gVar2.equals(khr.e.a);
                        d.a aVar4 = d.a.b;
                        if (zEquals) {
                            aVar3.N(886372566);
                            jhr.e(j.g(aVar4, 1.0f), aVar3, 6);
                            aVar3.H();
                        } else if (gVar2.equals(khr.f.a)) {
                            aVar3.N(886375927);
                            jhr.f(j.g(aVar4, 1.0f), aVar3, 6);
                            aVar3.H();
                        } else {
                            if (!(gVar2 instanceof khr.c)) {
                                throw rg.a(886370633, aVar3);
                            }
                            aVar3.N(886379578);
                            jhr.b(j.g(aVar4, 1.0f), (khr.c) gVar2, function1, aVar3, (iIntValue & 112) | 6);
                            aVar3.H();
                        }
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 1794432, 8);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mgr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    jhr.h(dVar, f, gVar, function1, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final d dVar, final String str, final qcn<ggr> qcnVar, a aVar, final int i) {
        b bVarI = aVar.i(1950504954);
        int i2 = (bVarI.M(str) ? 32 : 16) | i | (bVarI.M(qcnVar) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            String strA = cb40.a(R.string.page_lucky_numbers__streaming_hint_ticket_id, new Object[]{str}, bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).n;
            long j = ((lib0) bVarI.O(oib0.a)).o;
            d.a aVar3 = d.a.b;
            lkf0.d(strA, aVar3, j, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0Var, bVarI, 48, 24960, 110584);
            bVarI = bVarI;
            y1i.b(zqu.a(1.0f, h.j(aVar3, ((cjb0) bVarI.O(ejb0.a)).c, 0.0f, 0.0f, 0.0f, 14), true), new kw0.i(4.0f, true, new hw0()), new kw0.i(4.0f, true, new hw0()), null, 0, 0, pp8.b(965154449, new gaj() { // from class: xgr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((o2i) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Iterator<E> it = qcnVar.iterator();
                        while (it.hasNext()) {
                            jhr.a((ggr) it.next(), aVar4, 0);
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1573296, 56);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, qcnVar, i) { // from class: ygr
                public final /* synthetic */ String b;
                public final /* synthetic */ qcn c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    jhr.i(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final float f, final float f2, final khr khrVar, final Function1<? super ler, Unit> function1, a aVar, final int i) {
        b bVarI = aVar.i(-1428170076);
        int i2 = i | (bVarI.c(f) ? 4 : 2) | (bVarI.c(f2) ? 32 : 16) | (bVarI.M(khrVar) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = khrVar instanceof khr.d;
            gzg0 gzg0VarE = yi0.e(220, 0, null, 6);
            twd0 twd0VarA = xe0.a(z ? b : 0.0f, gzg0VarE, "ticket_window_top_padding", bVarI, 432, 8);
            twd0 twd0VarA2 = xe0.a(z ? 4.0f : 0.0f, gzg0VarE, "ticket_window_start_corner", bVarI, 432, 8);
            d dVarB = androidx.compose.foundation.a.b(ls7.a(h.j(d.a.b, 0.0f, ((g7f) twd0VarA.getValue()).a, 0.0f, 0.0f, 13), j060.d(((g7f) twd0VarA2.getValue()).a, 0.0f, 0.0f, ((g7f) twd0VarA2.getValue()).a)), a, zk40.a);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            boolean z2 = (i2 & 7168) == 2048;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new bhr(0, function1);
                bVarI.r(objY2);
            }
            d dVarB2 = androidx.compose.foundation.d.b(dVarB, pswVar, null, z, null, mla.d((Function0) objY2, bVarI, 0), 24);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
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
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new chr();
                bVarI.r(objY3);
            }
            Function1 function2 = (Function1) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new dhr();
                bVarI.r(objY4);
            }
            androidx.compose.animation.a.b(khrVar, null, function2, n54Var, "ln_stream_ticket_window_content", (Function1) objY4, pp8.b(1651597840, new iaj() { // from class: ehr
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    khr khrVar2 = (khr) obj2;
                    a aVar3 = (a) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((pf0) obj).getClass();
                    khrVar2.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= aVar3.M(khrVar2) ? 32 : 16;
                    }
                    if (!aVar3.q(iIntValue & 1, (iIntValue & 145) != 144)) {
                        aVar3.G();
                    } else if (khrVar2.equals(khr.b.a) || khrVar2.equals(khr.a.a)) {
                        aVar3.N(-1952370508);
                        aVar3.H();
                    } else if (khrVar2.equals(khr.d.a)) {
                        aVar3.N(-1952368691);
                        jhr.c(6, aVar3);
                        aVar3.H();
                    } else {
                        if (!(khrVar2 instanceof khr.g)) {
                            throw rg.a(-1952373825, aVar3);
                        }
                        aVar3.N(-393797964);
                        jhr.h(j.w(d.a.b, f), f2, (khr.g) khrVar2, function1, aVar3, (iIntValue << 3) & 896);
                        aVar3.H();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 1797504, 2);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, f2, khrVar, function1, i) { // from class: fhr
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ khr c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    jhr.j(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
