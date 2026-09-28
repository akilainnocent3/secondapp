package defpackage;

import android.view.View;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import com.sportybet.plugin.realsports.data.RSelection;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pf8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pf8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = CommonMobileMoneyWithdrawActivity.z;
                f00 f00Var = vgb0.a;
                vgb0.c("sporty_withdraw", jpu.b(new Pair(AnalyticsParam.CONTENT_TYPE, "click_balance_info_button")), false);
                ua00.a(((CommonMobileMoneyWithdrawActivity) obj2).getSupportFragmentManager(), ((kmj0) obj).b);
                break;
            default:
                RSelection rSelection = (RSelection) obj;
                boolean zS = b3.S(rSelection.eventId);
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = eu30.this.G;
                if (rSportsBetTicketDetailsActivity != null) {
                    String str = rSelection.eventId;
                    EventSource eventSource = rSelection.eventSource;
                    boolean zEquals = rSelection.sportId.equals("sr:sport:202120001");
                    if (str != null && !str.isEmpty()) {
                        xyd0 xyd0Var = new xyd0();
                        xyd0Var.setArguments(vj5.a(new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, str), new Pair("sport_id", null), new Pair("is_live", Boolean.FALSE), new Pair("is_virtual_live", Boolean.valueOf(zS)), new Pair("virtual_query_param", Boolean.valueOf(zEquals)), new Pair("event_source", eventSource)));
                        xyd0Var.show(rSportsBetTicketDetailsActivity.getSupportFragmentManager(), "statisticsDialogFragment");
                        break;
                    }
                }
                break;
        }
    }
}
