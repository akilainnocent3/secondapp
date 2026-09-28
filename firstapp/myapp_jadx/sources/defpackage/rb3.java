package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sporty.android.core.model.realsports.Order;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rb3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ rb3(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) fragment;
                u93 u93Var = betSuccessfulPageFragment.J;
                cln.a aVar = cln.a.a;
                Order order = betSuccessfulPageFragment.Q;
                u93Var.y1(aVar, order.shareCode, order.orderId, betSuccessfulPageFragment.R);
                break;
            default:
                re8 re8Var = (re8) fragment;
                re8.a aVar2 = re8.P;
                IconTextSelectorButton iconTextSelectorButton = re8Var.n0().z;
                Boolean bool = Boolean.FALSE;
                lop.b(iconTextSelectorButton, bool);
                lop.b(re8Var.n0().b, bool);
                df8 df8VarO0 = re8Var.o0();
                ej5.c(o8i0.d(df8VarO0), null, null, new cf8(df8VarO0, null), 3);
                break;
        }
    }
}
