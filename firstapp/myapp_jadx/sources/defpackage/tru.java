package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class tru {
    public static final HashSet a;
    public static final Set<String> b;
    public static final Set<String> c;

    static {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"202"}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        a = new HashSet(Collections.unmodifiableList(arrayList));
        Object[] objArr = {"18", "68", "90"};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj2 = objArr[i];
            Objects.requireNonNull(obj2);
            if (!hashSet.add(obj2)) {
                hb5.a(wga.a(obj2, "duplicate element: "));
                return;
            }
        }
        b = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet(1);
        Object obj3 = new Object[]{"18"}[0];
        Objects.requireNonNull(obj3);
        if (hashSet2.add(obj3)) {
            c = Collections.unmodifiableSet(hashSet2);
        } else {
            hb5.a(wga.a(obj3, "duplicate element: "));
        }
    }

    public static String b(Market market) {
        String str = market.desc;
        String strSubstring = market.specifier;
        try {
            if (strSubstring.contains("|")) {
                int iIndexOf = strSubstring.indexOf("|");
                strSubstring = iIndexOf >= 0 ? strSubstring.substring(iIndexOf + 1) : "";
            }
            return str.replaceAll(Pattern.quote(strSubstring.split("=")[1]), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
        } catch (Exception unused) {
            return market.desc;
        }
    }

    public static String c(Market market, boolean z, mfb0 mfb0Var, Context context) {
        if (!z) {
            return market.desc;
        }
        if (mfb0Var.b(market.id)) {
            return a.contains(market.id) ? sn5.b(context, R.string.common_functions__combo_market_title_set_winner, new Object[0]) : b(market);
        }
        return a(market);
    }

    public static String d(mfb0 mfb0Var, String str, Outcome outcome) {
        if (mfb0Var.m(str) || mfb0Var.i(str)) {
            String str2 = outcome != null ? outcome.desc : null;
            if (str2 != null) {
                int iLastIndexOf = str2.lastIndexOf(40);
                int iLastIndexOf2 = str2.lastIndexOf(41);
                if (iLastIndexOf >= 0 && iLastIndexOf2 > iLastIndexOf) {
                    String strTrim = str2.substring(iLastIndexOf + 1, iLastIndexOf2).trim();
                    if (!strTrim.isEmpty()) {
                        return strTrim;
                    }
                }
            }
        }
        return outcome != null ? outcome.odds : "";
    }

    public static String e(String[] strArr) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length - 1; i++) {
                sb.append(strArr[i]);
                sb.append(" ");
            }
            return sb.toString().trim();
        } catch (Exception unused) {
            return strArr.length > 0 ? strArr[0] : "";
        }
    }

    public static String f(String str) {
        try {
            return str.replace("(", "").replace(")", "").replace("+", "").replace("-", "");
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean g(String str, String str2) {
        if (b.contains(str) && !TextUtils.isEmpty(str2)) {
            try {
                Integer.parseInt(str2.replace("total=", ""));
                return true;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public static boolean h(Market market, String str) {
        return str.equals("16") && market.id.equals("223");
    }

    public static ArrayList i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (str.contains("|")) {
                    String[] strArrSplit = str.split("\\|");
                    str = (strArrSplit.length <= 1 || strArrSplit[0].contains("total") || strArrSplit[0].contains("hcp")) ? strArrSplit[0] : strArrSplit[1];
                }
                if (str.contains("=")) {
                    String[] strArrSplit2 = str.split("=");
                    if (strArrSplit2.length > 1) {
                        arrayList.add(strArrSplit2[1]);
                    }
                }
            } catch (Exception unused) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_HOME_SCREEN);
                aVar.n("can't parse specifier", new Object[0]);
            }
        }
        return arrayList;
    }

    public static String a(Market market) {
        int length;
        int i;
        String strSubstring = market.desc;
        try {
            if (!market.outcomes.isEmpty()) {
                String[] strArrSplit = market.outcomes.get(0).desc.split("\\s+");
                if (strArrSplit.length > 1) {
                    String strReplace = strArrSplit[1];
                    try {
                        strReplace = strReplace.replace("(", "").replace(")", "").replace("+", "");
                    } catch (Exception unused) {
                    }
                    try {
                        float fAbs = Math.abs(Float.parseFloat(strReplace));
                        i = fAbs >= 1.0f ? (int) fAbs : Integer.MAX_VALUE;
                    } catch (Exception unused2) {
                    }
                    strSubstring = strSubstring.replaceAll(Pattern.quote(strReplace) + "(?!st|nd|rd|th)", "").trim();
                    length = i != Integer.MAX_VALUE ? String.valueOf(i).length() : 0;
                } else {
                    length = 0;
                    i = 0;
                }
                int iLastIndexOf = strSubstring.lastIndexOf("-");
                if (iLastIndexOf != -1 && iLastIndexOf == (strSubstring.length() - length) - 1) {
                    strSubstring = strSubstring.substring(0, iLastIndexOf);
                }
                int iLastIndexOf2 = strSubstring.lastIndexOf("- " + i);
                if (iLastIndexOf2 != -1 && length > 0) {
                    strSubstring = strSubstring.substring(0, iLastIndexOf2);
                }
            }
        } catch (Exception unused3) {
            strSubstring = market.desc;
        }
        if (TextUtils.isEmpty(strSubstring)) {
            strSubstring = market.desc;
        }
        return g(market.id, market.specifier) ? inm.a(yFmFZvuWxAYfEj.tpAIJfx, strSubstring) : strSubstring;
    }
}
