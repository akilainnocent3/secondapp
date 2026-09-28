package com.sportybet.android.instantwin.newtork.model.response.getstarted;

import com.google.gson.annotations.SerializedName;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedCtaContext;", "", "redirectUrl", "", "updateRequiredAppVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRedirectUrl", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getUpdateRequiredAppVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkVirtualLobbyGetStartedCtaContext {
    public static final int $stable = 0;

    @SerializedName("redirectUrl")
    private final String redirectUrl;

    @SerializedName("updateRequiredAppVersion")
    private final String updateRequiredAppVersion;

    public NetworkVirtualLobbyGetStartedCtaContext(String str, String str2) {
        this.redirectUrl = str;
        this.updateRequiredAppVersion = str2;
    }

    public static /* synthetic */ NetworkVirtualLobbyGetStartedCtaContext copy$default(NetworkVirtualLobbyGetStartedCtaContext networkVirtualLobbyGetStartedCtaContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkVirtualLobbyGetStartedCtaContext.redirectUrl;
        }
        if ((i & 2) != 0) {
            str2 = networkVirtualLobbyGetStartedCtaContext.updateRequiredAppVersion;
        }
        return networkVirtualLobbyGetStartedCtaContext.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUpdateRequiredAppVersion() {
        return this.updateRequiredAppVersion;
    }

    public final NetworkVirtualLobbyGetStartedCtaContext copy(String redirectUrl, String updateRequiredAppVersion) {
        return new NetworkVirtualLobbyGetStartedCtaContext(redirectUrl, updateRequiredAppVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkVirtualLobbyGetStartedCtaContext)) {
            return false;
        }
        NetworkVirtualLobbyGetStartedCtaContext networkVirtualLobbyGetStartedCtaContext = (NetworkVirtualLobbyGetStartedCtaContext) other;
        return Intrinsics.g(this.redirectUrl, networkVirtualLobbyGetStartedCtaContext.redirectUrl) && Intrinsics.g(this.updateRequiredAppVersion, networkVirtualLobbyGetStartedCtaContext.updateRequiredAppVersion);
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getUpdateRequiredAppVersion() {
        return this.updateRequiredAppVersion;
    }

    public int hashCode() {
        String str = this.redirectUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.updateRequiredAppVersion;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("NetworkVirtualLobbyGetStartedCtaContext(redirectUrl=", this.redirectUrl, ", updateRequiredAppVersion=", this.updateRequiredAppVersion, ")");
    }
}
