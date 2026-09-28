package com.sportybet.android.instantwin.newtork.model.response.getstarted;

import com.google.gson.annotations.SerializedName;
import defpackage.kya0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR-\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R'\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStarted;", "", "sportId", "", "sportName", "tabKey", "cmsContents", "", "Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedCmsContent;", "bottomCta", "Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedBottomCta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedBottomCta;)V", "getSportId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSportName", "getTabKey", "getCmsContents", "()Ljava/util/List;", "getBottomCta", "()Lcom/sportybet/android/instantwin/newtork/model/response/getstarted/NetworkVirtualLobbyGetStartedBottomCta;", "bottomCTA", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkVirtualLobbyGetStarted {
    public static final int $stable = NetworkVirtualLobbyGetStartedBottomCta.$stable;

    @SerializedName("bottomCTA")
    private final NetworkVirtualLobbyGetStartedBottomCta bottomCta;

    @SerializedName("cmsContents")
    private final List<NetworkVirtualLobbyGetStartedCmsContent> cmsContents;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("sportName")
    private final String sportName;

    @SerializedName("tabKey")
    private final String tabKey;

    public NetworkVirtualLobbyGetStarted(String str, String str2, String str3, List<NetworkVirtualLobbyGetStartedCmsContent> list, NetworkVirtualLobbyGetStartedBottomCta networkVirtualLobbyGetStartedBottomCta) {
        this.sportId = str;
        this.sportName = str2;
        this.tabKey = str3;
        this.cmsContents = list;
        this.bottomCta = networkVirtualLobbyGetStartedBottomCta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkVirtualLobbyGetStarted copy$default(NetworkVirtualLobbyGetStarted networkVirtualLobbyGetStarted, String str, String str2, String str3, List list, NetworkVirtualLobbyGetStartedBottomCta networkVirtualLobbyGetStartedBottomCta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkVirtualLobbyGetStarted.sportId;
        }
        if ((i & 2) != 0) {
            str2 = networkVirtualLobbyGetStarted.sportName;
        }
        if ((i & 4) != 0) {
            str3 = networkVirtualLobbyGetStarted.tabKey;
        }
        if ((i & 8) != 0) {
            list = networkVirtualLobbyGetStarted.cmsContents;
        }
        if ((i & 16) != 0) {
            networkVirtualLobbyGetStartedBottomCta = networkVirtualLobbyGetStarted.bottomCta;
        }
        NetworkVirtualLobbyGetStartedBottomCta networkVirtualLobbyGetStartedBottomCta2 = networkVirtualLobbyGetStartedBottomCta;
        String str4 = str3;
        return networkVirtualLobbyGetStarted.copy(str, str2, str4, list, networkVirtualLobbyGetStartedBottomCta2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTabKey() {
        return this.tabKey;
    }

    public final List<NetworkVirtualLobbyGetStartedCmsContent> component4() {
        return this.cmsContents;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NetworkVirtualLobbyGetStartedBottomCta getBottomCta() {
        return this.bottomCta;
    }

    public final NetworkVirtualLobbyGetStarted copy(String sportId, String sportName, String tabKey, List<NetworkVirtualLobbyGetStartedCmsContent> cmsContents, NetworkVirtualLobbyGetStartedBottomCta bottomCta) {
        return new NetworkVirtualLobbyGetStarted(sportId, sportName, tabKey, cmsContents, bottomCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkVirtualLobbyGetStarted)) {
            return false;
        }
        NetworkVirtualLobbyGetStarted networkVirtualLobbyGetStarted = (NetworkVirtualLobbyGetStarted) other;
        return Intrinsics.g(this.sportId, networkVirtualLobbyGetStarted.sportId) && Intrinsics.g(this.sportName, networkVirtualLobbyGetStarted.sportName) && Intrinsics.g(this.tabKey, networkVirtualLobbyGetStarted.tabKey) && Intrinsics.g(this.cmsContents, networkVirtualLobbyGetStarted.cmsContents) && Intrinsics.g(this.bottomCta, networkVirtualLobbyGetStarted.bottomCta);
    }

    public final NetworkVirtualLobbyGetStartedBottomCta getBottomCta() {
        return this.bottomCta;
    }

    public final List<NetworkVirtualLobbyGetStartedCmsContent> getCmsContents() {
        return this.cmsContents;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public int hashCode() {
        String str = this.sportId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sportName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tabKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<NetworkVirtualLobbyGetStartedCmsContent> list = this.cmsContents;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        NetworkVirtualLobbyGetStartedBottomCta networkVirtualLobbyGetStartedBottomCta = this.bottomCta;
        return iHashCode4 + (networkVirtualLobbyGetStartedBottomCta != null ? networkVirtualLobbyGetStartedBottomCta.hashCode() : 0);
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.sportName;
        String str3 = this.tabKey;
        List<NetworkVirtualLobbyGetStartedCmsContent> list = this.cmsContents;
        NetworkVirtualLobbyGetStartedBottomCta networkVirtualLobbyGetStartedBottomCta = this.bottomCta;
        StringBuilder sbA = ux5.a("NetworkVirtualLobbyGetStarted(sportId=", str, ", sportName=", str2, ", tabKey=");
        kya0.b(str3, ", cmsContents=", ", bottomCta=", sbA, list);
        sbA.append(networkVirtualLobbyGetStartedBottomCta);
        sbA.append(")");
        return sbA.toString();
    }
}
