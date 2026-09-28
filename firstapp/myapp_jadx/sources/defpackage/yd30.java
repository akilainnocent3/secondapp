package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yd30 implements Runnable {
    public final /* synthetic */ QuickBetView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Selection d;

    public /* synthetic */ yd30(QuickBetView quickBetView, String str, boolean z, Selection selection) {
        this.a = quickBetView;
        this.b = str;
        this.c = z;
        this.d = selection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = QuickBetView.j1;
        QuickBetView quickBetView = this.a;
        jrm betItem = quickBetView.getBetItem();
        String str = this.b;
        boolean z2 = this.c;
        betItem.K(str, z2);
        Selection selection = this.d;
        selection.w = z2;
        QuickBetView.q1.add(new Selection(selection.a, selection.b, selection.c));
        QuickBetView.k1 = true;
        quickBetView.a0(false);
    }
}
