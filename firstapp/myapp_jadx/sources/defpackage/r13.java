package defpackage;

import android.accounts.Account;
import android.view.KeyEvent;
import android.view.View;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r13 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ r13(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                to3 to3Var = ((BetSlipFooter) callback).H;
                if (to3Var != null) {
                    to3Var.s0(true);
                    return;
                }
                return;
            case 1:
                final EventActivity eventActivity = (EventActivity) callback;
                int i2 = EventActivity.U0;
                rvu rvuVar = eventActivity.F0;
                if (rvuVar == null) {
                    Intrinsics.n("matchAlertViewModel");
                    throw null;
                }
                if (rvuVar.E.d() instanceof tzs.b) {
                    return;
                }
                eventActivity.getAccountHelper().demandAccount(eventActivity, new tit() { // from class: oig
                    @Override // defpackage.tit
                    public final void w(Account account, boolean z) {
                        int i3 = EventActivity.U0;
                        if (account != null) {
                            EventActivity eventActivity2 = eventActivity;
                            if (eventActivity2.getAccountHelper().isLogin()) {
                                rvu rvuVar2 = eventActivity2.F0;
                                if (rvuVar2 == null) {
                                    Intrinsics.n("matchAlertViewModel");
                                    throw null;
                                }
                                e eVar = eventActivity2.E0;
                                if (eVar == null) {
                                    Intrinsics.n("eventViewModel");
                                    throw null;
                                }
                                ej5.c(o8i0.d(rvuVar2), null, null, new vvu(rvuVar2, eVar.Q, null), 3);
                            }
                        }
                    }
                });
                return;
            default:
                SearchMarketView searchMarketView = (SearchMarketView) callback;
                int i3 = SearchMarketView.K;
                searchMarketView.F.c.setText("");
                searchMarketView.clearFocus();
                aff affVar = searchMarketView.H;
                if (affVar != null) {
                    ((vbz) affVar).a(true);
                    return;
                }
                return;
        }
    }
}
