package defpackage;

import android.os.Bundle;
import android.view.View;
import com.sportybet.plugin.myfavorite.widget.QuickAddStakeLayout;
import com.sportybet.plugin.myfavorite.widget.item.QuickAddStakeItem;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.remote.models.BetHistoryItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rr2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rr2(Object obj, int i) {
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
                return;
            default:
                QuickAddStakeLayout quickAddStakeLayout = (QuickAddStakeLayout) obj;
                QuickAddStakeItem quickAddStakeItem = quickAddStakeLayout.K;
                if (quickAddStakeItem != null) {
                    quickAddStakeLayout.F(quickAddStakeItem);
                    return;
                } else {
                    Intrinsics.n("currentItem");
                    throw null;
                }
        }
    }
}
