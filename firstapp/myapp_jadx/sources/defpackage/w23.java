package defpackage;

import android.view.View;
import android.widget.CheckBox;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w23 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w23(Object obj, int i) {
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
                int i2 = BetSlipFooter.j0;
                if (view instanceof CheckBox) {
                    boolean zIsChecked = ((CheckBox) view).isChecked();
                    zuy zuyVarB = betSlipFooter.getUpFooterInsureUseCase().b();
                    avy avyVar = zIsChecked ? betSlipFooter.W == huy.a ? avy.a : avy.b : avy.c;
                    to3 to3Var = betSlipFooter.H;
                    if (to3Var != null) {
                        to3Var.w0(zuyVarB, betSlipFooter.W, avyVar, betSlipFooter.d0);
                    }
                }
                break;
            default:
                ZoomImageActivity zoomImageActivity = ((sck0) obj).a;
                int i3 = ZoomImageActivity.z;
                zoomImageActivity.z1();
                break;
        }
    }
}
