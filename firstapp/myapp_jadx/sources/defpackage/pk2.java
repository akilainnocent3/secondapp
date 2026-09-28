package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class pk2 {
    public static String a(Context context, String str) {
        context.getClass();
        str.getClass();
        BigDecimal bigDecimalA = ird0.a().a();
        BigDecimal bigDecimalB = ird0.a().b();
        if (!TextUtils.isEmpty(str) && !str.equals("0")) {
            String strP = c.p(StringsKt.t0(str).toString(), ",", "", false);
            if (strP.equals(".")) {
                return sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, b6y.b(bigDecimalA));
            }
            AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
            try {
                Double.parseDouble(strP);
                BigDecimal bigDecimal = new BigDecimal(strP);
                if (iu2.k()) {
                    BigDecimal bigDecimalF = ird0.a().f();
                    if (bigDecimal.compareTo(bigDecimalF) < 0) {
                        return sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, b6y.b(bigDecimalF));
                    }
                } else {
                    if (bigDecimal.compareTo(bigDecimalA) < 0) {
                        return sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, b6y.b(bigDecimalA));
                    }
                    if (bigDecimal.compareTo(bigDecimalB) > 0) {
                        return sn5.b(context, R.string.component_betslip__greater_than_max, b6y.b(bigDecimalB));
                    }
                }
            } catch (NumberFormatException unused) {
                return sn5.b(context, R.string.page_payment__please_enter_a_valid_number, new Object[0]);
            }
        }
        return "";
    }
}
