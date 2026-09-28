package defpackage;

import android.content.Context;
import com.sportygames.commons.SportyGamesManager;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class mn5 {
    public static fo5 a(String str) {
        str.getClass();
        if (str.equals("My Favourite")) {
            return new fo5("sg_lobby_sections", "my_favourites", str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new fo5("sg_lobby_categories", lowerCase, str);
    }

    public static String b(String str) {
        try {
            String lowerCase = c.p(new Regex("[^a-zA-Z0-9\\s]").replace(str, ""), " ", "_", false).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(fo5 fo5Var) {
        op5 op5Var = op5.a;
        String strA = oxc.a(e(fo5Var.b), ":", fo5Var.a);
        String str = fo5Var.c;
        HashMap<String, String> map = fo5Var.d;
        op5Var.getClass();
        return op5.b(strA, str, map);
    }

    public static fo5 d(Context context, String str, String str2, int i) {
        String countryName;
        str.getClass();
        str2.getClass();
        if (!str.equals("top_n_games_in_region")) {
            if (!str.equals("top_n_games_globally")) {
                return new fo5("sg_lobby_sections", str, str2);
            }
            String strValueOf = String.valueOf(i);
            return new fo5("sg_lobby_sections", "top_n_games_globally", tug.a("Top ", strValueOf, " Games Globally"), kpu.d(new Pair("{count}", strValueOf)));
        }
        String strValueOf2 = String.valueOf(i);
        String strA = "";
        if (SportyGamesManager.getInstance() != null && SportyGamesManager.getInstance().getCountryName(context) != null && (countryName = SportyGamesManager.getInstance().getCountryName(context)) != null) {
            strA = countryName;
        }
        try {
            if (strA.length() == 0 && SportyGamesManager.getInstance() != null && SportyGamesManager.getInstance().getSubCountry() != null) {
                String subCountry = SportyGamesManager.getInstance().getSubCountry();
                subCountry.getClass();
                strA = xij.a(subCountry);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (strA.length() == 0) {
            strA = "Country";
        }
        return new fo5("sg_lobby_sections", "top_n_games_in_region", lx5.a("Top ", strValueOf2, " Games in ", strA), kpu.d(new Pair("{count}", strValueOf2), new Pair("{region}", strA)));
    }

    public static String e(String str) {
        try {
            if (str.length() == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
            if (listSplit$default.isEmpty()) {
                return str;
            }
            int size = listSplit$default.size();
            for (int i = 0; i < size; i++) {
                if (((CharSequence) listSplit$default.get(i)).length() != 0) {
                    sb.append((String) listSplit$default.get(i));
                    if (i != listSplit$default.size() - 1) {
                        sb.append("_");
                    }
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }
}
