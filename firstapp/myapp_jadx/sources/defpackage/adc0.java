package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class adc0 {
    public static final void a(final lgc0 lgc0Var, final Function2 function2, d dVar, final boolean z, final long j, a aVar, final int i) {
        final d dVar2;
        int i2;
        b bVarI = aVar.i(-772741238);
        int i3 = i | (bVarI.A(lgc0Var) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16) | 384 | (bVarI.b(z) ? 2048 : 1024) | (bVarI.e(j) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            i060 i060VarC = j060.c(40.0f);
            l35 l35VarA = m35.a(2.0f, j);
            fg6 fg6VarB = gg6.b(((lib0) bVarI.O(oib0.a)).t0, 0L, bVarI, 24576, 14);
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.i(h.j(aVar2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 55.0f), 16.0f, 0.0f, 2);
            boolean z2 = !z;
            boolean z3 = ((i3 & 14) == 4 || bVarI.A(lgc0Var)) | ((i3 & 112) == 32);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z3 || objY == c0042a) {
                i2 = 1;
                objY = new ws3(1, function2, lgc0Var);
                bVarI.r(objY);
            } else {
                i2 = 1;
            }
            d dVarD = androidx.compose.foundation.d.d(dVarH, z2, null, null, (Function0) objY, 14);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new pcc0();
                bVarI.r(objY2);
            }
            rg6.a(g3w.h(xa80.b(dVarD, false, (Function1) objY2), "sporty_legends_recommended_row"), i060VarC, fg6VarB, null, l35VarA, pp8.b(1803354840, new t7r(lgc0Var, i2), bVarI), bVarI, 196608, 8);
            bVarI = bVarI;
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, dVar2, z, j, i) { // from class: qcc0
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ d c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ long e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    adc0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final String str, final xnc0 xnc0Var, final qcn qcnVar, final qcn qcnVar2, final Function1 function1, final Function1 function2, final Function2 function3, a aVar, final int i) {
        final Function1 function4;
        Function1 function5;
        Function2 function6;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function7;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(1627882078);
        int i2 = (i & 6) == 0 ? (bVarI.M(dVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(xnc0Var) : bVarI.A(xnc0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? bVarI.M(qcnVar2) : bVarI.A(qcnVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            function4 = function1;
            i2 |= bVarI.A(function4) ? 131072 : 65536;
        } else {
            function4 = function1;
        }
        if ((1572864 & i) == 0) {
            function5 = function2;
            i2 |= bVarI.A(function5) ? 1048576 : 524288;
        } else {
            function5 = function2;
        }
        if ((12582912 & i) == 0) {
            function6 = function3;
            i2 |= bVarI.A(function6) ? 8388608 : 4194304;
        } else {
            function6 = function3;
        }
        if (bVarI.q(i2 & 1, (i2 & 4793491) != 4793490)) {
            if (qcnVar.isEmpty()) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                }
                final Function1 function8 = function5;
                final Function2 function9 = function6;
                function7 = new Function2() { // from class: occ0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        adc0.b(dVar, str, xnc0Var, qcnVar, qcnVar2, function4, function8, function9, (a) obj, qj40.a(i | 1));
                        return Unit.a;
                    }
                };
            } else {
                Iterator<E> it = qcnVar.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (((cdc0) it.next()).a.equals(str)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                cdc0 cdc0Var = (cdc0) CollectionsKt.V(i3, qcnVar);
                Object obj = null;
                String str2 = cdc0Var != null ? cdc0Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                for (Object obj2 : qcnVar2) {
                    if (((bdc0) obj2).a.equals(str2)) {
                        obj = obj2;
                        break;
                    }
                }
                final bdc0 bdc0Var = (bdc0) obj;
                if (bdc0Var == null) {
                    eVarZ = bVarI.Z();
                    if (eVarZ == null) {
                        return;
                    } else {
                        function7 = new Function2() { // from class: tcc0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                adc0.b(dVar, str, xnc0Var, qcnVar, qcnVar2, function1, function2, function3, (a) obj3, qj40.a(i | 1));
                                return Unit.a;
                            }
                        };
                    }
                } else {
                    d dVarJ = h.j(dVar, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                    Object objY = bVarI.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new ucc0();
                        bVarI.r(objY);
                    }
                    d dVarB = xa80.b(dVarJ, false, (Function1) objY);
                    umz umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                    boolean zA = ((i2 & 112) == 32) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && bVarI.A(qcnVar))) | ((458752 & i2) == 131072) | bVarI.A(bdc0Var) | ((29360128 & i2) == 8388608) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && bVarI.A(xnc0Var))) | ((i2 & 3670016) == 1048576);
                    Object objY2 = bVarI.y();
                    if (zA || objY2 == c0042a) {
                        Function1 function10 = new Function1() { // from class: vcc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                szr szrVar = (szr) obj3;
                                szrVar.getClass();
                                final qcn qcnVar3 = qcnVar;
                                final String str3 = str;
                                final Function1 function11 = function1;
                                szr.h(szrVar, null, new op8(-210258381, new gaj() { // from class: xcc0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        a aVar2 = (a) obj5;
                                        int iIntValue = ((Integer) obj6).intValue();
                                        ((gwr) obj4).getClass();
                                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            d.a aVar3 = d.a.b;
                                            d dVarJ2 = h.j(h.h(j.g(aVar3, 1.0f), 20.0f, 0.0f, 2), 0.0f, 20.0f, 0.0f, 0.0f, 13);
                                            d160 d160VarA = b160.a(kw0.e, ht.a.k, aVar2, 54);
                                            int iHashCode = Long.hashCode(aVar2.m());
                                            ne00 ne00VarO = aVar2.o();
                                            d dVarC = c.c(aVar2, dVarJ2);
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
                                            crz crzVarA = erz.a(R.drawable.ic_football_16dp, 0, aVar2);
                                            qyd0 qyd0Var = oib0.a;
                                            h9n.a(crzVarA, "football", g3w.h(h.j(aVar3, 0.0f, 0.0f, 4.0f, 0.0f, 11), "sporty_legends_pick_match_football_icon"), null, null, 0.0f, new gf4(((lib0) aVar2.O(qyd0Var)).a0, 5), aVar2, 432, 56);
                                            lkf0.d(cb40.a(R.string.page_instant_virtual__pick_your_own_match_and_bet_instantly, new Object[0], aVar2), g3w.h(aVar3, "sporty_legends_pick_match_title_text"), ((lib0) aVar2.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar2), aVar2, 48, 0, 131064);
                                            aVar2.s();
                                            d dVarH = h.h(aVar3, 0.0f, 12.0f, 1);
                                            Function1 function12 = function11;
                                            boolean zM = aVar2.M(function12);
                                            Object objY3 = aVar2.y();
                                            if (zM || objY3 == a.C0041a.a) {
                                                objY3 = new qgm(function12, 1);
                                                aVar2.r(objY3);
                                            }
                                            jdc0.a(dVarH, str3, qcnVar3, (Function1) objY3, aVar2, 6);
                                        } else {
                                            aVar2.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true), 3);
                                bdc0 bdc0Var2 = bdc0Var;
                                final qcn<lgc0> qcnVar4 = bdc0Var2.c;
                                final xnc0 xnc0Var2 = xnc0Var;
                                if (qcnVar4 != null) {
                                    int size = qcnVar4.size();
                                    final Function2 function12 = function3;
                                    szr.f(szrVar, size, null, new op8(1058704628, new iaj() { // from class: ycc0
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            long j;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            a aVar2 = (a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((gwr) obj4).getClass();
                                            if ((iIntValue2 & 48) == 0) {
                                                iIntValue2 |= aVar2.d(iIntValue) ? 32 : 16;
                                            }
                                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                                List list = qcnVar4;
                                                lgc0 lgc0Var = (lgc0) list.get(iIntValue);
                                                lgc0 lgc0Var2 = (lgc0) list.get(iIntValue);
                                                xnc0 xnc0Var3 = xnc0Var2;
                                                boolean zC = adc0.c(xnc0Var3, lgc0Var2);
                                                if (adc0.c(xnc0Var3, (lgc0) list.get(iIntValue))) {
                                                    aVar2.N(-53908300);
                                                    j = ((lib0) aVar2.O(oib0.a)).H0;
                                                    aVar2.H();
                                                } else {
                                                    aVar2.N(-53861583);
                                                    j = ((lib0) aVar2.O(oib0.a)).H;
                                                    aVar2.H();
                                                }
                                                adc0.a(lgc0Var, function12, null, zC, j, aVar2, 8);
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 6);
                                } else {
                                    final qcn<enc0> qcnVar5 = bdc0Var2.d;
                                    if (qcnVar5 != null) {
                                        final Function1 function13 = function2;
                                        szr.h(szrVar, null, new op8(1765907860, new gaj() { // from class: zcc0
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                a aVar2 = (a) obj5;
                                                int iIntValue = ((Integer) obj6).intValue();
                                                ((gwr) obj4).getClass();
                                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    d dVarH = h.h(j.g(d.a.b, 1.0f), 16.0f, 0.0f, 2);
                                                    kw0.i iVar = new kw0.i(20.0f, true, new hw0());
                                                    kw0.i iVar2 = new kw0.i(8.0f, true, new hw0());
                                                    final List list = qcnVar5;
                                                    final xnc0 xnc0Var3 = xnc0Var2;
                                                    final Function1 function14 = function13;
                                                    y1i.b(dVarH, iVar, iVar2, null, 2, 0, pp8.b(-480004487, new gaj() { // from class: rcc0
                                                        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
                                                        @Override // defpackage.gaj
                                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                            boolean z;
                                                            long j;
                                                            xnc0 xnc0Var4 = xnc0Var3;
                                                            enc0 enc0Var = xnc0Var4.b;
                                                            o2i o2iVar = (o2i) obj7;
                                                            a aVar3 = (a) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            o2iVar.getClass();
                                                            if ((iIntValue2 & 6) == 0) {
                                                                iIntValue2 |= aVar3.M(o2iVar) ? 4 : 2;
                                                            }
                                                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                                for (final enc0 enc0Var2 : list) {
                                                                    d dVarA = o2iVar.a(1.0f, d.a.b, true);
                                                                    String str4 = enc0Var2 != null ? enc0Var2.a : null;
                                                                    enc0 enc0Var3 = xnc0Var4.c;
                                                                    if (Intrinsics.g(str4, enc0Var != null ? enc0Var.a : null)) {
                                                                        z = true;
                                                                    } else if (Intrinsics.g(enc0Var2 != null ? enc0Var2.a : null, enc0Var3 != null ? enc0Var3.a : null)) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    boolean z2 = !z;
                                                                    final Function1 function15 = function14;
                                                                    boolean zM = aVar3.M(function15) | aVar3.A(enc0Var2);
                                                                    Object objY3 = aVar3.y();
                                                                    if (zM || objY3 == a.C0041a.a) {
                                                                        objY3 = new Function0() { // from class: scc0
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Object invoke() {
                                                                                function15.invoke(enc0Var2);
                                                                                return Unit.a;
                                                                            }
                                                                        };
                                                                        aVar3.r(objY3);
                                                                    }
                                                                    d dVarD = androidx.compose.foundation.d.d(dVarA, z2, null, null, (Function0) objY3, 14);
                                                                    String str5 = enc0Var2 != null ? enc0Var2.a : null;
                                                                    if (Intrinsics.g(str5, enc0Var != null ? enc0Var.a : null)) {
                                                                        aVar3.N(1299165536);
                                                                        j = ((lib0) aVar3.O(oib0.a)).H0;
                                                                        aVar3.H();
                                                                    } else if (Intrinsics.g(str5, enc0Var3 != null ? enc0Var3.a : null)) {
                                                                        aVar3.N(1299167263);
                                                                        j = ((lib0) aVar3.O(oib0.a)).Y;
                                                                        aVar3.H();
                                                                    } else {
                                                                        aVar3.N(1299168579);
                                                                        j = ((lib0) aVar3.O(oib0.a)).H;
                                                                        aVar3.H();
                                                                    }
                                                                    inc0.a(dVarD, enc0Var2, j, aVar3, 64);
                                                                }
                                                            } else {
                                                                aVar3.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, aVar2), aVar2, 1597878, 40);
                                                } else {
                                                    aVar2.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 3);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(function10);
                        objY2 = function10;
                    }
                    aur.a(dVarB, null, umzVar, false, null, null, null, false, null, (Function1) objY2, bVarI, 384, 506);
                }
            }
            eVarZ.d = function7;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function7 = new Function2() { // from class: wcc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    adc0.b(dVar, str, xnc0Var, qcnVar, qcnVar2, function1, function2, function3, (a) obj3, qj40.a(i | 1));
                    return Unit.a;
                }
            };
            eVarZ.d = function7;
        }
    }

    public static final boolean c(xnc0 xnc0Var, lgc0 lgc0Var) {
        String str = lgc0Var != null ? lgc0Var.a.a : null;
        enc0 enc0Var = xnc0Var.b;
        if (!Intrinsics.g(str, enc0Var != null ? enc0Var.a : null)) {
            return false;
        }
        String str2 = lgc0Var != null ? lgc0Var.b.a : null;
        enc0 enc0Var2 = xnc0Var.c;
        return Intrinsics.g(str2, enc0Var2 != null ? enc0Var2.a : null);
    }
}
