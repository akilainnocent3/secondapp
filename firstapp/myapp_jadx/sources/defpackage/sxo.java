package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lsxo;", "", "", "a", "Z", "c", "()Z", "isEnabled", "", "b", "J", "()J", "gcpNumber", "", "I", "getMinimumIntervalMinutes", "()I", "minimumIntervalMinutes", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class sxo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("is_enabled")
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("gcp_number")
    private final long gcpNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("verification_interval_minutes")
    private final int minimumIntervalMinutes;

    public sxo(int i) {
        this.isEnabled = false;
        this.gcpNumber = 0L;
        this.minimumIntervalMinutes = 0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getGcpNumber() {
        return this.gcpNumber;
    }

    public final long b() {
        return ((long) (this.minimumIntervalMinutes * 60)) * 1000;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxo)) {
            return false;
        }
        sxo sxoVar = (sxo) obj;
        return this.isEnabled == sxoVar.isEnabled && this.gcpNumber == sxoVar.gcpNumber && this.minimumIntervalMinutes == sxoVar.minimumIntervalMinutes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minimumIntervalMinutes) + f87.a(Boolean.hashCode(this.isEnabled) * 31, this.gcpNumber, 31);
    }

    public final String toString() {
        return "IntegrityCheckFeature(isEnabled=" + this.isEnabled + ", gcpNumber=" + this.gcpNumber + ", minimumIntervalMinutes=" + this.minimumIntervalMinutes + ")";
    }

    public sxo() {
        this(0);
    }
}
