package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0011"}, d2 = {"Lf750;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "baseHost", "b", "aliveApiBaseUrl", "e", "resourcesBaseUrl", "d", "f", "sportyComUrl", "analyticsAuthorization", "liveScoreUrl", "environment"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class f750 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("baseHost")
    private final String baseHost = null;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("aliveApiBaseUrl")
    private final String aliveApiBaseUrl = null;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("resourcesBaseUrl")
    private final String resourcesBaseUrl = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("sportyComUrl")
    private final String sportyComUrl = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("analyticsAuthorization")
    private final String analyticsAuthorization = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("liveScoreUrl")
    private final String liveScoreUrl = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAliveApiBaseUrl() {
        return this.aliveApiBaseUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAnalyticsAuthorization() {
        return this.analyticsAuthorization;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBaseHost() {
        return this.baseHost;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLiveScoreUrl() {
        return this.liveScoreUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getResourcesBaseUrl() {
        return this.resourcesBaseUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f750)) {
            return false;
        }
        f750 f750Var = (f750) obj;
        return Intrinsics.g(this.baseHost, f750Var.baseHost) && Intrinsics.g(this.aliveApiBaseUrl, f750Var.aliveApiBaseUrl) && Intrinsics.g(this.resourcesBaseUrl, f750Var.resourcesBaseUrl) && Intrinsics.g(this.sportyComUrl, f750Var.sportyComUrl) && Intrinsics.g(this.analyticsAuthorization, f750Var.analyticsAuthorization) && Intrinsics.g(this.liveScoreUrl, f750Var.liveScoreUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSportyComUrl() {
        return this.sportyComUrl;
    }

    public final int hashCode() {
        String str = this.baseHost;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aliveApiBaseUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resourcesBaseUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sportyComUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.analyticsAuthorization;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.liveScoreUrl;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.baseHost;
        String str2 = this.aliveApiBaseUrl;
        String str3 = this.resourcesBaseUrl;
        String str4 = this.sportyComUrl;
        String str5 = this.analyticsAuthorization;
        String str6 = this.liveScoreUrl;
        StringBuilder sbA = ux5.a("RemoteUrlConfig(baseHost=", str, ", aliveApiBaseUrl=", str2, ", resourcesBaseUrl=");
        hxa.c(sbA, str3, ", sportyComUrl=", str4, ", analyticsAuthorization=");
        return kwi.a(sbA, str5, ", liveScoreUrl=", str6, ")");
    }
}
