package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.sporty.android.common.uievent.a;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ya3 implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ya3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj2;
                betSuccessfulPageFragment.z.d((a) obj, betSuccessfulPageFragment, betSuccessfulPageFragment.H.a, null);
                break;
            default:
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = (RSportsBetTicketDetailsActivity) obj2;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                if (!((Boolean) obj).booleanValue()) {
                    v9m.a((ViewGroup) rSportsBetTicketDetailsActivity.findViewById(R.id.ticket_detail_root_layout), rSportsBetTicketDetailsActivity.findViewById(R.id.customer_service), null, rSportsBetTicketDetailsActivity.getCMSString(R.string.bet_history__contact_support_about_this_ticket, new Object[0]), 256, 44, b120.b, -48, new doq(rSportsBetTicketDetailsActivity, 1));
                } else {
                    ViewGroup viewGroup = (ViewGroup) rSportsBetTicketDetailsActivity.findViewById(android.R.id.content);
                    View viewFindViewById = rSportsBetTicketDetailsActivity.findViewById(R.id.customer_service);
                    viewGroup.getClass();
                    viewFindViewById.getClass();
                    Object tag = viewFindViewById.getTag(R.id.hint_popup_tag);
                    View view = tag instanceof View ? (View) tag : null;
                    if (view != null) {
                        viewGroup.removeView(view);
                        viewFindViewById.setTag(R.id.hint_popup_tag, null);
                    }
                }
                break;
        }
    }
}
