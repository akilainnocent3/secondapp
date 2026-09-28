package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ngg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ngg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgg) obj).F0();
                break;
            default:
                QuickBetView quickBetView = (QuickBetView) obj;
                boolean z = QuickBetView.j1;
                quickBetView.getBetSlipMarketingDomainService().f(false);
                yyk yykVar = quickBetView.i0;
                if (yykVar != null) {
                    yykVar.H1();
                }
                quickBetView.i.clear();
                quickBetView.v();
                quickBetView.K0();
                break;
        }
        return Unit.a;
    }
}
