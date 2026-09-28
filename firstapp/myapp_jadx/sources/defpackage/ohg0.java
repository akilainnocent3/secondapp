package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.PrizeInfo;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ohg0 {
    public static ArrayList a(List list) {
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        sportyGamesManager.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PrizeInfo prizeInfo = (PrizeInfo) it.next();
            Double prize = prizeInfo.getPrize();
            String str = "0.00";
            if (prize != null) {
                try {
                    String str2 = new DecimalFormat("0.00", sportyGamesManager.getDecimalFormatSymbols()).format(prize.doubleValue());
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
            }
            if (Intrinsics.g(prizeInfo.getStartRank(), prizeInfo.getEndRank())) {
                Integer startRank = prizeInfo.getStartRank();
                StringBuilder sb = new StringBuilder();
                sb.append(startRank);
                arrayList.add(new Pair(sb.toString(), str));
            } else {
                arrayList.add(new Pair(prizeInfo.getStartRank() + "-" + prizeInfo.getEndRank(), str));
            }
        }
        return arrayList;
    }
}
