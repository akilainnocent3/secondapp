package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.data.BetSelection;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o6v implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        BetSelection betSelection = (BetSelection) (tag instanceof BetSelection ? tag : null);
        if (betSelection == null) {
            return;
        }
        f00 f00Var = vgb0.a;
        vgb0.a("Cashout_OpenBets");
        xi6.b(betSelection.eventId, betSelection.marketId, betSelection.specifier, betSelection.sportId, betSelection.eventStatus != 0);
    }
}
