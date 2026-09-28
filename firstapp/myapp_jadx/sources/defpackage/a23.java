package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a23 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a23(bwb bwbVar) {
        this.a = 1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = BetSlipFooter.j0;
                return new ema();
            case 1:
                return Unit.a;
            default:
                int i2 = SearchPreMatchPanel.J;
                return avy.c;
        }
    }

    public /* synthetic */ a23(int i) {
        this.a = i;
    }
}
