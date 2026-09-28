package defpackage;

import android.content.Context;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.data.RSelection;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q13 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q13(Object obj, int i) {
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
                    to3Var.v();
                }
                break;
            default:
                jl30.d dVar = (jl30.d) obj;
                Object tag = view.getTag();
                if (tag instanceof RSelection) {
                    RSelection rSelection = (RSelection) tag;
                    xec xecVarA = dVar.y;
                    if (xecVarA == null) {
                        Context context = view.getContext();
                        context.getClass();
                        xec.a aVar = new xec.a(context);
                        xec xecVar = aVar.a;
                        xecVar.e = R.layout.layout_selection_status_popup;
                        xecVar.f = null;
                        xecVar.d = false;
                        xecVarA = aVar.a();
                        dVar.y = xecVarA;
                    }
                    rkf.d(view, xecVarA, rSelection);
                }
                break;
        }
    }
}
