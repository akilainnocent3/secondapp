package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class seq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ seq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(keq.c.a);
                return Unit.a;
            case 1:
                QuickBetView quickBetView = (QuickBetView) obj;
                boolean z = QuickBetView.j1;
                quickBetView.getBetSlipMarketingDomainService().d(false);
                yyk yykVar = quickBetView.i0;
                if (yykVar != null) {
                    yykVar.H1();
                }
                quickBetView.K0();
                return Unit.a;
            default:
                zzr zzrVar = (zzr) obj;
                return new Pair(Integer.valueOf(zzrVar.i()), Integer.valueOf(zzrVar.h()));
        }
    }
}
