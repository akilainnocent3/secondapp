package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lnpj;", "", "<init>", "()V", "a", "g", "n", "c", "e", "d", "p", "j", "o", "k", "l", "m", "i", "f", "h", "b", "Lnpj$b;", "Lnpj$c;", "Lnpj$d;", "Lnpj$e;", "Lnpj$g;", "Lnpj$h;", "Lnpj$j;", "Lnpj$k;", "Lnpj$l;", "Lnpj$m;", "Lnpj$n;", "Lnpj$o;", "Lnpj$p;", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class npj {

    public static final class a {
        public static npj a(String str, eal ealVar) {
            GenericDeclaration genericDeclaration;
            str.getClass();
            ealVar.getClass();
            v040 v040Var = (v040) ealVar.e(str, v040.class);
            if (v040Var != null) {
                xdp xdpVarA = v040Var.getCom.twilio.voice.EventKeys.PAYLOAD java.lang.String();
                switch (v040Var.getType()) {
                    case "PLAYER_LEFT":
                        genericDeclaration = h.class;
                        break;
                    case "ROUND_ENDED":
                        genericDeclaration = l.class;
                        break;
                    case "PLAYER_JOINED":
                        genericDeclaration = g.class;
                        break;
                    case "HIT":
                        genericDeclaration = c.class;
                        break;
                    case "ROUND":
                        genericDeclaration = b.class;
                        break;
                    case "ROUND_TICK":
                        genericDeclaration = p.class;
                        break;
                    case "LATE_PHASE":
                        genericDeclaration = d.class;
                        break;
                    case "ROUND_PLAYER_RESULTS":
                        genericDeclaration = m.class;
                        break;
                    case "ROUND_STARTED":
                        genericDeclaration = n.class;
                        break;
                    case "MINOR_WIN_REACHED":
                        genericDeclaration = e.class;
                        break;
                    case "ROUND_ALREADY_ENDED":
                        genericDeclaration = k.class;
                        break;
                    case "PRE_START_ROUND_TICK":
                        genericDeclaration = j.class;
                        break;
                    case "ROUND_STATUS":
                        genericDeclaration = o.class;
                        break;
                    default:
                        genericDeclaration = null;
                        break;
                }
                if (genericDeclaration != null) {
                    return (npj) ealVar.b(xdpVarA, genericDeclaration);
                }
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lnpj$b;", "Lnpj;", "", "a", "J", "b", "()J", "playerId", "", "Ljava/lang/String;", "()Ljava/lang/String;", "emoji", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("emoji")
        private final String emoji;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmoji() {
            return this.emoji;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.playerId == bVar.playerId && Intrinsics.g(this.emoji, bVar.emoji);
        }

        public final int hashCode() {
            return this.emoji.hashCode() + (Long.hashCode(this.playerId) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmojiEvent(playerId=");
            sb.append(this.playerId);
            sb.append(", emoji=");
            return j26.a(sb, this.emoji, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0005¨\u0006\u000e"}, d2 = {"Lnpj$c;", "Lnpj;", "", "a", "I", "()I", "hitsLeft", "", "b", "J", "()J", "playerId", "c", "totalHits", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("hitsLeft")
        private final int hitsLeft;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("totalHits")
        private final int totalHits;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHitsLeft() {
            return this.hitsLeft;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTotalHits() {
            return this.totalHits;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.hitsLeft == cVar.hitsLeft && this.playerId == cVar.playerId && this.totalHits == cVar.totalHits;
        }

        public final int hashCode() {
            return Integer.hashCode(this.totalHits) + f87.a(Integer.hashCode(this.hitsLeft) * 31, this.playerId, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HitEvent(hitsLeft=");
            sb.append(this.hitsLeft);
            sb.append(", playerId=");
            sb.append(this.playerId);
            sb.append(", totalHits=");
            return rr1.b(sb, this.totalHits, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lnpj$d;", "Lnpj;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", EventKeys.ERROR_MESSAGE, "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName(EventKeys.ERROR_MESSAGE)
        private final String message;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.message, ((d) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return j26.a(new StringBuilder("LatePhaseEvent(message="), this.message, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lnpj$e;", "Lnpj;", "", "a", "J", "b", "()J", "winnerPlayerId", "", "D", "()D", "rewardAmount", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("winnerPlayerId")
        private final long winnerPlayerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("rewardAmount")
        private final double rewardAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getRewardAmount() {
            return this.rewardAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getWinnerPlayerId() {
            return this.winnerPlayerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.winnerPlayerId == eVar.winnerPlayerId && Double.compare(this.rewardAmount, eVar.rewardAmount) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.rewardAmount) + (Long.hashCode(this.winnerPlayerId) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MinorWinReachedEvent(winnerPlayerId=");
            sb.append(this.winnerPlayerId);
            sb.append(", rewardAmount=");
            return org0.a(sb, this.rewardAmount, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lnpj$f;", "", "", "a", "J", "b", "()J", "playerId", "", "I", "()I", "leftHits", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("leftHits")
        private final int leftHits;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getLeftHits() {
            return this.leftHits;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.playerId == fVar.playerId && this.leftHits == fVar.leftHits;
        }

        public final int hashCode() {
            return Integer.hashCode(this.leftHits) + (Long.hashCode(this.playerId) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerHits(playerId=");
            sb.append(this.playerId);
            sb.append(", leftHits=");
            return rr1.b(sb, this.leftHits, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lnpj$g;", "Lnpj;", "", "a", "J", "b", "()J", "playerId", "", "I", "()I", "activePlayers", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("activePlayers")
        private final int activePlayers;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getActivePlayers() {
            return this.activePlayers;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.playerId == gVar.playerId && this.activePlayers == gVar.activePlayers;
        }

        public final int hashCode() {
            return Integer.hashCode(this.activePlayers) + (Long.hashCode(this.playerId) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerJoinedEvent(playerId=");
            sb.append(this.playerId);
            sb.append(", activePlayers=");
            return rr1.b(sb, this.activePlayers, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lnpj$h;", "Lnpj;", "", "a", "J", "getPlayerId", "()J", "playerId", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.playerId == ((h) obj).playerId;
        }

        public final int hashCode() {
            return Long.hashCode(this.playerId);
        }

        public final String toString() {
            return uvh.a(new StringBuilder("PlayerLeftEvent(playerId="), this.playerId, ')');
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lnpj$i;", "", "", "a", "J", "b", "()J", "playerId", "", "D", "()D", "paymentAmount", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "type", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("paymentAmount")
        private final double paymentAmount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("rewardType")
        private final String type;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getPaymentAmount() {
            return this.paymentAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.playerId == iVar.playerId && Double.compare(this.paymentAmount, iVar.paymentAmount) == 0 && Intrinsics.g(this.type, iVar.type);
        }

        public final int hashCode() {
            return this.type.hashCode() + nrg0.a(Long.hashCode(this.playerId) * 31, 31, this.paymentAmount);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerReward(playerId=");
            sb.append(this.playerId);
            sb.append(", paymentAmount=");
            sb.append(this.paymentAmount);
            sb.append(", type=");
            return j26.a(sb, this.type, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lnpj$j;", "Lnpj;", "", "a", "I", "()I", "secondsLeft", "b", "getEstimatedRoundSeconds", "estimatedRoundSeconds", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("secondsLeft")
        private final int secondsLeft;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("estimatedRoundSeconds")
        private final int estimatedRoundSeconds;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getSecondsLeft() {
            return this.secondsLeft;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.secondsLeft == jVar.secondsLeft && this.estimatedRoundSeconds == jVar.estimatedRoundSeconds;
        }

        public final int hashCode() {
            return Integer.hashCode(this.estimatedRoundSeconds) + (Integer.hashCode(this.secondsLeft) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreStartRoundTickEvent(secondsLeft=");
            sb.append(this.secondsLeft);
            sb.append(", estimatedRoundSeconds=");
            return rr1.b(sb, this.estimatedRoundSeconds, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Lnpj$k;", "Lnpj;", "", "a", "J", "d", "()J", "playerId", "b", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "winnerId", "", "c", "D", "()D", "majorAmount", "minorAmount", "goldenRainAmount", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("winnerId")
        private final Long winnerId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("majorAmount")
        private final double majorAmount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("minorAmount")
        private final double minorAmount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("goldenRainAmount")
        private final double goldenRainAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getGoldenRainAmount() {
            return this.goldenRainAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getMajorAmount() {
            return this.majorAmount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getMinorAmount() {
            return this.minorAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getWinnerId() {
            return this.winnerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.playerId == kVar.playerId && Intrinsics.g(this.winnerId, kVar.winnerId) && Double.compare(this.majorAmount, kVar.majorAmount) == 0 && Double.compare(this.minorAmount, kVar.minorAmount) == 0 && Double.compare(this.goldenRainAmount, kVar.goldenRainAmount) == 0;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.playerId) * 31;
            Long l = this.winnerId;
            return Double.hashCode(this.goldenRainAmount) + nrg0.a(nrg0.a((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.majorAmount), 31, this.minorAmount);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoundAlreadyEndedEvent(playerId=");
            sb.append(this.playerId);
            sb.append(", winnerId=");
            sb.append(this.winnerId);
            sb.append(", majorAmount=");
            sb.append(this.majorAmount);
            sb.append(", minorAmount=");
            sb.append(this.minorAmount);
            sb.append(", goldenRainAmount=");
            return org0.a(sb, this.goldenRainAmount, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lnpj$l;", "Lnpj;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "reason", "", "Lnpj$i;", "Ljava/util/List;", "()Ljava/util/List;", "playerRewards", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("reason")
        private final String reason;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("playerRewards")
        private final List<i> playerRewards;

        public final List<i> a() {
            return this.playerRewards;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.g(this.reason, lVar.reason) && Intrinsics.g(this.playerRewards, lVar.playerRewards);
        }

        public final int hashCode() {
            return this.playerRewards.hashCode() + (this.reason.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoundEndedEvent(reason=");
            sb.append(this.reason);
            sb.append(", playerRewards=");
            return o8i.a(sb, this.playerRewards, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Lnpj$m;", "Lnpj;", "", "a", "J", "d", "()J", "playerId", "b", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "winnerId", "", "c", "D", "()D", "majorAmount", "minorAmount", "goldenRainAmount", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("playerId")
        private final long playerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("winnerId")
        private final Long winnerId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("majorAmount")
        private final double majorAmount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("minorAmount")
        private final double minorAmount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("goldenRainAmount")
        private final double goldenRainAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getGoldenRainAmount() {
            return this.goldenRainAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getMajorAmount() {
            return this.majorAmount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getMinorAmount() {
            return this.minorAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getPlayerId() {
            return this.playerId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getWinnerId() {
            return this.winnerId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.playerId == mVar.playerId && Intrinsics.g(this.winnerId, mVar.winnerId) && Double.compare(this.majorAmount, mVar.majorAmount) == 0 && Double.compare(this.minorAmount, mVar.minorAmount) == 0 && Double.compare(this.goldenRainAmount, mVar.goldenRainAmount) == 0;
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.playerId) * 31;
            Long l = this.winnerId;
            return Double.hashCode(this.goldenRainAmount) + nrg0.a(nrg0.a((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.majorAmount), 31, this.minorAmount);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoundPlayerResultsEvent(playerId=");
            sb.append(this.playerId);
            sb.append(", winnerId=");
            sb.append(this.winnerId);
            sb.append(", majorAmount=");
            sb.append(this.majorAmount);
            sb.append(", minorAmount=");
            sb.append(this.minorAmount);
            sb.append(", goldenRainAmount=");
            return org0.a(sb, this.goldenRainAmount, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lnpj$n;", "Lnpj;", "", "a", "Ljava/lang/String;", "getStartedAt", "()Ljava/lang/String;", "startedAt", "", "b", "D", "()D", "prizePoolAmount", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("startedAt")
        private final String startedAt;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("prizePoolAmount")
        private final double prizePoolAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getPrizePoolAmount() {
            return this.prizePoolAmount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.g(this.startedAt, nVar.startedAt) && Double.compare(this.prizePoolAmount, nVar.prizePoolAmount) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.prizePoolAmount) + (this.startedAt.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoundStartedEvent(startedAt=");
            sb.append(this.startedAt);
            sb.append(", prizePoolAmount=");
            return org0.a(sb, this.prizePoolAmount, ')');
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lnpj$o;", "Lnpj;", "", "a", "I", "c", "()I", "totalHits", "", "Lnpj$f;", "b", "Ljava/util/List;", "()Ljava/util/List;", "playersLeftHits", "", "Ljava/lang/String;", "()Ljava/lang/String;", AnalyticsParam.EVENT_STATUS, "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class o extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("totalHits")
        private final int totalHits;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("playersLeftHits")
        private final List<f> playersLeftHits;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName(AnalyticsParam.EVENT_STATUS)
        private final String status;

        public final List<f> a() {
            return this.playersLeftHits;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTotalHits() {
            return this.totalHits;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.totalHits == oVar.totalHits && Intrinsics.g(this.playersLeftHits, oVar.playersLeftHits) && Intrinsics.g(this.status, oVar.status);
        }

        public final int hashCode() {
            return this.status.hashCode() + ai50.a(Integer.hashCode(this.totalHits) * 31, 31, this.playersLeftHits);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoundStatusEvent(totalHits=");
            sb.append(this.totalHits);
            sb.append(", playersLeftHits=");
            sb.append(this.playersLeftHits);
            sb.append(", status=");
            return j26.a(sb, this.status, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lnpj$p;", "Lnpj;", "", "a", "I", "()I", "secondsLeft", "b", "getEstimatedRoundSeconds", "estimatedRoundSeconds", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class p extends npj {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("secondsLeft")
        private final int secondsLeft;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("estimatedRoundSeconds")
        private final int estimatedRoundSeconds;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getSecondsLeft() {
            return this.secondsLeft;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.secondsLeft == pVar.secondsLeft && this.estimatedRoundSeconds == pVar.estimatedRoundSeconds;
        }

        public final int hashCode() {
            return Integer.hashCode(this.estimatedRoundSeconds) + (Integer.hashCode(this.secondsLeft) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoundTickEvent(secondsLeft=");
            sb.append(this.secondsLeft);
            sb.append(", estimatedRoundSeconds=");
            return rr1.b(sb, this.estimatedRoundSeconds, ')');
        }
    }

    private npj() {
    }
}
