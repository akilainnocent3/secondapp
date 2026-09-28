package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.cashout.SingleBetCashoutRecommendation;
import com.sporty.android.core.model.cashout.SingleBetCashoutRecommendationMarket;
import com.sporty.android.core.model.cashout.SingleBetCashoutRecommendationOutcome;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.repository.CashoutRepositoryImpl$fetchSingleBetCashoutRecommendations$2", f = "CashoutRepositoryImpl.kt", l = {167}, m = "invokeSuspend", v = 2)
public final class er6 extends tje0 implements Function2<v5b, v1b<? super List<? extends pt90>>, Object> {
    public int a;
    public final /* synthetic */ fr6 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er6(fr6 fr6Var, String str, v1b<? super er6> v1bVar) {
        super(2, v1bVar);
        this.b = fr6Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new er6(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends pt90>> v1bVar) {
        return ((er6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        SingleBetCashoutRecommendationOutcome outcome;
        String id;
        pt90 pt90Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            t840 t840Var = this.b.b;
            this.a = 1;
            objB = t840Var.b(this.c, this);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = obj;
        }
        List<SingleBetCashoutRecommendation> list = (List) n52.b((BaseResponse) objB);
        ArrayList arrayListA = kw5.a(list);
        for (SingleBetCashoutRecommendation singleBetCashoutRecommendation : list) {
            singleBetCashoutRecommendation.getClass();
            SingleBetCashoutRecommendationMarket market = singleBetCashoutRecommendation.getMarket();
            if (market == null || (outcome = market.getOutcome()) == null || (id = outcome.getId()) == null || id.length() == 0) {
                pt90Var = null;
            } else {
                String eventId = singleBetCashoutRecommendation.getEventId();
                if (eventId == null) {
                    eventId = "";
                }
                String sportId = singleBetCashoutRecommendation.getSportId();
                if (sportId == null) {
                    sportId = "";
                }
                String categoryId = singleBetCashoutRecommendation.getCategoryId();
                if (categoryId == null) {
                    categoryId = "";
                }
                String tournamentId = singleBetCashoutRecommendation.getTournamentId();
                if (tournamentId == null) {
                    tournamentId = "";
                }
                String tournamentName = singleBetCashoutRecommendation.getTournamentName();
                if (tournamentName == null) {
                    tournamentName = "";
                }
                String homeTeamName = singleBetCashoutRecommendation.getHomeTeamName();
                if (homeTeamName == null) {
                    homeTeamName = "";
                }
                String awayTeamName = singleBetCashoutRecommendation.getAwayTeamName();
                if (awayTeamName == null) {
                    awayTeamName = "";
                }
                String matchStatus = singleBetCashoutRecommendation.getMatchStatus();
                if (matchStatus == null) {
                    matchStatus = "";
                }
                Integer status = singleBetCashoutRecommendation.getStatus();
                int iIntValue = status != null ? status.intValue() : 0;
                Long estimateStartTime = singleBetCashoutRecommendation.getEstimateStartTime();
                qt90 qt90Var = new qt90(eventId, sportId, categoryId, tournamentId, tournamentName, homeTeamName, awayTeamName, matchStatus, estimateStartTime != null ? estimateStartTime.longValue() : 0L, iIntValue);
                String id2 = market.getId();
                String str = id2 == null ? "" : id2;
                String specifier = market.getSpecifier();
                String str2 = specifier == null ? "" : specifier;
                Integer product = market.getProduct();
                int iIntValue2 = product != null ? product.intValue() : 0;
                String desc = market.getDesc();
                String str3 = desc == null ? "" : desc;
                Integer status2 = market.getStatus();
                rt90 rt90Var = new rt90(str, iIntValue2, status2 != null ? status2.intValue() : 0, str2, str3);
                String id3 = outcome.getId();
                String str4 = id3 == null ? "" : id3;
                String odds = outcome.getOdds();
                String str5 = odds == null ? "" : odds;
                String probability = outcome.getProbability();
                String str6 = probability == null ? "" : probability;
                Integer numIsActive = outcome.isActive();
                int iIntValue3 = numIsActive != null ? numIsActive.intValue() : 0;
                String desc2 = outcome.getDesc();
                pt90Var = new pt90(qt90Var, rt90Var, new st90(str4, str5, str6, iIntValue3, desc2 == null ? "" : desc2));
            }
            if (pt90Var != null) {
                arrayListA.add(pt90Var);
            }
        }
        return arrayListA;
    }
}
