package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.notifications.presentation.reward.LoyaltyRewardBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ayt implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ayt(d dVar, qbj0 qbj0Var, int i) {
        this.b = dVar;
        this.c = qbj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ResourceUiText resourceUiText = (ResourceUiText) obj4;
                final LoyaltyRewardBottomSheetActivity loyaltyRewardBottomSheetActivity = (LoyaltyRewardBottomSheetActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                LoyaltyRewardBottomSheetActivity.a aVar2 = LoyaltyRewardBottomSheetActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarE = j.e(d.a.b, 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarE);
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
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    StringUiText stringUiText = vch0.a;
                    ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_loyalty__popup_reward_title);
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_loyalty__claim_reward);
                    String strA = cb40.a(R.string.page_loyalty__popup_reward_img, new Object[0], aVar);
                    boolean zA = aVar.A(loyaltyRewardBottomSheetActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new p3b(loyaltyRewardBottomSheetActivity, 1);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(loyaltyRewardBottomSheetActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: byt
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                LoyaltyRewardBottomSheetActivity loyaltyRewardBottomSheetActivity2 = loyaltyRewardBottomSheetActivity;
                                azm azmVar = loyaltyRewardBottomSheetActivity2.b;
                                if (azmVar == null) {
                                    Intrinsics.n("router");
                                    throw null;
                                }
                                azmVar.d(wae.LOYALTY);
                                loyaltyRewardBottomSheetActivity2.finish();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    fst.a(null, resourceUiText2, resourceUiText3, strA, resourceUiText, function0, (Function0) objY2, null, null, aVar, 0, 385);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                obj0.f((d) obj4, (qbj0) obj3, (a) obj, qj40.a(7));
                return Unit.a;
        }
    }

    public /* synthetic */ ayt(ResourceUiText resourceUiText, LoyaltyRewardBottomSheetActivity loyaltyRewardBottomSheetActivity) {
        this.b = resourceUiText;
        this.c = loyaltyRewardBottomSheetActivity;
    }
}
