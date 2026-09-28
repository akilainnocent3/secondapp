package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bÊ\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyTicketMarket;", "", "marketId", "", "title", "subtitle", "bannerTitles", "oddTitles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMarketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTitle", "getSubtitle", "subTitle", "getBannerTitles", "getOddTitles", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyTicketMarket {
    public static final int $stable = 0;

    @SerializedName("bannerTitles")
    private final String bannerTitles;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("oddTitles")
    private final String oddTitles;

    @SerializedName("subTitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    public NetworkSportyPenaltyTicketMarket(String str, String str2, String str3, String str4, String str5) {
        this.marketId = str;
        this.title = str2;
        this.subtitle = str3;
        this.bannerTitles = str4;
        this.oddTitles = str5;
    }

    public static /* synthetic */ NetworkSportyPenaltyTicketMarket copy$default(NetworkSportyPenaltyTicketMarket networkSportyPenaltyTicketMarket, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSportyPenaltyTicketMarket.marketId;
        }
        if ((i & 2) != 0) {
            str2 = networkSportyPenaltyTicketMarket.title;
        }
        if ((i & 4) != 0) {
            str3 = networkSportyPenaltyTicketMarket.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = networkSportyPenaltyTicketMarket.bannerTitles;
        }
        if ((i & 16) != 0) {
            str5 = networkSportyPenaltyTicketMarket.oddTitles;
        }
        String str6 = str5;
        String str7 = str3;
        return networkSportyPenaltyTicketMarket.copy(str, str2, str7, str4, str6);
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
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOddTitles() {
        return this.oddTitles;
    }

    public final NetworkSportyPenaltyTicketMarket copy(String marketId, String title, String subtitle, String bannerTitles, String oddTitles) {
        return new NetworkSportyPenaltyTicketMarket(marketId, title, subtitle, bannerTitles, oddTitles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyTicketMarket)) {
            return false;
        }
        NetworkSportyPenaltyTicketMarket networkSportyPenaltyTicketMarket = (NetworkSportyPenaltyTicketMarket) other;
        return Intrinsics.g(this.marketId, networkSportyPenaltyTicketMarket.marketId) && Intrinsics.g(this.title, networkSportyPenaltyTicketMarket.title) && Intrinsics.g(this.subtitle, networkSportyPenaltyTicketMarket.subtitle) && Intrinsics.g(this.bannerTitles, networkSportyPenaltyTicketMarket.bannerTitles) && Intrinsics.g(this.oddTitles, networkSportyPenaltyTicketMarket.oddTitles);
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

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.marketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bannerTitles;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.oddTitles;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.bannerTitles;
        String str5 = this.oddTitles;
        StringBuilder sbA = ux5.a("NetworkSportyPenaltyTicketMarket(marketId=", str, ", title=", str2, ", subtitle=");
        hxa.c(sbA, str3, ", bannerTitles=", str4, ", oddTitles=");
        return uf80.a(sbA, str5, ")");
    }
}
