package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sporty.android.core.model.patron.FavoriteMarket;
import com.sporty.android.core.model.patron.FavoriteMarketItem;
import com.sporty.android.core.model.patron.FavoriteOddsRange;
import com.sporty.android.core.model.patron.FavoriteSummary;
import com.sporty.android.core.model.patron.FavoriteTeam;
import com.sporty.android.core.model.patron.FavoriteTournament;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class pyw extends j8i0 {
    public njs<hqc> a;
    public jlv b;
    public jlv c;
    public jlv d;
    public jlv e;
    public jlv f;
    public jlv i;
    public vxw v;

    public final jlv x1(final hzw hzwVar) {
        return tsg0.c(this.a, new Function1(this) { // from class: nyw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hqc hqcVar = (hqc) obj;
                String str = "";
                if (!(hqcVar instanceof nqc)) {
                    return new ssw("");
                }
                FavoriteSummary favoriteSummary = (FavoriteSummary) ((nqc) hqcVar).a;
                int iOrdinal = hzwVar.ordinal();
                if (iOrdinal == 1) {
                    StringBuilder sb = new StringBuilder();
                    HashSet hashSet = new HashSet();
                    Iterator<FavoriteTournament> it = favoriteSummary.getTournamentRefMapping().values().iterator();
                    while (it.hasNext()) {
                        String str2 = it.next().leagueName;
                        if (hashSet.add(str2)) {
                            sb.append(str2);
                            sb.append(", ");
                        }
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        sb = new StringBuilder(sb.substring(0, sb.length() - 2));
                    }
                    return new ssw(sb.toString());
                }
                if (iOrdinal == 2) {
                    StringBuilder sb2 = new StringBuilder();
                    HashSet hashSet2 = new HashSet();
                    Iterator<FavoriteTeam> it2 = favoriteSummary.getTeamRefMapping().values().iterator();
                    while (it2.hasNext()) {
                        String str3 = it2.next().name;
                        if (hashSet2.add(str3)) {
                            sb2.append(str3);
                            sb2.append(", ");
                        }
                    }
                    if (!TextUtils.isEmpty(sb2.toString())) {
                        sb2 = new StringBuilder(sb2.substring(0, sb2.length() - 2));
                    }
                    return new ssw(sb2.toString());
                }
                if (iOrdinal == 3) {
                    StringBuilder sb3 = new StringBuilder();
                    HashSet hashSet3 = new HashSet();
                    List<FavoriteMarket> list = favoriteSummary.markets;
                    if (list != null && list.size() > 0) {
                        Iterator<FavoriteMarket> it3 = favoriteSummary.markets.iterator();
                        while (it3.hasNext()) {
                            List<FavoriteMarketItem> list2 = it3.next().markets;
                            if (list2 != null) {
                                Iterator<FavoriteMarketItem> it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    String str4 = it4.next().name;
                                    if (hashSet3.add(str4)) {
                                        sb3.append(str4);
                                        sb3.append(", ");
                                    }
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(sb3.toString())) {
                        sb3 = new StringBuilder(sb3.substring(0, sb3.length() - 2));
                    }
                    return new ssw(sb3.toString());
                }
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        return new ssw("");
                    }
                    MyFavoriteStake myFavoriteStake = favoriteSummary != null ? favoriteSummary.stake : null;
                    double dDoubleValue = (myFavoriteStake == null || myFavoriteStake.getDefaultStake() == null) ? 0.0d : BigDecimal.valueOf(myFavoriteStake.getDefaultStake().doubleValue()).divide(BigDecimal.valueOf(10000L)).doubleValue();
                    if (dDoubleValue != 0.0d) {
                        str = a8b.d().replaceFirst(" ", "") + b6y.b.format(dDoubleValue);
                    }
                    return new ssw(str);
                }
                FavoriteOddsRange favoriteOddsRange = favoriteSummary.oddsRange;
                if (favoriteOddsRange != null) {
                    double d = favoriteOddsRange.min;
                    if (d != 0.0d) {
                        double d2 = favoriteOddsRange.max;
                        if (d2 != 0.0d) {
                            if (((float) d2) == 2.1474836E9f) {
                                str = d + " - MAX";
                            } else {
                                str = d + " - " + favoriteOddsRange.max;
                            }
                        }
                    }
                }
                return new ssw(str);
            }
        });
    }
}
