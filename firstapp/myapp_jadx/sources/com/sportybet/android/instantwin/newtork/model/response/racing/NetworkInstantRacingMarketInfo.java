package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketInfo;", "", "marketCategories", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketCategory;", "markets", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarket;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getMarketCategories", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarkets", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingMarketInfo {
    public static final int $stable = 0;

    @SerializedName("marketCategories")
    private final List<NetworkInstantRacingMarketCategory> marketCategories;

    @SerializedName("markets")
    private final List<NetworkInstantRacingMarket> markets;

    public NetworkInstantRacingMarketInfo(List<NetworkInstantRacingMarketCategory> list, List<NetworkInstantRacingMarket> list2) {
        this.marketCategories = list;
        this.markets = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingMarketInfo copy$default(NetworkInstantRacingMarketInfo networkInstantRacingMarketInfo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = networkInstantRacingMarketInfo.marketCategories;
        }
        if ((i & 2) != 0) {
            list2 = networkInstantRacingMarketInfo.markets;
        }
        return networkInstantRacingMarketInfo.copy(list, list2);
    }

    public final List<NetworkInstantRacingMarketCategory> component1() {
        return this.marketCategories;
    }

    public final List<NetworkInstantRacingMarket> component2() {
        return this.markets;
    }

    public final NetworkInstantRacingMarketInfo copy(List<NetworkInstantRacingMarketCategory> marketCategories, List<NetworkInstantRacingMarket> markets) {
        return new NetworkInstantRacingMarketInfo(marketCategories, markets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingMarketInfo)) {
            return false;
        }
        NetworkInstantRacingMarketInfo networkInstantRacingMarketInfo = (NetworkInstantRacingMarketInfo) other;
        return Intrinsics.g(this.marketCategories, networkInstantRacingMarketInfo.marketCategories) && Intrinsics.g(this.markets, networkInstantRacingMarketInfo.markets);
    }

    public final List<NetworkInstantRacingMarketCategory> getMarketCategories() {
        return this.marketCategories;
    }

    public final List<NetworkInstantRacingMarket> getMarkets() {
        return this.markets;
    }

    public int hashCode() {
        List<NetworkInstantRacingMarketCategory> list = this.marketCategories;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NetworkInstantRacingMarket> list2 = this.markets;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return w9d.a("NetworkInstantRacingMarketInfo(marketCategories=", ", markets=", ")", this.marketCategories, this.markets);
    }
}
