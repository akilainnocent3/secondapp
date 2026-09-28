package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006!"}, d2 = {"Lgp4;", "", "", "a", "I", "c", "()I", "objectId", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "objectType", "columnNumber", "", "F", "()F", "angle", "e", "Ljava/lang/Float;", "f", "()Ljava/lang/Float;", "velocityMultiplier", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "rewardValue", "", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isGoldenBallAllowed", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class gp4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("objectId")
    private final int objectId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("objectType")
    private final String objectType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("columnNumber")
    private final int columnNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("angle")
    private final float angle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("velocityMultiplier")
    private final Float velocityMultiplier;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("rewardValue")
    private final Double rewardValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName(alternate = {"isGoldenBallAllowed"}, value = "goldenBallAllowed")
    private final Boolean isGoldenBallAllowed;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAngle() {
        return this.angle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getColumnNumber() {
        return this.columnNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getObjectId() {
        return this.objectId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getObjectType() {
        return this.objectType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getRewardValue() {
        return this.rewardValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp4)) {
            return false;
        }
        gp4 gp4Var = (gp4) obj;
        return this.objectId == gp4Var.objectId && Intrinsics.g(this.objectType, gp4Var.objectType) && this.columnNumber == gp4Var.columnNumber && Float.compare(this.angle, gp4Var.angle) == 0 && Intrinsics.g(this.velocityMultiplier, gp4Var.velocityMultiplier) && Intrinsics.g(this.rewardValue, gp4Var.rewardValue) && Intrinsics.g(this.isGoldenBallAllowed, gp4Var.isGoldenBallAllowed);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Float getVelocityMultiplier() {
        return this.velocityMultiplier;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getIsGoldenBallAllowed() {
        return this.isGoldenBallAllowed;
    }

    public final int hashCode() {
        int iA = tvh.a(this.angle, gpp.a(this.columnNumber, gmf0.a(Integer.hashCode(this.objectId) * 31, 31, this.objectType), 31), 31);
        Float f = this.velocityMultiplier;
        int iHashCode = (iA + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.rewardValue;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.isGoldenBallAllowed;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BonusCupSpawnObject(objectId=" + this.objectId + ", objectType=" + this.objectType + ", columnNumber=" + this.columnNumber + ", angle=" + this.angle + ", velocityMultiplier=" + this.velocityMultiplier + ", rewardValue=" + this.rewardValue + ", isGoldenBallAllowed=" + this.isGoldenBallAllowed + ')';
    }
}
