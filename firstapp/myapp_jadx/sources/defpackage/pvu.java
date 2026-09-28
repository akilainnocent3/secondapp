package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class pvu {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, tmz tmzVar, final boolean z, final Function1 function1, final h0s h0sVar, final Function1 function2, final Function0 function0, a aVar, final int i) {
        int i2;
        final tmz tmzVar2;
        boolean z2;
        boolean z3;
        b bVarI = aVar.i(1099413014);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tmzVar2 = tmzVar;
            i2 |= bVarI.M(tmzVar2) ? 32 : 16;
        } else {
            tmzVar2 = tmzVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= bVarI.b(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? bVarI.M(h0sVar) : bVarI.A(h0sVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            d dVarE = j.e(h.e(dVar, tmzVar), 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            op8 op8Var = fe9.a;
            gk80 gk80Var = gk80.a;
            int i3 = i2 << 9;
            int i4 = 0;
            ck80.h(null, "ReceiveMatchAlertsTitle", op8Var, "ReceiveMatchAlertsSwitch", z2, function1, false, null, null, R.color.background_type1_primary, bVarI, (458752 & i3) | 28080 | (i3 & 3670016), 897);
            bVarI = bVarI;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Boolean boolValueOf = Boolean.valueOf(h0sVar.d().f);
            Boolean boolValueOf2 = Boolean.valueOf(h0sVar.d().g);
            Integer numValueOf = Integer.valueOf(h0sVar.c());
            boolean z4 = (57344 & i2) == 16384 || ((i2 & 32768) != 0 && bVarI.A(h0sVar));
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new lvu(h0sVar, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.f(boolValueOf, boolValueOf2, numValueOf, (Function2) objY2, bVarI);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                int iC = h0sVar.c();
                d.a aVar3 = d.a.b;
                if (iC == 0) {
                    bVarI.N(1142416601);
                    z3 = true;
                    q75.a(j.e(aVar3, 1.0f), null, false, pp8.b(-521108378, new ivu(function0, i4), bVarI), bVarI, 3078, 6);
                    bVarI.X(false);
                } else {
                    z3 = true;
                    bVarI.N(1144294705);
                    q75.a(j.e(aVar3, 1.0f), null, false, pp8.b(-462394746, new fz2(1, h0sVar, function2), bVarI), bVarI, 3078, 6);
                    bVarI.X(false);
                }
            } else {
                bVarI.N(1142185620);
                d(9, true, bVarI, 54, 0);
                bVarI.X(false);
                z3 = true;
            }
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jvu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pvu.a(dVar, tmzVar2, z, function1, h0sVar, function2, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Function0 function0, final Function0 function1, final rvu rvuVar, a aVar, int i) {
        b bVarA = v2g.a(function0, function1, aVar, 2011376468);
        int i2 = (bVarA.A(function0) ? 4 : 2) | i | (bVarA.A(function1) ? 32 : 16) | 128;
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            bVarA.A0();
            if ((i & 1) == 0 || bVarA.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarA);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                rvuVar = (rvu) p8i0.a(jq40.a(rvu.class), w8i0VarA, null, cll.a(w8i0VarA, bVarA), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarA);
            } else {
                bVarA.G();
            }
            bVarA.Y();
            o0z.a(null, null, null, null, null, pp8.b(-1075033019, new Function2() { // from class: uuu
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        rvu rvuVar2 = rvuVar;
                        h0s h0sVarA = k0s.a(rvuVar2.B, aVar2);
                        boolean zBooleanValue = ((Boolean) wyh.c(rvuVar2.C, aVar2, 0, 7).getValue()).booleanValue();
                        boolean zA = aVar2.A(rvuVar2);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            mvu mvuVar = new mvu(1, rvuVar2, rvu.class, "toggleReceiveMatchAlerts", "toggleReceiveMatchAlerts(Z)V", 0);
                            aVar2.r(mvuVar);
                            objY = mvuVar;
                        }
                        Function1 function2 = (Function1) ((chp) objY);
                        boolean zA2 = aVar2.A(rvuVar2);
                        Object objY2 = aVar2.y();
                        if (zA2 || objY2 == c0042a) {
                            nvu nvuVar = new nvu(1, rvuVar2, rvu.class, "toggleSubscribedEventEnabling", "toggleSubscribedEventEnabling(Lcom/sporty/android/platform/features/settings/notification/matchalert/presentation/uistate/SubscribedEventUiState;)Lkotlinx/coroutines/Job;", 8);
                            aVar2.r(nvuVar);
                            objY2 = nvuVar;
                        }
                        Function1 function3 = (Function1) objY2;
                        boolean zA3 = aVar2.A(rvuVar2);
                        Object objY3 = aVar2.y();
                        if (zA3 || objY3 == c0042a) {
                            ovu ovuVar = new ovu(0, rvuVar2, rvu.class, "clickSearchEvents", "clickSearchEvents()Lkotlinx/coroutines/Job;", 8);
                            aVar2.r(ovuVar);
                            objY3 = ovuVar;
                        }
                        pvu.c(null, function0, function1, zBooleanValue, function2, h0sVarA, function3, (Function0) objY3, aVar2, 262144);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVarA, 196608);
            bVarA = bVarA;
        } else {
            bVarA.G();
        }
        rvu rvuVar2 = rvuVar;
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new dvu(function0, function1, rvuVar2, i, 0);
        }
    }

    public static final void c(d dVar, final Function0 function0, final Function0 function1, final boolean z, final Function1 function2, final h0s h0sVar, final Function1 function3, final Function0 function4, a aVar, final int i) {
        b bVar;
        final d dVar2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        h0sVar.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(1384123385);
        int i2 = i | 6 | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(h0sVar) ? 131072 : 65536) | (bVarI.A(function3) ? 1048576 : 524288) | (bVarI.A(function4) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new evu();
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            bVar = bVarI;
            hy60.a(xa80.b(aVar2, false, (Function1) objY), pp8.b(287524533, new Function2() { // from class: fvu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        odd0.c(null, pwo.e(R.string.wap_setting__match_alert, aVar3), function0, function1, aVar3, 0, 1);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, 0, c68.a(R.color.background_type1_quaternary, bVarI), 0L, null, pp8.b(-816980854, new gaj() { // from class: gvu
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        pvu.a(d.a.b, tmzVar, z, function2, h0sVar, function3, function4, aVar3, ((iIntValue << 3) & 112) | 32768);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 805306416, 444);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, z, function2, h0sVar, function3, function4, i) { // from class: hvu
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ h0s f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(262145);
                    pvu.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, final boolean z, a aVar, final int i2, final int i3) {
        int i4;
        b bVarI = aVar.i(-1883506178);
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = i2 | 48;
        } else if ((i2 & 48) == 0) {
            i4 = (bVarI.b(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        if (bVarI.q(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                z = false;
            }
            q75.a(j.e(d.a.b, 1.0f), null, false, pp8.b(1139480552, new gaj() { // from class: kvu
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    int i6 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fA = qvf.a(r75Var.d(), 0.0f);
                        d.a aVar3 = d.a.b;
                        float f = 1.0f;
                        d dVarE = j.e(aVar3, 1.0f);
                        long jA = c68.a(R.color.background_general_primary, aVar2);
                        zk40.a aVar4 = zk40.a;
                        d dVarH = h.h(androidx.compose.foundation.a.b(dVarE, jA, aVar4), fA, 0.0f, 2);
                        kw0.k kVar = kw0.c;
                        n54.a aVar5 = ht.a.m;
                        i78 i78VarA = g78.a(kVar, aVar5, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarH);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar6);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        if (z) {
                            aVar2.N(-2120544485);
                            g75.a(j.i(j.g(androidx.compose.foundation.a.b(aVar3, c68.a(R.color.background_type1_tertiary, aVar2), aVar4), 1.0f), 30.0f), aVar2, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(-2120278288);
                            aVar2.H();
                        }
                        aVar2.N(-206941224);
                        int i7 = i;
                        int[] iArr = new int[i7];
                        int i8 = 0;
                        while (i8 < i7) {
                            int i9 = iArr[i8];
                            d dVarG = j.g(aVar3, f);
                            i78 i78VarA2 = g78.a(kVar, aVar5, aVar2, i6);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarG);
                            yka.k.getClass();
                            tsr.a aVar7 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar7);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA2, yka.a.f);
                            hlh0.a(aVar2, ne00VarO2, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a2);
                            }
                            hlh0.a(aVar2, dVarC2, yka.a.d);
                            ty0.a(aVar2, j.i(aVar3, 16.0f));
                            g75.a(androidx.compose.foundation.a.a(j.i(j.w(h.j(aVar3, 16.0f, 0.0f, 0.0f, 0.0f, 14), 196.0f), 16.0f), m590.a(null, aVar2, 3), null, 0.0f, 6), aVar2, i6);
                            ty0.a(aVar2, j.i(aVar3, 2.0f));
                            g75.a(androidx.compose.foundation.a.a(j.i(j.w(h.j(aVar3, 16.0f, 0.0f, 0.0f, 0.0f, 14), 60.0f), 12.0f), m590.a(null, aVar2, 3), null, 0.0f, 6), aVar2, 0);
                            g75.a(androidx.compose.foundation.a.a(j.i(wtc.b(aVar3, 16.0f, aVar2, aVar3, 1.0f), 1.0f), m590.a(null, aVar2, 3), null, 0.0f, 6), aVar2, 0);
                            aVar2.s();
                            i8++;
                            f = 1.0f;
                            i6 = 0;
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
            eVarZ.d = new Function2() { // from class: vuu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    pvu.d(i, z, (a) obj, iA, i3);
                    return Unit.a;
                }
            };
        }
    }
}
