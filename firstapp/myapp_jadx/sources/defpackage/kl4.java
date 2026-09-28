package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkl4;", "", "", "a", "I", "getObjectId", "()I", "objectId", "", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "rewardDelta", "accumulatedReward", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "timerSeconds", "Lgp4;", "e", "Lgp4;", "()Lgp4;", "nextSpawnObject", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class kl4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("objectId")
    private final int objectId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("rewardDelta")
    private final Double rewardDelta;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("accumulatedReward")
    private final Double accumulatedReward;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("timerSeconds")
    private final Integer timerSeconds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("nextSpawnObject")
    private final gp4 nextSpawnObject;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAccumulatedReward() {
        return this.accumulatedReward;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final gp4 getNextSpawnObject() {
        return this.nextSpawnObject;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getRewardDelta() {
        return this.rewardDelta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getTimerSeconds() {
        return this.timerSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl4)) {
            return false;
        }
        kl4 kl4Var = (kl4) obj;
        return this.objectId == kl4Var.objectId && Intrinsics.g(this.rewardDelta, kl4Var.rewardDelta) && Intrinsics.g(this.accumulatedReward, kl4Var.accumulatedReward) && Intrinsics.g(this.timerSeconds, kl4Var.timerSeconds) && Intrinsics.g(this.nextSpawnObject, kl4Var.nextSpawnObject);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.objectId) * 31;
        Double d = this.rewardDelta;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.accumulatedReward;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.timerSeconds;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        gp4 gp4Var = this.nextSpawnObject;
        return iHashCode4 + (gp4Var != null ? gp4Var.hashCode() : 0);
    }

    public final String toString() {
        return "BonusCupGameplayEventPayload(objectId=" + this.objectId + ", rewardDelta=" + this.rewardDelta + ", accumulatedReward=" + this.accumulatedReward + ", timerSeconds=" + this.timerSeconds + ", nextSpawnObject=" + this.nextSpawnObject + ')';
    }
}
