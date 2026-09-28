package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h1h implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h1h(rhv rhvVar, ytw ytwVar) {
        this.b = rhvVar;
        this.c = ytwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                lb80.h(pb80Var, 6);
                pb80Var.b(ra80.b, new c6(null, new i1h(0, (j1h) obj3, (ooa0) obj2)));
                break;
            default:
                final rhv rhvVar = (rhv) obj3;
                final ytw ytwVar = (ytw) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szr.h(szrVar, null, new op8(-1005673885, new gaj() { // from class: afv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        a aVar = (a) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        ((gwr) obj4).getClass();
                        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            ytw ytwVar2 = ytwVar;
                            String str = ((cgv) ytwVar2.getValue()).f.b;
                            cil cilVar = ((cgv) ytwVar2.getValue()).d;
                            gv1 gv1Var = ((cgv) ytwVar2.getValue()).e;
                            hfv hfvVar = ((cgv) ytwVar2.getValue()).f;
                            String str2 = ((cgv) ytwVar2.getValue()).l;
                            int i2 = ((cgv) ytwVar2.getValue()).g;
                            int i3 = ((cgv) ytwVar2.getValue()).h;
                            cgv cgvVar = (cgv) ytwVar2.getValue();
                            boolean z = cgvVar.g > 0 || cgvVar.h > 0;
                            boolean z2 = ((cgv) ytwVar2.getValue()).m;
                            pfv pfvVar = ((cgv) ytwVar2.getValue()).i;
                            rhv rhvVar2 = rhvVar;
                            boolean zA = aVar.A(rhvVar2);
                            Object objY = aVar.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zA || objY == c0042a) {
                                objY = new ffv.f(1, rhvVar2, rhv.class, "handleAction", "handleAction(Lcom/sportybet/feature/profile/me/presentation/MeAction;)V", 0);
                                aVar.r(objY);
                            }
                            chp chpVar = (chp) objY;
                            boolean zA2 = aVar.A(rhvVar2);
                            Object objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a) {
                                ffv.l lVar = new ffv.l(0, rhvVar2, rhv.class, "onUserNameClicked", "onUserNameClicked()V", 0);
                                aVar.r(lVar);
                                objY2 = lVar;
                            }
                            chp chpVar2 = (chp) objY2;
                            boolean zA3 = aVar.A(rhvVar2);
                            Object objY3 = aVar.y();
                            if (zA3 || objY3 == c0042a) {
                                ffv.m mVar = new ffv.m(1, rhvVar2, rhv.class, "onThemeSelected", "onThemeSelected(Lcom/sporty/android/core/model/account/themes/ThemeConfig;)V", 0);
                                aVar.r(mVar);
                                objY3 = mVar;
                            }
                            chp chpVar3 = (chp) objY3;
                            boolean zA4 = aVar.A(rhvVar2);
                            Object objY4 = aVar.y();
                            if (zA4 || objY4 == c0042a) {
                                ffv.n nVar = new ffv.n(0, rhvVar2, rhv.class, "toggleShowBalance", "toggleShowBalance()Lkotlinx/coroutines/Job;", 8);
                                aVar.r(nVar);
                                objY4 = nVar;
                            }
                            Function0 function0 = (Function0) objY4;
                            boolean zA5 = aVar.A(rhvVar2);
                            Object objY5 = aVar.y();
                            if (zA5 || objY5 == c0042a) {
                                ffv.o oVar = new ffv.o(0, rhvVar2, rhv.class, "onInconsistentHintClicked", "onInconsistentHintClicked()V", 0);
                                aVar.r(oVar);
                                objY5 = oVar;
                            }
                            chp chpVar4 = (chp) objY5;
                            boolean zA6 = aVar.A(rhvVar2);
                            Object objY6 = aVar.y();
                            if (zA6 || objY6 == c0042a) {
                                ffv.p pVar = new ffv.p(0, rhvVar2, rhv.class, "onWithdrawClicked", "onWithdrawClicked()V", 0);
                                aVar.r(pVar);
                                objY6 = pVar;
                            }
                            chp chpVar5 = (chp) objY6;
                            boolean zA7 = aVar.A(rhvVar2);
                            Object objY7 = aVar.y();
                            if (zA7 || objY7 == c0042a) {
                                ffv.q qVar = new ffv.q(0, rhvVar2, rhv.class, "onDepositClicked", "onDepositClicked()V", 0);
                                aVar.r(qVar);
                                objY7 = qVar;
                            }
                            chp chpVar6 = (chp) objY7;
                            boolean zA8 = aVar.A(rhvVar2);
                            Object objY8 = aVar.y();
                            if (zA8 || objY8 == c0042a) {
                                ffv.r rVar = new ffv.r(0, rhvVar2, rhv.class, "onPopupDismissed", "onPopupDismissed()V", 0);
                                aVar.r(rVar);
                                objY8 = rVar;
                            }
                            chp chpVar7 = (chp) objY8;
                            boolean zA9 = aVar.A(rhvVar2);
                            Object objY9 = aVar.y();
                            if (zA9 || objY9 == c0042a) {
                                ffv.s sVar = new ffv.s(0, rhvVar2, rhv.class, "onSettingsIconClicked", "onSettingsIconClicked()V", 0);
                                aVar.r(sVar);
                                objY9 = sVar;
                            }
                            chp chpVar8 = (chp) objY9;
                            boolean zA10 = aVar.A(rhvVar2);
                            Object objY10 = aVar.y();
                            if (zA10 || objY10 == c0042a) {
                                ffv.g gVar = new ffv.g(0, rhvVar2, rhv.class, "onVerifyIdentityClicked", "onVerifyIdentityClicked()V", 0);
                                aVar.r(gVar);
                                objY10 = gVar;
                            }
                            chp chpVar9 = (chp) objY10;
                            boolean zA11 = aVar.A(rhvVar2);
                            Object objY11 = aVar.y();
                            if (zA11 || objY11 == c0042a) {
                                ffv.h hVar = new ffv.h(1, rhvVar2, rhv.class, "onLoyaltyClick", "onLoyaltyClick(Lcom/sportybet/feature/profile/me/analytics/MeEventSource;)Lkotlinx/coroutines/Job;", 8);
                                aVar.r(hVar);
                                objY11 = hVar;
                            }
                            Function1 function1 = (Function1) objY11;
                            boolean zA12 = aVar.A(rhvVar2);
                            Object objY12 = aVar.y();
                            if (zA12 || objY12 == c0042a) {
                                ffv.i iVar = new ffv.i(0, rhvVar2, rhv.class, "onBetsHistoryClicked", "onBetsHistoryClicked()V", 0);
                                aVar.r(iVar);
                                objY12 = iVar;
                            }
                            chp chpVar10 = (chp) objY12;
                            boolean zA13 = aVar.A(rhvVar2);
                            Object objY13 = aVar.y();
                            if (zA13 || objY13 == c0042a) {
                                ffv.j jVar = new ffv.j(0, rhvVar2, rhv.class, "onTransactionsClicked", "onTransactionsClicked()V", 0);
                                aVar.r(jVar);
                                objY13 = jVar;
                            }
                            chp chpVar11 = (chp) objY13;
                            boolean zA14 = aVar.A(rhvVar2);
                            Object objY14 = aVar.y();
                            if (zA14 || objY14 == c0042a) {
                                ffv.k kVar = new ffv.k(0, rhvVar2, rhv.class, "onGiftsClicked", "onGiftsClicked()V", 0);
                                aVar.r(kVar);
                                objY14 = kVar;
                            }
                            z1g0.b(str, cilVar, gv1Var, hfvVar, pfvVar, str2, i2, i3, z, z2, (Function1) chpVar, (Function1) chpVar3, function0, (Function0) chpVar4, (Function0) chpVar5, (Function0) chpVar6, (Function0) chpVar7, (Function0) chpVar2, (Function0) chpVar8, (Function0) chpVar9, function1, (Function0) chpVar10, (Function0) chpVar11, (Function0) ((chp) objY14), aVar, 0);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true), 3);
                szr.h(szrVar, null, se9.a, 3);
                final ezj0 ezj0Var = ((cgv) ytwVar.getValue()).o;
                if (ezj0Var != null) {
                    szr.h(szrVar, null, new op8(-1706972029, new gaj() { // from class: bfv
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            a aVar = (a) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            ((gwr) obj4).getClass();
                            if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                d dVarJ = h.j(j.g(androidx.compose.foundation.a.b(d.a.b, c68.a(R.color.background_general_primary, aVar), zk40.a), 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                                Object objY = aVar.y();
                                if (objY == a.C0041a.a) {
                                    objY = new efv();
                                    aVar.r(objY);
                                }
                                d dVarB = xa80.b(dVarJ, false, (Function1) objY);
                                aiv aivVarC = g75.c(ht.a.a, false);
                                int iHashCode = Long.hashCode(aVar.m());
                                ne00 ne00VarO = aVar.o();
                                d dVarC = c.c(aVar, dVarB);
                                yka.k.getClass();
                                tsr.a aVar2 = yka.a.b;
                                if (aVar.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar.D();
                                if (aVar.g()) {
                                    aVar.F(aVar2);
                                } else {
                                    aVar.p();
                                }
                                hlh0.a(aVar, aivVarC, yka.a.f);
                                hlh0.a(aVar, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar, iHashCode, c1350a);
                                }
                                hlh0.a(aVar, dVarC, yka.a.d);
                                ezj0 ezj0Var2 = ezj0Var;
                                azj0.a(ezj0Var2.a, ezj0Var2.c, null, czj0.Flat, ezj0Var2.b, pib0.a(R.drawable.ic__arrow_chevron_right, 0, aVar), aVar, 3072, 4);
                                aVar.s();
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true), 3);
                }
                List<aev> list = ((cgv) ytwVar.getValue()).b;
                szrVar.d(list.size(), new ffv.w(new cfv(), list), new ffv.x(list), new op8(802480018, new ffv.y(list, rhvVar, ytwVar), true));
                szr.h(szrVar, null, new op8(2030886811, new gaj() { // from class: dfv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        a aVar = (a) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        ((gwr) obj4).getClass();
                        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            StringUiText stringUiText = vch0.a;
                            ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__log_out);
                            rhv rhvVar2 = rhvVar;
                            boolean zA = aVar.A(rhvVar2);
                            Object objY = aVar.y();
                            if (zA || objY == a.C0041a.a) {
                                ffv.v vVar = new ffv.v(0, rhvVar2, rhv.class, "onLogoutClicked", "onLogoutClicked()V", 0);
                                aVar.r(vVar);
                                objY = vVar;
                            }
                            koi koiVar = new koi(resourceUiText, "log_out", (Function0) ((chp) objY));
                            if (!((cgv) ytwVar.getValue()).n) {
                                koiVar = null;
                            }
                            lpi.a(koiVar, aVar, 0);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true), 3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ h1h(boolean z, String str, String str2, String str3, j1h j1hVar, ooa0 ooa0Var) {
        this.b = j1hVar;
        this.c = ooa0Var;
    }
}
