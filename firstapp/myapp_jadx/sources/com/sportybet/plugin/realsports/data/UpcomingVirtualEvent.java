package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJn\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!Ê\u0001\f\b4\u0012\b\b5\u0012\u0004\b\u0003\u0010\u0000¨\u00063"}, d2 = {"Lcom/sportybet/plugin/realsports/data/UpcomingVirtualEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "homeTeamId", "homeTeamName", "homeTeamLogo", "awayTeamId", "awayTeamName", "awayTeamLogo", "startTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getEventId", "()Ljava/lang/String;", "setEventId", "(Ljava/lang/String;)V", "getHomeTeamId", "setHomeTeamId", "getHomeTeamName", "setHomeTeamName", "getHomeTeamLogo", "setHomeTeamLogo", "getAwayTeamId", "setAwayTeamId", "getAwayTeamName", "setAwayTeamName", "getAwayTeamLogo", "setAwayTeamLogo", "getStartTime", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/sportybet/plugin/realsports/data/UpcomingVirtualEvent;", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpcomingVirtualEvent {
    public static final int $stable = 8;
    private String awayTeamId;
    private String awayTeamLogo;
    private String awayTeamName;
    private String eventId;
    private String homeTeamId;
    private String homeTeamLogo;
    private String homeTeamName;
    private Long startTime;

    public /* synthetic */ UpcomingVirtualEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : l);
    }

    public static /* synthetic */ UpcomingVirtualEvent copy$default(UpcomingVirtualEvent upcomingVirtualEvent, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upcomingVirtualEvent.eventId;
        }
        if ((i & 2) != 0) {
            str2 = upcomingVirtualEvent.homeTeamId;
        }
        if ((i & 4) != 0) {
            str3 = upcomingVirtualEvent.homeTeamName;
        }
        if ((i & 8) != 0) {
            str4 = upcomingVirtualEvent.homeTeamLogo;
        }
        if ((i & 16) != 0) {
            str5 = upcomingVirtualEvent.awayTeamId;
        }
        if ((i & 32) != 0) {
            str6 = upcomingVirtualEvent.awayTeamName;
        }
        if ((i & 64) != 0) {
            str7 = upcomingVirtualEvent.awayTeamLogo;
        }
        if ((i & 128) != 0) {
            l = upcomingVirtualEvent.startTime;
        }
        String str8 = str7;
        Long l2 = l;
        String str9 = str5;
        String str10 = str6;
        return upcomingVirtualEvent.copy(str, str2, str3, str4, str9, str10, str8, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    public final UpcomingVirtualEvent copy(String eventId, String homeTeamId, String homeTeamName, String homeTeamLogo, String awayTeamId, String awayTeamName, String awayTeamLogo, Long startTime) {
        return new UpcomingVirtualEvent(eventId, homeTeamId, homeTeamName, homeTeamLogo, awayTeamId, awayTeamName, awayTeamLogo, startTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcomingVirtualEvent)) {
            return false;
        }
        UpcomingVirtualEvent upcomingVirtualEvent = (UpcomingVirtualEvent) other;
        return Intrinsics.g(this.eventId, upcomingVirtualEvent.eventId) && Intrinsics.g(this.homeTeamId, upcomingVirtualEvent.homeTeamId) && Intrinsics.g(this.homeTeamName, upcomingVirtualEvent.homeTeamName) && Intrinsics.g(this.homeTeamLogo, upcomingVirtualEvent.homeTeamLogo) && Intrinsics.g(this.awayTeamId, upcomingVirtualEvent.awayTeamId) && Intrinsics.g(this.awayTeamName, upcomingVirtualEvent.awayTeamName) && Intrinsics.g(this.awayTeamLogo, upcomingVirtualEvent.awayTeamLogo) && Intrinsics.g(this.startTime, upcomingVirtualEvent.startTime);
    }

    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeTeamId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeTeamName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.homeTeamLogo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awayTeamId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awayTeamName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.awayTeamLogo;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.startTime;
        return iHashCode7 + (l != null ? l.hashCode() : 0);
    }

    public final void setAwayTeamId(String str) {
        this.awayTeamId = str;
    }

    public final void setAwayTeamLogo(String str) {
        this.awayTeamLogo = str;
    }

    public final void setAwayTeamName(String str) {
        this.awayTeamName = str;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setHomeTeamId(String str) {
        this.homeTeamId = str;
    }

    public final void setHomeTeamLogo(String str) {
        this.homeTeamLogo = str;
    }

    public final void setHomeTeamName(String str) {
        this.homeTeamName = str;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.homeTeamId;
        String str3 = this.homeTeamName;
        String str4 = this.homeTeamLogo;
        String str5 = this.awayTeamId;
        String str6 = this.awayTeamName;
        String str7 = this.awayTeamLogo;
        Long l = this.startTime;
        StringBuilder sbA = ux5.a("UpcomingVirtualEvent(eventId=", str, ", homeTeamId=", str2, ", homeTeamName=");
        hxa.c(sbA, str3, ", homeTeamLogo=", str4, ", awayTeamId=");
        hxa.c(sbA, str5, ", awayTeamName=", str6, ", awayTeamLogo=");
        sbA.append(str7);
        sbA.append(", startTime=");
        sbA.append(l);
        sbA.append(")");
        return sbA.toString();
    }

    public UpcomingVirtualEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l) {
        this.eventId = str;
        this.homeTeamId = str2;
        this.homeTeamName = str3;
        this.homeTeamLogo = str4;
        this.awayTeamId = str5;
        this.awayTeamName = str6;
        this.awayTeamLogo = str7;
        this.startTime = l;
    }

    public UpcomingVirtualEvent() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
