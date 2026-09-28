package defpackage;

import com.sporty.android.platform.features.loyalty.upgradedialog.LoyaltyUpgradeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o1u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                LoyaltyUpgradeActivity.a aVar = LoyaltyUpgradeActivity.c;
                ((LoyaltyUpgradeActivity) obj).finish();
                break;
            default:
                ((mjj0) obj).L1();
                break;
        }
        return Unit.a;
    }
}
