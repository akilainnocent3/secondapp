package defpackage;

import android.view.View;
import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;
import com.sportygames.pingpong.components.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pp6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pp6(Object obj, int i) {
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
                ((CashoutLiveEventControlsHeaderView) obj).H(ils.STATS);
                return;
            default:
                a aVar = (a) obj;
                aVar.e.invoke(Boolean.TRUE);
                String str = aVar.b;
                d820 d820Var = aVar.i;
                if (d820Var != null) {
                    wz.a("popup_action", "Ping Pong", str, d820Var.d.getText().toString());
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
        }
    }
}
