package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.recommendation.NetworkBetslipRecommendation;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.NetworkBetslipRecommendationSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class ss3 {
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final mt3 a(NetworkBetslipRecommendation networkBetslipRecommendation) {
        String probability;
        String eventId;
        String marketId;
        String outcomeId;
        String str;
        networkBetslipRecommendation.getClass();
        List<NetworkBetslipRecommendationSelection> selections = networkBetslipRecommendation.getSelections();
        if (selections == null) {
            selections = m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkBetslipRecommendationSelection networkBetslipRecommendationSelection : selections) {
            networkBetslipRecommendationSelection.getClass();
            String odds = networkBetslipRecommendationSelection.getOdds();
            Object gs3Var = null;
            if (odds != null) {
                String str2 = b.g(odds) != null ? odds : null;
                if (str2 != null && (probability = networkBetslipRecommendationSelection.getProbability()) != null) {
                    String str3 = b.g(probability) != null ? probability : null;
                    if (str3 != null && (eventId = networkBetslipRecommendationSelection.getEventId()) != null) {
                        String str4 = !StringsKt.U(eventId) ? eventId : null;
                        if (str4 != null && (marketId = networkBetslipRecommendationSelection.getMarketId()) != null) {
                            String str5 = !StringsKt.U(marketId) ? marketId : null;
                            if (str5 != null && (outcomeId = networkBetslipRecommendationSelection.getOutcomeId()) != null) {
                                String str6 = !StringsKt.U(outcomeId) ? outcomeId : null;
                                if (str6 != null) {
                                    String outcomeDesc = networkBetslipRecommendationSelection.getOutcomeDesc();
                                    String str7 = outcomeDesc == null ? "" : outcomeDesc;
                                    String leagueId = networkBetslipRecommendationSelection.getLeagueId();
                                    String str8 = leagueId == null ? "" : leagueId;
                                    String homeTeamName = networkBetslipRecommendationSelection.getHomeTeamName();
                                    String str9 = homeTeamName == null ? "" : homeTeamName;
                                    String homeTeamLogo = networkBetslipRecommendationSelection.getHomeTeamLogo();
                                    String str10 = homeTeamLogo == null ? "" : homeTeamLogo;
                                    String awayTeamName = networkBetslipRecommendationSelection.getAwayTeamName();
                                    String str11 = awayTeamName == null ? "" : awayTeamName;
                                    String awayTeamLogo = networkBetslipRecommendationSelection.getAwayTeamLogo();
                                    String str12 = awayTeamLogo == null ? "" : awayTeamLogo;
                                    String marketTitle = networkBetslipRecommendationSelection.getMarketTitle();
                                    String str13 = marketTitle == null ? "" : marketTitle;
                                    String outcomeContext = networkBetslipRecommendationSelection.getOutcomeContext();
                                    if (outcomeContext == null) {
                                        str = str7;
                                    } else {
                                        gs3Var = StringsKt.U(outcomeContext) ? null : outcomeContext;
                                        if (gs3Var == null) {
                                            str = str7;
                                        } else {
                                            str = gs3Var;
                                        }
                                    }
                                    gs3Var = new gs3(str4, str8, str9, str10, str11, str12, str5, str13, str6, str7, str2, str3, str);
                                }
                            }
                        }
                    }
                }
            }
            if (gs3Var != null) {
                arrayList.add(gs3Var);
            }
        }
        return new mt3(arrayList);
    }
}
