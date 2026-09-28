package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lu9p;", "", "", "a", "J", "()J", "joinKey", "", "b", "Ljava/lang/String;", "getTraceId", "()Ljava/lang/String;", "traceId", "c", "getMatchmakingStatus", "matchmakingStatus", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "topics", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u9p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("joinKey")
    private final long joinKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("traceId")
    private final String traceId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("matchmakingStatus")
    private final String matchmakingStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("topics")
    private final List<String> topics;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getJoinKey() {
        return this.joinKey;
    }

    public final List<String> b() {
        return this.topics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9p)) {
            return false;
        }
        u9p u9pVar = (u9p) obj;
        return this.joinKey == u9pVar.joinKey && Intrinsics.g(this.traceId, u9pVar.traceId) && Intrinsics.g(this.matchmakingStatus, u9pVar.matchmakingStatus) && Intrinsics.g(this.topics, u9pVar.topics);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(Long.hashCode(this.joinKey) * 31, 31, this.traceId), 31, this.matchmakingStatus);
        List<String> list = this.topics;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinResponse(joinKey=");
        sb.append(this.joinKey);
        sb.append(", traceId=");
        sb.append(this.traceId);
        sb.append(", matchmakingStatus=");
        sb.append(this.matchmakingStatus);
        sb.append(", topics=");
        return o8i.a(sb, this.topics, ')');
    }
}
