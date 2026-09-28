package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0006HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R%\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eÊ\u0001\f\b.\u0012\b\b/\u0012\u0004\b\u0003\u0010\u0000¨\u0006-"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMatchday;", "", "season", "", "matchday", AnalyticsParam.EVENT_STATUS, "", "betOpenTime", "", "betCloseTime", "kickoffTime", "hiddenTime", "events", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballEvent;", "<init>", "(IILjava/lang/String;JJJJLjava/util/List;)V", "getSeason", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getMatchday", "getStatus", "()Ljava/lang/String;", "getBetOpenTime", "()J", "getBetCloseTime", "getKickoffTime", "getHiddenTime", "getEvents", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballMatchday {
    public static final int $stable = 8;

    @SerializedName("betCloseTime")
    private final long betCloseTime;

    @SerializedName("betOpenTime")
    private final long betOpenTime;

    @SerializedName("events")
    private final List<NetworkScheduledFootballEvent> events;

    @SerializedName("hiddenTime")
    private final long hiddenTime;

    @SerializedName("kickoffTime")
    private final long kickoffTime;

    @SerializedName("matchday")
    private final int matchday;

    @SerializedName("season")
    private final int season;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String status;

    public NetworkScheduledFootballMatchday(int i, int i2, String str, long j, long j2, long j3, long j4, List<NetworkScheduledFootballEvent> list) {
        this.season = i;
        this.matchday = i2;
        this.status = str;
        this.betOpenTime = j;
        this.betCloseTime = j2;
        this.kickoffTime = j3;
        this.hiddenTime = j4;
        this.events = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballMatchday copy$default(NetworkScheduledFootballMatchday networkScheduledFootballMatchday, int i, int i2, String str, long j, long j2, long j3, long j4, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = networkScheduledFootballMatchday.season;
        }
        if ((i3 & 2) != 0) {
            i2 = networkScheduledFootballMatchday.matchday;
        }
        if ((i3 & 4) != 0) {
            str = networkScheduledFootballMatchday.status;
        }
        if ((i3 & 8) != 0) {
            j = networkScheduledFootballMatchday.betOpenTime;
        }
        if ((i3 & 16) != 0) {
            j2 = networkScheduledFootballMatchday.betCloseTime;
        }
        if ((i3 & 32) != 0) {
            j3 = networkScheduledFootballMatchday.kickoffTime;
        }
        if ((i3 & 64) != 0) {
            j4 = networkScheduledFootballMatchday.hiddenTime;
        }
        if ((i3 & 128) != 0) {
            list = networkScheduledFootballMatchday.events;
        }
        List list2 = list;
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        String str2 = str;
        return networkScheduledFootballMatchday.copy(i, i2, str2, j, j7, j6, j5, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSeason() {
        return this.season;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMatchday() {
        return this.matchday;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getBetOpenTime() {
        return this.betOpenTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBetCloseTime() {
        return this.betCloseTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getKickoffTime() {
        return this.kickoffTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getHiddenTime() {
        return this.hiddenTime;
    }

    public final List<NetworkScheduledFootballEvent> component8() {
        return this.events;
    }

    public final NetworkScheduledFootballMatchday copy(int season, int matchday, String status, long betOpenTime, long betCloseTime, long kickoffTime, long hiddenTime, List<NetworkScheduledFootballEvent> events) {
        return new NetworkScheduledFootballMatchday(season, matchday, status, betOpenTime, betCloseTime, kickoffTime, hiddenTime, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballMatchday)) {
            return false;
        }
        NetworkScheduledFootballMatchday networkScheduledFootballMatchday = (NetworkScheduledFootballMatchday) other;
        return this.season == networkScheduledFootballMatchday.season && this.matchday == networkScheduledFootballMatchday.matchday && Intrinsics.g(this.status, networkScheduledFootballMatchday.status) && this.betOpenTime == networkScheduledFootballMatchday.betOpenTime && this.betCloseTime == networkScheduledFootballMatchday.betCloseTime && this.kickoffTime == networkScheduledFootballMatchday.kickoffTime && this.hiddenTime == networkScheduledFootballMatchday.hiddenTime && Intrinsics.g(this.events, networkScheduledFootballMatchday.events);
    }

    public final long getBetCloseTime() {
        return this.betCloseTime;
    }

    public final long getBetOpenTime() {
        return this.betOpenTime;
    }

    public final List<NetworkScheduledFootballEvent> getEvents() {
        return this.events;
    }

    public final long getHiddenTime() {
        return this.hiddenTime;
    }

    public final long getKickoffTime() {
        return this.kickoffTime;
    }

    public final int getMatchday() {
        return this.matchday;
    }

    public final int getSeason() {
        return this.season;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = gpp.a(this.matchday, Integer.hashCode(this.season) * 31, 31);
        String str = this.status;
        int iA2 = f87.a(f87.a(f87.a(f87.a((iA + (str == null ? 0 : str.hashCode())) * 31, this.betOpenTime, 31), this.betCloseTime, 31), this.kickoffTime, 31), this.hiddenTime, 31);
        List<NetworkScheduledFootballEvent> list = this.events;
        return iA2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = this.season;
        int i2 = this.matchday;
        String str = this.status;
        long j = this.betOpenTime;
        long j2 = this.betCloseTime;
        long j3 = this.kickoffTime;
        long j4 = this.hiddenTime;
        List<NetworkScheduledFootballEvent> list = this.events;
        StringBuilder sbA = dy5.a("NetworkScheduledFootballMatchday(season=", i, i2, ", matchday=", ", status=");
        l.a(j, str, ", betOpenTime=", sbA);
        g41.a(j2, ", betCloseTime=", ", kickoffTime=", sbA);
        sbA.append(j3);
        g41.a(j4, ", hiddenTime=", ", events=", sbA);
        return ng1.a(sbA, list, ")");
    }
}
