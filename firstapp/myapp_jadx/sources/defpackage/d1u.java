package defpackage;

import com.sporty.android.platform.features.loyalty.unlockedbottomsheet.LoyaltyUnlockedActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d1u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                LoyaltyUnlockedActivity loyaltyUnlockedActivity = (LoyaltyUnlockedActivity) obj;
                int i2 = LoyaltyUnlockedActivity.c;
                loyaltyUnlockedActivity.setResult(0);
                loyaltyUnlockedActivity.finish();
                return Unit.a;
            default:
                return new xu5((Call.Factory) obj);
        }
    }
}
