package defpackage;

import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import java.util.HashMap;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class kn5 {
    public static String a(String str, String str2) {
        str.getClass();
        str2.getClass();
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

    public static String b(eo5 eo5Var) {
        op5 op5Var = op5.a;
        String string = eo5Var.b;
        try {
            if (string.length() != 0) {
                StringBuilder sb = new StringBuilder();
                List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{" "}, false, 0, 6, null);
                if (!listSplit$default.isEmpty()) {
                    int size = listSplit$default.size();
                    for (int i = 0; i < size; i++) {
                        if (((CharSequence) listSplit$default.get(i)).length() != 0) {
                            sb.append((String) listSplit$default.get(i));
                            if (i != listSplit$default.size() - 1) {
                                sb.append("_");
                            }
                        }
                    }
                    string = sb.toString();
                }
            }
        } catch (Exception unused) {
        }
        String strA = oxc.a(string, ":", eo5Var.a);
        String str = eo5Var.c;
        HashMap<String, String> map = eo5Var.d;
        op5Var.getClass();
        return op5.b(strA, str, map);
    }
}
