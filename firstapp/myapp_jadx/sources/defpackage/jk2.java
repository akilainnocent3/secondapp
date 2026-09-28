package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.BetChipItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class jk2 {
    public static final Map<Double, String> a = kpu.f(new Pair(Double.valueOf(0.01d), "light_brown_chip"), new Pair(Double.valueOf(0.1d), "yellow"), new Pair(Double.valueOf(0.2d), "american_brown"), new Pair(Double.valueOf(0.5d), "light_green"), new Pair(Double.valueOf(1.0d), "red"), new Pair(Double.valueOf(2.0d), "bright_pink"), new Pair(Double.valueOf(2.5d), "dark_pale"), new Pair(Double.valueOf(5.0d), "light_purple"), new Pair(Double.valueOf(10.0d), "sea_green"), new Pair(Double.valueOf(20.0d), "dark_sea_green"), new Pair(Double.valueOf(25.0d), "blue"), new Pair(Double.valueOf(50.0d), "green"), new Pair(Double.valueOf(100.0d), "purple"), new Pair(Double.valueOf(200.0d), "light_brown"), new Pair(Double.valueOf(250.0d), "bottle_green"), new Pair(Double.valueOf(500.0d), "brown"), new Pair(Double.valueOf(1000.0d), "navy_blue"), new Pair(Double.valueOf(2000.0d), "dark_orange"), new Pair(Double.valueOf(2500.0d), "parrot_green"), new Pair(Double.valueOf(5000.0d), "grey"), new Pair(Double.valueOf(10000.0d), "pink"), new Pair(Double.valueOf(20000.0d), "dark_red"), new Pair(Double.valueOf(25000.0d), "light_sea_green"), new Pair(Double.valueOf(50000.0d), "fade_brown"), new Pair(Double.valueOf(100000.0d), "dark_navy_blue"), new Pair(Double.valueOf(200000.0d), "very_light_purple"), new Pair(Double.valueOf(250000.0d), "dark_yellow"), new Pair(Double.valueOf(500000.0d), "pale"), new Pair(Double.valueOf(1000000.0d), "dark_brown"), new Pair(Double.valueOf(2500000.0d), "light_blue"), new Pair(Double.valueOf(400000.0d), "sky_blue"), new Pair(Double.valueOf(5000000.0d), "light_grey"), new Pair(Double.valueOf(750000.0d), "orange"));
    public static final Map<String, Integer> b = kpu.f(new Pair("light_brown_chip", Integer.valueOf(R.drawable.light_brown_chip)), new Pair("yellow", Integer.valueOf(R.drawable.yellow)), new Pair("american_brown", Integer.valueOf(R.drawable.american_brown)), new Pair("light_green", Integer.valueOf(R.drawable.light_green)), new Pair("red", Integer.valueOf(R.drawable.red)), new Pair("bright_pink", Integer.valueOf(R.drawable.bright_pink)), new Pair("dark_pale", Integer.valueOf(R.drawable.dark_pale)), new Pair("light_purple", Integer.valueOf(R.drawable.light_purple)), new Pair("sea_green", Integer.valueOf(R.drawable.sea_green)), new Pair("dark_sea_green", Integer.valueOf(R.drawable.dark_sea_green)), new Pair("blue", Integer.valueOf(R.drawable.blue)), new Pair("green", Integer.valueOf(R.drawable.green)), new Pair("purple", Integer.valueOf(R.drawable.purple)), new Pair("light_brown", Integer.valueOf(R.drawable.light_brown)), new Pair("bottle_green", Integer.valueOf(R.drawable.bottle_green)), new Pair("brown", Integer.valueOf(R.drawable.brown)), new Pair("navy_blue", Integer.valueOf(R.drawable.navy_blue)), new Pair("dark_orange", Integer.valueOf(R.drawable.dark_orange)), new Pair("parrot_green", Integer.valueOf(R.drawable.parrot_green)), new Pair("grey", Integer.valueOf(R.drawable.grey)), new Pair("pink", Integer.valueOf(R.drawable.pink)), new Pair("dark_red", Integer.valueOf(R.drawable.dark_red)), new Pair("light_sea_green", Integer.valueOf(R.drawable.light_sea_green)), new Pair("fade_brown", Integer.valueOf(R.drawable.fade_brown)), new Pair("dark_navy_blue", Integer.valueOf(R.drawable.dark_navy_blue)), new Pair("very_light_purple", Integer.valueOf(R.drawable.very_light_purple)), new Pair("dark_yellow", Integer.valueOf(R.drawable.dark_yellow)), new Pair("pale", Integer.valueOf(R.drawable.pale)), new Pair("dark_brown", Integer.valueOf(R.drawable.dark_brown)), new Pair("light_blue", Integer.valueOf(R.drawable.light_blue)), new Pair("sky_blue", Integer.valueOf(R.drawable.sky_blue)), new Pair("light_grey", Integer.valueOf(R.drawable.light_grey)), new Pair("orange", Integer.valueOf(R.drawable.orange)));
    public static ArrayList<BetChipItem> c = new ArrayList<>();
    public static final HashMap<Long, String> d = new HashMap<>();

    public static String a(double d2, ArrayList arrayList) {
        arrayList.getClass();
        ArrayList<BetChipItem> arrayListB = b(arrayList);
        c = arrayListB;
        int i = 0;
        for (BetChipItem betChipItem : arrayListB) {
            i++;
            if (Double.valueOf(betChipItem.getBetAmount()).equals(Double.valueOf(d2))) {
                c = new ArrayList<>();
                return betChipItem.getChipColor();
            }
            if (d2 > betChipItem.getBetAmount() && i <= c.size() - 1 && d2 < c.get(i).getBetAmount()) {
                c = new ArrayList<>();
                return betChipItem.getChipColor();
            }
        }
        return (c.size() <= 0 || d2 >= c.get(0).getBetAmount()) ? ((BetChipItem) rh6.a(1, c)).getChipColor() : c.get(0).getChipColor();
    }

    public static ArrayList b(ArrayList arrayList) {
        String strValueOf;
        boolean z;
        arrayList.getClass();
        c = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        it.getClass();
        String str = "";
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            double dDoubleValue = ((Number) next).doubleValue();
            long j = (long) dDoubleValue;
            Long lValueOf = Long.valueOf(j);
            HashMap<Long, String> map = d;
            if (map.containsKey(lValueOf)) {
                strValueOf = String.valueOf(map.get(Long.valueOf(j)));
            } else {
                TreeMap treeMap = pw.a;
                String strE = pw.e(j);
                map.put(Long.valueOf(j), strE);
                strValueOf = strE;
            }
            Double dValueOf = Double.valueOf(dDoubleValue);
            Map<Double, String> map2 = a;
            if (map2.containsKey(dValueOf)) {
                str = map2.get(Double.valueOf(dDoubleValue));
                if (str == null) {
                    str = "";
                }
                int size = arrayList2.size();
                z = false;
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    BetChipItem betChipItem = (BetChipItem) obj;
                    String str2 = map2.get(Double.valueOf(dDoubleValue));
                    if (str2 == null) {
                        str2 = "";
                    }
                    betChipItem.setChipColor(str2);
                    c.add(betChipItem);
                }
                arrayList2.clear();
                String str3 = map2.get(Double.valueOf(dDoubleValue));
                c.add(new BetChipItem(dDoubleValue, str3 == null ? "" : str3, strValueOf, true));
            } else {
                z = true;
            }
            String str4 = str;
            if (z) {
                if (str4.length() > 0) {
                    c.add(new BetChipItem(dDoubleValue, str4, strValueOf, true));
                } else {
                    arrayList2.add(new BetChipItem(dDoubleValue, "", strValueOf, true));
                }
            }
            str = str4;
        }
        return c;
    }
}
