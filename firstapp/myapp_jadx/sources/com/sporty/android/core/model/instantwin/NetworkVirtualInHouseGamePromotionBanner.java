package com.sporty.android.core.model.instantwin;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.t160;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jg\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0005HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R'\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R'\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R'\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R'\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R'\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006("}, d2 = {"Lcom/sporty/android/core/model/instantwin/NetworkVirtualInHouseGamePromotionBanner;", "", "active", "", "cmsPage", "", "bodyText", "buttonText", "iconUrl", "backgroundUrl", "redirectUrl", "androidAvailableAppVersion", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getCmsPage", "()Ljava/lang/String;", "getBodyText", "getButtonText", "getIconUrl", "getBackgroundUrl", "getRedirectUrl", "getAndroidAvailableAppVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkVirtualInHouseGamePromotionBanner {

    @SerializedName("active")
    private final boolean active;

    @SerializedName("androidAvailableAppVersion")
    private final String androidAvailableAppVersion;

    @SerializedName("backgroundUrl")
    private final String backgroundUrl;

    @SerializedName("bodyText")
    private final String bodyText;

    @SerializedName("buttonText")
    private final String buttonText;

    @SerializedName("cmsPage")
    private final String cmsPage;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("redirectUrl")
    private final String redirectUrl;

    public NetworkVirtualInHouseGamePromotionBanner(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.active = z;
        this.cmsPage = str;
        this.bodyText = str2;
        this.buttonText = str3;
        this.iconUrl = str4;
        this.backgroundUrl = str5;
        this.redirectUrl = str6;
        this.androidAvailableAppVersion = str7;
    }

    public static /* synthetic */ NetworkVirtualInHouseGamePromotionBanner copy$default(NetworkVirtualInHouseGamePromotionBanner networkVirtualInHouseGamePromotionBanner, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkVirtualInHouseGamePromotionBanner.active;
        }
        if ((i & 2) != 0) {
            str = networkVirtualInHouseGamePromotionBanner.cmsPage;
        }
        if ((i & 4) != 0) {
            str2 = networkVirtualInHouseGamePromotionBanner.bodyText;
        }
        if ((i & 8) != 0) {
            str3 = networkVirtualInHouseGamePromotionBanner.buttonText;
        }
        if ((i & 16) != 0) {
            str4 = networkVirtualInHouseGamePromotionBanner.iconUrl;
        }
        if ((i & 32) != 0) {
            str5 = networkVirtualInHouseGamePromotionBanner.backgroundUrl;
        }
        if ((i & 64) != 0) {
            str6 = networkVirtualInHouseGamePromotionBanner.redirectUrl;
        }
        if ((i & 128) != 0) {
            str7 = networkVirtualInHouseGamePromotionBanner.androidAvailableAppVersion;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return networkVirtualInHouseGamePromotionBanner.copy(z, str, str2, str3, str10, str11, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCmsPage() {
        return this.cmsPage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAndroidAvailableAppVersion() {
        return this.androidAvailableAppVersion;
    }

    public final NetworkVirtualInHouseGamePromotionBanner copy(boolean active, String cmsPage, String bodyText, String buttonText, String iconUrl, String backgroundUrl, String redirectUrl, String androidAvailableAppVersion) {
        return new NetworkVirtualInHouseGamePromotionBanner(active, cmsPage, bodyText, buttonText, iconUrl, backgroundUrl, redirectUrl, androidAvailableAppVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkVirtualInHouseGamePromotionBanner)) {
            return false;
        }
        NetworkVirtualInHouseGamePromotionBanner networkVirtualInHouseGamePromotionBanner = (NetworkVirtualInHouseGamePromotionBanner) other;
        return this.active == networkVirtualInHouseGamePromotionBanner.active && Intrinsics.g(this.cmsPage, networkVirtualInHouseGamePromotionBanner.cmsPage) && Intrinsics.g(this.bodyText, networkVirtualInHouseGamePromotionBanner.bodyText) && Intrinsics.g(this.buttonText, networkVirtualInHouseGamePromotionBanner.buttonText) && Intrinsics.g(this.iconUrl, networkVirtualInHouseGamePromotionBanner.iconUrl) && Intrinsics.g(this.backgroundUrl, networkVirtualInHouseGamePromotionBanner.backgroundUrl) && Intrinsics.g(this.redirectUrl, networkVirtualInHouseGamePromotionBanner.redirectUrl) && Intrinsics.g(this.androidAvailableAppVersion, networkVirtualInHouseGamePromotionBanner.androidAvailableAppVersion);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getAndroidAvailableAppVersion() {
        return this.androidAvailableAppVersion;
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getCmsPage() {
        return this.cmsPage;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.active) * 31;
        String str = this.cmsPage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bodyText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.redirectUrl;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.androidAvailableAppVersion;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.active;
        String str = this.cmsPage;
        String str2 = this.bodyText;
        String str3 = this.buttonText;
        String str4 = this.iconUrl;
        String str5 = this.backgroundUrl;
        String str6 = this.redirectUrl;
        String str7 = this.androidAvailableAppVersion;
        StringBuilder sbA = t160.a("NetworkVirtualInHouseGamePromotionBanner(active=", ", cmsPage=", str, ", bodyText=", z);
        hxa.c(sbA, str2, ", buttonText=", str3, ", iconUrl=");
        hxa.c(sbA, str4, ", backgroundUrl=", str5, ", redirectUrl=");
        return kwi.a(sbA, str6, ", androidAvailableAppVersion=", str7, ")");
    }
}
