package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Laj4;", "", "", "a", "J", "d", "()J", "sessionId", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expiresAt", "", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "accumulatedReward", "remainingBudget", "", "e", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "yellowCards", "timerSeconds", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class aj4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("sessionId")
    private final long sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("expiresAt")
    private final Long expiresAt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("accumulatedReward")
    private final Double accumulatedReward;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("remainingBudget")
    private final Double remainingBudget;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("yellowCards")
    private final Integer yellowCards;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("timerSeconds")
    private final Integer timerSeconds;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAccumulatedReward() {
        return this.accumulatedReward;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getRemainingBudget() {
        return this.remainingBudget;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getTimerSeconds() {
        return this.timerSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj4)) {
            return false;
        }
        aj4 aj4Var = (aj4) obj;
        return this.sessionId == aj4Var.sessionId && Intrinsics.g(this.expiresAt, aj4Var.expiresAt) && Intrinsics.g(this.accumulatedReward, aj4Var.accumulatedReward) && Intrinsics.g(this.remainingBudget, aj4Var.remainingBudget) && Intrinsics.g(this.yellowCards, aj4Var.yellowCards) && Intrinsics.g(this.timerSeconds, aj4Var.timerSeconds);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.sessionId) * 31;
        Long l = this.expiresAt;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.accumulatedReward;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.remainingBudget;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.yellowCards;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timerSeconds;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "BonusCupCurrentGame(sessionId=" + this.sessionId + ", expiresAt=" + this.expiresAt + ", accumulatedReward=" + this.accumulatedReward + ", remainingBudget=" + this.remainingBudget + ", yellowCards=" + this.yellowCards + ", timerSeconds=" + this.timerSeconds + ')';
    }
}
