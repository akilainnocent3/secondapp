package defpackage;

import com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil;
import com.sportybet.android.user.selfexclusion.SelfExclusionConfirmFragment;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class if3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ if3(Object obj, int i) {
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
                betslipActivity.t4(2);
                return Unit.a;
            case 1:
                return CustomCodeComposeUtil.w((CustomCodeComposeUtil) obj);
            default:
                z980 z980Var = ((SelfExclusionConfirmFragment) obj).J;
                z980Var.getClass();
                ej5.c(o8i0.d(z980Var), null, null, new ca80(z980Var, null), 3);
                return Unit.a;
        }
    }
}
