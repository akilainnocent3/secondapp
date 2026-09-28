package defpackage;

import com.sportybet.android.limits.reached.ReachedLimitsActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xj3 extends saj implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj3(Object obj) {
        super(0, obj, ReachedLimitsActivity.class, "finish", "finish()V", 0);
        this.a = 2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) this.receiver;
                Set<g08> set = BetslipActivity.X2;
                betslipActivity.z2();
                break;
            case 1:
                ((n000) this.receiver).a2();
                break;
            default:
                ((ReachedLimitsActivity) this.receiver).finish();
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }
}
