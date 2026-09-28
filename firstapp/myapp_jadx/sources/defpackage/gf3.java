package defpackage;

import android.view.KeyEvent;
import com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gf3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ gf3(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) callback;
                Set<g08> set = BetslipActivity.X2;
                betslipActivity.getAccountHelper().demandNewAccount(betslipActivity, betslipActivity);
                betslipActivity.R1 = true;
                return Unit.a;
            default:
                return CustomCodeComposeUtil.u((CustomCodeComposeUtil) callback);
        }
    }
}
