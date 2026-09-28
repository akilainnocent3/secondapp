package com.sportybet.android.instantwin.newtork.model.request;

import com.google.gson.annotations.SerializedName;
import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/SportyLegendsPrepareRoundRequest;", "", "homeTeamId", "", "homeTeamLeagueId", "awayTeamId", "awayTeamLeagueId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHomeTeamId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHomeTeamLeagueId", "getAwayTeamId", "getAwayTeamLeagueId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyLegendsPrepareRoundRequest {
    public static final int $stable = 0;

    @SerializedName("awayTeamId")
    private final String awayTeamId;

    @SerializedName("awayTeamLeagueId")
    private final String awayTeamLeagueId;

    @SerializedName("homeTeamId")
    private final String homeTeamId;

    @SerializedName("homeTeamLeagueId")
    private final String homeTeamLeagueId;

    public SportyLegendsPrepareRoundRequest(String str, String str2, String str3, String str4) {
        this.homeTeamId = str;
        this.homeTeamLeagueId = str2;
        this.awayTeamId = str3;
        this.awayTeamLeagueId = str4;
    }

    public static /* synthetic */ SportyLegendsPrepareRoundRequest copy$default(SportyLegendsPrepareRoundRequest sportyLegendsPrepareRoundRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportyLegendsPrepareRoundRequest.homeTeamId;
        }
        if ((i & 2) != 0) {
            str2 = sportyLegendsPrepareRoundRequest.homeTeamLeagueId;
        }
        if ((i & 4) != 0) {
            str3 = sportyLegendsPrepareRoundRequest.awayTeamId;
        }
        if ((i & 8) != 0) {
            str4 = sportyLegendsPrepareRoundRequest.awayTeamLeagueId;
        }
        return sportyLegendsPrepareRoundRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHomeTeamLeagueId() {
        return this.homeTeamLeagueId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAwayTeamLeagueId() {
        return this.awayTeamLeagueId;
    }

    public final SportyLegendsPrepareRoundRequest copy(String homeTeamId, String homeTeamLeagueId, String awayTeamId, String awayTeamLeagueId) {
        return new SportyLegendsPrepareRoundRequest(homeTeamId, homeTeamLeagueId, awayTeamId, awayTeamLeagueId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportyLegendsPrepareRoundRequest)) {
            return false;
        }
        SportyLegendsPrepareRoundRequest sportyLegendsPrepareRoundRequest = (SportyLegendsPrepareRoundRequest) other;
        return Intrinsics.g(this.homeTeamId, sportyLegendsPrepareRoundRequest.homeTeamId) && Intrinsics.g(this.homeTeamLeagueId, sportyLegendsPrepareRoundRequest.homeTeamLeagueId) && Intrinsics.g(this.awayTeamId, sportyLegendsPrepareRoundRequest.awayTeamId) && Intrinsics.g(this.awayTeamLeagueId, sportyLegendsPrepareRoundRequest.awayTeamLeagueId);
    }

    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    public final String getAwayTeamLeagueId() {
        return this.awayTeamLeagueId;
    }

    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    public final String getHomeTeamLeagueId() {
        return this.homeTeamLeagueId;
    }

    public int hashCode() {
        String str = this.homeTeamId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeTeamLeagueId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awayTeamId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.awayTeamLeagueId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.homeTeamId;
        String str2 = this.homeTeamLeagueId;
        return kwi.a(ux5.a("SportyLegendsPrepareRoundRequest(homeTeamId=", str, ", homeTeamLeagueId=", str2, ", awayTeamId="), this.awayTeamId, ", awayTeamLeagueId=", this.awayTeamLeagueId, ")");
    }
}
