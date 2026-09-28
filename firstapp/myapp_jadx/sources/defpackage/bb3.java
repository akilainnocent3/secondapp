package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.uievent.a;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bb3 implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bb3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj2;
                lk50 lk50Var = (lk50) obj;
                betSuccessfulPageFragment.u0(false);
                if (lk50Var instanceof lk50.c) {
                    Integer num = (Integer) ((lk50.c) lk50Var).a;
                    if (num == null) {
                        betSuccessfulPageFragment.a0 = false;
                        betSuccessfulPageFragment.z0();
                    } else if (num.intValue() == 10000) {
                        betSuccessfulPageFragment.a0 = true;
                        betSuccessfulPageFragment.z0();
                        zyf0.c(1, sn5.b(betSuccessfulPageFragment.requireActivity(), R.string.personal_page__published_on_sportysocial, new Object[0]));
                    } else if (num.intValue() == 4757) {
                        betSuccessfulPageFragment.a0 = false;
                        betSuccessfulPageFragment.z0();
                        zyf0.c(1, sn5.b(betSuccessfulPageFragment.requireActivity(), R.string.personal_page__publish_code_error_live_event, new Object[0]));
                    } else if (num.intValue() != 4756) {
                        betSuccessfulPageFragment.a0 = false;
                        betSuccessfulPageFragment.z0();
                        zyf0.c(1, sn5.b(betSuccessfulPageFragment.requireActivity(), R.string.common_feedback__something_went_wrong_please_try_again, new Object[0]));
                    } else {
                        betSuccessfulPageFragment.a0 = false;
                        betSuccessfulPageFragment.z0();
                        e eVarRequireActivity = betSuccessfulPageFragment.requireActivity();
                        String strB = sn5.b(betSuccessfulPageFragment.requireActivity(), R.string.personal_page__publish_code_limit_error_text, new Object[0]);
                        cc3 cc3Var = new cc3();
                        eVarRequireActivity.getClass();
                        js.d(eVarRequireActivity, R.string.personal_page__publish_code_limit_error_title, strB, cc3Var, null, 32);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    betSuccessfulPageFragment.a0 = false;
                    betSuccessfulPageFragment.z0();
                    Throwable th = ((lk50.a) lk50Var).a;
                    zyf0.c(1, (th == null || th.getMessage() == null) ? sn5.b(betSuccessfulPageFragment.requireActivity(), R.string.common_functions__error, new Object[0]) : th.getMessage());
                }
                break;
            default:
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = (RSportsBetTicketDetailsActivity) obj2;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                rSportsBetTicketDetailsActivity.k0.c((a) obj, rSportsBetTicketDetailsActivity, rSportsBetTicketDetailsActivity.getWindow().getDecorView().getRootView(), null);
                break;
        }
    }
}
