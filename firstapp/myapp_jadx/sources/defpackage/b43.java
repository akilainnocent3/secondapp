package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import java.math.BigDecimal;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class b43 extends uj90<Pair<? extends Integer, ? extends onw>> {
    public final /* synthetic */ BetSlipFooter b;

    public b43(BetSlipFooter betSlipFooter) {
        this.b = betSlipFooter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kfy
    public final void onNext(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        onw onwVar = (onw) pair.b;
        BigDecimal bigDecimal = onwVar.a;
        BigDecimal bigDecimal2 = onwVar.b;
        BigDecimal bigDecimal3 = onwVar.c;
        BigDecimal bigDecimal4 = onwVar.d;
        long j = onwVar.e;
        int iIntValue = ((Number) pair.a).intValue();
        boolean zP = iu2.p();
        boolean z = onwVar.f;
        int i = BetSlipFooter.j0;
        this.b.C(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, j, iIntValue, zP, z);
    }
}
