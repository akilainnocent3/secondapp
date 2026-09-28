package com.sportybet.android.instantwin.presentation.model;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.oxc;
import defpackage.ruw;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public class BetSlipData implements Comparable<BetSlipData> {

    @SerializedName("awayTeamName")
    public String awayTeamName;

    @SerializedName("betBuilderMarketId")
    public String betBuilderMarketId;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    public String eventId;

    @SerializedName("homeTeamName")
    public String homeTeamName;

    @SerializedName("isHighlighted")
    public boolean isHighlighted;

    @SerializedName("marketId")
    public String marketId;

    @SerializedName("marketTitle")
    public String marketTitle;

    @SerializedName("odds")
    public String odds;

    @SerializedName("outComeDesc")
    public String outComeDesc;

    @SerializedName("outcomeId")
    public String outcomeId;

    @SerializedName("probability")
    public String probability;

    @SerializedName("singleStake")
    public BigDecimal singleStake;

    public BetSlipData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.eventId = str;
        this.marketId = str2;
        this.outcomeId = str3;
        this.marketTitle = str4;
        this.outComeDesc = str5;
        this.odds = str6;
        this.homeTeamName = str7;
        this.awayTeamName = str8;
        this.betBuilderMarketId = oxc.a(str, "-", str3);
        this.probability = str9;
        this.isHighlighted = z;
    }

    @Override // java.lang.Comparable
    public int compareTo(BetSlipData betSlipData) {
        return new BigDecimal(this.odds).compareTo(new BigDecimal(betSlipData.odds));
    }

    public void setHighlighted(boolean z) {
        this.isHighlighted = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BetSlipData{eventId='");
        sb.append(this.eventId);
        sb.append("', marketId='");
        sb.append(this.marketId);
        sb.append("', outcomeId='");
        sb.append(this.outcomeId);
        sb.append("', marketTitle='");
        sb.append(this.marketTitle);
        sb.append("', outComeDesc='");
        sb.append(this.outComeDesc);
        sb.append("', odds='");
        sb.append(this.odds);
        sb.append("', probability='");
        sb.append(this.probability);
        sb.append("', homeTeamName='");
        sb.append(this.homeTeamName);
        sb.append("', awayTeamName='");
        sb.append(this.awayTeamName);
        sb.append("', singleStake=");
        sb.append(this.singleStake);
        sb.append(", betBuilderMarketId='");
        sb.append(this.betBuilderMarketId);
        sb.append("', isHighlighted=");
        return ruw.a(sb, this.isHighlighted, '}');
    }
}
