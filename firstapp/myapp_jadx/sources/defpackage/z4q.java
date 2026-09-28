package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z4q {
    public static final void a(szr szrVar, final UiText uiText, qcn<s4q> qcnVar, final Function1<? super hsq, Unit> function1, final Function1<? super s4q, Unit> function2, final Function1<? super String, Unit> function3) {
        uiText.getClass();
        qcnVar.getClass();
        szr.h(szrVar, "tag_title", new op8(-668021926, new gaj() { // from class: t4q
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                gwr gwrVar = (gwr) obj;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gwrVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar.M(gwrVar) ? 4 : 2;
                }
                if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d dVarJ = h.j(gwrVar.c(d.a.b, yi0.e(300, 0, null, 6), yi0.d(0.0f, 200.0f, null, 5), yi0.e(300, 0, null, 6)), 8.0f, 12.0f, 0.0f, 8.0f, 4);
                    UiText uiText2 = uiText;
                    uiText2.getClass();
                    lkf0.d(uiText2.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b)), dVarJ, ((lib0) aVar.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).j, aVar, 0, 0, 131064);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true), 2);
        for (final s4q s4qVar : qcnVar) {
            szrVar.i(inm.a("country_", s4qVar.a), "country", new op8(-1232746815, new gaj() { // from class: u4q
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    gwr gwrVar = (gwr) obj;
                    a aVar = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    gwrVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar.M(gwrVar) ? 4 : 2;
                    }
                    if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        qyd0 qyd0Var = oib0.a;
                        final long j = ((lib0) aVar.O(qyd0Var)).A;
                        gzg0 gzg0VarE = yi0.e(300, 0, null, 6);
                        gzg0 gzg0VarE2 = yi0.e(300, 0, null, 6);
                        fkd0 fkd0VarD = yi0.d(0.0f, 200.0f, null, 5);
                        d.a aVar2 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(j.g(j.i(gwrVar.c(aVar2, gzg0VarE, fkd0VarD, gzg0VarE2), 40.0f), 1.0f), ((lib0) aVar.O(qyd0Var)).n0, zk40.a);
                        final Function1 function4 = function2;
                        boolean zM = aVar.M(function4);
                        final s4q s4qVar2 = s4qVar;
                        boolean zA = zM | aVar.A(s4qVar2);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new Function0() { // from class: w4q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function4.invoke(s4qVar2);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        d dVarD = androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY, 15);
                        boolean zE = aVar.e(j);
                        Object objY2 = aVar.y();
                        if (zE || objY2 == c0042a) {
                            objY2 = new Function1() { // from class: x4q
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    tcf tcfVar = (tcf) obj4;
                                    tcfVar.getClass();
                                    float fC1 = tcfVar.C1(0.5f);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) - (fC1 / 2.0f);
                                    tcf.Z1(tcfVar, j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), fC1, 0, null, 496);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY2);
                        }
                        d dVarF = h.f(androidx.compose.ui.draw.a.a(dVarD, (Function1) objY2), 8.0f);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar, 48);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarF);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar3);
                        } else {
                            aVar.p();
                        }
                        hlh0.a(aVar, d160VarA, yka.a.f);
                        hlh0.a(aVar, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        hlh0.a(aVar, dVarC, yka.a.d);
                        dcq.a(h.j(aVar2, 0.0f, 0.0f, 8.0f, 0.0f, 11), s4qVar2.d, false, aVar, 6, 4);
                        lkf0.d(s4qVar2.b, new LayoutWeightElement(1.0f, true), ((lib0) aVar.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).i, aVar, 0, 384, 126968);
                        h6n.b(erz.a(R.drawable.arrow_down, 0, aVar), "Expand Icon", p1a.a(j.r(aVar2, 12.0f), ((Number) xe0.b(s4qVar2.e ? -180.0f : 0.0f, yi0.e(300, 0, xkf.b, 2), "rotationAnimation", null, aVar, 3072, 20).getValue()).floatValue()), ((lib0) aVar.O(qyd0Var)).P, aVar, 48, 0);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
            if (s4qVar.e) {
                for (final hsq hsqVar : s4qVar.f) {
                    szrVar.i(inm.a("lottery_", hsqVar.a), "lottery", new op8(1776904339, new gaj() { // from class: v4q
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            gwr gwrVar = (gwr) obj;
                            a aVar = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            gwrVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar.M(gwrVar) ? 4 : 2;
                            }
                            if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                d dVarC = gwrVar.c(d.a.b, yi0.e(300, 0, null, 6), yi0.d(0.0f, 200.0f, null, 5), yi0.e(300, 0, null, 6));
                                final Function1 function4 = function1;
                                boolean zM = aVar.M(function4);
                                final hsq hsqVar2 = hsqVar;
                                boolean zA = zM | aVar.A(hsqVar2);
                                Object objY = aVar.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new Function0() { // from class: y4q
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function4.invoke(hsqVar2);
                                            return Unit.a;
                                        }
                                    };
                                    aVar.r(objY);
                                }
                                bmt.b(dVarC, hsqVar2, (Function0) objY, function3, null, null, aVar, 0);
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
            }
        }
    }
}
