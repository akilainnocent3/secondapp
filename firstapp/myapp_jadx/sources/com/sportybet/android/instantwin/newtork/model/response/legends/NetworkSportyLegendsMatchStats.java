package com.sportybet.android.instantwin.newtork.model.response.legends;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\bHÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR)\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R)\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0002¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsMatchStats;", "", "homeTeamId", "", "homeTeamName", "awayTeamId", "awayTeamName", "homeScore", "", "awayScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHomeTeamId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHomeTeamName", "getAwayTeamId", "getAwayTeamName", "getHomeScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAwayScore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sportybet/android/instantwin/newtork/model/response/legends/NetworkSportyLegendsMatchStats;", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyLegendsMatchStats {
    public static final int $stable = 0;

    @SerializedName("awayScore")
    private final Integer awayScore;

    @SerializedName("awayTeamId")
    private final String awayTeamId;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("homeScore")
    private final Integer homeScore;

    @SerializedName("homeTeamId")
    private final String homeTeamId;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    public NetworkSportyLegendsMatchStats(String str, String str2, String str3, String str4, Integer num, Integer num2) {
        this.homeTeamId = str;
        this.homeTeamName = str2;
        this.awayTeamId = str3;
        this.awayTeamName = str4;
        this.homeScore = num;
        this.awayScore = num2;
    }

    public static /* synthetic */ NetworkSportyLegendsMatchStats copy$default(NetworkSportyLegendsMatchStats networkSportyLegendsMatchStats, String str, String str2, String str3, String str4, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSportyLegendsMatchStats.homeTeamId;
        }
        if ((i & 2) != 0) {
            str2 = networkSportyLegendsMatchStats.homeTeamName;
        }
        if ((i & 4) != 0) {
            str3 = networkSportyLegendsMatchStats.awayTeamId;
        }
        if ((i & 8) != 0) {
            str4 = networkSportyLegendsMatchStats.awayTeamName;
        }
        if ((i & 16) != 0) {
            num = networkSportyLegendsMatchStats.homeScore;
        }
        if ((i & 32) != 0) {
            num2 = networkSportyLegendsMatchStats.awayScore;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return networkSportyLegendsMatchStats.copy(str, str2, str3, str4, num3, num4);
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
    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getHomeScore() {
        return this.homeScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getAwayScore() {
        return this.awayScore;
    }

    public final NetworkSportyLegendsMatchStats copy(String homeTeamId, String homeTeamName, String awayTeamId, String awayTeamName, Integer homeScore, Integer awayScore) {
        return new NetworkSportyLegendsMatchStats(homeTeamId, homeTeamName, awayTeamId, awayTeamName, homeScore, awayScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyLegendsMatchStats)) {
            return false;
        }
        NetworkSportyLegendsMatchStats networkSportyLegendsMatchStats = (NetworkSportyLegendsMatchStats) other;
        return Intrinsics.g(this.homeTeamId, networkSportyLegendsMatchStats.homeTeamId) && Intrinsics.g(this.homeTeamName, networkSportyLegendsMatchStats.homeTeamName) && Intrinsics.g(this.awayTeamId, networkSportyLegendsMatchStats.awayTeamId) && Intrinsics.g(this.awayTeamName, networkSportyLegendsMatchStats.awayTeamName) && Intrinsics.g(this.homeScore, networkSportyLegendsMatchStats.homeScore) && Intrinsics.g(this.awayScore, networkSportyLegendsMatchStats.awayScore);
    }

    public final Integer getAwayScore() {
        return this.awayScore;
    }

    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final Integer getHomeScore() {
        return this.homeScore;
    }

    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public int hashCode() {
        String str = this.homeTeamId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeTeamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awayTeamId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.awayTeamName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.homeScore;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.awayScore;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.homeTeamId;
        String str2 = this.homeTeamName;
        String str3 = this.awayTeamId;
        String str4 = this.awayTeamName;
        Integer num = this.homeScore;
        Integer num2 = this.awayScore;
        StringBuilder sbA = ux5.a("NetworkSportyLegendsMatchStats(homeTeamId=", str, ", homeTeamName=", str2, ", awayTeamId=");
        hxa.c(sbA, str3, ", awayTeamName=", str4, ", homeScore=");
        sbA.append(num);
        sbA.append(", awayScore=");
        sbA.append(num2);
        sbA.append(")");
        return sbA.toString();
    }
}
