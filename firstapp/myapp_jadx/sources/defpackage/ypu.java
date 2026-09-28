package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ypu {
    public static final Map<String, ksu> a;
    public static final Map<String, String> b;

    static {
        Map<String, ksu> mapF = kpu.f(new Pair("Goalscorers", new ksu("Goalscorers", new ResourceUiText(R.string.common_functions__market_title_goal_scorer), ay0.V(new String[]{"40", "38", "39"}), b.k("40", "38", "39"), kpu.f(new Pair("40", new ResourceUiText(R.string.common_functions__anytime)), new Pair("39", new ResourceUiText(R.string.common_functions__last))))), new Pair("PlayerAssists", new ksu("PlayerAssists", wi80.b("770"), null, 26)), new Pair("PlayerGoals", new ksu("PlayerGoals", wi80.b("775"), null, 26)), new Pair("PlayerShots", new ksu("PlayerShots", wi80.b("776"), null, 26)), new Pair("PlayerShotsOnGoal", new ksu("PlayerShotsOnGoal", wi80.b("777"), null, 26)), new Pair("PlayerTackles", new ksu("PlayerTackles", wi80.b("780"), null, 26)), new Pair("PlayerPasses", new ksu("PlayerPasses", wi80.b("778"), null, 26)), new Pair("PlayerTotalAccuratePasses", new ksu("PlayerTotalAccuratePasses", wi80.b("800292"), null, 26)), new Pair("PlayerCards", new ksu("PlayerCards", new ResourceUiText(R.string.common_functions__market_title_player_cards), ay0.V(new String[]{"800296", "800118", "800119"}), b.k("800296", "800118", "800119"), kpu.f(new Pair("800296", new ResourceUiText(R.string.common_functions__to_be_carded)), new Pair("800118", new ResourceUiText(R.string.common_functions__first_booked)), new Pair("800119", new ResourceUiText(R.string.common_functions__sent_off))))), new Pair("PlayerGoalScorerHalf", new ksu("PlayerGoalScorerHalf", new ResourceUiText(R.string.common_functions__market_title_player_goal_scorer), ay0.V(new String[]{"800238", "800239", "800251"}), b.k("800238", "800239", "800251"), kpu.f(new Pair("800238", new ResourceUiText(R.string.common_functions__1st_half)), new Pair("800239", new ResourceUiText(R.string.common_functions__2nd_half)), new Pair("800251", new ResourceUiText(R.string.common_functions__both_halves))))), new Pair("PlayerToScoreFirst10Min", new ksu("PlayerToScoreFirst10Min", wi80.b("800249"), jpu.b(new Pair("800249", new ResourceUiText(R.string.common_functions__first_ten_mins))), 10)), new Pair("PlayerToScoreHeader", new ksu("PlayerToScoreHeader", wi80.b("800190"), jpu.b(new Pair("800190", new ResourceUiText(R.string.common_functions__header))), 10)), new Pair("PlayerToScoreFreeKick", new ksu("PlayerToScoreFreeKick", wi80.b("800191"), jpu.b(new Pair("800191", new ResourceUiText(R.string.common_functions__free_kick))), 10)), new Pair("PlayerToScoreOutsideBox", new ksu("PlayerToScoreOutsideBox", wi80.b("800189"), jpu.b(new Pair("800189", new ResourceUiText(R.string.common_functions__outside_box))), 10)), new Pair("PlayerToScoreFoot", new ksu("PlayerToScoreFoot", new ResourceUiText(R.string.common_functions__market_title_player_to_score_foot), ay0.V(new String[]{"800236", "800237"}), b.k("800236", "800237"), kpu.f(new Pair("800236", new ResourceUiText(R.string.common_functions__left)), new Pair("800237", new ResourceUiText(R.string.common_functions__right))))));
        a = mapF;
        Collection<ksu> collectionValues = mapF.values();
        ArrayList arrayList = new ArrayList();
        for (ksu ksuVar : collectionValues) {
            Set<String> set = ksuVar.c;
            ArrayList arrayList2 = new ArrayList(l48.r(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Pair((String) it.next(), ksuVar.a));
            }
            p48.w(arrayList2, arrayList);
        }
        b = kpu.k(arrayList);
    }

    public static List a(String str) {
        ksu ksuVar;
        Set<String> set;
        str.getClass();
        String str2 = b.get(str);
        List listQ0 = null;
        if (str2 != null && (ksuVar = a.get(str2)) != null && (set = ksuVar.c) != null) {
            Set<String> set2 = set;
            ArrayList arrayList = new ArrayList(l48.r(set2, 10));
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            listQ0 = CollectionsKt.q0(arrayList);
        }
        if (listQ0 != null) {
            return listQ0;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        return intOrNull != null ? a.c(intOrNull) : m2g.a;
    }
}
