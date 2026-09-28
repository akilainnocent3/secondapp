package com.sporty.android.core.model.ads;

import com.sporty.android.core.model.gson.AlwaysListTypeAdapterFactory;
import defpackage.nf;
import defpackage.zbp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/ads/AdSpots;", "", "spotId", "", "ads", "", "Lcom/sporty/android/core/model/ads/Ads;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSpotId", "()Ljava/lang/String;", "setSpotId", "(Ljava/lang/String;)V", "getAds", "()Ljava/util/List;", "Lcom/google/gson/annotations/JsonAdapter;", "value", "Lcom/sporty/android/core/model/gson/AlwaysListTypeAdapterFactory;", "firstAd", "getFirstAd", "()Lcom/sporty/android/core/model/ads/Ads;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AdSpots {

    @zbp(AlwaysListTypeAdapterFactory.class)
    private final List<Ads> ads;
    private String spotId;

    public /* synthetic */ AdSpots(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdSpots copy$default(AdSpots adSpots, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adSpots.spotId;
        }
        if ((i & 2) != 0) {
            list = adSpots.ads;
        }
        return adSpots.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpotId() {
        return this.spotId;
    }

    public final List<Ads> component2() {
        return this.ads;
    }

    public final AdSpots copy(String spotId, List<Ads> ads) {
        return new AdSpots(spotId, ads);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdSpots)) {
            return false;
        }
        AdSpots adSpots = (AdSpots) other;
        return Intrinsics.g(this.spotId, adSpots.spotId) && Intrinsics.g(this.ads, adSpots.ads);
    }

    public final List<Ads> getAds() {
        return this.ads;
    }

    public final Ads getFirstAd() {
        List<Ads> list = this.ads;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.ads.get(0);
    }

    public final String getSpotId() {
        return this.spotId;
    }

    public int hashCode() {
        String str = this.spotId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Ads> list = this.ads;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setSpotId(String str) {
        this.spotId = str;
    }

    public String toString() {
        return nf.b("AdSpots(spotId=", this.spotId, ", ads=", ")", this.ads);
    }

    public AdSpots(String str, List<Ads> list) {
        this.spotId = str;
        this.ads = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdSpots() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
