package defpackage;

import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class mt5 {
    public final jrm a;
    public final ex4 b;

    public mt5(jrm jrmVar, ex4 ex4Var) {
        jrmVar.getClass();
        ex4Var.getClass();
        this.a = jrmVar;
        this.b = ex4Var;
    }

    public final BigDecimal a(BigDecimal bigDecimal) {
        Object bVar;
        Object bVar2;
        bigDecimal.getClass();
        TaxConfigs taxConfigsC = this.b.C();
        TaxConfig virtualTaxConfig = this.a.m0() ? taxConfigsC.getVirtualTaxConfig() : taxConfigsC.getRealSportTaxConfig();
        try {
            zi50.a aVar = zi50.b;
            bVar = new BigDecimal(virtualTaxConfig.getExciseTaxRateToCharge());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bVar instanceof zi50.b) {
            bVar = bigDecimal2;
        }
        BigDecimal bigDecimal3 = (BigDecimal) bVar;
        if (bigDecimal3.compareTo(bigDecimal2) <= 0) {
            bigDecimal2.getClass();
            return bigDecimal2;
        }
        try {
            bVar2 = new BigDecimal(virtualTaxConfig.getExciseTaxRateToBonus());
        } catch (Throwable th2) {
            zi50.a aVar3 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        if (bVar2 instanceof zi50.b) {
            bVar2 = bigDecimal4;
        }
        BigDecimal bigDecimal5 = (BigDecimal) bVar2;
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal3);
        bigDecimalMultiply.getClass();
        bigDecimal5.getClass();
        BigDecimal bigDecimalMultiply2 = bigDecimal.multiply(bigDecimal5);
        bigDecimalMultiply2.getClass();
        BigDecimal bigDecimalSubtract = bigDecimalMultiply.subtract(bigDecimalMultiply2);
        bigDecimalSubtract.getClass();
        bigDecimal4.getClass();
        Comparable comparableD = wl8.d(bigDecimalSubtract, bigDecimal4);
        comparableD.getClass();
        return (BigDecimal) comparableD;
    }
}
