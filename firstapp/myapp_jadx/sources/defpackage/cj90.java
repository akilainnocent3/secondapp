package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class cj90 {
    public static final j7g a(int i, Context context, String str) {
        BigDecimal bigDecimal;
        context.getClass();
        str.getClass();
        j7g j7gVar = new j7g(sn5.b(context, R.string.component_betslip__place_simulate_bet, new Object[0]));
        if (TextUtils.isEmpty(str)) {
            bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
        } else {
            try {
                bigDecimal = new BigDecimal(c.p(str, ",", "", false));
            } catch (Exception unused) {
                bigDecimal = BigDecimal.ZERO;
                bigDecimal.getClass();
            }
        }
        j7gVar.l(zch0.b(context.getResources(), 12), sn5.b(context, R.string.component_betslip__about_to_pay_vamount_lineup, bjb0.L(bigDecimal.multiply(BigDecimal.valueOf(i)), Locale.US)));
        return j7gVar;
    }
}
