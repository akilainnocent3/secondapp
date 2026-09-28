package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0015"}, d2 = {"Lp27;", "", "", "a", "I", "e", "()I", "rewardType", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "referenceId", "", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "rewardAmount", "currency", "customizedText", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class p27 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("rewardType")
    private final int rewardType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("referenceId")
    private final String referenceId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("rewardAmount")
    private final Long rewardAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("currency")
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("customizedText")
    private final String customizedText;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCustomizedText() {
        return this.customizedText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getRewardAmount() {
        return this.rewardAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRewardType() {
        return this.rewardType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p27)) {
            return false;
        }
        p27 p27Var = (p27) obj;
        return this.rewardType == p27Var.rewardType && Intrinsics.g(this.referenceId, p27Var.referenceId) && Intrinsics.g(this.rewardAmount, p27Var.rewardAmount) && Intrinsics.g(this.currency, p27Var.currency) && Intrinsics.g(this.customizedText, p27Var.customizedText);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.rewardType) * 31;
        String str = this.referenceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.rewardAmount;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customizedText;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.rewardType;
        String str = this.referenceId;
        Long l = this.rewardAmount;
        String str2 = this.currency;
        String str3 = this.customizedText;
        StringBuilder sbA = uqe0.a(i, "ChallengeRewardDto(rewardType=", ", referenceId=", str, ", rewardAmount=");
        sbA.append(l);
        sbA.append(", currency=");
        sbA.append(str2);
        sbA.append(", customizedText=");
        return uf80.a(sbA, str3, ")");
    }
}
