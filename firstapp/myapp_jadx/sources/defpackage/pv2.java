package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pv2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pv2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cw2 cw2Var = (cw2) obj;
                cw2Var.b.invoke(new y43.a.e(cw2Var.getBindingAdapterPosition()));
                break;
            default:
                QuickBetView.l1 = false;
                ((QuickBetView) obj).S0();
                break;
        }
    }
}
