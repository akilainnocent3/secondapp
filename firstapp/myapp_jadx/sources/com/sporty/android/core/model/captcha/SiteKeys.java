package com.sporty.android.core.model.captcha;

import com.google.gson.annotations.SerializedName;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/captcha/SiteKeys;", "", "googleSiteKey", "", "inHouseSiteKey", "cloudflareSiteKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGoogleSiteKey", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "2", "getInHouseSiteKey", "4", "getCloudflareSiteKey", "5", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SiteKeys {

    @SerializedName("5")
    private final String cloudflareSiteKey;

    @SerializedName("2")
    private final String googleSiteKey;

    @SerializedName("4")
    private final String inHouseSiteKey;

    public SiteKeys(String str, String str2, String str3) {
        this.googleSiteKey = str;
        this.inHouseSiteKey = str2;
        this.cloudflareSiteKey = str3;
    }

    public static /* synthetic */ SiteKeys copy$default(SiteKeys siteKeys, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = siteKeys.googleSiteKey;
        }
        if ((i & 2) != 0) {
            str2 = siteKeys.inHouseSiteKey;
        }
        if ((i & 4) != 0) {
            str3 = siteKeys.cloudflareSiteKey;
        }
        return siteKeys.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGoogleSiteKey() {
        return this.googleSiteKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInHouseSiteKey() {
        return this.inHouseSiteKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCloudflareSiteKey() {
        return this.cloudflareSiteKey;
    }

    public final SiteKeys copy(String googleSiteKey, String inHouseSiteKey, String cloudflareSiteKey) {
        return new SiteKeys(googleSiteKey, inHouseSiteKey, cloudflareSiteKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SiteKeys)) {
            return false;
        }
        SiteKeys siteKeys = (SiteKeys) other;
        return Intrinsics.g(this.googleSiteKey, siteKeys.googleSiteKey) && Intrinsics.g(this.inHouseSiteKey, siteKeys.inHouseSiteKey) && Intrinsics.g(this.cloudflareSiteKey, siteKeys.cloudflareSiteKey);
    }

    public final String getCloudflareSiteKey() {
        return this.cloudflareSiteKey;
    }

    public final String getGoogleSiteKey() {
        return this.googleSiteKey;
    }

    public final String getInHouseSiteKey() {
        return this.inHouseSiteKey;
    }

    public int hashCode() {
        String str = this.googleSiteKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inHouseSiteKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cloudflareSiteKey;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.googleSiteKey;
        String str2 = this.inHouseSiteKey;
        return uf80.a(ux5.a("SiteKeys(googleSiteKey=", str, ", inHouseSiteKey=", str2, ", cloudflareSiteKey="), this.cloudflareSiteKey, ")");
    }
}
