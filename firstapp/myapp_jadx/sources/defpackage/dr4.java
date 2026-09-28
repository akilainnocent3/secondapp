package defpackage;

import com.sporty.android.core.model.gift.BonusFactor;
import com.sportybet.plugin.realsports.data.Sport;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class dr4 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static BigDecimal a(List list) {
        ArrayList arrayListA = kw5.a(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Sport sport = ((lw2.a) it.next()).a.sport;
            String str = sport.category.tournament.id;
            String str2 = sport.id;
            LinkedHashMap linkedHashMap = a;
            BigDecimal bigDecimal = null;
            if (linkedHashMap.containsKey(str)) {
                Double d = (Double) linkedHashMap.get(str);
                if (d != null) {
                    bigDecimal = BigDecimal.valueOf(d.doubleValue());
                }
            } else if (linkedHashMap.containsKey(str2)) {
                Double d2 = (Double) linkedHashMap.get(str2);
                if (d2 != null) {
                    bigDecimal = BigDecimal.valueOf(d2.doubleValue());
                }
            } else {
                bigDecimal = new BigDecimal(10000);
            }
            if (bigDecimal != null) {
                arrayListA.add(bigDecimal);
            }
        }
        BigDecimal bigDecimal2 = (BigDecimal) CollectionsKt.f0(arrayListA);
        if (bigDecimal2 == null) {
            return new BigDecimal(10000);
        }
        BigDecimal bigDecimalDivide = bigDecimal2.divide(new BigDecimal(10000));
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public static void b(List list) {
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            if (new BigDecimal(String.valueOf(((BonusFactor) obj).getBonusFactor())).compareTo(BigDecimal.ZERO) > 0) {
                arrayListA.add(obj);
            }
        }
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListA.get(i);
            i++;
            BonusFactor bonusFactor = (BonusFactor) obj2;
            String strUsedTournamentId = bonusFactor.usedTournamentId();
            if (StringsKt.U(strUsedTournamentId)) {
                strUsedTournamentId = bonusFactor.usedSportId();
            }
            a.put(strUsedTournamentId, Double.valueOf(bonusFactor.getBonusFactor()));
        }
    }
}
