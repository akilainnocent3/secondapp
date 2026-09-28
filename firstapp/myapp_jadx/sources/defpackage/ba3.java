package defpackage;

import android.view.View;
import androidx.appcompat.app.b;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ba3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ba3(Fragment fragment, int i) {
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
                b.a aVar = new b.a(view.getContext());
                aVar.a.f = sn5.d(betSuccessfulPageFragment, R.string.about_to_pay_vamount_no_lineup__input_this_code_in_betslip_to_restore_selections, new Object[0]);
                aVar.c(sn5.d(betSuccessfulPageFragment, R.string.common_functions__ok, new Object[0]), null);
                aVar.f();
                break;
            default:
                ((cr30) fragment).m0(false);
                break;
        }
    }
}
