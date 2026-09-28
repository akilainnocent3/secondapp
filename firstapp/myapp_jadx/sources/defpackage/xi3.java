package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xi3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xi3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj;
                Set<g08> set = BetslipActivity.X2;
                BetSlipFooter betSlipFooter = betslipActivity.S1().D;
                RecyclerView recyclerView = betslipActivity.S1().S;
                View rootView = betslipActivity.S1().E.getRootView();
                if (betSlipFooter.isAttachedToWindow() && recyclerView.I && rootView.isAttachedToWindow()) {
                    betslipActivity.S1().W.scrollTo(0, rootView.getHeight() + recyclerView.getHeight() + betSlipFooter.getHeight());
                    break;
                }
                break;
            default:
                bo8.c((bo8) obj);
                break;
        }
    }
}
