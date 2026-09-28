package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.b7f;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003Je\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\nHÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018Ê\u0001\f\b)\u0012\b\b*\u0012\u0004\b\u0003\u0010\u0002¨\u0006("}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsMatchRecord;", "", "homeTeamId", "", "homeTeamName", "homeTeamLogoUrl", "awayTeamId", "awayTeamName", "awayTeamLogoUrl", "homeScore", "", "awayScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getHomeTeamId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHomeTeamName", "getHomeTeamLogoUrl", "getAwayTeamId", "getAwayTeamName", "getAwayTeamLogoUrl", "getHomeScore", "()I", "getAwayScore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballHeadToHeadStatsMatchRecord {
    public static final int $stable = 0;

    @SerializedName("awayScore")
    private final int awayScore;

    @SerializedName("awayTeamId")
    private final String awayTeamId;

    @SerializedName("awayTeamLogoUrl")
    private final String awayTeamLogoUrl;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("homeScore")
    private final int homeScore;

    @SerializedName("homeTeamId")
    private final String homeTeamId;

    @SerializedName("homeTeamLogoUrl")
    private final String homeTeamLogoUrl;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    public NetworkScheduledFootballHeadToHeadStatsMatchRecord(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        this.homeTeamId = str;
        this.homeTeamName = str2;
        this.homeTeamLogoUrl = str3;
        this.awayTeamId = str4;
        this.awayTeamName = str5;
        this.awayTeamLogoUrl = str6;
        this.homeScore = i;
        this.awayScore = i2;
    }

    public static /* synthetic */ NetworkScheduledFootballHeadToHeadStatsMatchRecord copy$default(NetworkScheduledFootballHeadToHeadStatsMatchRecord networkScheduledFootballHeadToHeadStatsMatchRecord, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = networkScheduledFootballHeadToHeadStatsMatchRecord.homeTeamId;
        }
        if ((i3 & 2) != 0) {
            str2 = networkScheduledFootballHeadToHeadStatsMatchRecord.homeTeamName;
        }
        if ((i3 & 4) != 0) {
            str3 = networkScheduledFootballHeadToHeadStatsMatchRecord.homeTeamLogoUrl;
        }
        if ((i3 & 8) != 0) {
            str4 = networkScheduledFootballHeadToHeadStatsMatchRecord.awayTeamId;
        }
        if ((i3 & 16) != 0) {
            str5 = networkScheduledFootballHeadToHeadStatsMatchRecord.awayTeamName;
        }
        if ((i3 & 32) != 0) {
            str6 = networkScheduledFootballHeadToHeadStatsMatchRecord.awayTeamLogoUrl;
        }
        if ((i3 & 64) != 0) {
            i = networkScheduledFootballHeadToHeadStatsMatchRecord.homeScore;
        }
        if ((i3 & 128) != 0) {
            i2 = networkScheduledFootballHeadToHeadStatsMatchRecord.awayScore;
        }
        int i4 = i;
        int i5 = i2;
        String str7 = str5;
        String str8 = str6;
        return networkScheduledFootballHeadToHeadStatsMatchRecord.copy(str, str2, str3, str4, str7, str8, i4, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHomeTeamId() {
        return this.homeTeamId;
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
    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAwayTeamLogoUrl() {
        return this.awayTeamLogoUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHomeScore() {
        return this.homeScore;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getAwayScore() {
        return this.awayScore;
    }

    public final NetworkScheduledFootballHeadToHeadStatsMatchRecord copy(String homeTeamId, String homeTeamName, String homeTeamLogoUrl, String awayTeamId, String awayTeamName, String awayTeamLogoUrl, int homeScore, int awayScore) {
        return new NetworkScheduledFootballHeadToHeadStatsMatchRecord(homeTeamId, homeTeamName, homeTeamLogoUrl, awayTeamId, awayTeamName, awayTeamLogoUrl, homeScore, awayScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballHeadToHeadStatsMatchRecord)) {
            return false;
        }
        NetworkScheduledFootballHeadToHeadStatsMatchRecord networkScheduledFootballHeadToHeadStatsMatchRecord = (NetworkScheduledFootballHeadToHeadStatsMatchRecord) other;
        return Intrinsics.g(this.homeTeamId, networkScheduledFootballHeadToHeadStatsMatchRecord.homeTeamId) && Intrinsics.g(this.homeTeamName, networkScheduledFootballHeadToHeadStatsMatchRecord.homeTeamName) && Intrinsics.g(this.homeTeamLogoUrl, networkScheduledFootballHeadToHeadStatsMatchRecord.homeTeamLogoUrl) && Intrinsics.g(this.awayTeamId, networkScheduledFootballHeadToHeadStatsMatchRecord.awayTeamId) && Intrinsics.g(this.awayTeamName, networkScheduledFootballHeadToHeadStatsMatchRecord.awayTeamName) && Intrinsics.g(this.awayTeamLogoUrl, networkScheduledFootballHeadToHeadStatsMatchRecord.awayTeamLogoUrl) && this.homeScore == networkScheduledFootballHeadToHeadStatsMatchRecord.homeScore && this.awayScore == networkScheduledFootballHeadToHeadStatsMatchRecord.awayScore;
    }

    public final int getAwayScore() {
        return this.awayScore;
    }

    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    public final String getAwayTeamLogoUrl() {
        return this.awayTeamLogoUrl;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final int getHomeScore() {
        return this.homeScore;
    }

    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    public final String getHomeTeamLogoUrl() {
        return this.homeTeamLogoUrl;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public int hashCode() {
        String str = this.homeTeamId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeTeamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeTeamLogoUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.awayTeamId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awayTeamName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awayTeamLogoUrl;
        return Integer.hashCode(this.awayScore) + gpp.a(this.homeScore, (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.homeTeamId;
        String str2 = this.homeTeamName;
        String str3 = this.homeTeamLogoUrl;
        String str4 = this.awayTeamId;
        String str5 = this.awayTeamName;
        String str6 = this.awayTeamLogoUrl;
        int i = this.homeScore;
        int i2 = this.awayScore;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballHeadToHeadStatsMatchRecord(homeTeamId=", str, ", homeTeamName=", str2, ", homeTeamLogoUrl=");
        hxa.c(sbA, str3, ", awayTeamId=", str4, ", awayTeamName=");
        hxa.c(sbA, str5, ", awayTeamLogoUrl=", str6, ", homeScore=");
        return b7f.a(sbA, i, ", awayScore=", i2, ")");
    }
}
