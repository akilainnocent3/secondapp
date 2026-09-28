package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class hv3 {
    public static final void a(final iv3 iv3Var, final Function1 function1, final Function1 function2, final Function2 function3, final Function2 function4, final Function1 function5, final Function1 function6, final Function2 function7, final Function0 function0, final Function0 function8, final Function0 function9, final Function1 function10, a aVar, final int i) {
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function0.getClass();
        function8.getClass();
        b bVarI = aVar.i(-1114211379);
        int i2 = i | (bVarI.M(iv3Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024) | (bVarI.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function5) ? 131072 : 65536) | (bVarI.A(function6) ? 1048576 : 524288) | (bVarI.A(function7) ? 8388608 : 4194304) | (bVarI.A(function0) ? 67108864 : 33554432) | (bVarI.A(function8) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, ((306783379 & i2) == 306783378 && (((bVarI.A(function9) ? (char) 4 : (char) 2) | (bVarI.A(function10) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            d dVarG = j.g(d.a.b, 1.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new tu3(0);
                bVarI.r(objY);
            }
            q75.a(xa80.b(dVarG, false, (Function1) objY), null, false, pp8.b(-500496201, new gaj() { // from class: wu3
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final iv3 iv3Var2 = iv3Var;
                    kk3 kk3Var = iv3Var2.k;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fE = (r75Var.e() - 48.0f) - (kk3Var != null ? 80.0f : 0.0f);
                        long j = ((lib0) aVar2.O(oib0.a)).i0;
                        zk40.a aVar3 = zk40.a;
                        d.a aVar4 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(aVar4, j, aVar3);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
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
                        d dVarK = j.k(aVar4, 0.0f, fE, 1);
                        boolean zA = aVar2.A(iv3Var2);
                        final Function1 function11 = function1;
                        boolean zM = zA | aVar2.M(function11);
                        final Function1 function12 = function2;
                        boolean zM2 = zM | aVar2.M(function12);
                        final Function2 function13 = function3;
                        boolean zM3 = zM2 | aVar2.M(function13);
                        final Function2 function14 = function4;
                        boolean zM4 = zM3 | aVar2.M(function14);
                        final Function1 function15 = function5;
                        boolean zM5 = zM4 | aVar2.M(function15);
                        final Function1 function16 = function6;
                        boolean zM6 = zM5 | aVar2.M(function16);
                        final Function2 function17 = function7;
                        boolean zM7 = zM6 | aVar2.M(function17);
                        final Function0 function18 = function0;
                        boolean zM8 = zM7 | aVar2.M(function18);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM8 || objY2 == c0042a) {
                            Function1 function19 = new Function1() { // from class: yu3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    szr szrVar = (szr) obj4;
                                    szrVar.getClass();
                                    final iv3 iv3Var3 = iv3Var2;
                                    qcn<ov3> qcnVar = iv3Var3.a;
                                    int size = qcnVar.size();
                                    fv3 fv3Var = new fv3(qcnVar);
                                    Function1 function20 = function11;
                                    final Function1 function21 = function12;
                                    final Function2 function22 = function13;
                                    final Function2 function23 = function14;
                                    final Function1 function24 = function15;
                                    final Function1 function25 = function16;
                                    final Function2 function26 = function17;
                                    szrVar.d(size, null, fv3Var, new op8(802480018, new gv3(qcnVar, function20, function21, function22, function23, function24, function25, function26), true));
                                    szr.h(szrVar, null, new op8(455428876, new gaj() { // from class: av3
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            Unit unit;
                                            a aVar6 = (a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((gwr) obj5).getClass();
                                            if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                UiText uiText = iv3Var3.b;
                                                d.a aVar7 = d.a.b;
                                                if (uiText == null) {
                                                    aVar6.N(-119979597);
                                                    aVar6.H();
                                                    unit = null;
                                                } else {
                                                    aVar6.N(-119979596);
                                                    ro3.a(6, aVar6, h.j(aVar7, 0.0f, 8.0f, 0.0f, 0.0f, 13), uiText);
                                                    aVar6.H();
                                                    unit = Unit.a;
                                                }
                                                if (unit == null) {
                                                    aVar6.N(-419503159);
                                                    ty0.a(aVar6, j.i(aVar7, 8.0f));
                                                } else {
                                                    aVar6.N(-419513296);
                                                }
                                                aVar6.H();
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                    szr.h(szrVar, null, new op8(-9536523, new gaj() { // from class: bv3
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            a aVar6 = (a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((gwr) obj5).getClass();
                                            if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                yv3.a(iv3Var3.c, function21, function22, function23, function24, function25, function26, aVar6, 8);
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                    szr.h(szrVar, null, new op8(-890085164, new gaj() { // from class: cv3
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            a aVar6 = (a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((gwr) obj5).getClass();
                                            if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                jk3.a(cb40.a(R.string.common_functions__total_stake, new Object[0], aVar6), iv3Var3.d, "betslip_total_stake_text", aVar6, 384);
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                    final String str = iv3Var3.e;
                                    if (str != null) {
                                        szr.h(szrVar, null, new op8(1696074796, new gaj() { // from class: dv3
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                a aVar6 = (a) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                ((gwr) obj5).getClass();
                                                if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    jk3.a(cb40.a(R.string.bet_history__wh_tax, new Object[0], aVar6), str, "betslip_withholding_tax_text", aVar6, 384);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 3);
                                    }
                                    final String str2 = iv3Var3.f;
                                    if (str2 != null) {
                                        szr.h(szrVar, null, new op8(-1749715691, new gaj() { // from class: ev3
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                a aVar6 = (a) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                ((gwr) obj5).getClass();
                                                if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    jk3.a(cb40.a(R.string.common_functions__excise_tax, new Object[0], aVar6), str2, "betslip_excise_tax_text", aVar6, 384);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 3);
                                    }
                                    szr.h(szrVar, null, new op8(-1770633805, new gaj() { // from class: uu3
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            a aVar6 = (a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((gwr) obj5).getClass();
                                            if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                b04.a(iv3Var3.g, aVar6, 0);
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                    final Function0 function27 = function18;
                                    szr.h(szrVar, null, new op8(1643784850, new gaj() { // from class: vu3
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            a aVar6 = (a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((gwr) obj5).getClass();
                                            if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                dqk dqkVar = iv3Var3.h;
                                                d.a aVar7 = d.a.b;
                                                Unit unit = null;
                                                if (dqkVar == null) {
                                                    aVar6.N(-1222574968);
                                                    aVar6.H();
                                                } else {
                                                    aVar6.N(-1222574967);
                                                    d dVarG2 = j.g(aVar7, 1.0f);
                                                    aiv aivVarC = g75.c(ht.a.a, false);
                                                    int iHashCode2 = Long.hashCode(aVar6.m());
                                                    ne00 ne00VarO2 = aVar6.o();
                                                    d dVarC2 = c.c(aVar6, dVarG2);
                                                    yka.k.getClass();
                                                    tsr.a aVar8 = yka.a.b;
                                                    if (aVar6.k() == null) {
                                                        l2a.b();
                                                        throw null;
                                                    }
                                                    aVar6.D();
                                                    if (aVar6.g()) {
                                                        aVar6.F(aVar8);
                                                    } else {
                                                        aVar6.p();
                                                    }
                                                    hlh0.a(aVar6, aivVarC, yka.a.f);
                                                    hlh0.a(aVar6, ne00VarO2, yka.a.e);
                                                    yka.a.C1350a c1350a2 = yka.a.g;
                                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode2))) {
                                                        j3c.a(iHashCode2, aVar6, iHashCode2, c1350a2);
                                                    }
                                                    hlh0.a(aVar6, dVarC2, yka.a.d);
                                                    cqk.a(androidx.compose.foundation.layout.d.a.b(h.j(aVar7, 0.0f, 4.0f, 8.0f, 8.0f, 1), ht.a.f), dqkVar, function27, aVar6, 0);
                                                    aVar6.s();
                                                    aVar6.H();
                                                    unit = Unit.a;
                                                }
                                                if (unit == null) {
                                                    aVar6.N(-870704656);
                                                    ty0.a(aVar6, j.i(aVar7, 16.0f));
                                                } else {
                                                    aVar6.N(-870722760);
                                                }
                                                aVar6.H();
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(function19);
                            objY2 = function19;
                        }
                        aur.a(dVarK, null, null, false, null, null, null, false, null, (Function1) objY2, aVar2, 0, 510);
                        if (kk3Var == null) {
                            aVar2.N(1919739227);
                            aVar2.H();
                        } else {
                            aVar2.N(1919739228);
                            rk3.b(null, kk3Var, function10, aVar2, 0);
                            aVar2.H();
                        }
                        if (iv3Var2.j) {
                            aVar2.N(1919990700);
                            d dVarI = j.i(j.g(aVar4, 1.0f), 48.0f);
                            Function0 function20 = function9;
                            boolean zM9 = aVar2.M(function20);
                            Object objY3 = aVar2.y();
                            if (zM9 || objY3 == c0042a) {
                                objY3 = new zu3(function20, 0);
                                aVar2.r(objY3);
                            }
                            a6.a(6, aVar2, dVarI, (Function0) objY3);
                            aVar2.H();
                        } else {
                            aVar2.N(1920274381);
                            rg10.a(g3w.h(j.i(j.g(aVar4, 1.0f), 48.0f), "betslip_place_bet_button"), iv3Var2.i, function8, aVar2, 6);
                            aVar2.H();
                        }
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, function4, function5, function6, function7, function0, function8, function9, function10, i) { // from class: xu3
                public final /* synthetic */ Function1 A;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function2 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ Function0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hv3.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
