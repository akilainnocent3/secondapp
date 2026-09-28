package defpackage;

import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class srd0 {
    public static String a(String str, String str2) {
        str.getClass();
        if ((!str2.equals("0") && !str2.equals(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS)) || str.length() != 0) {
            if (!str2.equals(".")) {
                int iS = StringsKt.S(str, '.', 0, 6);
                if (iS < 0 || (str.length() - iS) - 1 < 2) {
                    return str.concat(str2);
                }
            } else if (!StringsKt.M(str, ".", false)) {
                return str.length() == 0 ? "0." : str.concat(".");
            }
        }
        return str;
    }
}
