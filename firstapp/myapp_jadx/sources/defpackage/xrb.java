package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xrb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xrb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((esb) obj2).b(Boolean.FALSE, (String) obj);
                break;
            default:
                QuickBetView quickBetView = (QuickBetView) obj2;
                Selection selection = (Selection) obj;
                boolean z = QuickBetView.j1;
                quickBetView.getBetItem().N0(selection.a, selection.b, selection.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection.d, (14336 & 64) != 0 ? k980.DEFAULT : selection.e, (14336 & 128) != 0 ? false : selection.i, (14336 & 256) != 0 ? false : true, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                jrm betItem = quickBetView.getBetItem();
                Event event = selection.a;
                Market market = selection.b;
                Outcome outcome = selection.c;
                if (betItem.v(event, market, outcome)) {
                    QuickBetView.q1.add(new Selection(event, market, outcome, selection.d));
                }
                break;
        }
    }
}
