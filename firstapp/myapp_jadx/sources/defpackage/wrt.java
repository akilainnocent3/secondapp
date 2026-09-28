package defpackage;

import com.appsflyer.internal.b0;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006¨\u0006\u001c"}, d2 = {"Lwrt;", "", "", "a", "J", "b", "()J", AnalyticsParam.EVENT_PARAM_ID, "", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "type", "c", "e", AnalyticsParam.EVENT_STATUS, "Lvrt;", "d", "Lvrt;", "()Lvrt;", "content", "Lxrt;", "Lxrt;", "()Lxrt;", "parameter", "publishedTime", "g", "unpublishedTime", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class wrt {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("type")
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("content")
    private final vrt content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("parameter")
    private final xrt parameter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("publishedTime")
    private final long publishedTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("unpublishedTime")
    private final long unpublishedTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final vrt getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final xrt getParameter() {
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
        if (!(obj instanceof wrt)) {
            return false;
        }
        wrt wrtVar = (wrt) obj;
        return this.id == wrtVar.id && Intrinsics.g(this.type, wrtVar.type) && Intrinsics.g(this.status, wrtVar.status) && Intrinsics.g(this.content, wrtVar.content) && Intrinsics.g(this.parameter, wrtVar.parameter) && this.publishedTime == wrtVar.publishedTime && this.unpublishedTime == wrtVar.unpublishedTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getUnpublishedTime() {
        return this.unpublishedTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.unpublishedTime) + f87.a((this.parameter.hashCode() + ((this.content.hashCode() + gmf0.a(gmf0.a(Long.hashCode(this.id) * 31, 31, this.type), 31, this.status)) * 31)) * 31, this.publishedTime, 31);
    }

    public final String toString() {
        long j = this.id;
        String str = this.type;
        String str2 = this.status;
        vrt vrtVar = this.content;
        xrt xrtVar = this.parameter;
        long j2 = this.publishedTime;
        long j3 = this.unpublishedTime;
        StringBuilder sbA = b0.a(j, "LoyaltyChallengeConfigDto(id=", ", type=", str);
        sbA.append(", status=");
        sbA.append(str2);
        sbA.append(", content=");
        sbA.append(vrtVar);
        sbA.append(", parameter=");
        sbA.append(xrtVar);
        sbA.append(", publishedTime=");
        sbA.append(j2);
        return zug.a(j3, ", unpublishedTime=", ")", sbA);
    }
}
