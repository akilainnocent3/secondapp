package defpackage;

import android.content.Context;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import com.sportybet.plugin.realsports.data.RSelection;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tf8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = CommonMobileMoneyWithdrawActivity.z;
                ((CommonMobileMoneyWithdrawActivity) obj).z1().y1();
                break;
            default:
                eu30.d dVar = (eu30.d) obj;
                Object tag = view.getTag();
                if (tag instanceof RSelection) {
                    RSelection rSelection = (RSelection) tag;
                    xec xecVarA = dVar.E;
                    if (xecVarA == null) {
                        Context context = view.getContext();
                        context.getClass();
                        xec.a aVar = new xec.a(context);
                        xec xecVar = aVar.a;
                        xecVar.e = R.layout.layout_selection_status_popup;
                        xecVar.f = null;
                        xecVar.d = false;
                        xecVarA = aVar.a();
                        dVar.E = xecVarA;
                    }
                    rkf.d(view, xecVarA, rSelection);
                }
                break;
        }
    }
}
