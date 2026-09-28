package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.BettingStreakMissionBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c24 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c24(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final BettingStreakMissionBottomSheetActivity bettingStreakMissionBottomSheetActivity = (BettingStreakMissionBottomSheetActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = BettingStreakMissionBottomSheetActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ytw ytwVarC = wyh.c(((c) bettingStreakMissionBottomSheetActivity.b.getValue()).c, aVar, 0, 7);
                    gan.a(kotlin.collections.a.c(bettingStreakMissionBottomSheetActivity.getCMSString(R.string.page_loyalty__popup_reward_img, new Object[0])), true, 0.0f, 0, aVar, 48);
                    o0z.a(null, null, null, null, null, pp8.b(1922627164, new Function2() { // from class: d24
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i3 = BettingStreakMissionBottomSheetActivity.d;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                String strA = cb40.a(R.string.page_loyalty__popup_reward_img, new Object[0], aVar2);
                                twd0 twd0Var = ytwVarC;
                                UiText uiText = ((j24) twd0Var.getValue()).a;
                                UiText uiText2 = ((j24) twd0Var.getValue()).b;
                                UiText uiText3 = ((j24) twd0Var.getValue()).c;
                                BettingStreakMissionBottomSheetActivity bettingStreakMissionBottomSheetActivity2 = bettingStreakMissionBottomSheetActivity;
                                boolean zA = aVar2.A(bettingStreakMissionBottomSheetActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new e24(bettingStreakMissionBottomSheetActivity2, 0);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(bettingStreakMissionBottomSheetActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new f24(bettingStreakMissionBottomSheetActivity2, 0);
                                    aVar2.r(objY2);
                                }
                                fst.a(null, uiText, uiText3, strA, uiText2, function0, (Function0) objY2, null, null, aVar2, 0, 385);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
            default:
                UiText uiText = (UiText) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uiText.getClass();
                    lkf0.d(uiText.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), null, syj.a(0L, 0L, 0L, null, null, aVar2, 31).e.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar2), aVar2, 0, 0, 131066);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
