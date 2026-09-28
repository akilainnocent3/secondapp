package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhp4;", "", "", "a", "J", "getSessionId", "()J", "sessionId", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class hp4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("sessionId")
    private final long sessionId;

    public hp4(long j) {
        this.sessionId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp4) && this.sessionId == ((hp4) obj).sessionId;
    }

    public final int hashCode() {
        return Long.hashCode(this.sessionId);
    }

    public final String toString() {
        return uvh.a(new StringBuilder("BonusCupSpawnRequest(sessionId="), this.sessionId, ')');
    }
}
