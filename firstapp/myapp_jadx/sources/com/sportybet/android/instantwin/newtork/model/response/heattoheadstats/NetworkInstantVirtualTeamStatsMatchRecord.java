package com.sportybet.android.instantwin.newtork.model.response.heattoheadstats;

import defpackage.b7f;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006 "}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsMatchRecord;", "", "homeTeamId", "", "homeTeamName", "awayTeamId", "awayTeamName", "homeScore", "", "awayScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getHomeTeamId", "()Ljava/lang/String;", "getHomeTeamName", "getAwayTeamId", "getAwayTeamName", "getHomeScore", "()I", "getAwayScore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantVirtualTeamStatsMatchRecord {
    public static final int $stable = 0;
    private final int awayScore;
    private final String awayTeamId;
    private final String awayTeamName;
    private final int homeScore;
    private final String homeTeamId;
    private final String homeTeamName;

    public /* synthetic */ NetworkInstantVirtualTeamStatsMatchRecord(String str, String str2, String str3, String str4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
    }

    public static /* synthetic */ NetworkInstantVirtualTeamStatsMatchRecord copy$default(NetworkInstantVirtualTeamStatsMatchRecord networkInstantVirtualTeamStatsMatchRecord, String str, String str2, String str3, String str4, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = networkInstantVirtualTeamStatsMatchRecord.homeTeamId;
        }
        if ((i3 & 2) != 0) {
            str2 = networkInstantVirtualTeamStatsMatchRecord.homeTeamName;
        }
        if ((i3 & 4) != 0) {
            str3 = networkInstantVirtualTeamStatsMatchRecord.awayTeamId;
        }
        if ((i3 & 8) != 0) {
            str4 = networkInstantVirtualTeamStatsMatchRecord.awayTeamName;
        }
        if ((i3 & 16) != 0) {
            i = networkInstantVirtualTeamStatsMatchRecord.homeScore;
        }
        if ((i3 & 32) != 0) {
            i2 = networkInstantVirtualTeamStatsMatchRecord.awayScore;
        }
        int i4 = i;
        int i5 = i2;
        return networkInstantVirtualTeamStatsMatchRecord.copy(str, str2, str3, str4, i4, i5);
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
    public final int getHomeScore() {
        return this.homeScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAwayScore() {
        return this.awayScore;
    }

    public final NetworkInstantVirtualTeamStatsMatchRecord copy(String homeTeamId, String homeTeamName, String awayTeamId, String awayTeamName, int homeScore, int awayScore) {
        return new NetworkInstantVirtualTeamStatsMatchRecord(homeTeamId, homeTeamName, awayTeamId, awayTeamName, homeScore, awayScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantVirtualTeamStatsMatchRecord)) {
            return false;
        }
        NetworkInstantVirtualTeamStatsMatchRecord networkInstantVirtualTeamStatsMatchRecord = (NetworkInstantVirtualTeamStatsMatchRecord) other;
        return Intrinsics.g(this.homeTeamId, networkInstantVirtualTeamStatsMatchRecord.homeTeamId) && Intrinsics.g(this.homeTeamName, networkInstantVirtualTeamStatsMatchRecord.homeTeamName) && Intrinsics.g(this.awayTeamId, networkInstantVirtualTeamStatsMatchRecord.awayTeamId) && Intrinsics.g(this.awayTeamName, networkInstantVirtualTeamStatsMatchRecord.awayTeamName) && this.homeScore == networkInstantVirtualTeamStatsMatchRecord.homeScore && this.awayScore == networkInstantVirtualTeamStatsMatchRecord.awayScore;
    }

    public final int getAwayScore() {
        return this.awayScore;
    }

    public final String getAwayTeamId() {
        return this.awayTeamId;
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
        return Integer.hashCode(this.awayScore) + gpp.a(this.homeScore, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.homeTeamId;
        String str2 = this.homeTeamName;
        String str3 = this.awayTeamId;
        String str4 = this.awayTeamName;
        int i = this.homeScore;
        int i2 = this.awayScore;
        StringBuilder sbA = ux5.a("NetworkInstantVirtualTeamStatsMatchRecord(homeTeamId=", str, ", homeTeamName=", str2, ", awayTeamId=");
        hxa.c(sbA, str3, ", awayTeamName=", str4, ", homeScore=");
        return b7f.a(sbA, i, ", awayScore=", i2, ")");
    }

    public NetworkInstantVirtualTeamStatsMatchRecord(String str, String str2, String str3, String str4, int i, int i2) {
        this.homeTeamId = str;
        this.homeTeamName = str2;
        this.awayTeamId = str3;
        this.awayTeamName = str4;
        this.homeScore = i;
        this.awayScore = i2;
    }

    public NetworkInstantVirtualTeamStatsMatchRecord() {
        this(null, null, null, null, 0, 0, 63, null);
    }
}
