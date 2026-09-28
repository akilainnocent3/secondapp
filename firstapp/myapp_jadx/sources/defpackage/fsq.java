package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0003\u0010\r¨\u0006\u0010"}, d2 = {"Lfsq;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", AnalyticsParam.EVENT_PARAM_ID, "d", "title", "", "c", "J", "()J", "startTime", "endTime", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class fsq {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("i")
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("ti")
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("st")
    private final long startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("et")
    private final long endTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsq)) {
            return false;
        }
        fsq fsqVar = (fsq) obj;
        return Intrinsics.g(this.id, fsqVar.id) && Intrinsics.g(this.title, fsqVar.title) && this.startTime == fsqVar.startTime && this.endTime == fsqVar.endTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.endTime) + f87.a(gmf0.a(this.id.hashCode() * 31, 31, this.title), this.startTime, 31);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        long j = this.startTime;
        long j2 = this.endTime;
        StringBuilder sbA = ux5.a("LNLotteryStreamDTO(id=", str, ", title=", str2, ", startTime=");
        sbA.append(j);
        return zug.a(j2, ", endTime=", ")", sbA);
    }
}
