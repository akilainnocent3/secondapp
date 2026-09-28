package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lzzd0;", "", "<init>", "()V", "a", "d", "e", "c", "b", "Lzzd0$a;", "Lzzd0$b;", "Lzzd0$c;", "Lzzd0$d;", "Lzzd0$e;", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzd0 {

    public static final class a extends zzd0 {
        public static final a a = new a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2089909911;
        }

        public final String toString() {
            return "CancelledMatchmakingPayload";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\"\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\u0015\u0010!R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006$"}, d2 = {"Lzzd0$b;", "Lzzd0;", "", "a", "J", "g", "()J", "roundId", "", "", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "topics", "Ldq10;", "c", "players", "d", "playerId", "", "e", "I", "()I", "hitsLeft", "", "f", "D", "i", "()D", "totalPrizePool", "roundEndSeconds", "Ljava/lang/String;", "()Ljava/lang/String;", "roomTheme", "roomConfigId", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends zzd0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("roundId")
        private final long roundId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("topics")
        private final List<String> topics;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("players")
        private final List<dq10> players;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("hitsLeft")
        private final int hitsLeft;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @SerializedName("totalPrizePool")
        private final double totalPrizePool;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @SerializedName("roundEndSeconds")
        private final int roundEndSeconds;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @SerializedName("roomTheme")
        private final String roomTheme;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @SerializedName("roomConfigId")
        private final long roomConfigId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHitsLeft() {
            return this.hitsLeft;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        public final List<dq10> c() {
            return this.players;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getRoomConfigId() {
            return this.roomConfigId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRoomTheme() {
            return this.roomTheme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.roundId == bVar.roundId && Intrinsics.g(this.topics, bVar.topics) && Intrinsics.g(this.players, bVar.players) && this.playerId == bVar.playerId && this.hitsLeft == bVar.hitsLeft && Double.compare(this.totalPrizePool, bVar.totalPrizePool) == 0 && this.roundEndSeconds == bVar.roundEndSeconds && Intrinsics.g(this.roomTheme, bVar.roomTheme) && this.roomConfigId == bVar.roomConfigId;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getRoundEndSeconds() {
            return this.roundEndSeconds;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getRoundId() {
            return this.roundId;
        }

        public final List<String> h() {
            return this.topics;
        }

        public final int hashCode() {
            return Long.hashCode(this.roomConfigId) + gmf0.a(gpp.a(this.roundEndSeconds, nrg0.a(gpp.a(this.hitsLeft, f87.a(ai50.a(ai50.a(Long.hashCode(this.roundId) * 31, 31, this.topics), 31, this.players), this.playerId, 31), 31), 31, this.totalPrizePool), 31), 31, this.roomTheme);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final double getTotalPrizePool() {
            return this.totalPrizePool;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GameplayStatusPayload(roundId=");
            sb.append(this.roundId);
            sb.append(", topics=");
            sb.append(this.topics);
            sb.append(", players=");
            sb.append(this.players);
            sb.append(", playerId=");
            sb.append(this.playerId);
            sb.append(", hitsLeft=");
            sb.append(this.hitsLeft);
            sb.append(", totalPrizePool=");
            sb.append(this.totalPrizePool);
            sb.append(", roundEndSeconds=");
            sb.append(this.roundEndSeconds);
            sb.append(", roomTheme=");
            sb.append(this.roomTheme);
            sb.append(", roomConfigId=");
            return uvh.a(sb, this.roomConfigId, ')');
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0011\u0010\u0005¨\u0006\u0015"}, d2 = {"Lzzd0$c;", "Lzzd0;", "", "a", "J", "()J", "joinKey", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "matchmakingStatus", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "matchmakingTopics", "d", "e", "roomTheme", "roomConfigId", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends zzd0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("joinKey")
        private final long joinKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("matchmakingStatus")
        private final String matchmakingStatus;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("matchmakingTopics")
        private final List<String> matchmakingTopics;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("roomTheme")
        private final String roomTheme;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("roomConfigId")
        private final long roomConfigId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getJoinKey() {
            return this.joinKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMatchmakingStatus() {
            return this.matchmakingStatus;
        }

        public final List<String> c() {
            return this.matchmakingTopics;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getRoomConfigId() {
            return this.roomConfigId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRoomTheme() {
            return this.roomTheme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.joinKey == cVar.joinKey && Intrinsics.g(this.matchmakingStatus, cVar.matchmakingStatus) && Intrinsics.g(this.matchmakingTopics, cVar.matchmakingTopics) && Intrinsics.g(this.roomTheme, cVar.roomTheme) && this.roomConfigId == cVar.roomConfigId;
        }

        public final int hashCode() {
            int iA = gmf0.a(Long.hashCode(this.joinKey) * 31, 31, this.matchmakingStatus);
            List<String> list = this.matchmakingTopics;
            return Long.hashCode(this.roomConfigId) + gmf0.a((iA + (list == null ? 0 : list.hashCode())) * 31, 31, this.roomTheme);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MatchmakingStatusPayload(joinKey=");
            sb.append(this.joinKey);
            sb.append(", matchmakingStatus=");
            sb.append(this.matchmakingStatus);
            sb.append(", matchmakingTopics=");
            sb.append(this.matchmakingTopics);
            sb.append(", roomTheme=");
            sb.append(this.roomTheme);
            sb.append(", roomConfigId=");
            return uvh.a(sb, this.roomConfigId, ')');
        }
    }

    public static final class d extends zzd0 {
        public static final d a = new d(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2090747150;
        }

        public final String toString() {
            return "PlayerLeftPayload";
        }
    }

    public static final class e extends zzd0 {
        public static final e a = new e(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1317109129;
        }

        public final String toString() {
            return "RoundEndPayload";
        }
    }

    public /* synthetic */ zzd0(int i) {
        this();
    }

    private zzd0() {
    }
}
