package com.sporty.android.core.model.orders;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.oie;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003Jz\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010)J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R)\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR'\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/sporty/android/core/model/orders/BetSelection;", "", "home", "", "away", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "marketId", "outcomeId", "outcomeName", "odds", AnalyticsParam.EVENT_PARAM_RESULT, "", "eventPendingReason", "Lcom/sporty/android/core/model/orders/EventPendingReason;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sporty/android/core/model/orders/EventPendingReason;)V", "getHome", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getAway", "getEventId", "getMarketId", "getOutcomeId", "getOutcomeName", "getOdds", "getResult", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEventPendingReason", "()Lcom/sporty/android/core/model/orders/EventPendingReason;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sporty/android/core/model/orders/EventPendingReason;)Lcom/sporty/android/core/model/orders/BetSelection;", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetSelection {

    @SerializedName("away")
    private final String away;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("eventPendingReason")
    private final EventPendingReason eventPendingReason;

    @SerializedName("home")
    private final String home;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("outcomeName")
    private final String outcomeName;

    @SerializedName(AnalyticsParam.EVENT_PARAM_RESULT)
    private final Integer result;

    public /* synthetic */ BetSelection(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, EventPendingReason eventPendingReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : eventPendingReason);
    }

    public static /* synthetic */ BetSelection copy$default(BetSelection betSelection, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, EventPendingReason eventPendingReason, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betSelection.home;
        }
        if ((i & 2) != 0) {
            str2 = betSelection.away;
        }
        if ((i & 4) != 0) {
            str3 = betSelection.eventId;
        }
        if ((i & 8) != 0) {
            str4 = betSelection.marketId;
        }
        if ((i & 16) != 0) {
            str5 = betSelection.outcomeId;
        }
        if ((i & 32) != 0) {
            str6 = betSelection.outcomeName;
        }
        if ((i & 64) != 0) {
            str7 = betSelection.odds;
        }
        if ((i & 128) != 0) {
            num = betSelection.result;
        }
        if ((i & 256) != 0) {
            eventPendingReason = betSelection.eventPendingReason;
        }
        Integer num2 = num;
        EventPendingReason eventPendingReason2 = eventPendingReason;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return betSelection.copy(str, str2, str11, str4, str10, str8, str9, num2, eventPendingReason2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHome() {
        return this.home;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAway() {
        return this.away;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOutcomeName() {
        return this.outcomeName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EventPendingReason getEventPendingReason() {
        return this.eventPendingReason;
    }

    public final BetSelection copy(String home, String away, String eventId, String marketId, String outcomeId, String outcomeName, String odds, Integer result, EventPendingReason eventPendingReason) {
        return new BetSelection(home, away, eventId, marketId, outcomeId, outcomeName, odds, result, eventPendingReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetSelection)) {
            return false;
        }
        BetSelection betSelection = (BetSelection) other;
        return Intrinsics.g(this.home, betSelection.home) && Intrinsics.g(this.away, betSelection.away) && Intrinsics.g(this.eventId, betSelection.eventId) && Intrinsics.g(this.marketId, betSelection.marketId) && Intrinsics.g(this.outcomeId, betSelection.outcomeId) && Intrinsics.g(this.outcomeName, betSelection.outcomeName) && Intrinsics.g(this.odds, betSelection.odds) && Intrinsics.g(this.result, betSelection.result) && Intrinsics.g(this.eventPendingReason, betSelection.eventPendingReason);
    }

    public final String getAway() {
        return this.away;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final EventPendingReason getEventPendingReason() {
        return this.eventPendingReason;
    }

    public final String getHome() {
        return this.home;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getOutcomeName() {
        return this.outcomeName;
    }

    public final Integer getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.home;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.away;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.outcomeId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.outcomeName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.odds;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.result;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        EventPendingReason eventPendingReason = this.eventPendingReason;
        return iHashCode8 + (eventPendingReason != null ? eventPendingReason.hashCode() : 0);
    }

    public String toString() {
        String str = this.home;
        String str2 = this.away;
        String str3 = this.eventId;
        String str4 = this.marketId;
        String str5 = this.outcomeId;
        String str6 = this.outcomeName;
        String str7 = this.odds;
        Integer num = this.result;
        EventPendingReason eventPendingReason = this.eventPendingReason;
        StringBuilder sbA = ux5.a("BetSelection(home=", str, ", away=", str2, ", eventId=");
        hxa.c(sbA, str3, ", marketId=", str4, ", outcomeId=");
        hxa.c(sbA, str5, ", outcomeName=", str6, ", odds=");
        oie.a(num, str7, ", result=", ", eventPendingReason=", sbA);
        sbA.append(eventPendingReason);
        sbA.append(")");
        return sbA.toString();
    }

    public BetSelection(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, EventPendingReason eventPendingReason) {
        this.home = str;
        this.away = str2;
        this.eventId = str3;
        this.marketId = str4;
        this.outcomeId = str5;
        this.outcomeName = str6;
        this.odds = str7;
        this.result = num;
        this.eventPendingReason = eventPendingReason;
    }

    public BetSelection() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
