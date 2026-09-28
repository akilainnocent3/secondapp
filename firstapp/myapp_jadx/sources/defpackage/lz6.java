package defpackage;

import com.appsflyer.internal.b0;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0003\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b\u000e\u0010!R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b$\u0010\u0006¨\u0006&"}, d2 = {"Llz6;", "", "", "a", "J", "b", "()J", AnalyticsParam.EVENT_PARAM_ID, "", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "type", "", "c", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "tier", "", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "tiers", "e", AnalyticsParam.EVENT_STATUS, "Lsz6;", "Lsz6;", "()Lsz6;", "content", "Lz17;", "Lz17;", "()Lz17;", "parameter", "publishedTime", "i", "unpublishedTime", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class lz6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("type")
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("tier")
    private final Integer tier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("tiers")
    private final List<Integer> tiers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("content")
    private final sz6 content;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("parameter")
    private final z17 parameter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("publishedTime")
    private final long publishedTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("unpublishedTime")
    private final long unpublishedTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final sz6 getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final z17 getParameter() {
        return this.parameter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getPublishedTime() {
        return this.publishedTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz6)) {
            return false;
        }
        lz6 lz6Var = (lz6) obj;
        return this.id == lz6Var.id && Intrinsics.g(this.type, lz6Var.type) && Intrinsics.g(this.tier, lz6Var.tier) && Intrinsics.g(this.tiers, lz6Var.tiers) && Intrinsics.g(this.status, lz6Var.status) && Intrinsics.g(this.content, lz6Var.content) && Intrinsics.g(this.parameter, lz6Var.parameter) && this.publishedTime == lz6Var.publishedTime && this.unpublishedTime == lz6Var.unpublishedTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTier() {
        return this.tier;
    }

    public final List<Integer> g() {
        return this.tiers;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iA = gmf0.a(Long.hashCode(this.id) * 31, 31, this.type);
        Integer num = this.tier;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.tiers;
        return Long.hashCode(this.unpublishedTime) + f87.a((this.parameter.hashCode() + ((this.content.hashCode() + gmf0.a((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.status)) * 31)) * 31, this.publishedTime, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getUnpublishedTime() {
        return this.unpublishedTime;
    }

    public final String toString() {
        long j = this.id;
        String str = this.type;
        Integer num = this.tier;
        List<Integer> list = this.tiers;
        String str2 = this.status;
        sz6 sz6Var = this.content;
        z17 z17Var = this.parameter;
        long j2 = this.publishedTime;
        long j3 = this.unpublishedTime;
        StringBuilder sbA = b0.a(j, "ChallengeConfigDto(id=", ", type=", str);
        sbA.append(", tier=");
        sbA.append(num);
        sbA.append(", tiers=");
        sbA.append(list);
        sbA.append(", status=");
        sbA.append(str2);
        sbA.append(", content=");
        sbA.append(sz6Var);
        sbA.append(", parameter=");
        sbA.append(z17Var);
        sbA.append(", publishedTime=");
        sbA.append(j2);
        return zug.a(j3, ", unpublishedTime=", ")", sbA);
    }
}
