package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z33 extends uj90<bxg0<? extends Integer, ? extends Pair<? extends TaxConfigs, ? extends String>, ? extends String>> {
    public final /* synthetic */ BetSlipFooter b;

    public z33(BetSlipFooter betSlipFooter) {
        this.b = betSlipFooter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kfy
    public final void onNext(Object obj) {
        bxg0 bxg0Var = (bxg0) obj;
        bxg0Var.getClass();
        Pair pair = (Pair) bxg0Var.b;
        if (Intrinsics.g(pair.b, "- -")) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(((Number) bxg0Var.a).intValue());
        A a = pair.a;
        A a2 = pair.a;
        boolean zHasExciseTaxRate = ((TaxConfigs) a).hasExciseTaxRate(iu2.p());
        BigDecimal bigDecimalA = b6y.a((String) pair.b);
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalA);
        String str = (String) bxg0Var.c;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_TAX);
        aVar.g("[exciseTaxSubject] autoBetTimes: " + bigDecimal + ", adjustTax: " + str + ", exciseTax: " + bigDecimalA + ", totalExciseTax: " + bigDecimalMultiply, new Object[0]);
        int length = str.length();
        BetSlipFooter betSlipFooter = this.b;
        if (length <= 0 || !iu2.p()) {
            betSlipFooter.setShowExciseTax(zHasExciseTaxRate, bjb0.L(bigDecimalMultiply, Locale.US));
        } else {
            ((TaxConfigs) a2).getVirtualTaxConfig().getExciseTax(new BigDecimal(str));
            betSlipFooter.setShowExciseTax(zHasExciseTaxRate, bjb0.L(bigDecimal.multiply(((TaxConfigs) a2).getVirtualTaxConfig().getExciseTax(new BigDecimal(str))), Locale.US));
        }
    }
}
