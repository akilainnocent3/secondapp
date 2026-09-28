package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0003\u0005R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lnof;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", AnalyticsParam.EVENT_PARAM_ID, "", "Lnof$a;", "Ljava/util/List;", "()Ljava/util/List;", "bets", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class nof {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("bets")
    private final List<a> bets;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnof$a;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", AnalyticsParam.EVENT_PARAM_ID, "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "createTime", "c", "originStake", "d", "potentialWinnings", "", "Lnof$b;", "e", "Ljava/util/List;", "()Ljava/util/List;", "selections", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("createTime")
        private final Long createTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("originStake")
        private final String originStake;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("potentialWinnings")
        private final String potentialWinnings;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("selections")
        private final List<b> selections;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getCreateTime() {
            return this.createTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getOriginStake() {
            return this.originStake;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPotentialWinnings() {
            return this.potentialWinnings;
        }

        public final List<b> e() {
            return this.selections;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.id, aVar.id) && Intrinsics.g(this.createTime, aVar.createTime) && Intrinsics.g(this.originStake, aVar.originStake) && Intrinsics.g(this.potentialWinnings, aVar.potentialWinnings) && Intrinsics.g(this.selections, aVar.selections);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.createTime;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.originStake;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.potentialWinnings;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<b> list = this.selections;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            String str = this.id;
            Long l = this.createTime;
            String str2 = this.originStake;
            String str3 = this.potentialWinnings;
            List<b> list = this.selections;
            StringBuilder sb = new StringBuilder("Bet(id=");
            sb.append(str);
            sb.append(", createTime=");
            sb.append(l);
            sb.append(", originStake=");
            hxa.c(sb, str2, ", potentialWinnings=", str3, ", selections=");
            return ng1.a(sb, list, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0017"}, d2 = {"Lnof$b;", "", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", AnalyticsParam.EVENT_PARAM_ID, "b", "h", "sportId", "c", "g", "outcomeDesc", "f", "odds", "e", "marketDesc", "home", "away", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "i", "tournamentName", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("sportId")
        private final String sportId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("outcomeDesc")
        private final String outcomeDesc;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("odds")
        private final String odds;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @SerializedName("marketDesc")
        private final String marketDesc;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @SerializedName("home")
        private final String home;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @SerializedName("away")
        private final String away;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
        private final String eventId;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @SerializedName("tournamentName")
        private final String tournamentName;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAway() {
            return this.away;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getHome() {
            return this.home;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMarketDesc() {
            return this.marketDesc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.id, bVar.id) && Intrinsics.g(this.sportId, bVar.sportId) && Intrinsics.g(this.outcomeDesc, bVar.outcomeDesc) && Intrinsics.g(this.odds, bVar.odds) && Intrinsics.g(this.marketDesc, bVar.marketDesc) && Intrinsics.g(this.home, bVar.home) && Intrinsics.g(this.away, bVar.away) && Intrinsics.g(this.eventId, bVar.eventId) && Intrinsics.g(this.tournamentName, bVar.tournamentName);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getOdds() {
            return this.odds;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getOutcomeDesc() {
            return this.outcomeDesc;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSportId() {
            return this.sportId;
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sportId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.outcomeDesc;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.odds;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.marketDesc;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.home;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.away;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.eventId;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.tournamentName;
            return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTournamentName() {
            return this.tournamentName;
        }

        public final String toString() {
            String str = this.id;
            String str2 = this.sportId;
            String str3 = this.outcomeDesc;
            String str4 = this.odds;
            String str5 = this.marketDesc;
            String str6 = this.home;
            String str7 = this.away;
            String str8 = this.eventId;
            String str9 = this.tournamentName;
            StringBuilder sbA = ux5.a("Selection(id=", str, ", sportId=", str2, ", outcomeDesc=");
            hxa.c(sbA, str3, ", odds=", str4, ", marketDesc=");
            hxa.c(sbA, str5, ", home=", str6, ", away=");
            hxa.c(sbA, str7, ", eventId=", str8, ", tournamentName=");
            return uf80.a(sbA, str9, ")");
        }
    }

    public final List<a> a() {
        return this.bets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nof)) {
            return false;
        }
        nof nofVar = (nof) obj;
        return Intrinsics.g(this.id, nofVar.id) && Intrinsics.g(this.bets, nofVar.bets);
    }

    public final int hashCode() {
        return this.bets.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        return nf.b("EditHistory(id=", this.id, ", bets=", ")", this.bets);
    }
}
