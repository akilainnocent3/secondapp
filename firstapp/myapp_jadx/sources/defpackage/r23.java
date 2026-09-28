package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r23 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r23(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BetSlipFooter.j0;
                sh8.c().e(o7d.a(wae.SWIPE_BET));
                ((BetslipActivity) obj).finish();
                break;
            default:
                ((wnz) obj).c.i(zyy.b);
                break;
        }
    }
}
