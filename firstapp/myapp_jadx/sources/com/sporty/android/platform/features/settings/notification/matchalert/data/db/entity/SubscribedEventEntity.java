package com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.rg2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\\\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0005HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R)\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR)\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(#¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!Ê\u0001\u0002\b2Ê\u0001 \b3\u0012\u0012\b4\u0012\u000e\b\fJ\u0004\b\b(\u0002J\u0004\b\b(\u0017\u0012\b\b5\u0012\u0004\b\b(6Ê\u0001\f\b7\u0012\b\b8\u0012\u0004\b\u0003\u0010\u0002¨\u00061"}, d2 = {"Lcom/sporty/android/platform/features/settings/notification/matchalert/data/db/entity/SubscribedEventEntity;", "", "account", "", "remoteIndex", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "homeTeamName", "awayTeamName", "fixtureStartTime", "", "notificationEnabled", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getAccount", "()Ljava/lang/String;", "Landroidx/room/ColumnInfo;", "name", "getRemoteIndex", "()I", "remote_index", "getEventId", AnalyticsParam.EVENT_PARAM_EVENT_ID, "getHomeTeamName", "home_team_name", "getAwayTeamName", "away_team_name", "getFixtureStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "fixture_start_time", "getNotificationEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "notification_enabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/sporty/android/platform/features/settings/notification/matchalert/data/db/entity/SubscribedEventEntity;", "equals", "other", "hashCode", "toString", "sportyplatform", "Landroidx/annotation/Keep;", "Landroidx/room/Entity;", "primaryKeys", "tableName", "subscribed_event_table", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubscribedEventEntity {
    public static final int $stable = 0;
    private final String account;
    private final String awayTeamName;
    private final String eventId;
    private final Long fixtureStartTime;
    private final String homeTeamName;
    private final Boolean notificationEnabled;
    private final int remoteIndex;

    public SubscribedEventEntity(String str, int i, String str2, String str3, String str4, Long l, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.account = str;
        this.remoteIndex = i;
        this.eventId = str2;
        this.homeTeamName = str3;
        this.awayTeamName = str4;
        this.fixtureStartTime = l;
        this.notificationEnabled = bool;
    }

    public static /* synthetic */ SubscribedEventEntity copy$default(SubscribedEventEntity subscribedEventEntity, String str, int i, String str2, String str3, String str4, Long l, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = subscribedEventEntity.account;
        }
        if ((i2 & 2) != 0) {
            i = subscribedEventEntity.remoteIndex;
        }
        if ((i2 & 4) != 0) {
            str2 = subscribedEventEntity.eventId;
        }
        if ((i2 & 8) != 0) {
            str3 = subscribedEventEntity.homeTeamName;
        }
        if ((i2 & 16) != 0) {
            str4 = subscribedEventEntity.awayTeamName;
        }
        if ((i2 & 32) != 0) {
            l = subscribedEventEntity.fixtureStartTime;
        }
        if ((i2 & 64) != 0) {
            bool = subscribedEventEntity.notificationEnabled;
        }
        Long l2 = l;
        Boolean bool2 = bool;
        String str5 = str4;
        String str6 = str2;
        return subscribedEventEntity.copy(str, i, str6, str3, str5, l2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRemoteIndex() {
        return this.remoteIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getFixtureStartTime() {
        return this.fixtureStartTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getNotificationEnabled() {
        return this.notificationEnabled;
    }

    public final SubscribedEventEntity copy(String account, int remoteIndex, String eventId, String homeTeamName, String awayTeamName, Long fixtureStartTime, Boolean notificationEnabled) {
        account.getClass();
        eventId.getClass();
        return new SubscribedEventEntity(account, remoteIndex, eventId, homeTeamName, awayTeamName, fixtureStartTime, notificationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribedEventEntity)) {
            return false;
        }
        SubscribedEventEntity subscribedEventEntity = (SubscribedEventEntity) other;
        return Intrinsics.g(this.account, subscribedEventEntity.account) && this.remoteIndex == subscribedEventEntity.remoteIndex && Intrinsics.g(this.eventId, subscribedEventEntity.eventId) && Intrinsics.g(this.homeTeamName, subscribedEventEntity.homeTeamName) && Intrinsics.g(this.awayTeamName, subscribedEventEntity.awayTeamName) && Intrinsics.g(this.fixtureStartTime, subscribedEventEntity.fixtureStartTime) && Intrinsics.g(this.notificationEnabled, subscribedEventEntity.notificationEnabled);
    }

    public final String getAccount() {
        return this.account;
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

    public final int getRemoteIndex() {
        return this.remoteIndex;
    }

    public int hashCode() {
        int iA = gmf0.a(gpp.a(this.remoteIndex, this.account.hashCode() * 31, 31), 31, this.eventId);
        String str = this.homeTeamName;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awayTeamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.fixtureStartTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.notificationEnabled;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.account;
        int i = this.remoteIndex;
        String str2 = this.eventId;
        String str3 = this.homeTeamName;
        String str4 = this.awayTeamName;
        Long l = this.fixtureStartTime;
        Boolean bool = this.notificationEnabled;
        StringBuilder sbA = ml5.a(i, "SubscribedEventEntity(account=", str, ", remoteIndex=", ", eventId=");
        hxa.c(sbA, str2, ", homeTeamName=", str3, ", awayTeamName=");
        sbA.append(str4);
        sbA.append(", fixtureStartTime=");
        sbA.append(l);
        sbA.append(", notificationEnabled=");
        return rg2.a(sbA, bool, ")");
    }
}
