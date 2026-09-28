package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hwt implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hwt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dcb0 dcb0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = LoyaltyMissionBottomSheetActivity.b;
                ((LoyaltyMissionBottomSheetActivity) obj).finish();
                break;
            case 1:
                ytw ytwVar = (ytw) obj;
                ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
                break;
            default:
                b8b0 b8b0Var = (b8b0) obj;
                if (!b8b0Var.W && (dcb0Var = (dcb0) b8b0Var.b) != null) {
                    dcb0Var.y.n(8388613);
                }
                break;
        }
        return Unit.a;
    }
}
