package defpackage;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\t\u0010\u001aR\u001a\u0010!\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0011\u0010\fR\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\u0016\u0010)¨\u0006+"}, d2 = {"Lj230;", "", "", "a", "I", "j", "()I", AnalyticsParam.EVENT_STATUS, "", "b", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "userId", "c", "batchId", "", "d", "J", "i", "()J", "startTime", "e", "f", "endTime", "Ljava/lang/Long;", "()Ljava/lang/Long;", "claimedTime", "g", "lastClaimedTime", "h", "potentialReward", "claimedAmount", "currency", "", "Z", "l", "()Z", "isDaily", "Ljnc;", "Ljnc;", "()Ljnc;", "dailyRecordContent", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class j230 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("batchId")
    private final String batchId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("startTime")
    private final long startTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("endTime")
    private final long endTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("claimedTime")
    private final Long claimedTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("lastClaimedTime")
    private final Long lastClaimedTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("potentialReward")
    private final Long potentialReward;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("claimedAmount")
    private final Long claimedAmount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("currency")
    private final String currency;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName("isDaily")
    private final boolean isDaily;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName("dailyRecordContent")
    private final jnc dailyRecordContent;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getClaimedAmount() {
        return this.claimedAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getClaimedTime() {
        return this.claimedTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jnc getDailyRecordContent() {
        return this.dailyRecordContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j230)) {
            return false;
        }
        j230 j230Var = (j230) obj;
        return this.status == j230Var.status && Intrinsics.g(this.userId, j230Var.userId) && Intrinsics.g(this.batchId, j230Var.batchId) && this.startTime == j230Var.startTime && this.endTime == j230Var.endTime && Intrinsics.g(this.claimedTime, j230Var.claimedTime) && Intrinsics.g(this.lastClaimedTime, j230Var.lastClaimedTime) && Intrinsics.g(this.potentialReward, j230Var.potentialReward) && Intrinsics.g(this.claimedAmount, j230Var.claimedAmount) && Intrinsics.g(this.currency, j230Var.currency) && this.isDaily == j230Var.isDaily && Intrinsics.g(this.dailyRecordContent, j230Var.dailyRecordContent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getLastClaimedTime() {
        return this.lastClaimedTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getPotentialReward() {
        return this.potentialReward;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.status) * 31;
        String str = this.userId;
        int iA = f87.a(f87.a(gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.batchId), this.startTime, 31), this.endTime, 31);
        Long l = this.claimedTime;
        int iHashCode2 = (iA + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastClaimedTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.potentialReward;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.claimedAmount;
        int iA2 = mtg0.a(gmf0.a((iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.currency), 31, this.isDaily);
        jnc jncVar = this.dailyRecordContent;
        return iA2 + (jncVar != null ? jncVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsDaily() {
        return this.isDaily;
    }

    public final String toString() {
        int i = this.status;
        String str = this.userId;
        String str2 = this.batchId;
        long j = this.startTime;
        long j2 = this.endTime;
        Long l = this.claimedTime;
        Long l2 = this.lastClaimedTime;
        Long l3 = this.potentialReward;
        Long l4 = this.claimedAmount;
        String str3 = this.currency;
        boolean z = this.isDaily;
        jnc jncVar = this.dailyRecordContent;
        StringBuilder sbA = uqe0.a(i, "ProgramQualifyDto(status=", ", userId=", str, ", batchId=");
        l.a(j, str2, ", startTime=", sbA);
        g41.a(j2, ", endTime=", lTGEJfVytU.yRS, sbA);
        sbA.append(l);
        sbA.append(", lastClaimedTime=");
        sbA.append(l2);
        sbA.append(", potentialReward=");
        sbA.append(l3);
        sbA.append(", claimedAmount=");
        sbA.append(l4);
        sbA.append(", currency=");
        uts.b(str3, ", isDaily=", ", dailyRecordContent=", sbA, z);
        sbA.append(jncVar);
        sbA.append(")");
        return sbA.toString();
    }
}
