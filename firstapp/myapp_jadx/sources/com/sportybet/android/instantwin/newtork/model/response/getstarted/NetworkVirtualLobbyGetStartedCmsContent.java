package com.sportybet.android.instantwin.newtork.model.response.getstarted;

import com.google.gson.annotations.SerializedName;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR'\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001e"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedCmsContent;", "", "type", "", "cmsKey", "cmsValue", "ctaContext", "Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedCtaContext;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedCtaContext;)V", "getType", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getCmsKey", "getCmsValue", "getCtaContext", "()Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedCtaContext;", "CTAContext", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkVirtualLobbyGetStartedCmsContent {
    public static final int $stable = NetworkVirtualLobbyGetStartedCtaContext.$stable;

    @SerializedName("cmsKey")
    private final String cmsKey;

    @SerializedName("cmsValue")
    private final String cmsValue;

    @SerializedName("CTAContext")
    private final NetworkVirtualLobbyGetStartedCtaContext ctaContext;

    @SerializedName("type")
    private final String type;

    public NetworkVirtualLobbyGetStartedCmsContent(String str, String str2, String str3, NetworkVirtualLobbyGetStartedCtaContext networkVirtualLobbyGetStartedCtaContext) {
        this.type = str;
        this.cmsKey = str2;
        this.cmsValue = str3;
        this.ctaContext = networkVirtualLobbyGetStartedCtaContext;
    }

    public static /* synthetic */ NetworkVirtualLobbyGetStartedCmsContent copy$default(NetworkVirtualLobbyGetStartedCmsContent networkVirtualLobbyGetStartedCmsContent, String str, String str2, String str3, NetworkVirtualLobbyGetStartedCtaContext networkVirtualLobbyGetStartedCtaContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkVirtualLobbyGetStartedCmsContent.type;
        }
        if ((i & 2) != 0) {
            str2 = networkVirtualLobbyGetStartedCmsContent.cmsKey;
        }
        if ((i & 4) != 0) {
            str3 = networkVirtualLobbyGetStartedCmsContent.cmsValue;
        }
        if ((i & 8) != 0) {
            networkVirtualLobbyGetStartedCtaContext = networkVirtualLobbyGetStartedCmsContent.ctaContext;
        }
        return networkVirtualLobbyGetStartedCmsContent.copy(str, str2, str3, networkVirtualLobbyGetStartedCtaContext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCmsKey() {
        return this.cmsKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCmsValue() {
        return this.cmsValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NetworkVirtualLobbyGetStartedCtaContext getCtaContext() {
        return this.ctaContext;
    }

    public final NetworkVirtualLobbyGetStartedCmsContent copy(String type, String cmsKey, String cmsValue, NetworkVirtualLobbyGetStartedCtaContext ctaContext) {
        return new NetworkVirtualLobbyGetStartedCmsContent(type, cmsKey, cmsValue, ctaContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkVirtualLobbyGetStartedCmsContent)) {
            return false;
        }
        NetworkVirtualLobbyGetStartedCmsContent networkVirtualLobbyGetStartedCmsContent = (NetworkVirtualLobbyGetStartedCmsContent) other;
        return Intrinsics.g(this.type, networkVirtualLobbyGetStartedCmsContent.type) && Intrinsics.g(this.cmsKey, networkVirtualLobbyGetStartedCmsContent.cmsKey) && Intrinsics.g(this.cmsValue, networkVirtualLobbyGetStartedCmsContent.cmsValue) && Intrinsics.g(this.ctaContext, networkVirtualLobbyGetStartedCmsContent.ctaContext);
    }

    public final String getCmsKey() {
        return this.cmsKey;
    }

    public final String getCmsValue() {
        return this.cmsValue;
    }

    public final NetworkVirtualLobbyGetStartedCtaContext getCtaContext() {
        return this.ctaContext;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cmsKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cmsValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        NetworkVirtualLobbyGetStartedCtaContext networkVirtualLobbyGetStartedCtaContext = this.ctaContext;
        return iHashCode3 + (networkVirtualLobbyGetStartedCtaContext != null ? networkVirtualLobbyGetStartedCtaContext.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.cmsKey;
        String str3 = this.cmsValue;
        NetworkVirtualLobbyGetStartedCtaContext networkVirtualLobbyGetStartedCtaContext = this.ctaContext;
        StringBuilder sbA = ux5.a("NetworkVirtualLobbyGetStartedCmsContent(type=", str, ", cmsKey=", str2, ", cmsValue=");
        sbA.append(str3);
        sbA.append(", ctaContext=");
        sbA.append(networkVirtualLobbyGetStartedCtaContext);
        sbA.append(")");
        return sbA.toString();
    }
}
