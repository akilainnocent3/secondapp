package com.sportybet.plugin.realsports.data;

import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.core.model.cashout.AdditionMarket;
import com.sporty.android.core.model.orders.EventPendingReason;
import com.sporty.android.core.model.orders.JokerInfo;
import defpackage.b3;
import defpackage.dz2;
import defpackage.j7g;
import defpackage.l48;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.q980;
import defpackage.uf80;
import defpackage.xdp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public class BetSelection {
    public List<String> additionMarketIdList;
    public boolean banker;
    public boolean bannedEvent;
    public List<BetSelection> betBuilderSelections;
    public boolean bgEvent;
    public xdp blob;
    public String cachedTargetScore;
    public String cashOutQuotaKey;
    public Integer cashOutStatus;
    public String categoryId;
    public String categoryName;
    public int commentNum;
    public String currentOdds;
    public double currentProbability;
    public double currentVoidProbability;
    public Double deadHeatFactor;
    public String eventDesc;
    public String eventId;
    public EventPendingReason eventPendingReason;
    public EventSource eventSource;
    public String gameId;
    public List<String> gameScore;
    public boolean haveLive;
    public String id;
    public boolean isMarketBettable;
    public boolean isOutComeBettable;
    public int isOutcomeActive;
    public boolean isTargetScoreCached;
    public String jointId;
    public JokerInfo joker;
    public long lastOddsChangeTime;
    public boolean lfbOddsBoosted;
    public AdditionMarket liveAdditionMarket;
    public boolean liveChannel;
    public String marketDesc;
    public String marketId;
    public int marketStatus;
    public List<AdditionMarket> markets;
    public boolean matchTrackerNotAllowed;
    public String odds;
    public double originalProbability;
    public double originalVoidProbability;
    public String outcomeDesc;
    public String outcomeId;
    public String period;
    public PickMarketMetadata pickMarketMetadata;
    public String pointScore;
    public AdditionMarket prematchAdditionMarket;
    public long product;
    public String remainingTimeInPeriod;
    public String score;
    public String setScore;
    public Integer settleStatus;
    public int settleType;
    public boolean socialMediaLiveChannel;
    public String source;
    public String specifier;
    public String sportId;
    public long startTime;
    public int status;
    public String subBetId;
    public List<String> subBetIdIndex;
    public String suspendedReason;
    public String tournamentId;
    public boolean webViewLiveChannel;
    public int eventStatus = 0;
    public String matchStatus = "";
    public String home = "";
    public String away = "";
    public String playedSeconds = "";
    public int oddsFlag = 0;
    public String tournamentName = "";
    public int ogOrderNum = 0;

    public BetSelection() {
        List list = Collections.EMPTY_LIST;
        this.additionMarketIdList = list;
        this.markets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.text.SpannableStringBuilder, j7g] */
    private String getLiveScore() {
        int i;
        mfb0 mfb0VarE = lfb0.d().e(this.sportId);
        ?? j7gVar = "";
        if (mfb0VarE != null && ((i = this.eventStatus) == 1 || i == 2)) {
            String strF = mfb0VarE.f(this.playedSeconds, this.remainingTimeInPeriod, this.matchStatus);
            ArrayList arrayListF0 = CollectionsKt.F0(mfb0VarE.A(this.setScore, this.pointScore, this.gameScore), 2, 2);
            ArrayList arrayList = new ArrayList(l48.r(arrayListF0, 10));
            int size = arrayListF0.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListF0.get(i3);
                i3++;
                arrayList.add(CollectionsKt.a0((List) obj, ":", null, null, null, 62));
            }
            if (!StringsKt.U(strF)) {
                j7gVar = new j7g();
                j7gVar.a(strF);
                j7gVar.a(" | ");
                if (arrayList.isEmpty()) {
                    j7gVar.a("- : -");
                } else {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        j7gVar.a(((String) obj2) + " ");
                    }
                }
            }
        }
        return j7gVar.toString();
    }

    public void combineData() {
        this.marketStatus = !this.isMarketBettable ? 1 : 0;
        this.isOutcomeActive = this.isOutComeBettable ? 1 : 0;
    }

    public boolean isBetBuilder() {
        List<BetSelection> list = this.betBuilderSelections;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isLive() {
        if (b3.T(this.eventId)) {
            return false;
        }
        int i = this.eventStatus;
        return i == 1 || i == 2;
    }

    public boolean shouldShowBoreDrawLabel(BoreDrawConfig boreDrawConfig) {
        return q980.d(boreDrawConfig, getLiveScore(), this.status, this.eventStatus, this.marketId, this.sportId, this.outcomeId, this.outcomeDesc);
    }

    public CashOutBetJs toCashOutJs() {
        Integer numValueOf = Integer.valueOf(this.status);
        Integer numValueOf2 = Integer.valueOf(this.eventStatus);
        Integer numValueOf3 = Integer.valueOf(this.marketStatus);
        Double dValueOf = Double.valueOf(this.currentProbability);
        String str = this.odds;
        String str2 = this.currentOdds;
        Double dValueOf2 = Double.valueOf(this.originalProbability);
        List<String> list = this.subBetIdIndex;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new CashOutBetJs(numValueOf, numValueOf2, numValueOf3, dValueOf, str, str2, dValueOf2, list, this.marketId, this.outcomeId, this.tournamentId, this.sportId, this.suspendedReason, Boolean.valueOf(this.bannedEvent), this.cashOutStatus, dz2.b(this), this.specifier, this.setScore, this.settleStatus, this.id, Boolean.valueOf(isLive()), Long.valueOf(this.lastOddsChangeTime), this.cashOutQuotaKey, Double.valueOf(this.currentVoidProbability), Double.valueOf(this.originalVoidProbability), this.joker, this.source, this.deadHeatFactor, this.eventId);
    }

    public CashOutSelection toCashOutSelection() {
        String str = this.id;
        String str2 = this.eventId;
        String str3 = this.sportId;
        Long lValueOf = Long.valueOf(this.product);
        String str4 = this.marketId;
        String str5 = this.specifier;
        String str6 = this.outcomeId;
        Integer numValueOf = Integer.valueOf(this.status);
        Integer numValueOf2 = Integer.valueOf(this.eventStatus);
        Boolean boolValueOf = Boolean.valueOf(this.banker);
        String str7 = this.odds;
        String str8 = this.currentOdds;
        Integer numValueOf3 = Integer.valueOf(this.marketStatus);
        Integer numValueOf4 = Integer.valueOf(this.isOutcomeActive);
        Double dValueOf = Double.valueOf(this.originalProbability);
        Double dValueOf2 = Double.valueOf(this.currentProbability);
        List<String> list = this.subBetIdIndex;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new CashOutSelection(str, str2, str3, lValueOf, str4, str5, str6, numValueOf, numValueOf2, boolValueOf, str7, str8, numValueOf3, numValueOf4, dValueOf, dValueOf2, list, this.subBetId, this.suspendedReason, this.tournamentId, Boolean.valueOf(this.bannedEvent), this.cashOutStatus, dz2.b(this), this.setScore, this.settleStatus, Boolean.valueOf(isLive()), Long.valueOf(this.lastOddsChangeTime), Double.valueOf(this.currentVoidProbability), Double.valueOf(this.originalVoidProbability), this.joker, this.source, this.deadHeatFactor);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BetSelection{eventDesc='");
        sb.append(this.eventDesc);
        sb.append("', eventId='");
        sb.append(this.eventId);
        sb.append("', marketId='");
        sb.append(this.marketId);
        sb.append("', outcomeId='");
        sb.append(this.outcomeId);
        sb.append("', specifier='");
        sb.append(this.specifier);
        sb.append("', eventStatus=");
        sb.append(this.eventStatus);
        sb.append(", matchStatus='");
        sb.append(this.matchStatus);
        sb.append("', id='");
        sb.append(this.id);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", odds='");
        sb.append(this.odds);
        sb.append("', marketDesc='");
        sb.append(this.marketDesc);
        sb.append("', marketStatus=");
        sb.append(this.marketStatus);
        sb.append(", isOutcomeActive=");
        sb.append(this.isOutcomeActive);
        sb.append(", score='");
        sb.append(this.score);
        sb.append("', sportId='");
        sb.append(this.sportId);
        sb.append("', categoryId='");
        sb.append(this.categoryId);
        sb.append("', tournamentId='");
        sb.append(this.tournamentId);
        sb.append("', outcomeDesc='");
        sb.append(this.outcomeDesc);
        sb.append("', home='");
        sb.append(this.home);
        sb.append("', away='");
        sb.append(this.away);
        sb.append("', playedSeconds='");
        sb.append(this.playedSeconds);
        sb.append("', remainingTimeInPeriod='");
        sb.append(this.remainingTimeInPeriod);
        sb.append("', period='");
        sb.append(this.period);
        sb.append("', isOutComeBettable=");
        sb.append(this.isOutComeBettable);
        sb.append(", isMarketBettable=");
        sb.append(this.isMarketBettable);
        sb.append(", jointId='");
        sb.append(this.jointId);
        sb.append("', gameId='");
        sb.append(this.gameId);
        sb.append("', product=");
        sb.append(this.product);
        sb.append(", banker=");
        sb.append(this.banker);
        sb.append(", haveLive=");
        sb.append(this.haveLive);
        sb.append(", currentOdds='");
        sb.append(this.currentOdds);
        sb.append("', startTime=");
        sb.append(this.startTime);
        sb.append(", commentNum=");
        sb.append(this.commentNum);
        sb.append(", blob=");
        sb.append(this.blob);
        sb.append(", oddsFlag=");
        sb.append(this.oddsFlag);
        sb.append(", gameScore=");
        sb.append(this.gameScore);
        sb.append(", setScore='");
        sb.append(this.setScore);
        sb.append("', pointScore='");
        return uf80.a(sb, this.pointScore, "'}");
    }
}
