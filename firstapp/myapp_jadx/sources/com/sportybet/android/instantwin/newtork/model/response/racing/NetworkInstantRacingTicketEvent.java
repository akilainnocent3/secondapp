package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gfs;
import defpackage.hxa;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003Ji\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016Ê\u0001\f\b(\u0012\b\b)\u0012\u0004\b\u0003\u0010\u0002¨\u0006'"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "leagueId", "leagueUrl", "leagueName", "racers", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketRacer;", "resultSequence", "resultTrack", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagueId", "getLeagueUrl", "getLeagueName", "getRacers", "()Ljava/util/List;", "getResultSequence", "getResultTrack", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingTicketEvent {
    public static final int $stable = 0;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("leagueName")
    private final String leagueName;

    @SerializedName("leagueUrl")
    private final String leagueUrl;

    @SerializedName("racers")
    private final List<NetworkInstantRacingTicketRacer> racers;

    @SerializedName("resultSequence")
    private final String resultSequence;

    @SerializedName("resultTrack")
    private final List<String> resultTrack;

    public NetworkInstantRacingTicketEvent(String str, String str2, String str3, String str4, List<NetworkInstantRacingTicketRacer> list, String str5, List<String> list2) {
        this.eventId = str;
        this.leagueId = str2;
        this.leagueUrl = str3;
        this.leagueName = str4;
        this.racers = list;
        this.resultSequence = str5;
        this.resultTrack = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingTicketEvent copy$default(NetworkInstantRacingTicketEvent networkInstantRacingTicketEvent, String str, String str2, String str3, String str4, List list, String str5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingTicketEvent.eventId;
        }
        if ((i & 2) != 0) {
            str2 = networkInstantRacingTicketEvent.leagueId;
        }
        if ((i & 4) != 0) {
            str3 = networkInstantRacingTicketEvent.leagueUrl;
        }
        if ((i & 8) != 0) {
            str4 = networkInstantRacingTicketEvent.leagueName;
        }
        if ((i & 16) != 0) {
            list = networkInstantRacingTicketEvent.racers;
        }
        if ((i & 32) != 0) {
            str5 = networkInstantRacingTicketEvent.resultSequence;
        }
        if ((i & 64) != 0) {
            list2 = networkInstantRacingTicketEvent.resultTrack;
        }
        String str6 = str5;
        List list3 = list2;
        List list4 = list;
        String str7 = str3;
        return networkInstantRacingTicketEvent.copy(str, str2, str7, str4, list4, str6, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeagueUrl() {
        return this.leagueUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    public final List<NetworkInstantRacingTicketRacer> component5() {
        return this.racers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getResultSequence() {
        return this.resultSequence;
    }

    public final List<String> component7() {
        return this.resultTrack;
    }

    public final NetworkInstantRacingTicketEvent copy(String eventId, String leagueId, String leagueUrl, String leagueName, List<NetworkInstantRacingTicketRacer> racers, String resultSequence, List<String> resultTrack) {
        return new NetworkInstantRacingTicketEvent(eventId, leagueId, leagueUrl, leagueName, racers, resultSequence, resultTrack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingTicketEvent)) {
            return false;
        }
        NetworkInstantRacingTicketEvent networkInstantRacingTicketEvent = (NetworkInstantRacingTicketEvent) other;
        return Intrinsics.g(this.eventId, networkInstantRacingTicketEvent.eventId) && Intrinsics.g(this.leagueId, networkInstantRacingTicketEvent.leagueId) && Intrinsics.g(this.leagueUrl, networkInstantRacingTicketEvent.leagueUrl) && Intrinsics.g(this.leagueName, networkInstantRacingTicketEvent.leagueName) && Intrinsics.g(this.racers, networkInstantRacingTicketEvent.racers) && Intrinsics.g(this.resultSequence, networkInstantRacingTicketEvent.resultSequence) && Intrinsics.g(this.resultTrack, networkInstantRacingTicketEvent.resultTrack);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final String getLeagueUrl() {
        return this.leagueUrl;
    }

    public final List<NetworkInstantRacingTicketRacer> getRacers() {
        return this.racers;
    }

    public final String getResultSequence() {
        return this.resultSequence;
    }

    public final List<String> getResultTrack() {
        return this.resultTrack;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leagueId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leagueUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leagueName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<NetworkInstantRacingTicketRacer> list = this.racers;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.resultSequence;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list2 = this.resultTrack;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.leagueId;
        String str3 = this.leagueUrl;
        String str4 = this.leagueName;
        List<NetworkInstantRacingTicketRacer> list = this.racers;
        String str5 = this.resultSequence;
        List<String> list2 = this.resultTrack;
        StringBuilder sbA = ux5.a("NetworkInstantRacingTicketEvent(eventId=", str, ", leagueId=", str2, ", leagueUrl=");
        hxa.c(sbA, str3, ", leagueName=", str4, ", racers=");
        gfs.a(", resultSequence=", str5, ", resultTrack=", sbA, list);
        return ng1.a(sbA, list2, ")");
    }
}
