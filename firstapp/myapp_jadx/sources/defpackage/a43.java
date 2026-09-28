package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class a43 extends uj90<Pair<? extends Integer, ? extends iw90>> {
    public final /* synthetic */ BetSlipFooter b;

    public a43(BetSlipFooter betSlipFooter) {
        this.b = betSlipFooter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kfy
    public final void onNext(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        to3 to3Var = this.b.H;
        if (to3Var == null || to3Var.x() != 1) {
            return;
        }
        iw90 iw90Var = (iw90) pair.b;
        this.b.D(iw90Var.a, iw90Var.b, iw90Var.c, iw90Var.d, iw90Var.e, ((Number) pair.a).intValue(), iu2.p());
    }
}
