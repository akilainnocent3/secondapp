package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lv14;", "", "", "a", "I", "()I", "level", "b", "streakDays", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class v14 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("level")
    private final int level;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("threshold")
    private final int streakDays;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStreakDays() {
        return this.streakDays;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v14)) {
            return false;
        }
        v14 v14Var = (v14) obj;
        return this.level == v14Var.level && this.streakDays == v14Var.streakDays;
    }

    public final int hashCode() {
        return Integer.hashCode(this.streakDays) + (Integer.hashCode(this.level) * 31);
    }

    public final String toString() {
        return n36.a("BettingStreakLevelConfigDto(level=", this.level, this.streakDays, ", streakDays=", ")");
    }
}
