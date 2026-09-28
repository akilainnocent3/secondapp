package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w8l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w8l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj;
                ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
                return Unit.a;
            case 1:
                return (trf0) ((ytw) obj).getValue();
            default:
                QuickBetView quickBetView = (QuickBetView) obj;
                boolean z = QuickBetView.j1;
                quickBetView.getBetSlipMarketingDomainService().e(false);
                quickBetView.i.clear();
                quickBetView.v();
                quickBetView.K0();
                return Unit.a;
        }
    }
}
