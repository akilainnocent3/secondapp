package defpackage;

import com.sportygames.campaign.data.model.PrizeInfo;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class phg0 {
    public static ArrayList a(ArrayList arrayList, b5 b5Var) {
        b5Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PrizeInfo prizeInfo = (PrizeInfo) obj;
            Double prize = prizeInfo.getPrize();
            String str = "0.00";
            if (prize != null) {
                try {
                    String str2 = new DecimalFormat("0.00", b5Var.getDecimalFormatSymbols()).format(prize.doubleValue());
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
            }
            if (Intrinsics.g(prizeInfo.getStartRank(), prizeInfo.getEndRank())) {
                arrayList2.add(new Pair("" + prizeInfo.getStartRank(), str));
            } else {
                arrayList2.add(new Pair("" + prizeInfo.getStartRank() + '-' + prizeInfo.getEndRank(), str));
            }
        }
        return arrayList2;
    }
}
