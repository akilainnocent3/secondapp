package defpackage;

import android.view.View;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s13 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s13(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                to3 to3Var = ((BetSlipFooter) obj).H;
                if (to3Var != null) {
                    to3Var.s0(false);
                }
                break;
            default:
                EventActivity eventActivity = (EventActivity) obj;
                int i2 = EventActivity.U0;
                if (eventActivity.J1()) {
                    eventActivity.H1();
                }
                break;
        }
    }
}
