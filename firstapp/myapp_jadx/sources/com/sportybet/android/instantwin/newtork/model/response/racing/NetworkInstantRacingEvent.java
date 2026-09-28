package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gpp;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0002¨\u0006#"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "leagueId", "racers", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingRacer;", "marketCount", "", "markets", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingEventMarket;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagueId", "getRacers", "()Ljava/util/List;", "getMarketCount", "()I", "getMarkets", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingEvent {
    public static final int $stable = 0;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("marketCount")
    private final int marketCount;

    @SerializedName("markets")
    private final List<NetworkInstantRacingEventMarket> markets;

    @SerializedName("racers")
    private final List<NetworkInstantRacingRacer> racers;

    public NetworkInstantRacingEvent(String str, String str2, List<NetworkInstantRacingRacer> list, int i, List<NetworkInstantRacingEventMarket> list2) {
        this.eventId = str;
        this.leagueId = str2;
        this.racers = list;
        this.marketCount = i;
        this.markets = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingEvent copy$default(NetworkInstantRacingEvent networkInstantRacingEvent, String str, String str2, List list, int i, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkInstantRacingEvent.eventId;
        }
        if ((i2 & 2) != 0) {
            str2 = networkInstantRacingEvent.leagueId;
        }
        if ((i2 & 4) != 0) {
            list = networkInstantRacingEvent.racers;
        }
        if ((i2 & 8) != 0) {
            i = networkInstantRacingEvent.marketCount;
        }
        if ((i2 & 16) != 0) {
            list2 = networkInstantRacingEvent.markets;
        }
        List list3 = list2;
        List list4 = list;
        return networkInstantRacingEvent.copy(str, str2, list4, i, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    public final List<NetworkInstantRacingRacer> component3() {
        return this.racers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMarketCount() {
        return this.marketCount;
    }

    public final List<NetworkInstantRacingEventMarket> component5() {
        return this.markets;
    }

    public final NetworkInstantRacingEvent copy(String eventId, String leagueId, List<NetworkInstantRacingRacer> racers, int marketCount, List<NetworkInstantRacingEventMarket> markets) {
        return new NetworkInstantRacingEvent(eventId, leagueId, racers, marketCount, markets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingEvent)) {
            return false;
        }
        NetworkInstantRacingEvent networkInstantRacingEvent = (NetworkInstantRacingEvent) other;
        return Intrinsics.g(this.eventId, networkInstantRacingEvent.eventId) && Intrinsics.g(this.leagueId, networkInstantRacingEvent.leagueId) && Intrinsics.g(this.racers, networkInstantRacingEvent.racers) && this.marketCount == networkInstantRacingEvent.marketCount && Intrinsics.g(this.markets, networkInstantRacingEvent.markets);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final int getMarketCount() {
        return this.marketCount;
    }

    public final List<NetworkInstantRacingEventMarket> getMarkets() {
        return this.markets;
    }

    public final List<NetworkInstantRacingRacer> getRacers() {
        return this.racers;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leagueId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<NetworkInstantRacingRacer> list = this.racers;
        int iA = gpp.a(this.marketCount, (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        List<NetworkInstantRacingEventMarket> list2 = this.markets;
        return iA + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.leagueId;
        List<NetworkInstantRacingRacer> list = this.racers;
        int i = this.marketCount;
        List<NetworkInstantRacingEventMarket> list2 = this.markets;
        StringBuilder sbA = ux5.a("NetworkInstantRacingEvent(eventId=", str, ", leagueId=", str2, ", racers=");
        sbA.append(list);
        sbA.append(", marketCount=");
        sbA.append(i);
        sbA.append(", markets=");
        return ng1.a(sbA, list2, ")");
    }
}
