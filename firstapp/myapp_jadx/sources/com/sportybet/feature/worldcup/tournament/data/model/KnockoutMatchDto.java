package com.sportybet.feature.worldcup.tournament.data.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.cv7;
import defpackage.gpp;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0096\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0014\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00108\u001a\u00020\u0006HÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b$\u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b%\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015Ê\u0001\u0002\b;Ê\u0001\f\b<\u0012\b\b=\u0012\u0004\b\u0003\u0010\u0000¨\u0006:"}, d2 = {"Lcom/sportybet/feature/worldcup/tournament/data/model/KnockoutMatchDto;", "", "matchSlotId", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "matchNumber", "", "startTime", "", AnalyticsParam.EVENT_STATUS, "home", "Lcom/sportybet/feature/worldcup/tournament/data/model/SlotDto;", "away", "homeScore", "awayScore", "penaltyHomeScore", "penaltyAwayScore", "nextSlotId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;Lcom/sportybet/feature/worldcup/tournament/data/model/SlotDto;Lcom/sportybet/feature/worldcup/tournament/data/model/SlotDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getMatchSlotId", "()Ljava/lang/String;", "getEventId", "getMatchNumber", "()I", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "getHome", "()Lcom/sportybet/feature/worldcup/tournament/data/model/SlotDto;", "getAway", "getHomeScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAwayScore", "getPenaltyHomeScore", "getPenaltyAwayScore", "getNextSlotId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/String;Lcom/sportybet/feature/worldcup/tournament/data/model/SlotDto;Lcom/sportybet/feature/worldcup/tournament/data/model/SlotDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sportybet/feature/worldcup/tournament/data/model/KnockoutMatchDto;", "equals", "", "other", "hashCode", "toString", "world-cup", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class KnockoutMatchDto {
    public static final int $stable = TeamDto.$stable;
    private final SlotDto away;
    private final Integer awayScore;
    private final String eventId;
    private final SlotDto home;
    private final Integer homeScore;
    private final int matchNumber;
    private final String matchSlotId;
    private final String nextSlotId;
    private final Integer penaltyAwayScore;
    private final Integer penaltyHomeScore;
    private final Long startTime;
    private final String status;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ KnockoutMatchDto(String str, String str2, int i, Long l, String str3, SlotDto slotDto, SlotDto slotDto2, Integer num, Integer num2, Integer num3, Integer num4, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = 3;
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? new SlotDto(null, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0) : slotDto, (i2 & 64) != 0 ? new SlotDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0) : slotDto2, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : num3, (i2 & 1024) != 0 ? null : num4, (i2 & 2048) != 0 ? null : str4);
    }

    public static /* synthetic */ KnockoutMatchDto copy$default(KnockoutMatchDto knockoutMatchDto, String str, String str2, int i, Long l, String str3, SlotDto slotDto, SlotDto slotDto2, Integer num, Integer num2, Integer num3, Integer num4, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = knockoutMatchDto.matchSlotId;
        }
        if ((i2 & 2) != 0) {
            str2 = knockoutMatchDto.eventId;
        }
        if ((i2 & 4) != 0) {
            i = knockoutMatchDto.matchNumber;
        }
        if ((i2 & 8) != 0) {
            l = knockoutMatchDto.startTime;
        }
        if ((i2 & 16) != 0) {
            str3 = knockoutMatchDto.status;
        }
        if ((i2 & 32) != 0) {
            slotDto = knockoutMatchDto.home;
        }
        if ((i2 & 64) != 0) {
            slotDto2 = knockoutMatchDto.away;
        }
        if ((i2 & 128) != 0) {
            num = knockoutMatchDto.homeScore;
        }
        if ((i2 & 256) != 0) {
            num2 = knockoutMatchDto.awayScore;
        }
        if ((i2 & 512) != 0) {
            num3 = knockoutMatchDto.penaltyHomeScore;
        }
        if ((i2 & 1024) != 0) {
            num4 = knockoutMatchDto.penaltyAwayScore;
        }
        if ((i2 & 2048) != 0) {
            str4 = knockoutMatchDto.nextSlotId;
        }
        Integer num5 = num4;
        String str5 = str4;
        Integer num6 = num2;
        Integer num7 = num3;
        SlotDto slotDto3 = slotDto2;
        Integer num8 = num;
        String str6 = str3;
        SlotDto slotDto4 = slotDto;
        return knockoutMatchDto.copy(str, str2, i, l, str6, slotDto4, slotDto3, num8, num6, num7, num5, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMatchSlotId() {
        return this.matchSlotId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getPenaltyHomeScore() {
        return this.penaltyHomeScore;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getPenaltyAwayScore() {
        return this.penaltyAwayScore;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNextSlotId() {
        return this.nextSlotId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMatchNumber() {
        return this.matchNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SlotDto getHome() {
        return this.home;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SlotDto getAway() {
        return this.away;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getHomeScore() {
        return this.homeScore;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getAwayScore() {
        return this.awayScore;
    }

    public final KnockoutMatchDto copy(String matchSlotId, String eventId, int matchNumber, Long startTime, String status, SlotDto home, SlotDto away, Integer homeScore, Integer awayScore, Integer penaltyHomeScore, Integer penaltyAwayScore, String nextSlotId) {
        matchSlotId.getClass();
        home.getClass();
        away.getClass();
        return new KnockoutMatchDto(matchSlotId, eventId, matchNumber, startTime, status, home, away, homeScore, awayScore, penaltyHomeScore, penaltyAwayScore, nextSlotId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KnockoutMatchDto)) {
            return false;
        }
        KnockoutMatchDto knockoutMatchDto = (KnockoutMatchDto) other;
        return Intrinsics.g(this.matchSlotId, knockoutMatchDto.matchSlotId) && Intrinsics.g(this.eventId, knockoutMatchDto.eventId) && this.matchNumber == knockoutMatchDto.matchNumber && Intrinsics.g(this.startTime, knockoutMatchDto.startTime) && Intrinsics.g(this.status, knockoutMatchDto.status) && Intrinsics.g(this.home, knockoutMatchDto.home) && Intrinsics.g(this.away, knockoutMatchDto.away) && Intrinsics.g(this.homeScore, knockoutMatchDto.homeScore) && Intrinsics.g(this.awayScore, knockoutMatchDto.awayScore) && Intrinsics.g(this.penaltyHomeScore, knockoutMatchDto.penaltyHomeScore) && Intrinsics.g(this.penaltyAwayScore, knockoutMatchDto.penaltyAwayScore) && Intrinsics.g(this.nextSlotId, knockoutMatchDto.nextSlotId);
    }

    public final SlotDto getAway() {
        return this.away;
    }

    public final Integer getAwayScore() {
        return this.awayScore;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final SlotDto getHome() {
        return this.home;
    }

    public final Integer getHomeScore() {
        return this.homeScore;
    }

    public final int getMatchNumber() {
        return this.matchNumber;
    }

    public final String getMatchSlotId() {
        return this.matchSlotId;
    }

    public final String getNextSlotId() {
        return this.nextSlotId;
    }

    public final Integer getPenaltyAwayScore() {
        return this.penaltyAwayScore;
    }

    public final Integer getPenaltyHomeScore() {
        return this.penaltyHomeScore;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.matchSlotId.hashCode() * 31;
        String str = this.eventId;
        int iA = gpp.a(this.matchNumber, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Long l = this.startTime;
        int iHashCode2 = (iA + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (this.away.hashCode() + ((this.home.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.homeScore;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.awayScore;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.penaltyHomeScore;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.penaltyAwayScore;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.nextSlotId;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.matchSlotId;
        String str2 = this.eventId;
        int i = this.matchNumber;
        Long l = this.startTime;
        String str3 = this.status;
        SlotDto slotDto = this.home;
        SlotDto slotDto2 = this.away;
        Integer num = this.homeScore;
        Integer num2 = this.awayScore;
        Integer num3 = this.penaltyHomeScore;
        Integer num4 = this.penaltyAwayScore;
        String str4 = this.nextSlotId;
        StringBuilder sbA = ux5.a("KnockoutMatchDto(matchSlotId=", str, ", eventId=", str2, ", matchNumber=");
        sbA.append(i);
        sbA.append(", startTime=");
        sbA.append(l);
        sbA.append(", status=");
        sbA.append(str3);
        sbA.append(", home=");
        sbA.append(slotDto);
        sbA.append(", away=");
        sbA.append(slotDto2);
        sbA.append(", homeScore=");
        sbA.append(num);
        sbA.append(", awayScore=");
        cv7.a(sbA, num2, ", penaltyHomeScore=", num3, ", penaltyAwayScore=");
        sbA.append(num4);
        sbA.append(", nextSlotId=");
        sbA.append(str4);
        sbA.append(")");
        return sbA.toString();
    }

    public KnockoutMatchDto(String str, String str2, int i, Long l, String str3, SlotDto slotDto, SlotDto slotDto2, Integer num, Integer num2, Integer num3, Integer num4, String str4) {
        str.getClass();
        slotDto.getClass();
        slotDto2.getClass();
        this.matchSlotId = str;
        this.eventId = str2;
        this.matchNumber = i;
        this.startTime = l;
        this.status = str3;
        this.home = slotDto;
        this.away = slotDto2;
        this.homeScore = num;
        this.awayScore = num2;
        this.penaltyHomeScore = num3;
        this.penaltyAwayScore = num4;
        this.nextSlotId = str4;
    }
}
