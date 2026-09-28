package defpackage;

import com.sportybet.android.user.selfexclusion.SelfExclusionConfirmFragment;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hf3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hf3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj;
                betslipActivity.v2 = true;
                betslipActivity.t4(1);
                break;
            default:
                ((SelfExclusionConfirmFragment) obj).requireActivity().finish();
                break;
        }
        return Unit.a;
    }
}
