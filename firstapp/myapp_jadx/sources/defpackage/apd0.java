package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lapd0;", "", "", "a", "I", "getSize", "()I", "size", "", "b", "Ljava/lang/String;", "getStartingPoint", "()Ljava/lang/String;", "startingPoint", "", "c", "F", "getSpeed", "()F", "speed", "", "d", "D", "getRowRewardAmount", "()D", "rowRewardAmount", "game-stacker_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class apd0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("size")
    private final int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("startingPoint")
    private final String startingPoint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("speed")
    private final float speed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("rowRewardAmount")
    private final double rowRewardAmount;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStartingPoint() {
        return this.startingPoint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getRowRewardAmount() {
        return this.rowRewardAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apd0)) {
            return false;
        }
        apd0 apd0Var = (apd0) obj;
        return this.size == apd0Var.size && Intrinsics.g(this.startingPoint, apd0Var.startingPoint) && Float.compare(this.speed, apd0Var.speed) == 0 && Double.compare(this.rowRewardAmount, apd0Var.rowRewardAmount) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.rowRewardAmount) + tvh.a(this.speed, gmf0.a(Integer.hashCode(this.size) * 31, 31, this.startingPoint), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackerRow(size=");
        sb.append(this.size);
        sb.append(", startingPoint=");
        sb.append(this.startingPoint);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", rowRewardAmount=");
        return org0.a(sb, this.rowRewardAmount, ')');
    }
}
