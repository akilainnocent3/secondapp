package com.sporty.android.core.model.ads;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/ads/RealSportsAdsData;", "", "platform", "", "adSpots", "", "Lcom/sporty/android/core/model/ads/RealSportsAdSpots;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPlatform", "()Ljava/lang/String;", "getAdSpots", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RealSportsAdsData {
    private final List<RealSportsAdSpots> adSpots;
    private final String platform;

    public /* synthetic */ RealSportsAdsData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RealSportsAdsData copy$default(RealSportsAdsData realSportsAdsData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = realSportsAdsData.platform;
        }
        if ((i & 2) != 0) {
            list = realSportsAdsData.adSpots;
        }
        return realSportsAdsData.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final List<RealSportsAdSpots> component2() {
        return this.adSpots;
    }

    public final RealSportsAdsData copy(String platform, List<RealSportsAdSpots> adSpots) {
        return new RealSportsAdsData(platform, adSpots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealSportsAdsData)) {
            return false;
        }
        RealSportsAdsData realSportsAdsData = (RealSportsAdsData) other;
        return Intrinsics.g(this.platform, realSportsAdsData.platform) && Intrinsics.g(this.adSpots, realSportsAdsData.adSpots);
    }

    public final List<RealSportsAdSpots> getAdSpots() {
        return this.adSpots;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        String str = this.platform;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RealSportsAdSpots> list = this.adSpots;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nf.b("RealSportsAdsData(platform=", this.platform, ", adSpots=", ")", this.adSpots);
    }

    public RealSportsAdsData(String str, List<RealSportsAdSpots> list) {
        this.platform = str;
        this.adSpots = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealSportsAdsData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
