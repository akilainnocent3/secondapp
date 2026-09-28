package com.sporty.android.core.model.ads;

import com.sporty.android.core.model.gson.AlwaysListTypeAdapterFactory;
import defpackage.nf;
import defpackage.zbp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/ads/RealSportsAdSpots;", "", "spotId", "", "ads", "", "Lcom/sporty/android/core/model/ads/RealSportsAds;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSpotId", "()Ljava/lang/String;", "getAds", "()Ljava/util/List;", "Lcom/google/gson/annotations/JsonAdapter;", "value", "Lcom/sporty/android/core/model/gson/AlwaysListTypeAdapterFactory;", "firstAd", "getFirstAd", "()Lcom/sporty/android/core/model/ads/RealSportsAds;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RealSportsAdSpots {

    @zbp(AlwaysListTypeAdapterFactory.class)
    private final List<RealSportsAds> ads;
    private final String spotId;

    public /* synthetic */ RealSportsAdSpots(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RealSportsAdSpots copy$default(RealSportsAdSpots realSportsAdSpots, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = realSportsAdSpots.spotId;
        }
        if ((i & 2) != 0) {
            list = realSportsAdSpots.ads;
        }
        return realSportsAdSpots.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpotId() {
        return this.spotId;
    }

    public final List<RealSportsAds> component2() {
        return this.ads;
    }

    public final RealSportsAdSpots copy(String spotId, List<RealSportsAds> ads) {
        return new RealSportsAdSpots(spotId, ads);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealSportsAdSpots)) {
            return false;
        }
        RealSportsAdSpots realSportsAdSpots = (RealSportsAdSpots) other;
        return Intrinsics.g(this.spotId, realSportsAdSpots.spotId) && Intrinsics.g(this.ads, realSportsAdSpots.ads);
    }

    public final List<RealSportsAds> getAds() {
        return this.ads;
    }

    public final RealSportsAds getFirstAd() {
        List<RealSportsAds> list = this.ads;
        if (list == null) {
            return null;
        }
        list.getClass();
        if (list.size() <= 0) {
            return null;
        }
        List<RealSportsAds> list2 = this.ads;
        list2.getClass();
        return list2.get(0);
    }

    public final String getSpotId() {
        return this.spotId;
    }

    public int hashCode() {
        String str = this.spotId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RealSportsAds> list = this.ads;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nf.b("RealSportsAdSpots(spotId=", this.spotId, ", ads=", ")", this.ads);
    }

    public RealSportsAdSpots(String str, List<RealSportsAds> list) {
        this.spotId = str;
        this.ads = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealSportsAdSpots() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
