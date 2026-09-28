package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u5y {
    public static void a(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static final ArrayList b(List list) {
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            Market market = (Market) obj;
            if (!c(market) && d(market)) {
                arrayListA.add(obj);
            }
        }
        return arrayListA;
    }

    public static final boolean c(Market market) {
        market.getClass();
        return Intrinsics.g(market.id, "820003");
    }

    public static final boolean d(Market market) {
        market.getClass();
        List<Outcome> list = market.outcomes;
        list.getClass();
        Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
        List<PreCannedBBOutcome> list2 = outcome != null ? outcome.childOutcomes : null;
        return !(list2 == null || list2.isEmpty());
    }

    public static BigDecimal e(String str) {
        a(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }
}
