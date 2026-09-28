package defpackage;

import android.view.View;
import com.sportybet.android.globalpay.mobileMoney.CmMobileMoneyDepositActivity;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.spin2win.model.BetHistoryItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yr2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yr2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wz.a("TransactionTicketClicked", "Spin2Win", new String[0]);
                String ticketId = ((BetHistoryItem) obj).getTicketId();
                if (ticketId == null) {
                    ticketId = "";
                }
                SportyGamesManager.getInstance().gotoSportyBet(xae.d, mll0.a("KEY_TICKET_ID", ticketId));
                return;
            default:
                CmMobileMoneyDepositActivity cmMobileMoneyDepositActivity = (CmMobileMoneyDepositActivity) obj;
                bnh0 bnh0Var = cmMobileMoneyDepositActivity.d;
                if (bnh0Var == null) {
                    Intrinsics.n("urlCreator");
                    throw null;
                }
                String strH = bnh0Var.h(WebViewActivityUtils.URL_HOW_TO_PLAY_DEPOSIT);
                azm azmVar = cmMobileMoneyDepositActivity.e;
                if (azmVar != null) {
                    azm.c(azmVar, strH, null, null, 6);
                    return;
                } else {
                    Intrinsics.n("router");
                    throw null;
                }
        }
    }
}
