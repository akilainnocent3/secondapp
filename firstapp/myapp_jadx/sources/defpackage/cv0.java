package defpackage;

import com.appsflyer.internal.a0;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcv0;", "", "", "a", "I", "b", "()I", "kind", "", "J", "()J", "endTime", "c", "multiplier", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class cv0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("boostKind")
    private final int kind;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("endTime")
    private final long endTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("multiplier")
    private final int multiplier;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMultiplier() {
        return this.multiplier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0)) {
            return false;
        }
        cv0 cv0Var = (cv0) obj;
        return this.kind == cv0Var.kind && this.endTime == cv0Var.endTime && this.multiplier == cv0Var.multiplier;
    }

    public final int hashCode() {
        return Integer.hashCode(this.multiplier) + f87.a(Integer.hashCode(this.kind) * 31, this.endTime, 31);
    }

    public final String toString() {
        int i = this.kind;
        long j = this.endTime;
        int i2 = this.multiplier;
        StringBuilder sbA = a0.a("AppliedBoostDto(kind=", ", endTime=", i, j);
        sbA.append(", multiplier=");
        sbA.append(i2);
        sbA.append(")");
        return sbA.toString();
    }
}
