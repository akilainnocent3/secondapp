package defpackage;

import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.text.b;

/* JADX INFO: loaded from: classes.dex */
public class b22 {
    public static muh0 a(b22 b22Var, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        b22Var.getClass();
        str.getClass();
        if (str.length() == 0) {
            return new muh0.b(null);
        }
        BigDecimal bigDecimalG = b.g(str);
        if (bigDecimalG == null) {
            return new muh0.a(R.string.common_feedback__something_went_wrong);
        }
        if (bigDecimal == null || bigDecimalG.compareTo(bigDecimal) >= 0) {
            return (bigDecimal2 == null || bigDecimalG.compareTo(bigDecimal2) <= 0) ? new muh0.b(bigDecimalG) : new muh0.a(R.string.page_limits__the_amount_must_be_lower_than_the_maximum_stake);
        }
        return new muh0.a(R.string.page_limits__the_amount_must_be_higher_than_the_minimum_stake);
    }
}
