package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p13 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1k b;

    public /* synthetic */ p13(j1k j1kVar, int i) {
        this.a = i;
        this.b = j1kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        j1k j1kVar = this.b;
        switch (i) {
            case 0:
                BetSlipFooter betSlipFooter = (BetSlipFooter) j1kVar;
                to3 to3Var = betSlipFooter.H;
                if (to3Var != null) {
                    to3Var.P();
                }
                betSlipFooter.getInsureMoreUiStateManager().a.setValue(f5w.a.a);
                break;
            default:
                ((tak0) j1kVar).dismiss();
                break;
        }
        return Unit.a;
    }
}
