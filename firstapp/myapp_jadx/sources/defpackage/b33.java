package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b33 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b33(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetSlipFooter betSlipFooter = (BetSlipFooter) obj;
                if (!(view instanceof CheckBox)) {
                    int i2 = BetSlipFooter.j0;
                } else {
                    to3 to3Var = betSlipFooter.H;
                    if (to3Var != null) {
                        to3Var.S(((CheckBox) view).isChecked());
                    }
                }
                break;
            default:
                final MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) obj;
                int i3 = MatchEventDetailActivity.U;
                if (!matchEventDetailActivity.L1()) {
                    matchEventDetailActivity.R1();
                } else {
                    matchEventDetailActivity.Z1(new DialogInterface.OnClickListener() { // from class: ezu
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            int i5 = MatchEventDetailActivity.U;
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            matchEventDetailActivity.R1();
                        }
                    });
                }
                break;
        }
    }
}
