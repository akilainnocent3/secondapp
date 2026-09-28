package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvkh0;", "", "", "a", "Z", "()Z", "notifyKeepStreak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class vkh0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("notifyKeepStreak")
    private final boolean notifyKeepStreak;

    public vkh0(boolean z) {
        this.notifyKeepStreak = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getNotifyKeepStreak() {
        return this.notifyKeepStreak;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vkh0) && this.notifyKeepStreak == ((vkh0) obj).notifyKeepStreak;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.notifyKeepStreak);
    }

    public final String toString() {
        return b6c.a("UpdateStreakReminderStatusDto(notifyKeepStreak=", ")", this.notifyKeepStreak);
    }
}
