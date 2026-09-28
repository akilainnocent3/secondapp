package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Ljnc;", "", "", "a", "Z", "c", "()Z", "isAccumulate", "", "b", "J", "()J", "dailyRewardStartDate", "dailyRewardEndDate", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class jnc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("isAccumulate")
    private final boolean isAccumulate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("dailyRewardStartDate")
    private final long dailyRewardStartDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("dailyRewardEndDate")
    private final long dailyRewardEndDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDailyRewardEndDate() {
        return this.dailyRewardEndDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDailyRewardStartDate() {
        return this.dailyRewardStartDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAccumulate() {
        return this.isAccumulate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnc)) {
            return false;
        }
        jnc jncVar = (jnc) obj;
        return this.isAccumulate == jncVar.isAccumulate && this.dailyRewardStartDate == jncVar.dailyRewardStartDate && this.dailyRewardEndDate == jncVar.dailyRewardEndDate;
    }

    public final int hashCode() {
        return Long.hashCode(this.dailyRewardEndDate) + f87.a(Boolean.hashCode(this.isAccumulate) * 31, this.dailyRewardStartDate, 31);
    }

    public final String toString() {
        boolean z = this.isAccumulate;
        long j = this.dailyRewardStartDate;
        long j2 = this.dailyRewardEndDate;
        StringBuilder sb = new StringBuilder("DailyRecordContentDto(isAccumulate=");
        sb.append(z);
        sb.append(", dailyRewardStartDate=");
        sb.append(j);
        return zug.a(j2, ", dailyRewardEndDate=", ")", sb);
    }
}
