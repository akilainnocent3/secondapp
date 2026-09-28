package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Lri4;", "", "", "a", "J", "d", "()J", "sessionId", "", "b", "Ljava/lang/Integer;", "getCampaignTierId", "()Ljava/lang/Integer;", "campaignTierId", "c", "freeBetCount", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "freeBetValue", "", "Lhm4;", "e", "Ljava/util/List;", "()Ljava/util/List;", "gifts", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ri4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("sessionId")
    private final long sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("campaignTierId")
    private final Integer campaignTierId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("freeBetCount")
    private final Integer freeBetCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("freeBetValue")
    private final Double freeBetValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("gifts")
    private final List<hm4> gifts;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getFreeBetCount() {
        return this.freeBetCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getFreeBetValue() {
        return this.freeBetValue;
    }

    public final List<hm4> c() {
        return this.gifts;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri4)) {
            return false;
        }
        ri4 ri4Var = (ri4) obj;
        return this.sessionId == ri4Var.sessionId && Intrinsics.g(this.campaignTierId, ri4Var.campaignTierId) && Intrinsics.g(this.freeBetCount, ri4Var.freeBetCount) && Intrinsics.g(this.freeBetValue, ri4Var.freeBetValue) && Intrinsics.g(this.gifts, ri4Var.gifts);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.sessionId) * 31;
        Integer num = this.campaignTierId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.freeBetCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.freeBetValue;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        List<hm4> list = this.gifts;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupClaim(sessionId=");
        sb.append(this.sessionId);
        sb.append(", campaignTierId=");
        sb.append(this.campaignTierId);
        sb.append(", freeBetCount=");
        sb.append(this.freeBetCount);
        sb.append(", freeBetValue=");
        sb.append(this.freeBetValue);
        sb.append(", gifts=");
        return o8i.a(sb, this.gifts, ')');
    }
}
