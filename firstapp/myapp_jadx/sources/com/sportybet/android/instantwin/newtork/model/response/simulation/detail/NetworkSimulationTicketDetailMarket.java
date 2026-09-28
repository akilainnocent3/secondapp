package com.sportybet.android.instantwin.newtork.model.response.simulation.detail;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.nve;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicketDetailMarket;", "", "marketId", "", "title", "subTitle", "bannerTitles", "oddTitles", "outcomes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicketDetailOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMarketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTitle", "getSubTitle", "getBannerTitles", "getOddTitles", "getOutcomes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicketDetailMarket {
    public static final int $stable = 8;

    @SerializedName("bannerTitles")
    private final String bannerTitles;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("oddTitles")
    private final String oddTitles;

    @SerializedName("outcomes")
    private final List<NetworkSimulationTicketDetailOutcome> outcomes;

    @SerializedName("subTitle")
    private final String subTitle;

    @SerializedName("title")
    private final String title;

    public NetworkSimulationTicketDetailMarket(String str, String str2, String str3, String str4, String str5, List<NetworkSimulationTicketDetailOutcome> list) {
        this.marketId = str;
        this.title = str2;
        this.subTitle = str3;
        this.bannerTitles = str4;
        this.oddTitles = str5;
        this.outcomes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSimulationTicketDetailMarket copy$default(NetworkSimulationTicketDetailMarket networkSimulationTicketDetailMarket, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSimulationTicketDetailMarket.marketId;
        }
        if ((i & 2) != 0) {
            str2 = networkSimulationTicketDetailMarket.title;
        }
        if ((i & 4) != 0) {
            str3 = networkSimulationTicketDetailMarket.subTitle;
        }
        if ((i & 8) != 0) {
            str4 = networkSimulationTicketDetailMarket.bannerTitles;
        }
        if ((i & 16) != 0) {
            str5 = networkSimulationTicketDetailMarket.oddTitles;
        }
        if ((i & 32) != 0) {
            list = networkSimulationTicketDetailMarket.outcomes;
        }
        String str6 = str5;
        List list2 = list;
        return networkSimulationTicketDetailMarket.copy(str, str2, str3, str4, str6, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOddTitles() {
        return this.oddTitles;
    }

    public final List<NetworkSimulationTicketDetailOutcome> component6() {
        return this.outcomes;
    }

    public final NetworkSimulationTicketDetailMarket copy(String marketId, String title, String subTitle, String bannerTitles, String oddTitles, List<NetworkSimulationTicketDetailOutcome> outcomes) {
        return new NetworkSimulationTicketDetailMarket(marketId, title, subTitle, bannerTitles, oddTitles, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicketDetailMarket)) {
            return false;
        }
        NetworkSimulationTicketDetailMarket networkSimulationTicketDetailMarket = (NetworkSimulationTicketDetailMarket) other;
        return Intrinsics.g(this.marketId, networkSimulationTicketDetailMarket.marketId) && Intrinsics.g(this.title, networkSimulationTicketDetailMarket.title) && Intrinsics.g(this.subTitle, networkSimulationTicketDetailMarket.subTitle) && Intrinsics.g(this.bannerTitles, networkSimulationTicketDetailMarket.bannerTitles) && Intrinsics.g(this.oddTitles, networkSimulationTicketDetailMarket.oddTitles) && Intrinsics.g(this.outcomes, networkSimulationTicketDetailMarket.outcomes);
    }

    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOddTitles() {
        return this.oddTitles;
    }

    public final List<NetworkSimulationTicketDetailOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.marketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bannerTitles;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.oddTitles;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<NetworkSimulationTicketDetailOutcome> list = this.outcomes;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.title;
        String str3 = this.subTitle;
        String str4 = this.bannerTitles;
        String str5 = this.oddTitles;
        List<NetworkSimulationTicketDetailOutcome> list = this.outcomes;
        StringBuilder sbA = ux5.a("NetworkSimulationTicketDetailMarket(marketId=", str, ", title=", str2, ", subTitle=");
        hxa.c(sbA, str3, ", bannerTitles=", str4, ", oddTitles=");
        return nve.a(str5, ", outcomes=", ")", sbA, list);
    }
}
