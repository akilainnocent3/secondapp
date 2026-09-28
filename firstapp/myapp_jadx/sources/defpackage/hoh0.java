package defpackage;

import com.appsflyer.internal.b0;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u001a"}, d2 = {"Lhoh0;", "", "", "a", "J", "d", "()J", AnalyticsParam.EVENT_PARAM_ID, "", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "c", "challengeId", "e", AnalyticsParam.EVENT_STATUS, "", "D", "()D", "accumulatedAmount", "f", "expireTime", "g", "updateTime", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class hoh0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("challengeId")
    private final long challengeId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("accumulatedAmount")
    private final double accumulatedAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("expireTime")
    private final long expireTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("updateTime")
    private final long updateTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAccumulatedAmount() {
        return this.accumulatedAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getChallengeId() {
        return this.challengeId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoh0)) {
            return false;
        }
        hoh0 hoh0Var = (hoh0) obj;
        return this.id == hoh0Var.id && Intrinsics.g(this.userId, hoh0Var.userId) && this.challengeId == hoh0Var.challengeId && Intrinsics.g(this.status, hoh0Var.status) && Double.compare(this.accumulatedAmount, hoh0Var.accumulatedAmount) == 0 && this.expireTime == hoh0Var.expireTime && this.updateTime == hoh0Var.updateTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.updateTime) + f87.a(nrg0.a(gmf0.a(f87.a(gmf0.a(Long.hashCode(this.id) * 31, 31, this.userId), this.challengeId, 31), 31, this.status), 31, this.accumulatedAmount), this.expireTime, 31);
    }

    public final String toString() {
        long j = this.id;
        String str = this.userId;
        long j2 = this.challengeId;
        String str2 = this.status;
        double d = this.accumulatedAmount;
        long j3 = this.expireTime;
        long j4 = this.updateTime;
        StringBuilder sbA = b0.a(j, "UserChallengeDto(id=", ", userId=", str);
        g41.a(j2, ", challengeId=", ", status=", sbA);
        sbA.append(str2);
        sbA.append(", accumulatedAmount=");
        sbA.append(d);
        g41.a(j3, ", expireTime=", ", updateTime=", sbA);
        return nrz.a(j4, ")", sbA);
    }
}
