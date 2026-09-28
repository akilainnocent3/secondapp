package defpackage;

import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.gift.GiftDetails;
import java.math.BigDecimal;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wvc0 extends pf implements kaj<List<? extends f4d0>, lni0, TaxConfigs, List<? extends GiftDetails>, m780, v1b<? super ysa>, Object> {
    @Override // defpackage.kaj
    public final Object f(List<? extends f4d0> list, lni0 lni0Var, TaxConfigs taxConfigs, List<? extends GiftDetails> list2, m780 m780Var, v1b<? super ysa> v1bVar) {
        List<? extends f4d0> list3 = list;
        lni0 lni0Var2 = lni0Var;
        TaxConfigs taxConfigs2 = taxConfigs;
        List<? extends GiftDetails> list4 = list2;
        m780 m780Var2 = m780Var;
        yvc0 yvc0Var = (yvc0) this.a;
        ht90 ht90Var = yvc0Var.d;
        if (lni0Var2 == lni0.a) {
            return null;
        }
        String strB = yvc0Var.b.B();
        TaxConfig virtualTaxConfig = taxConfigs2.getVirtualTaxConfig();
        BigDecimal bigDecimalH = hn9.h(list3);
        BigDecimal bigDecimalE = hn9.e(bigDecimalH, m780Var2);
        virtualTaxConfig.getClass();
        BigDecimal exciseTax = virtualTaxConfig.getExciseTax(bigDecimalE);
        BigDecimal bigDecimalAdd = bigDecimalE.add(exciseTax);
        bigDecimalAdd.getClass();
        return new ysa(ht90.n(bigDecimalAdd, strB), ht90.m(strB, bigDecimalE, exciseTax, virtualTaxConfig.hasExciseTaxRate()), ht90.e(list4, m780Var2, bigDecimalH, strB));
    }
}
