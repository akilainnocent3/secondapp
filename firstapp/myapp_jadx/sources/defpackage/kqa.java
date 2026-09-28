package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;
import com.sportybet.feature.kyc.confirmAccountInfo.b;
import com.sportybet.feature.kyc.confirmAccountInfo.f;
import com.sportybet.feature.loyalty.impl.welcomereward.WelcomeRewardBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kqa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py1 b;

    public /* synthetic */ kqa(py1 py1Var, int i) {
        this.a = i;
        this.b = py1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        py1 py1Var = this.b;
        int i2 = 1;
        int i3 = 2;
        switch (i) {
            case 0:
                final ConfirmAccountInfoActivity confirmAccountInfoActivity = (ConfirmAccountInfoActivity) py1Var;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ConfirmAccountInfoActivity.a aVar2 = ConfirmAccountInfoActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(-163325666, new Function2() { // from class: mqa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar3 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ConfirmAccountInfoActivity.a aVar4 = ConfirmAccountInfoActivity.d;
                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ConfirmAccountInfoActivity confirmAccountInfoActivity2 = confirmAccountInfoActivity;
                                f fVar = (f) confirmAccountInfoActivity2.c.getValue();
                                boolean zA = aVar3.A(confirmAccountInfoActivity2);
                                Object objY = aVar3.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    ConfirmAccountInfoActivity.b bVar = new ConfirmAccountInfoActivity.b(0, confirmAccountInfoActivity2, ConfirmAccountInfoActivity.class, "navigateToHome", "navigateToHome()V", 0);
                                    aVar3.r(bVar);
                                    objY = bVar;
                                }
                                Function0 function0 = (Function0) ((chp) objY);
                                boolean zA2 = aVar3.A(confirmAccountInfoActivity2);
                                Object objY2 = aVar3.y();
                                if (zA2 || objY2 == c0042a) {
                                    ConfirmAccountInfoActivity.c cVar = new ConfirmAccountInfoActivity.c(0, confirmAccountInfoActivity2, ConfirmAccountInfoActivity.class, "navigateToTx", "navigateToTx()V", 0);
                                    aVar3.r(cVar);
                                    objY2 = cVar;
                                }
                                Function0 function1 = (Function0) ((chp) objY2);
                                boolean zA3 = aVar3.A(confirmAccountInfoActivity2);
                                Object objY3 = aVar3.y();
                                if (zA3 || objY3 == c0042a) {
                                    ConfirmAccountInfoActivity.d dVar = new ConfirmAccountInfoActivity.d(1, confirmAccountInfoActivity2, ConfirmAccountInfoActivity.class, "onAccountInfoConfirmed", "onAccountInfoConfirmed(Lcom/sportybet/feature/kyc/confirmAccountInfo/ConfirmAccountInfoState;)V", 0);
                                    aVar3.r(dVar);
                                    objY3 = dVar;
                                }
                                Function1 function2 = (Function1) ((chp) objY3);
                                boolean zA4 = aVar3.A(confirmAccountInfoActivity2);
                                Object objY4 = aVar3.y();
                                if (zA4 || objY4 == c0042a) {
                                    objY4 = new nqa(confirmAccountInfoActivity2, 0);
                                    aVar3.r(objY4);
                                }
                                b.c(fVar, function0, function1, function2, (Function0) objY4, aVar3, 8);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                final WelcomeRewardBottomSheetActivity welcomeRewardBottomSheetActivity = (WelcomeRewardBottomSheetActivity) py1Var;
                a aVar3 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i4 = WelcomeRewardBottomSheetActivity.d;
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d dVarE = j.e(d.a.b, 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar3.m());
                    ne00 ne00VarO = aVar3.o();
                    d dVarC = c.c(aVar3, dVarE);
                    yka.k.getClass();
                    tsr.a aVar4 = yka.a.b;
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar4);
                    } else {
                        aVar3.p();
                    }
                    hlh0.a(aVar3, aivVarC, yka.a.f);
                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                    }
                    hlh0.a(aVar3, dVarC, yka.a.d);
                    String strA = cb40.a(R.string.wap_home__unlock_tier_reward, new Object[0], aVar3);
                    StringUiText stringUiText = vch0.a;
                    StringUiText stringUiText2 = new StringUiText(strA);
                    StringUiText stringUiText3 = new StringUiText(cb40.a(R.string.reg_succ__registration_success_dposit_now, new Object[0], aVar3));
                    String strA2 = cb40.a(R.string.page_loyalty__popup_reward_img, new Object[0], aVar3);
                    StringUiText stringUiText4 = new StringUiText(cb40.a(R.string.wap_home__deposit_to_unlock_loyalty, new Object[0], aVar3));
                    boolean zA = aVar3.A(welcomeRewardBottomSheetActivity);
                    Object objY = aVar3.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new l6y(welcomeRewardBottomSheetActivity, i2);
                        aVar3.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar3.A(welcomeRewardBottomSheetActivity);
                    Object objY2 = aVar3.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new n5f(welcomeRewardBottomSheetActivity, i3);
                        aVar3.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar3.A(welcomeRewardBottomSheetActivity);
                    Object objY3 = aVar3.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new nqa(welcomeRewardBottomSheetActivity, i3);
                        aVar3.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean zA4 = aVar3.A(welcomeRewardBottomSheetActivity);
                    Object objY4 = aVar3.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: s1j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5 = WelcomeRewardBottomSheetActivity.d;
                                ((u1j0) welcomeRewardBottomSheetActivity.b.getValue()).x1(new x0j0.n(0));
                                return Unit.a;
                            }
                        };
                        aVar3.r(objY4);
                    }
                    fst.a(null, stringUiText2, stringUiText3, strA2, stringUiText4, function0, function1, function2, (Function0) objY4, aVar3, 0, 1);
                    aVar3.s();
                } else {
                    aVar3.G();
                }
                return Unit.a;
        }
    }
}
