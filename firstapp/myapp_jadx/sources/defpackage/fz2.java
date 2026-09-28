package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fz2 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fz2(int i, Object obj, Function1 function1) {
        this.a = i;
        this.c = obj;
        this.b = function1;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        d.a aVar = d.a.b;
        final Function1 function1 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                qcn<ez2> qcnVar = (qcn) obj4;
                o2i o2iVar = (o2i) obj;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                o2iVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar2.M(o2iVar) ? 4 : 2;
                }
                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    for (final ez2 ez2Var : qcnVar) {
                        d dVarA = o2iVar.a(1.0f, aVar, true);
                        boolean zM = aVar2.M(function1) | aVar2.M(ez2Var);
                        Object objY = aVar2.y();
                        if (zM || objY == c0042a) {
                            objY = new Function0() { // from class: hz2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(new yw2.k(ez2Var.a));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY);
                        }
                        jz2.a(dVarA, ez2Var, (Function0) objY, aVar2, 0);
                    }
                } else {
                    aVar2.G();
                }
                break;
            default:
                final h0s h0sVar = (h0s) obj4;
                r75 r75Var = (r75) obj;
                a aVar3 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                r75Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= aVar3.M(r75Var) ? 4 : 2;
                }
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    float fA = qvf.a(r75Var.d(), 0.0f);
                    d dVarE = j.e(aVar, 1.0f);
                    umz umzVarA = h.a(2, fA, 0.0f);
                    boolean zA = aVar3.A(h0sVar) | aVar3.M(function1);
                    Object objY2 = aVar3.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: xuu
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                szr szrVar = (szr) obj5;
                                szrVar.getClass();
                                final h0s h0sVar2 = h0sVar;
                                int iC = h0sVar2.c();
                                androidx.paging.compose.a aVar4 = new androidx.paging.compose.a(h0sVar2, new yuu(0));
                                final Function1 function2 = function1;
                                szr.f(szrVar, iC, aVar4, new op8(2020511396, new iaj() { // from class: zuu
                                    @Override // defpackage.iaj
                                    public final Object d(Object obj6, Object obj7, Object obj8, Object obj9) {
                                        StringUiText stringUiText;
                                        final vde0 vde0Var;
                                        String str;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        a aVar5 = (a) obj8;
                                        int iIntValue4 = ((Integer) obj9).intValue();
                                        ((gwr) obj6).getClass();
                                        if ((iIntValue4 & 48) == 0) {
                                            iIntValue4 |= aVar5.d(iIntValue3) ? 32 : 16;
                                        }
                                        if (aVar5.q(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                            h0s h0sVar3 = h0sVar2;
                                            vde0 vde0Var2 = (vde0) h0sVar3.b(iIntValue3);
                                            if (vde0Var2 == null) {
                                                aVar5.N(-911501846);
                                                aVar5.H();
                                            } else {
                                                String str2 = vde0Var2.a;
                                                Date date = vde0Var2.b;
                                                aVar5.N(-911501845);
                                                vde0 vde0Var3 = iIntValue3 > 0 ? (vde0) h0sVar3.b(iIntValue3 - 1) : null;
                                                if (vde0Var3 == null || !gsc.e(vde0Var3.b, date)) {
                                                    String strC = bwf0.c(date.getTime(), null);
                                                    StringUiText stringUiText2 = vch0.a;
                                                    stringUiText = new StringUiText(strC);
                                                } else {
                                                    stringUiText = null;
                                                }
                                                i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar5, 0);
                                                int iHashCode = Long.hashCode(aVar5.m());
                                                ne00 ne00VarO = aVar5.o();
                                                d.a aVar6 = d.a.b;
                                                d dVarC = c.c(aVar5, aVar6);
                                                yka.k.getClass();
                                                tsr.a aVar7 = yka.a.b;
                                                if (aVar5.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar5.D();
                                                if (aVar5.g()) {
                                                    aVar5.F(aVar7);
                                                } else {
                                                    aVar5.p();
                                                }
                                                hlh0.a(aVar5, i78VarA, yka.a.f);
                                                hlh0.a(aVar5, ne00VarO, yka.a.e);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                                                }
                                                hlh0.a(aVar5, dVarC, yka.a.d);
                                                if (stringUiText != null) {
                                                    aVar5.N(-394122781);
                                                    vde0Var = vde0Var2;
                                                    str = str2;
                                                    lkf0.e(stringUiText.a((Context) aVar5.O(AndroidCompositionLocals_androidKt.b)), j.A(h.h(androidx.compose.foundation.a.b(j.i(j.g(aVar6, 1.0f), 30.0f), c68.a(R.color.background_type1_tertiary, aVar5), zk40.a), 16.0f, 0.0f, 2), ht.a.k, 2), c68.a(R.color.text_type1_primary, aVar5), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.B2_R, aVar5), aVar5, 0, 0, 262136);
                                                    aVar5 = aVar5;
                                                    aVar5.H();
                                                } else {
                                                    vde0Var = vde0Var2;
                                                    str = str2;
                                                    aVar5.N(-393320346);
                                                    aVar5.H();
                                                }
                                                String strA = inm.a("MatchAlertItemTitle_", str);
                                                op8 op8VarB = pp8.b(134818405, new Function2() { // from class: bvu
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj10, Object obj11) {
                                                        a aVar8 = (a) obj10;
                                                        int iIntValue5 = ((Integer) obj11).intValue();
                                                        if (aVar8.q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                            i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar8, 0);
                                                            int iHashCode2 = Long.hashCode(aVar8.m());
                                                            ne00 ne00VarO2 = aVar8.o();
                                                            d dVarC2 = c.c(aVar8, d.a.b);
                                                            yka.k.getClass();
                                                            tsr.a aVar9 = yka.a.b;
                                                            if (aVar8.k() == null) {
                                                                l2a.b();
                                                                throw null;
                                                            }
                                                            aVar8.D();
                                                            if (aVar8.g()) {
                                                                aVar8.F(aVar9);
                                                            } else {
                                                                aVar8.p();
                                                            }
                                                            hlh0.a(aVar8, i78VarA2, yka.a.f);
                                                            hlh0.a(aVar8, ne00VarO2, yka.a.e);
                                                            yka.a.C1350a c1350a2 = yka.a.g;
                                                            if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode2))) {
                                                                j3c.a(iHashCode2, aVar8, iHashCode2, c1350a2);
                                                            }
                                                            hlh0.a(aVar8, dVarC2, yka.a.d);
                                                            vde0 vde0Var4 = vde0Var;
                                                            StringUiText stringUiText3 = vde0Var4.c;
                                                            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                                                            lkf0.e(stringUiText3.a((Context) aVar8.O(qyd0Var)), null, c68.a(R.color.text_type1_primary, aVar8), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.B1_R, aVar8), aVar8, 0, 0, 262138);
                                                            String strU = bwf0.u(vde0Var4.b);
                                                            StringUiText stringUiText4 = vch0.a;
                                                            lkf0.e(new StringUiText(strU).a((Context) aVar8.O(qyd0Var)), null, c68.a(R.color.text_type1_secondary, aVar8), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.C1_R, aVar8), aVar8, 0, 0, 262138);
                                                            aVar8.s();
                                                        } else {
                                                            aVar8.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar5);
                                                gk80 gk80Var = gk80.a;
                                                String strA2 = inm.a("MatchAlertItemSwitch_", str);
                                                boolean z = vde0Var.d;
                                                final Function1 function3 = function2;
                                                boolean zM2 = aVar5.M(function3) | aVar5.A(vde0Var);
                                                Object objY3 = aVar5.y();
                                                if (zM2 || objY3 == a.C0041a.a) {
                                                    objY3 = new Function1() { // from class: cvu
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj10) {
                                                            ((Boolean) obj10).getClass();
                                                            function3.invoke(vde0Var);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar5.r(objY3);
                                                }
                                                ck80.h(null, strA, op8VarB, strA2, z, (Function1) objY3, false, null, null, 0, aVar5, 3456, 1921);
                                                aVar5.s();
                                                aVar5.H();
                                            }
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true), 4);
                                szr.h(szrVar, null, new op8(133639259, new avu(h0sVar2, 0), true), 3);
                                return Unit.a;
                            }
                        };
                        aVar3.r(objY2);
                    }
                    aur.a(dVarE, null, umzVarA, false, null, ht.a.n, null, false, null, (Function1) objY2, aVar3, 196614, 474);
                } else {
                    aVar3.G();
                }
                break;
        }
        return Unit.a;
    }
}
