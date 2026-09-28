package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Llav;", "", "<init>", "()V", "a", "f", "e", "d", "b", "c", "Llav$b;", "Llav$c;", "Llav$d;", "Llav$e;", "Llav$f;", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class lav {

    public static final class a {
        public static lav a(String str, eal ealVar) {
            dq7 dq7VarA;
            Class cls;
            str.getClass();
            ealVar.getClass();
            kav kavVar = (kav) ealVar.e(str, kav.class);
            switch (kavVar.getType()) {
                case "QUEUE_TIMER":
                    cls = f.class;
                    dq7VarA = jq40.a(cls);
                    break;
                case "CANCELLED":
                    cls = b.class;
                    dq7VarA = jq40.a(cls);
                    break;
                case "ROUND_ASSIGNED":
                    cls = d.class;
                    dq7VarA = jq40.a(cls);
                    break;
                case "MATCHMAKING":
                    cls = c.class;
                    dq7VarA = jq40.a(cls);
                    break;
                case "QUEUE_STATUS":
                    cls = e.class;
                    dq7VarA = jq40.a(cls);
                    break;
                default:
                    dq7VarA = null;
                    break;
            }
            if (dq7VarA != null) {
                return (lav) ealVar.b(kavVar.getCom.twilio.voice.EventKeys.PAYLOAD java.lang.String(), tgp.b(dq7VarA));
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Llav$b;", "Llav;", "", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "", "b", "D", "()D", "refundAmount", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends lav {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("reason")
        private final String reason;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("refundAmount")
        private final double refundAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getRefundAmount() {
            return this.refundAmount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.reason, bVar.reason) && Double.compare(this.refundAmount, bVar.refundAmount) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.refundAmount) + (this.reason.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MatchmakingCancelledPayload(reason=");
            sb.append(this.reason);
            sb.append(", refundAmount=");
            return org0.a(sb, this.refundAmount, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Llav$c;", "Llav;", "", "a", "J", "c", "()J", "playerId", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "nickname", "emoji", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends lav {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("userId")
        private final long playerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("nickName")
        private final String nickname;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("emoji")
        private final String emoji;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmoji() {
            return this.emoji;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.playerId == cVar.playerId && Intrinsics.g(this.nickname, cVar.nickname) && Intrinsics.g(this.emoji, cVar.emoji);
        }

        public final int hashCode() {
            return this.emoji.hashCode() + gmf0.a(Long.hashCode(this.playerId) * 31, 31, this.nickname);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MatchmakingEmojiPayload(playerId=");
            sb.append(this.playerId);
            sb.append(", nickname=");
            sb.append(this.nickname);
            sb.append(", emoji=");
            return j26.a(sb, this.emoji, ')');
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\"\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006#"}, d2 = {"Llav$d;", "Llav;", "", "a", "J", "e", "()J", "roundId", "", "b", "Ljava/lang/String;", "getJoinKey", "()Ljava/lang/String;", "joinKey", "", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "topics", "Ldq10;", "d", "players", "playerId", "", "I", "()I", "hits", "", "g", "D", "()D", "totalPrizePool", "h", "roundEndSeconds", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends lav {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("roundId")
        private final long roundId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("joinKey")
        private final String joinKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("topics")
        private final List<String> topics;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("players")
        private final List<dq10> players;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @SerializedName("hits")
        private final int hits;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @SerializedName("totalPrizePool")
        private final double totalPrizePool;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @SerializedName("roundEndSeconds")
        private final int roundEndSeconds;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHits() {
            return this.hits;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        public final List<dq10> c() {
            return this.players;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getRoundEndSeconds() {
            return this.roundEndSeconds;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getRoundId() {
            return this.roundId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.roundId == dVar.roundId && Intrinsics.g(this.joinKey, dVar.joinKey) && Intrinsics.g(this.topics, dVar.topics) && Intrinsics.g(this.players, dVar.players) && this.playerId == dVar.playerId && this.hits == dVar.hits && Double.compare(this.totalPrizePool, dVar.totalPrizePool) == 0 && this.roundEndSeconds == dVar.roundEndSeconds;
        }

        public final List<String> f() {
            return this.topics;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final double getTotalPrizePool() {
            return this.totalPrizePool;
        }

        public final int hashCode() {
            return Integer.hashCode(this.roundEndSeconds) + nrg0.a(gpp.a(this.hits, f87.a(ai50.a(ai50.a(gmf0.a(Long.hashCode(this.roundId) * 31, 31, this.joinKey), 31, this.topics), 31, this.players), this.playerId, 31), 31), 31, this.totalPrizePool);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MatchmakingRoundAssignedPayload(roundId=");
            sb.append(this.roundId);
            sb.append(", joinKey=");
            sb.append(this.joinKey);
            sb.append(", topics=");
            sb.append(this.topics);
            sb.append(", players=");
            sb.append(this.players);
            sb.append(", playerId=");
            sb.append(this.playerId);
            sb.append(", hits=");
            sb.append(this.hits);
            sb.append(", totalPrizePool=");
            sb.append(this.totalPrizePool);
            sb.append(", roundEndSeconds=");
            return rr1.b(sb, this.roundEndSeconds, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Llav$e;", "Llav;", "", "a", "I", "()I", "currentPlayers", "b", "maxPlayers", "c", "d", "upperBound", "", "D", "()D", "prizePoolAmount", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends lav {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("currentPlayers")
        private final int currentPlayers;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("maxPlayers")
        private final int maxPlayers;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("upperBound")
        private final int upperBound;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("prizePoolAmount")
        private final double prizePoolAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCurrentPlayers() {
            return this.currentPlayers;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMaxPlayers() {
            return this.maxPlayers;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getPrizePoolAmount() {
            return this.prizePoolAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getUpperBound() {
            return this.upperBound;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.currentPlayers == eVar.currentPlayers && this.maxPlayers == eVar.maxPlayers && this.upperBound == eVar.upperBound && Double.compare(this.prizePoolAmount, eVar.prizePoolAmount) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.prizePoolAmount) + gpp.a(this.upperBound, gpp.a(this.maxPlayers, Integer.hashCode(this.currentPlayers) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MatchmakingStatusPayload(currentPlayers=");
            sb.append(this.currentPlayers);
            sb.append(", maxPlayers=");
            sb.append(this.maxPlayers);
            sb.append(", upperBound=");
            sb.append(this.upperBound);
            sb.append(", prizePoolAmount=");
            return org0.a(sb, this.prizePoolAmount, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Llav$f;", "Llav;", "", "a", "I", "b", "()I", "estimatedWaitTimeSeconds", "elapsedSeconds", "", "c", "J", "()J", "queueStartedAt", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends lav {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("estimatedWaitTimeSeconds")
        private final int estimatedWaitTimeSeconds;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("elapsedSeconds")
        private final int elapsedSeconds;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("queueStartedAt")
        private final long queueStartedAt;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getElapsedSeconds() {
            return this.elapsedSeconds;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getEstimatedWaitTimeSeconds() {
            return this.estimatedWaitTimeSeconds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getQueueStartedAt() {
            return this.queueStartedAt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.estimatedWaitTimeSeconds == fVar.estimatedWaitTimeSeconds && this.elapsedSeconds == fVar.elapsedSeconds && this.queueStartedAt == fVar.queueStartedAt;
        }

        public final int hashCode() {
            return Long.hashCode(this.queueStartedAt) + gpp.a(this.elapsedSeconds, Integer.hashCode(this.estimatedWaitTimeSeconds) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MatchmakingTimerPayload(estimatedWaitTimeSeconds=");
            sb.append(this.estimatedWaitTimeSeconds);
            sb.append(", elapsedSeconds=");
            sb.append(this.elapsedSeconds);
            sb.append(", queueStartedAt=");
            return uvh.a(sb, this.queueStartedAt, ')');
        }
    }

    private lav() {
    }
}
