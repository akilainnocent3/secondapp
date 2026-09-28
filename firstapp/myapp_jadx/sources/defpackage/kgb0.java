package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.realsports.Order;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import com.sportybet.plugin.realsports.data.CashOutHistory;
import com.sportybet.plugin.realsports.data.Combination;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.RBet;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.data.Tournaments;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class kgb0 {
    public static final ArrayList a = new ArrayList(Arrays.asList("sr:tournament:1374", "sr:tournament:1376", "sr:tournament:1378", "sr:tournament:1380", "sr:tournament:1382", "sr:tournament:1384", "sr:tournament:1386", "sr:tournament:1388", "sr:tournament:1390"));

    public static ArrayList a(List list, ArrayList arrayList) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tournaments tournaments = (Tournaments) it.next();
            r1 r1Var = new r1();
            r1Var.c = tournaments.eventSize;
            r1Var.a = tournaments.name;
            String str = tournaments.id;
            r1Var.b = str;
            r1Var.d = arrayList.contains(str);
            arrayList2.add(r1Var);
        }
        return arrayList2;
    }

    public static ArrayList b(boolean z, int i, RBet rBet) {
        ArrayList arrayList = new ArrayList();
        il30 il30Var = new il30();
        il30Var.a = rBet;
        il30Var.b = z;
        il30Var.c = i;
        arrayList.add(il30Var);
        List<CashOutHistory> list = rBet.cashOutHistorys;
        if (list != null && list.size() > 0) {
            fl30 fl30Var = new fl30();
            fl30Var.b = false;
            fl30Var.e = false;
            fl30Var.a = false;
            arrayList.add(fl30Var);
            ArrayList arrayList2 = new ArrayList();
            long j = 0;
            int i2 = 0;
            long j2 = 0;
            while (i2 < rBet.cashOutHistorys.size()) {
                CashOutHistory cashOutHistory = rBet.cashOutHistorys.get(i2);
                gl30 gl30Var = new gl30();
                gl30Var.b = i2 == 0;
                j += Long.parseLong(cashOutHistory.amount);
                j2 += Long.parseLong(cashOutHistory.usedStake);
                gl30Var.a = cashOutHistory;
                arrayList2.add(gl30Var);
                i2++;
            }
            gl30 gl30Var2 = new gl30();
            gl30Var2.b = false;
            gl30Var2.c = true;
            Locale locale = Locale.US;
            gl30Var2.e = bjb0.U(j, locale);
            gl30Var2.d = bjb0.U(j2, locale);
            arrayList2.add(gl30Var2);
            fl30Var.d = arrayList2;
        }
        List<RSelection> list2 = rBet.selections;
        if (list2 != null && list2.size() > 0) {
            fl30 fl30Var2 = new fl30();
            fl30Var2.a = true;
            fl30Var2.b = true;
            fl30Var2.e = true;
            arrayList.add(fl30Var2);
            ArrayList arrayList3 = new ArrayList();
            boolean z2 = rBet.selections.size() > 1;
            int i3 = 0;
            while (i3 < rBet.selections.size()) {
                RSelection rSelection = rBet.selections.get(i3);
                cu30 cu30Var = new cu30();
                cu30Var.a = rSelection;
                cu30Var.b = z2;
                i3++;
                cu30Var.c = i3;
                arrayList3.add(cu30Var);
            }
            fl30Var2.c = arrayList3;
            arrayList.addAll(arrayList3);
        }
        List<Combination> list3 = rBet.combinations;
        if (list3 != null && list3.size() > 1) {
            int i4 = 0;
            while (i4 < rBet.combinations.size()) {
                Combination combination = rBet.combinations.get(i4);
                el30 el30Var = new el30();
                el30Var.a = combination;
                el30Var.b = i4 == 0;
                arrayList.add(el30Var);
                i4++;
            }
        }
        return arrayList;
    }

    public static ArrayList c(List list, String str, String str2, hkf hkfVar) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Tournament tournament = (Tournament) list.get(0);
        List<Event> list2 = tournament.events;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        List listC = hkfVar.c(str, str2, list2, false);
        if (listC.isEmpty()) {
            return null;
        }
        String str3 = tournament.id;
        String str4 = tournament.name;
        int size = listC.size() - 1;
        long j = 0;
        for (int i = 0; i <= size; i++) {
            Event event = (Event) listC.get(i);
            ing ingVar = new ing();
            ingVar.a = event;
            ingVar.d = false;
            ingVar.b = str3;
            ingVar.i = str4;
            ingVar.v = true;
            ingVar.c = !vjt.a(j, event.estimateStartTime);
            j = event.estimateStartTime;
            arrayList.add(ingVar);
        }
        return arrayList;
    }

    public static JSONArray d(String str, String str2, List list, double d, int i) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sportId", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("marketId", str2);
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((String) it.next());
                }
                jSONArray2.put(jSONArray3);
                jSONObject.put("tournamentId", jSONArray2);
            }
            DecimalFormat decimalFormat = b6y.a;
            if (Double.doubleToLongBits(-1.0d) == Double.doubleToLongBits(d)) {
                jSONObject.put("timeline", Double.valueOf(bwf0.w()));
                jSONObject.put("todayGames", true);
            } else if (d > 0.0d) {
                jSONObject.put("timeline", d);
            }
            jSONObject.put("productId", i);
            jSONObject.put("count", 1);
            jSONObject.put("ignoreEmpty", false);
            jSONArray.put(jSONObject);
            return jSONArray;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONArray;
        }
    }

    public static JSONObject e(String str, String str2, List list, long j, long j2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sportId", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("marketId", str2);
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray2.put((String) it.next());
                }
                jSONArray.put(jSONArray2);
                jSONObject.put("tournamentId", jSONArray);
            }
            if (j > 0) {
                jSONObject.put("startTime", j);
            }
            if (j2 > 0) {
                jSONObject.put("endTime", j2);
            }
            jSONObject.put("count", 1);
            jSONObject.put("todayGames", z);
            jSONObject.put("productId", 3);
            jSONObject.put("ignoreEmpty", false);
            jSONObject.put("withOneUpMarket", true);
            jSONObject.put("withTwoUpMarket", true);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static ArrayList f(long j, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        long j2 = j;
        while (it.hasNext()) {
            Order order = (Order) it.next();
            or30 or30Var = new or30();
            or30Var.a = order;
            if (!vjt.a(j, order.createTime)) {
                or30Var.b = true;
                j = order.createTime;
            }
            if (j2 == 0) {
                j2 = order.createTime;
            }
            if (!vjt.b(j2, order.createTime)) {
                or30Var.c = true;
                j2 = order.createTime;
            }
            arrayList.add(or30Var);
        }
        return arrayList;
    }

    public static ArrayList g(long j, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        long jLongValue = j;
        while (it.hasNext()) {
            RealBetHistoryOrderDto realBetHistoryOrderDto = (RealBetHistoryOrderDto) it.next();
            vq30 vq30Var = new vq30();
            vq30Var.b = false;
            vq30Var.c = false;
            vq30Var.a = realBetHistoryOrderDto;
            if (!vjt.a(j, realBetHistoryOrderDto.getCreateTime().longValue())) {
                vq30Var.b = true;
                j = realBetHistoryOrderDto.getCreateTime().longValue();
            }
            if (!vjt.b(jLongValue, realBetHistoryOrderDto.getCreateTime().longValue())) {
                vq30Var.c = true;
                jLongValue = realBetHistoryOrderDto.getCreateTime().longValue();
            }
            arrayList.add(vq30Var);
        }
        return arrayList;
    }

    public static ArrayList h(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tournament tournament = (Tournament) it.next();
            c6g0 c6g0Var = new c6g0();
            c6g0Var.b = tournament.categoryName + "-" + tournament.name;
            c6g0Var.c = tournament.id;
            arrayList.add(c6g0Var);
            ArrayList arrayList2 = new ArrayList();
            for (Event event : tournament.events) {
                ing ingVar = new ing();
                ingVar.a = event;
                arrayList2.add(ingVar);
            }
            if (z) {
                arrayList.addAll(arrayList2);
                c6g0Var.e = true;
                c6g0Var.d = true;
            }
            c6g0Var.f = arrayList2;
        }
        return arrayList;
    }

    public static boolean i(String str) {
        return "sr:sport:1".equals(str) || "sr:sport:5".equals(str);
    }
}
