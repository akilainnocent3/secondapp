package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.presentation.event.adapter.viewholder.MatchEventInfoEventViewHolder;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ja3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ja3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj;
                betSuccessfulPageFragment.o0(BetSuccessfulPageFragment.b.d);
                String stringExtra = betSuccessfulPageFragment.requireActivity().getIntent().getStringExtra("action_load_booking_code_from");
                g08 g08Var = g08.UNKNOWN;
                if (!"REBET_ON_CASHOUT_SUCCESSFUL_POPUP".equals(stringExtra)) {
                    betSuccessfulPageFragment.F.n(betSuccessfulPageFragment.S ? b1z.b.QuickBetQuickCheck : b1z.b.Betslip);
                    betSuccessfulPageFragment.F.k();
                    sh8.c().c(o7d.a(wae.OPEN_BETS), mll0.a("open_bets_entry_point", betSuccessfulPageFragment.S ? AnalyticsParam.DATA_QUICK_BET_QUICK_CHECK : "betslip"));
                }
                break;
            default:
                MatchEventInfoEventViewHolder.bind$lambda$0$3((mpg) obj, view);
                break;
        }
    }
}
