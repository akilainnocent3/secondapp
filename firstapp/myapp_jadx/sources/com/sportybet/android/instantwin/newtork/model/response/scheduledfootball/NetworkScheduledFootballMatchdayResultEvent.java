package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rÊ\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0002¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMatchdayResultEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "homeTeamName", "homeTeamLogoUrl", "awayTeamName", "awayTeamLogoUrl", "ftScore", "htScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHomeTeamName", "getHomeTeamLogoUrl", "getAwayTeamName", "getAwayTeamLogoUrl", "getFtScore", "getHtScore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballMatchdayResultEvent {
    public static final int $stable = 0;

    @SerializedName("awayTeamLogoUrl")
    private final String awayTeamLogoUrl;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("ftScore")
    private final String ftScore;

    @SerializedName("homeTeamLogoUrl")
    private final String homeTeamLogoUrl;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    @SerializedName("htScore")
    private final String htScore;

    public NetworkScheduledFootballMatchdayResultEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.eventId = str;
        this.homeTeamName = str2;
        this.homeTeamLogoUrl = str3;
        this.awayTeamName = str4;
        this.awayTeamLogoUrl = str5;
        this.ftScore = str6;
        this.htScore = str7;
    }

    public static /* synthetic */ NetworkScheduledFootballMatchdayResultEvent copy$default(NetworkScheduledFootballMatchdayResultEvent networkScheduledFootballMatchdayResultEvent, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkScheduledFootballMatchdayResultEvent.eventId;
        }
        if ((i & 2) != 0) {
            str2 = networkScheduledFootballMatchdayResultEvent.homeTeamName;
        }
        if ((i & 4) != 0) {
            str3 = networkScheduledFootballMatchdayResultEvent.homeTeamLogoUrl;
        }
        if ((i & 8) != 0) {
            str4 = networkScheduledFootballMatchdayResultEvent.awayTeamName;
        }
        if ((i & 16) != 0) {
            str5 = networkScheduledFootballMatchdayResultEvent.awayTeamLogoUrl;
        }
        if ((i & 32) != 0) {
            str6 = networkScheduledFootballMatchdayResultEvent.ftScore;
        }
        if ((i & 64) != 0) {
            str7 = networkScheduledFootballMatchdayResultEvent.htScore;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return networkScheduledFootballMatchdayResultEvent.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHomeTeamLogoUrl() {
        return this.homeTeamLogoUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAwayTeamLogoUrl() {
        return this.awayTeamLogoUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFtScore() {
        return this.ftScore;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHtScore() {
        return this.htScore;
    }

    public final NetworkScheduledFootballMatchdayResultEvent copy(String eventId, String homeTeamName, String homeTeamLogoUrl, String awayTeamName, String awayTeamLogoUrl, String ftScore, String htScore) {
        return new NetworkScheduledFootballMatchdayResultEvent(eventId, homeTeamName, homeTeamLogoUrl, awayTeamName, awayTeamLogoUrl, ftScore, htScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballMatchdayResultEvent)) {
            return false;
        }
        NetworkScheduledFootballMatchdayResultEvent networkScheduledFootballMatchdayResultEvent = (NetworkScheduledFootballMatchdayResultEvent) other;
        return Intrinsics.g(this.eventId, networkScheduledFootballMatchdayResultEvent.eventId) && Intrinsics.g(this.homeTeamName, networkScheduledFootballMatchdayResultEvent.homeTeamName) && Intrinsics.g(this.homeTeamLogoUrl, networkScheduledFootballMatchdayResultEvent.homeTeamLogoUrl) && Intrinsics.g(this.awayTeamName, networkScheduledFootballMatchdayResultEvent.awayTeamName) && Intrinsics.g(this.awayTeamLogoUrl, networkScheduledFootballMatchdayResultEvent.awayTeamLogoUrl) && Intrinsics.g(this.ftScore, networkScheduledFootballMatchdayResultEvent.ftScore) && Intrinsics.g(this.htScore, networkScheduledFootballMatchdayResultEvent.htScore);
    }

    public final String getAwayTeamLogoUrl() {
        return this.awayTeamLogoUrl;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getFtScore() {
        return this.ftScore;
    }

    public final String getHomeTeamLogoUrl() {
        return this.homeTeamLogoUrl;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getHtScore() {
        return this.htScore;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeTeamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeTeamLogoUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.awayTeamName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awayTeamLogoUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ftScore;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.htScore;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.homeTeamName;
        String str3 = this.homeTeamLogoUrl;
        String str4 = this.awayTeamName;
        String str5 = this.awayTeamLogoUrl;
        String str6 = this.ftScore;
        String str7 = this.htScore;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballMatchdayResultEvent(eventId=", str, ", homeTeamName=", str2, ", homeTeamLogoUrl=");
        hxa.c(sbA, str3, ", awayTeamName=", str4, ", awayTeamLogoUrl=");
        hxa.c(sbA, str5, ", ftScore=", str6, ", htScore=");
        return uf80.a(sbA, str7, ")");
    }
}
