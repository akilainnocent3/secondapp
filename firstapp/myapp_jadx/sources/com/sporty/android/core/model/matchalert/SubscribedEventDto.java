package com.sporty.android.core.model.matchalert;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import defpackage.hxa;
import defpackage.rg2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/sporty/android/core/model/matchalert/SubscribedEventDto;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "fixtureStartTime", "", "awayTeamName", "homeTeamName", "notificationEnabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getEventId", "()Ljava/lang/String;", "getFixtureStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAwayTeamName", "getHomeTeamName", "getNotificationEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/matchalert/SubscribedEventDto;", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubscribedEventDto {
    private final String awayTeamName;
    private final String eventId;
    private final Long fixtureStartTime;
    private final String homeTeamName;
    private final Boolean notificationEnabled;

    public SubscribedEventDto(String str, Long l, String str2, String str3, Boolean bool) {
        this.eventId = str;
        this.fixtureStartTime = l;
        this.awayTeamName = str2;
        this.homeTeamName = str3;
        this.notificationEnabled = bool;
    }

    public static /* synthetic */ SubscribedEventDto copy$default(SubscribedEventDto subscribedEventDto, String str, Long l, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscribedEventDto.eventId;
        }
        if ((i & 2) != 0) {
            l = subscribedEventDto.fixtureStartTime;
        }
        if ((i & 4) != 0) {
            str2 = subscribedEventDto.awayTeamName;
        }
        if ((i & 8) != 0) {
            str3 = subscribedEventDto.homeTeamName;
        }
        if ((i & 16) != 0) {
            bool = subscribedEventDto.notificationEnabled;
        }
        Boolean bool2 = bool;
        String str4 = str2;
        return subscribedEventDto.copy(str, l, str4, str3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getFixtureStartTime() {
        return this.fixtureStartTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getNotificationEnabled() {
        return this.notificationEnabled;
    }

    public final SubscribedEventDto copy(String eventId, Long fixtureStartTime, String awayTeamName, String homeTeamName, Boolean notificationEnabled) {
        return new SubscribedEventDto(eventId, fixtureStartTime, awayTeamName, homeTeamName, notificationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribedEventDto)) {
            return false;
        }
        SubscribedEventDto subscribedEventDto = (SubscribedEventDto) other;
        return Intrinsics.g(this.eventId, subscribedEventDto.eventId) && Intrinsics.g(this.fixtureStartTime, subscribedEventDto.fixtureStartTime) && Intrinsics.g(this.awayTeamName, subscribedEventDto.awayTeamName) && Intrinsics.g(this.homeTeamName, subscribedEventDto.homeTeamName) && Intrinsics.g(this.notificationEnabled, subscribedEventDto.notificationEnabled);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Long getFixtureStartTime() {
        return this.fixtureStartTime;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final Boolean getNotificationEnabled() {
        return this.notificationEnabled;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.fixtureStartTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.awayTeamName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeTeamName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.notificationEnabled;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        Long l = this.fixtureStartTime;
        String str2 = this.awayTeamName;
        String str3 = this.homeTeamName;
        Boolean bool = this.notificationEnabled;
        StringBuilder sb = new StringBuilder("SubscribedEventDto(eventId=");
        sb.append(str);
        sb.append(", fixtureStartTime=");
        sb.append(l);
        sb.append(dqvOSm.iLTCFAKrZyxv);
        hxa.c(sb, str2, ", homeTeamName=", str3, ", notificationEnabled=");
        return rg2.a(sb, bool, ")");
    }
}
