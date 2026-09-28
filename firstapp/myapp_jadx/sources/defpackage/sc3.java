package defpackage;

import android.content.Context;
import android.view.View;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import com.sportybet.android.user.kyc.KYCActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sc3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sc3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                xc3 xc3Var = (xc3) obj;
                xc3Var.b.invoke(new y43.b.d(xc3Var.getBindingAdapterPosition()));
                return;
            case 1:
                int i2 = CommonMobileMoneyWithdrawActivity.z;
                view.getClass();
                d0n d0nVar = ((CommonMobileMoneyWithdrawActivity) obj).b;
                if (d0nVar == null) {
                    Intrinsics.n("utils");
                    throw null;
                }
                Context context = view.getContext();
                context.getClass();
                d0nVar.b(context, snb0.WITHDRAW);
                return;
            case 2:
                yrh0.t(((c000) obj).requireContext(), KYCActivity.class, true);
                return;
            default:
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = eu30.this.G;
                if (rSportsBetTicketDetailsActivity != null) {
                    ku90<a> ku90Var = rSportsBetTicketDetailsActivity.c0.e;
                    StringUiText stringUiText = vch0.a;
                    b.e(ku90Var, new ResourceUiText(R.string.bet_history__void_after_total_odds), null, new ResourceUiText(R.string.bet_history__void_adjust_odds_content), null, null, null, null, 506);
                    return;
                }
                return;
        }
    }
}
