package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ux3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ux3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BetslipThemeMissionBottomSheetActivity.d;
                ((BetslipThemeMissionBottomSheetActivity) obj).z1().x1(a.b.a);
                break;
            default:
                ((Function1) obj).invoke(dhh.a.a);
                break;
        }
        return Unit.a;
    }
}
