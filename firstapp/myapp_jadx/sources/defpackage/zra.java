package defpackage;

import com.sporty.android.platform.features.loyalty.LoyaltyActivity;
import com.sportybet.feature.kyc.confirmAccountInfo.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zra implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zra(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(d.g.a);
                break;
            case 1:
                LoyaltyActivity loyaltyActivity = (LoyaltyActivity) obj;
                int i2 = LoyaltyActivity.f;
                loyaltyActivity.getAccountHelper().demandAccount(loyaltyActivity, new kqt());
                break;
            default:
                ((a1b0) obj).G0();
                break;
        }
        return Unit.a;
    }
}
