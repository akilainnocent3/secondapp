package com.sportybet.android.instantwin.newtork.model.response.getstarted;

import com.google.gson.annotations.SerializedName;
import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedBottomCta;", "", "cmsKey", "", "cmsValue", "redirectUrl", "updateRequiredAppVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCmsKey", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getCmsValue", "getRedirectUrl", "getUpdateRequiredAppVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkVirtualLobbyGetStartedBottomCta {
    public static final int $stable = 0;

    @SerializedName("cmsKey")
    private final String cmsKey;

    @SerializedName("cmsValue")
    private final String cmsValue;

    @SerializedName("redirectUrl")
    private final String redirectUrl;

    @SerializedName("updateRequiredAppVersion")
    private final String updateRequiredAppVersion;

    public NetworkVirtualLobbyGetStartedBottomCta(String str, String str2, String str3, String str4) {
        this.cmsKey = str;
        this.cmsValue = str2;
        this.redirectUrl = str3;
        this.updateRequiredAppVersion = str4;
    }

    public static /* synthetic */ NetworkVirtualLobbyGetStartedBottomCta copy$default(NetworkVirtualLobbyGetStartedBottomCta networkVirtualLobbyGetStartedBottomCta, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkVirtualLobbyGetStartedBottomCta.cmsKey;
        }
        if ((i & 2) != 0) {
            str2 = networkVirtualLobbyGetStartedBottomCta.cmsValue;
        }
        if ((i & 4) != 0) {
            str3 = networkVirtualLobbyGetStartedBottomCta.redirectUrl;
        }
        if ((i & 8) != 0) {
            str4 = networkVirtualLobbyGetStartedBottomCta.updateRequiredAppVersion;
        }
        return networkVirtualLobbyGetStartedBottomCta.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCmsKey() {
        return this.cmsKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCmsValue() {
        return this.cmsValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpdateRequiredAppVersion() {
        return this.updateRequiredAppVersion;
    }

    public final NetworkVirtualLobbyGetStartedBottomCta copy(String cmsKey, String cmsValue, String redirectUrl, String updateRequiredAppVersion) {
        return new NetworkVirtualLobbyGetStartedBottomCta(cmsKey, cmsValue, redirectUrl, updateRequiredAppVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkVirtualLobbyGetStartedBottomCta)) {
            return false;
        }
        NetworkVirtualLobbyGetStartedBottomCta networkVirtualLobbyGetStartedBottomCta = (NetworkVirtualLobbyGetStartedBottomCta) other;
        return Intrinsics.g(this.cmsKey, networkVirtualLobbyGetStartedBottomCta.cmsKey) && Intrinsics.g(this.cmsValue, networkVirtualLobbyGetStartedBottomCta.cmsValue) && Intrinsics.g(this.redirectUrl, networkVirtualLobbyGetStartedBottomCta.redirectUrl) && Intrinsics.g(this.updateRequiredAppVersion, networkVirtualLobbyGetStartedBottomCta.updateRequiredAppVersion);
    }

    public final String getCmsKey() {
        return this.cmsKey;
    }

    public final String getCmsValue() {
        return this.cmsValue;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getUpdateRequiredAppVersion() {
        return this.updateRequiredAppVersion;
    }

    public int hashCode() {
        String str = this.cmsKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cmsValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redirectUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updateRequiredAppVersion;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.cmsKey;
        String str2 = this.cmsValue;
        return kwi.a(ux5.a("NetworkVirtualLobbyGetStartedBottomCta(cmsKey=", str, ", cmsValue=", str2, ", redirectUrl="), this.redirectUrl, ", updateRequiredAppVersion=", this.updateRequiredAppVersion, ")");
    }
}
