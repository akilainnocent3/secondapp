package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.pocket.common.DefaultLimitAmountData;
import com.sportybet.android.globalpay.data.GlobalPayLimit;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class z600 {
    public static volatile z600 h;
    public w600 b;
    public lwo c;
    public bcp d;
    public DefaultLimitAmountData e;
    public final psm a = (psm) hwr.b(new c8b(0)).getValue();
    public final ssw<Boolean> f = new ssw<>();
    public long g = -1;

    public class a extends TypeToken<List<GlobalPayLimit>> {
    }

    public z600() {
        a700 a700VarG = a8b.c().g();
        hp0 hp0Var = hp0.A;
        hp0Var.getClass();
        k650 k650VarQ = ((g650) qag.a(hp0Var, g650.class)).Q();
        k650VarQ.getClass();
        String str = a700VarG.a;
        this.b = new w600(str != null ? k650VarQ.c(str) : 1L, k650VarQ.c(a700VarG.b), k650VarQ.c(a700VarG.c), k650VarQ.c(a700VarG.d));
        this.c = new lwo(1000.0d, 1000.0d, 0.01d, 0.01d);
    }

    public static z600 a() {
        if (h == null) {
            synchronized (z600.class) {
                try {
                    if (h == null) {
                        h = new z600();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final void b() {
        double d;
        double dDoubleValue;
        double d2;
        psm psmVar = this.a;
        String strB = psmVar.B();
        Locale locale = Locale.US;
        String lowerCase = strB.toLowerCase(locale);
        String lowerCase2 = psmVar.getCountryCode().getCode().toLowerCase(locale);
        DefaultLimitAmountData defaultLimitAmountData = this.e;
        double dDoubleValue2 = 0.01d;
        double dDoubleValue3 = 1000.0d;
        if (defaultLimitAmountData != null) {
            double dDoubleValue4 = (defaultLimitAmountData.getMinimumDepositAmount() == null || this.e.getMinimumDepositAmount().doubleValue() <= 0.0d) ? 0.01d : this.e.getMinimumDepositAmount().doubleValue();
            if (this.e.getMinimumWithdrawalAmount() != null && this.e.getMinimumWithdrawalAmount().doubleValue() > 0.0d) {
                dDoubleValue2 = this.e.getMinimumWithdrawalAmount().doubleValue();
            }
            dDoubleValue = (this.e.getMaximumDepositAmount() == null || this.e.getMaximumDepositAmount().doubleValue() <= 0.0d) ? 1000.0d : this.e.getMaximumDepositAmount().doubleValue();
            if (this.e.getMaximumWithdrawalAmount() != null && this.e.getMaximumWithdrawalAmount().doubleValue() > 0.0d) {
                dDoubleValue3 = this.e.getMaximumWithdrawalAmount().doubleValue();
            }
            d = dDoubleValue3;
            d2 = dDoubleValue2;
            dDoubleValue2 = dDoubleValue4;
        } else {
            d = 1000.0d;
            dDoubleValue = 1000.0d;
            d2 = 0.01d;
        }
        double d3 = dDoubleValue;
        double amount = d;
        double amount2 = d3;
        double amount3 = d2;
        double amount4 = dDoubleValue2;
        for (int i = 0; i < 4; i++) {
            List<GlobalPayLimit> list = null;
            try {
                list = (List) new eal().f(dc8.f(i, this.d, null), new a().getType());
            } catch (qep e) {
                itf0.a.e(e);
            }
            if (list != null && !list.isEmpty()) {
                for (GlobalPayLimit globalPayLimit : list) {
                    if (globalPayLimit != null && globalPayLimit.getCurrency().equalsIgnoreCase(lowerCase) && globalPayLimit.getCountry().equalsIgnoreCase(lowerCase2)) {
                        if (i == 0) {
                            amount4 = globalPayLimit.getAmount() / 10000.0d;
                        } else if (i == 1) {
                            amount2 = globalPayLimit.getAmount() / 10000.0d;
                        } else if (i == 2) {
                            amount3 = globalPayLimit.getAmount() / 10000.0d;
                        } else if (i == 3) {
                            amount = globalPayLimit.getAmount() / 10000.0d;
                        }
                    }
                }
            }
        }
        this.c = new lwo(amount4, amount2, amount3, amount);
    }

    public final String toString() {
        return "PaymentConfigAgent{paymentConfig=" + this.b + '}';
    }
}
