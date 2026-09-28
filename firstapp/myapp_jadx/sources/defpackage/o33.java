package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class o33 implements Function1<huy, Unit> {
    public final /* synthetic */ BetSlipFooter a;

    public o33(BetSlipFooter betSlipFooter) {
        this.a = betSlipFooter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(huy huyVar) {
        huy huyVar2 = huyVar;
        huyVar2.getClass();
        to3 to3Var = this.a.H;
        if (to3Var != null) {
            to3Var.d1(BetSlipFooter.i(huyVar2));
        }
        return Unit.a;
    }
}
