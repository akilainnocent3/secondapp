package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class my70 {
    public static final void a(final vt70 vt70Var, final boolean z, final Function0<Unit> function0, a aVar, final int i) {
        long j;
        long j2;
        long j3;
        imf0 imf0Var;
        b bVarI = aVar.i(554682924);
        int i2 = (bVarI.M(vt70Var) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            i060 i060VarC = j060.c(24.0f);
            if (z) {
                bVarI.N(1819987546);
                j = fjb0.b(bVarI).x0;
                bVarI.X(false);
            } else {
                bVarI.N(1820052770);
                j = fjb0.b(bVarI).i0;
                bVarI.X(false);
            }
            if (z) {
                bVarI.N(1820142298);
                j2 = fjb0.b(bVarI).x0;
                bVarI.X(false);
            } else {
                bVarI.N(1820207491);
                j2 = fjb0.b(bVarI).A;
                bVarI.X(false);
            }
            if (z) {
                bVarI.N(1820296926);
                j3 = fjb0.b(bVarI).o;
                bVarI.X(false);
            } else {
                bVarI.N(1820358275);
                j3 = fjb0.b(bVarI).b;
                bVarI.X(false);
            }
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(d35.a(j.i(aVar2, 26.0f), 1.0f, j2, i060VarC), j, i060VarC);
            long j4 = j3;
            d dVarJ = h.j(androidx.compose.foundation.selection.a.b(dVarB, z, false, new su50(4), function0, 10), 6.0f, 0.0f, 10.0f, 0.0f, 10);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
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
            mw90.a(vt70Var.d, null, j.r(aVar2, 16.0f), null, null, null, new gf4(j4, 5), bVarI, 432, 1784);
            String str = vt70Var.c;
            if (z) {
                bVarI.N(1680173171);
                imf0Var = fjb0.e(bVarI).n;
            } else {
                bVarI.N(1680174291);
                imf0Var = fjb0.e(bVarI).o;
            }
            bVarI.X(false);
            lkf0.d(str, null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function0, i) { // from class: by70
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    my70.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final mx70 mx70Var, final Function1 function1, final jaj jajVar, final gaj gajVar, final d dVar, a aVar, final int i) {
        int i2;
        function1.getClass();
        jajVar.getClass();
        gajVar.getClass();
        b bVarI = aVar.i(-402026760);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(mx70Var) : bVarI.A(mx70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(jajVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(gajVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final List<vt70> list = mx70Var.a;
            boolean zA = bVarI.A(list);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new dyu(list, 1);
                bVarI.r(objY);
            }
            final ved vedVarB = eqz.b(0, (Function0) objY, bVarI, 0, 3);
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            String str = mx70Var.b;
            boolean zM = bVarI.M(vedVarB);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = new gy70(vedVarB, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, str, (Function2) objY3);
            Integer numValueOf = Integer.valueOf(vedVarB.k());
            boolean zM2 = bVarI.M(zzrVarA) | bVarI.M(vedVarB);
            Object objY4 = bVarI.y();
            if (zM2 || objY4 == c0042a) {
                objY4 = new hy70(zzrVarA, vedVarB, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY4);
            d dVarE = j.e(dVar, 1.0f);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).i0;
            zk40.a aVar2 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarE, j, aVar2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d.a aVar4 = d.a.b;
            d dVarB2 = androidx.compose.foundation.a.b(j.g(j.i(aVar4, 50.0f), 1.0f), ((lib0) bVarI.O(qyd0Var)).l0, aVar2);
            umz umzVarA = h.a(2, 12.0f, 0.0f);
            kw0.i iVar = new kw0.i(4.0f, true, new hw0());
            boolean zA2 = bVarI.A(list) | bVarI.M(vedVarB) | bVarI.A(v5bVar);
            Object objY5 = bVarI.y();
            if (zA2 || objY5 == c0042a) {
                objY5 = new Function1() { // from class: xx70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        List list2 = list;
                        szrVar.d(list2.size(), null, new ky70(list2), new op8(2039820996, new ly70(list2, vedVarB, v5bVar), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            aur.b(dVarB2, zzrVarA, umzVarA, iVar, ht.a.k, null, false, null, (Function1) objY5, bVarI, 221568, 456);
            ute.b(null, 0.0f, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 0, 3);
            dpz.a(0.0f, 0, 1572912, 16316, ht.a.j, pp8.b(-197648479, new iaj() { // from class: yx70
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    int iIntValue = ((Integer) obj2).intValue();
                    a aVar5 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((opz) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= aVar5.d(iIntValue) ? 32 : 16;
                    }
                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        final vt70 vt70Var = (vt70) list.get(iIntValue);
                        List listK = kotlin.collections.b.k(Boolean.valueOf((vt70Var.e.a.isEmpty() && vt70Var.e.b.isEmpty()) ? false : true), Boolean.valueOf(!vt70Var.f.isEmpty()), Boolean.valueOf(!vt70Var.g.isEmpty()), Boolean.valueOf(!vt70Var.h.isEmpty()), Boolean.valueOf(!vt70Var.i.isEmpty()));
                        if (listK == null || !listK.isEmpty()) {
                            Iterator it = listK.iterator();
                            i3 = 0;
                            while (it.hasNext()) {
                                if (((Boolean) it.next()).booleanValue() && (i3 = i3 + 1) < 0) {
                                    kotlin.collections.b.p();
                                    throw null;
                                }
                            }
                        } else {
                            i3 = 0;
                        }
                        final boolean z = i3 == 1;
                        d dVarE2 = j.e(d.a.b, 1.0f);
                        kw0.i iVar2 = new kw0.i(4.0f, true, new hw0());
                        boolean zA3 = aVar5.A(vt70Var);
                        final Function1 function2 = function1;
                        boolean zM3 = zA3 | aVar5.M(function2);
                        final jaj jajVar2 = jajVar;
                        boolean zM4 = zM3 | aVar5.M(jajVar2);
                        final gaj gajVar2 = gajVar;
                        boolean zM5 = aVar5.M(gajVar2) | zM4 | aVar5.b(z);
                        Object objY6 = aVar5.y();
                        if (zM5 || objY6 == a.C0041a.a) {
                            Function1 function3 = new Function1() { // from class: ay70
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    final boolean z2;
                                    szr szrVar = (szr) obj5;
                                    szrVar.getClass();
                                    final vt70 vt70Var2 = vt70Var;
                                    List<zv70> list2 = vt70Var2.i;
                                    vw70 vw70Var = vt70Var2.e;
                                    boolean zIsEmpty = list2.isEmpty();
                                    final Function1 function4 = function2;
                                    if (!zIsEmpty) {
                                        szr.h(szrVar, "games", new op8(-406652815, new gaj() { // from class: cy70
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                a aVar6 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                ((gwr) obj6).getClass();
                                                if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    cyj.b(0, aVar6, null, vt70Var2.i, function4);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 2);
                                    }
                                    boolean zIsEmpty2 = vw70Var.a.isEmpty();
                                    final jaj jajVar3 = jajVar2;
                                    final gaj gajVar3 = gajVar2;
                                    boolean z3 = z;
                                    if (zIsEmpty2 && vw70Var.b.isEmpty()) {
                                        z2 = z3;
                                    } else {
                                        z2 = z3;
                                        szr.h(szrVar, "matches", new op8(-1822821094, new gaj() { // from class: dy70
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                a aVar6 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                ((gwr) obj6).getClass();
                                                if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    bav.b(vt70Var2.e, function4, jajVar3, gajVar3, z2, null, aVar6, 0);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 2);
                                    }
                                    if (!vt70Var2.f.isEmpty()) {
                                        szr.h(szrVar, "teams", new op8(-251586311, new gaj() { // from class: ey70
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                a aVar6 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                ((gwr) obj6).getClass();
                                                if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    vt70 vt70Var3 = vt70Var2;
                                                    kaf0.a(vt70Var3.b, vt70Var3.f, function4, z2, null, aVar6, 0);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 2);
                                    }
                                    if (!vt70Var2.g.isEmpty()) {
                                        szr.h(szrVar, "tournaments", new op8(1319648472, new gaj() { // from class: fy70
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                a aVar6 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                ((gwr) obj6).getClass();
                                                if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    vt70 vt70Var3 = vt70Var2;
                                                    rig0.a(vt70Var3.b, vt70Var3.g, function4, z2, null, aVar6, 0);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 2);
                                    }
                                    if (!vt70Var2.h.isEmpty()) {
                                        szr.h(szrVar, "players", new op8(-1404084041, new gaj() { // from class: wx70
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                a aVar6 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                ((gwr) obj6).getClass();
                                                if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    zq10.b(vt70Var2.h, function4, jajVar3, gajVar3, z2, null, aVar6, 0);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 2);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar5.r(function3);
                            objY6 = function3;
                        }
                        aur.a(dVarE2, null, null, false, iVar2, null, null, false, null, (Function1) objY6, aVar5, 24582, 494);
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, null, vedVarB, null, null, bVarI, j.e(aVar4, 1.0f), null, false);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zx70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    my70.b(mx70Var, function1, jajVar, gajVar, dVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
