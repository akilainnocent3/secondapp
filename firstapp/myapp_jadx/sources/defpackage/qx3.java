package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qx3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ qx3(int i, Function0 function0) {
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity = (BetslipThemeMissionBottomSheetActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = BetslipThemeMissionBottomSheetActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(959739958, new rx3(betslipThemeMissionBottomSheetActivity, wyh.c(betslipThemeMissionBottomSheetActivity.z1().a, aVar, 0, 7)), aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                slm.c((Function0) obj3, (a) obj, qj40.a(7));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qx3(BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity) {
        this.b = betslipThemeMissionBottomSheetActivity;
    }
}
