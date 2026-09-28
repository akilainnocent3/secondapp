package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class c43 extends uj90<Pair<? extends Integer, ? extends BigDecimal>> {
    public final /* synthetic */ BetSlipFooter b;

    public c43(BetSlipFooter betSlipFooter) {
        this.b = betSlipFooter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kfy
    public final void onNext(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        BetSlipFooter betSlipFooter = this.b;
        c8i0.m(betSlipFooter.G.y, bjb0.L(((BigDecimal) pair.b).multiply(new BigDecimal(((Number) pair.a).intValue())), Locale.US), betSlipFooter.I, betSlipFooter.J);
    }
}
