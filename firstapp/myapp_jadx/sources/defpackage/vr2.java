package defpackage;

import android.os.Bundle;
import android.view.View;
import com.sportybet.android.globalpay.GlobalWithdrawActivity;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.pocketrocket.model.response.BetHistoryItem;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vr2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String ticketId = ((BetHistoryItem) obj).getTicketId();
                ticketId.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("KEY_TICKET_ID", ticketId);
                SportyGamesManager.getInstance().gotoSportyBet(xae.d, bundle);
                break;
            default:
                int i2 = GlobalWithdrawActivity.y;
                ((GlobalWithdrawActivity) obj).finish();
                break;
        }
    }
}
