package com.unity3d.ads.adplayer;

import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final boolean isScarAd;

    @m
    private final String offerwallPlacementName;

    @m
    private final String placementId;

    @m
    private final String scarAdString;

    @m
    private final String scarAdUnitId;

    @m
    private final String scarQueryId;

    @m
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(@m Map<String, ? extends Object> map, @m String str, boolean z10, @m String str2, @m String str3, @m String str4, boolean z11, @m String str5) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z10;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i10 & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i10 & 4) != 0) {
            z10 = androidShowOptions.isScarAd;
        }
        if ((i10 & 8) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        if ((i10 & 16) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        if ((i10 & 32) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        if ((i10 & 64) != 0) {
            z11 = androidShowOptions.isOfferwallAd;
        }
        if ((i10 & 128) != 0) {
            str5 = androidShowOptions.offerwallPlacementName;
        }
        boolean z12 = z11;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return androidShowOptions.copy(map, str, z10, str2, str7, str8, z12, str6);
    }

    @m
    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    @m
    public final String component2() {
        return this.placementId;
    }

    public final boolean component3() {
        return this.isScarAd;
    }

    @m
    public final String component4() {
        return this.scarQueryId;
    }

    @m
    public final String component5() {
        return this.scarAdString;
    }

    @m
    public final String component6() {
        return this.scarAdUnitId;
    }

    public final boolean component7() {
        return this.isOfferwallAd;
    }

    @m
    public final String component8() {
        return this.offerwallPlacementName;
    }

    @l
    public final AndroidShowOptions copy(@m Map<String, ? extends Object> map, @m String str, boolean z10, @m String str2, @m String str3, @m String str4, boolean z11, @m String str5) {
        return new AndroidShowOptions(map, str, z10, str2, str3, str4, z11, str5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return m0.g(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && m0.g(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && m0.g(this.scarQueryId, androidShowOptions.scarQueryId) && m0.g(this.scarAdString, androidShowOptions.scarAdString) && m0.g(this.scarAdUnitId, androidShowOptions.scarAdUnitId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && m0.g(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    @m
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @m
    public final String getPlacementId() {
        return this.placementId;
    }

    @m
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @m
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @m
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @m
    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        Map<String, Object> map = this.unityAdsShowOptions;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.placementId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.isScarAd;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode2 + r10) * 31;
        String str2 = this.scarQueryId;
        int iHashCode3 = (i10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        int i11 = (iHashCode5 + (z11 ? 1 : z11)) * 31;
        String str5 = this.offerwallPlacementName;
        return i11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    @l
    public String toString() {
        return "AndroidShowOptions(unityAdsShowOptions=" + this.unityAdsShowOptions + ", placementId=" + this.placementId + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdString=" + this.scarAdString + ", scarAdUnitId=" + this.scarAdUnitId + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ')';
    }

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5, int i10, x xVar) {
        this(map, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? null : str5);
    }
}
