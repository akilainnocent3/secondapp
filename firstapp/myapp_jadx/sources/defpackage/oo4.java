package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Loo4;", "", "", "a", "J", "()J", "sessionId", "", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "timerSeconds", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class oo4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("sessionId")
    private final long sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("timerSeconds")
    private final Integer timerSeconds;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTimerSeconds() {
        return this.timerSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo4)) {
            return false;
        }
        oo4 oo4Var = (oo4) obj;
        return this.sessionId == oo4Var.sessionId && Intrinsics.g(this.timerSeconds, oo4Var.timerSeconds);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.sessionId) * 31;
        Integer num = this.timerSeconds;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BonusCupRoundStart(sessionId=" + this.sessionId + ", timerSeconds=" + this.timerSeconds + ')';
    }
}
