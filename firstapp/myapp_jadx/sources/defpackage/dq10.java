package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Ldq10;", "", "", "a", "J", "b", "()J", "playerId", "", "Ljava/lang/String;", "()Ljava/lang/String;", "nickname", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class dq10 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("playerId")
    private final long playerId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(alternate = {"nickname"}, value = "nickName")
    private final String nickname;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPlayerId() {
        return this.playerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq10)) {
            return false;
        }
        dq10 dq10Var = (dq10) obj;
        return this.playerId == dq10Var.playerId && Intrinsics.g(this.nickname, dq10Var.nickname);
    }

    public final int hashCode() {
        return this.nickname.hashCode() + (Long.hashCode(this.playerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerPayload(playerId=");
        sb.append(this.playerId);
        sb.append(", nickname=");
        return j26.a(sb, this.nickname, ')');
    }
}
