package defpackage;

import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.gift.GiftDetails;
import java.math.BigDecimal;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oc5 extends pf implements kaj<lni0, TaxConfigs, List<? extends GiftDetails>, m780, String, v1b<? super ysa>, Object> {
    @Override // defpackage.kaj
    public final Object f(lni0 lni0Var, TaxConfigs taxConfigs, List<? extends GiftDetails> list, m780 m780Var, String str, v1b<? super ysa> v1bVar) {
        lni0 lni0Var2 = lni0Var;
        TaxConfigs taxConfigs2 = taxConfigs;
        List<? extends GiftDetails> list2 = list;
        m780 m780Var2 = m780Var;
        String str2 = str;
        qc5 qc5Var = (qc5) this.a;
        hn9 hn9Var = qc5Var.c;
        if (lni0Var2 == lni0.a) {
            return null;
        }
        String strB = qc5Var.b.B();
        TaxConfig virtualTaxConfig = taxConfigs2.getVirtualTaxConfig();
        BigDecimal bigDecimalG = b.g(str2);
        if (bigDecimalG == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        BigDecimal bigDecimalE = hn9.e(bigDecimalG, m780Var2);
        virtualTaxConfig.getClass();
        BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
        BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
        bigDecimalAdd.getClass();
        return new ysa(ht90.n(bigDecimalAdd, strB), ht90.m(strB, bigDecimalE, exciseTax, virtualTaxConfig.hasExciseTaxRate()), ht90.e(list2, m780Var2, bigDecimalG, strB));
    }
}
