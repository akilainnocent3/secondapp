package defpackage;

import android.view.View;
import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qp6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qp6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = CashoutLiveEventControlsHeaderView.O;
                ((CashoutLiveEventControlsHeaderView) obj).H(ils.LIVE_MATCH_TRACKER);
                return;
            default:
                fm60 fm60Var = (fm60) obj;
                fm60Var.e.invoke(Boolean.TRUE);
                String str = fm60Var.b;
                ss80 ss80Var = fm60Var.f;
                if (ss80Var != null) {
                    wz.a("popup_action", "Sporty Hero", str, ss80Var.d.getText().toString());
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
        }
    }
}
