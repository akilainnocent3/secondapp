package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData;
import com.sporty.android.core.model.loyalty.LoyaltyClientBannerDisplaySetting;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.mappers.LoyaltyStateMapper$invoke$$inlined$flatMapLatest$1", f = "LoyaltyStateMapper.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class oyt extends tje0 implements gaj<myh<? super hfv>, bxg0<? extends oum, ? extends Boolean, ? extends Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ syt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyt(v1b v1bVar, syt sytVar) {
        super(3, v1bVar);
        this.d = sytVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super hfv> myhVar, bxg0<? extends oum, ? extends Boolean, ? extends Boolean> bxg0Var, v1b<? super Unit> v1bVar) {
        oyt oytVar = new oyt(v1bVar, this.d);
        oytVar.b = myhVar;
        oytVar.c = bxg0Var;
        return oytVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ConcatUiText concatUiTextA;
        ConcatUiText concatUiTextA2;
        ConcatUiText concatUiTextA3;
        lyh rytVar;
        lyh gzhVar;
        LoyaltyClientBannerDisplaySetting loyaltyClientBannerDisplaySetting;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            bxg0 bxg0Var = (bxg0) this.c;
            oum oumVar = (oum) bxg0Var.a;
            boolean zBooleanValue = ((Boolean) bxg0Var.b).booleanValue();
            boolean zBooleanValue2 = ((Boolean) bxg0Var.c).booleanValue();
            LoyaltyAggregateHintData loyaltyAggregateHintData = oumVar.d;
            int availableMissionCount = loyaltyAggregateHintData != null ? loyaltyAggregateHintData.getAvailableMissionCount() : 0;
            int availableChallengeCount = loyaltyAggregateHintData != null ? loyaltyAggregateHintData.getAvailableChallengeCount() : 0;
            int availableProgramRewardCount = loyaltyAggregateHintData != null ? loyaltyAggregateHintData.getAvailableProgramRewardCount() : 0;
            syt sytVar = this.d;
            sytVar.getClass();
            g8k g8kVar = sytVar.c;
            if (availableMissionCount > 1) {
                String strB = pe4.b(availableMissionCount, "+", " ");
                StringUiText stringUiText = vch0.a;
                concatUiTextA = ygh.a(R.string.page_loyalty__missions, new StringUiText(strB));
            } else if (availableMissionCount > 0) {
                String strB2 = pe4.b(availableMissionCount, "+", " ");
                StringUiText stringUiText2 = vch0.a;
                concatUiTextA = ygh.a(R.string.page_loyalty__mission, new StringUiText(strB2));
            } else {
                concatUiTextA = null;
            }
            if (availableChallengeCount > 1) {
                String strB3 = pe4.b(availableChallengeCount, "+", " ");
                StringUiText stringUiText3 = vch0.a;
                concatUiTextA2 = ygh.a(R.string.page_loyalty__challenges, new StringUiText(strB3));
            } else if (availableChallengeCount > 0) {
                String strB4 = pe4.b(availableChallengeCount, "+", " ");
                StringUiText stringUiText4 = vch0.a;
                concatUiTextA2 = ygh.a(R.string.page_loyalty__challenge, new StringUiText(strB4));
            } else {
                concatUiTextA2 = null;
            }
            if (availableProgramRewardCount > 1) {
                String strB5 = pe4.b(availableProgramRewardCount, "+", " ");
                StringUiText stringUiText5 = vch0.a;
                concatUiTextA3 = ygh.a(R.string.page_loyalty__reward_plural, new StringUiText(strB5));
            } else if (availableProgramRewardCount > 0) {
                String strB6 = pe4.b(availableProgramRewardCount, "+", " ");
                StringUiText stringUiText6 = vch0.a;
                concatUiTextA3 = ygh.a(R.string.page_loyalty__reward, new StringUiText(strB6));
            } else {
                concatUiTextA3 = null;
            }
            ConcatUiText concatUiText = (concatUiTextA == null || concatUiTextA2 == null) ? concatUiTextA3 : null;
            if (!oumVar.a) {
                gzhVar = new gzh(new hfv(30));
            } else if (!zBooleanValue2) {
                gzhVar = new gzh(new hfv(true, null, lst.d.a, null, null));
            } else if (zBooleanValue) {
                if (loyaltyAggregateHintData == null || (loyaltyClientBannerDisplaySetting = loyaltyAggregateHintData.getLoyaltyClientBannerDisplaySetting()) == null || loyaltyClientBannerDisplaySetting.getBannerPotentialRewardValueDisplay()) {
                    rytVar = new ryt(bm50.f(g8kVar.a()), this.d, oumVar, loyaltyAggregateHintData, concatUiText, concatUiTextA, concatUiTextA2, availableMissionCount);
                } else {
                    rytVar = new qyt(bm50.f(g8kVar.a()), this.d, oumVar, concatUiText, concatUiTextA, concatUiTextA2, availableMissionCount);
                }
                gzhVar = rytVar;
            } else {
                krf0 krf0Var = krf0.TIER_0;
                gzhVar = new gzh(new hfv(true, syt.d(krf0Var), new lst.c(concatUiText, concatUiTextA, concatUiTextA2), new Integer(krf0Var.a), new Integer(availableMissionCount)));
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
