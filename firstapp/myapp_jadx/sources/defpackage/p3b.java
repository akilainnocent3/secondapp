package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.reward.LoyaltyRewardBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p3b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new yhf0((i3z) obj);
            case 1:
                LoyaltyRewardBottomSheetActivity.a aVar = LoyaltyRewardBottomSheetActivity.c;
                ((LoyaltyRewardBottomSheetActivity) obj).finish();
                return Unit.a;
            default:
                ((Function1) obj).invoke(qve0.a.a);
                return Unit.a;
        }
    }
}
