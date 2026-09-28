package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class zsu {
    public static final BigDecimal a = new BigDecimal(1000);

    public static BigDecimal a(int i, List list) {
        Object bVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Outcome outcome = (Outcome) it.next();
            try {
                zi50.a aVar = zi50.b;
                bVar = new BigDecimal(outcome.odds);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            BigDecimal bigDecimal = (BigDecimal) bVar;
            if (bigDecimal != null) {
                arrayList.add(bigDecimal);
            }
        }
        int size = i - arrayList.size();
        int i2 = 0;
        if (size < 0) {
            size = 0;
        }
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            bigDecimalAdd = bigDecimalAdd.add((BigDecimal) obj);
        }
        BigDecimal bigDecimalAdd2 = bigDecimalAdd.add(a.multiply(new BigDecimal(size)));
        int size3 = arrayList.size();
        if (i < size3) {
            i = size3;
        }
        if (i < 1) {
            i = 1;
        }
        BigDecimal bigDecimalDivide = bigDecimalAdd2.divide(new BigDecimal(i), MathContext.DECIMAL64);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public static BigDecimal b(Market market) {
        Object bVar;
        List<Outcome> list = market.outcomes;
        list.getClass();
        Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
        if (outcome != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = new BigDecimal(outcome.odds);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            BigDecimal bigDecimal = (BigDecimal) bVar;
            if (bigDecimal != null) {
                return bigDecimal;
            }
        }
        return a;
    }

    public static boolean c(Event event, String str) {
        if (str == null || StringsKt.U(str)) {
            return false;
        }
        String string = StringsKt.t0(StringsKt.o0(StringsKt.k0(str, "(", ""), ")")).toString();
        int length = string.length();
        String str2 = event.homeTeamName;
        if (length <= 0) {
            str2.getClass();
            return StringsKt.M(str, str2, true);
        }
        str2.getClass();
        if (StringsKt.U(string) || StringsKt.U(str2)) {
            return false;
        }
        if (!StringsKt.M(str2, string, true) && !StringsKt.M(string, str2, true)) {
            return false;
        }
        String str3 = event.awayTeamName;
        str3.getClass();
        return StringsKt.U(string) || StringsKt.U(str3) || !(StringsKt.M(str3, string, true) || StringsKt.M(string, str3, true));
    }

    public static boolean d(Event event, Market market) {
        List<Outcome> list = market.outcomes;
        list.getClass();
        Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
        return c(event, outcome != null ? outcome.desc : null);
    }

    public static boolean e(Event event, List list) {
        Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
        return c(event, outcome != null ? outcome.desc : null);
    }
}
