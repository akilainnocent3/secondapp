package com.sporty.android.book.presentation.eventdetails.header;

import defpackage.au1;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.lng;
import defpackage.mng;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.ofb0;
import defpackage.qn4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0010\u00101\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b3\u0010*J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u0010*J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010*J\u0010\u00106\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b6\u0010*J\u0010\u00107\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b7\u0010*J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u0010*J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u0010*J\u0010\u0010:\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b:\u0010*J\u0010\u0010;\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b;\u0010*J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u0010*J\u008c\u0002\u0010=\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b?\u0010$J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010D\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bD\u0010ER\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bG\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bI\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bJ\u0010$R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\bK\u0010$R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bL\u0010$R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bM\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bO\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bP\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bQ\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u0010.R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bT\u0010$R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bU\u0010$R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bV\u0010$R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bW\u0010$R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\b\u0015\u0010*R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\b\u0016\u0010*R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\b\u0017\u0010*R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\b\u0018\u0010*R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\bX\u0010*R\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010N\u001a\u0004\b\u001a\u0010*R\u0017\u0010\u001b\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\b\u001b\u0010*R\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010N\u001a\u0004\bY\u0010*R\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010N\u001a\u0004\bZ\u0010*R\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\b\u001e\u0010*¨\u0006["}, d2 = {"Lcom/sporty/android/book/presentation/eventdetails/header/EventDetailHeaderUiModel;", "", "", "Lau1;", "badges", "", "competitionName", "teamHome", "teamAway", "homeTeamId", "awayTeamId", "", "areTeamLogosVisible", "homeTeamIcon", "awayTeamIcon", "Lofb0;", "sportType", "date", "day", "time", "gameId", "isLiveInPlayAvailable", "isLiveStreamAvailable", "isAudioStreamAvailable", "isDelaySettle", "areEventsForSameTournamentLoaded", "isPreviousEventAvailable", "isNextEventAvailable", "areLiveEventsAvailable", "hasGift", "isTeamPagesEnabled", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lofb0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZ)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "component10", "()Lofb0;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lofb0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZ)Lcom/sporty/android/book/presentation/eventdetails/header/EventDetailHeaderUiModel;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBadges", "Ljava/lang/String;", "getCompetitionName", "getTeamHome", "getTeamAway", "getHomeTeamId", "getAwayTeamId", "Z", "getAreTeamLogosVisible", "getHomeTeamIcon", "getAwayTeamIcon", "Lofb0;", "getSportType", "getDate", "getDay", "getTime", "getGameId", "getAreEventsForSameTournamentLoaded", "getAreLiveEventsAvailable", "getHasGift", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventDetailHeaderUiModel {
    public static final int $stable = 0;
    private final boolean areEventsForSameTournamentLoaded;
    private final boolean areLiveEventsAvailable;
    private final boolean areTeamLogosVisible;
    private final String awayTeamIcon;
    private final String awayTeamId;
    private final List<au1> badges;
    private final String competitionName;
    private final String date;
    private final String day;
    private final String gameId;
    private final boolean hasGift;
    private final String homeTeamIcon;
    private final String homeTeamId;
    private final boolean isAudioStreamAvailable;
    private final boolean isDelaySettle;
    private final boolean isLiveInPlayAvailable;
    private final boolean isLiveStreamAvailable;
    private final boolean isNextEventAvailable;
    private final boolean isPreviousEventAvailable;
    private final boolean isTeamPagesEnabled;
    private final ofb0 sportType;
    private final String teamAway;
    private final String teamHome;
    private final String time;

    public EventDetailHeaderUiModel(List<au1> list, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ofb0 ofb0Var, String str8, String str9, String str10, String str11, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        qn4.b(str5, str8, str9, str10, str11);
        this.badges = list;
        this.competitionName = str;
        this.teamHome = str2;
        this.teamAway = str3;
        this.homeTeamId = str4;
        this.awayTeamId = str5;
        this.areTeamLogosVisible = z;
        this.homeTeamIcon = str6;
        this.awayTeamIcon = str7;
        this.sportType = ofb0Var;
        this.date = str8;
        this.day = str9;
        this.time = str10;
        this.gameId = str11;
        this.isLiveInPlayAvailable = z2;
        this.isLiveStreamAvailable = z3;
        this.isAudioStreamAvailable = z4;
        this.isDelaySettle = z5;
        this.areEventsForSameTournamentLoaded = z6;
        this.isPreviousEventAvailable = z7;
        this.isNextEventAvailable = z8;
        this.areLiveEventsAvailable = z9;
        this.hasGift = z10;
        this.isTeamPagesEnabled = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventDetailHeaderUiModel copy$default(EventDetailHeaderUiModel eventDetailHeaderUiModel, List list, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ofb0 ofb0Var, String str8, String str9, String str10, String str11, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, Object obj) {
        boolean z12;
        boolean z13;
        List list2 = (i & 1) != 0 ? eventDetailHeaderUiModel.badges : list;
        String str12 = (i & 2) != 0 ? eventDetailHeaderUiModel.competitionName : str;
        String str13 = (i & 4) != 0 ? eventDetailHeaderUiModel.teamHome : str2;
        String str14 = (i & 8) != 0 ? eventDetailHeaderUiModel.teamAway : str3;
        String str15 = (i & 16) != 0 ? eventDetailHeaderUiModel.homeTeamId : str4;
        String str16 = (i & 32) != 0 ? eventDetailHeaderUiModel.awayTeamId : str5;
        boolean z14 = (i & 64) != 0 ? eventDetailHeaderUiModel.areTeamLogosVisible : z;
        String str17 = (i & 128) != 0 ? eventDetailHeaderUiModel.homeTeamIcon : str6;
        String str18 = (i & 256) != 0 ? eventDetailHeaderUiModel.awayTeamIcon : str7;
        ofb0 ofb0Var2 = (i & 512) != 0 ? eventDetailHeaderUiModel.sportType : ofb0Var;
        String str19 = (i & 1024) != 0 ? eventDetailHeaderUiModel.date : str8;
        String str20 = (i & 2048) != 0 ? eventDetailHeaderUiModel.day : str9;
        String str21 = (i & 4096) != 0 ? eventDetailHeaderUiModel.time : str10;
        String str22 = (i & 8192) != 0 ? eventDetailHeaderUiModel.gameId : str11;
        List list3 = list2;
        boolean z15 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? eventDetailHeaderUiModel.isLiveInPlayAvailable : z2;
        boolean z16 = (i & 32768) != 0 ? eventDetailHeaderUiModel.isLiveStreamAvailable : z3;
        boolean z17 = (i & 65536) != 0 ? eventDetailHeaderUiModel.isAudioStreamAvailable : z4;
        boolean z18 = (i & 131072) != 0 ? eventDetailHeaderUiModel.isDelaySettle : z5;
        boolean z19 = (i & 262144) != 0 ? eventDetailHeaderUiModel.areEventsForSameTournamentLoaded : z6;
        boolean z20 = (i & 524288) != 0 ? eventDetailHeaderUiModel.isPreviousEventAvailable : z7;
        boolean z21 = (i & 1048576) != 0 ? eventDetailHeaderUiModel.isNextEventAvailable : z8;
        boolean z22 = (i & 2097152) != 0 ? eventDetailHeaderUiModel.areLiveEventsAvailable : z9;
        boolean z23 = (i & 4194304) != 0 ? eventDetailHeaderUiModel.hasGift : z10;
        if ((i & 8388608) != 0) {
            z13 = z23;
            z12 = eventDetailHeaderUiModel.isTeamPagesEnabled;
        } else {
            z12 = z11;
            z13 = z23;
        }
        return eventDetailHeaderUiModel.copy(list3, str12, str13, str14, str15, str16, z14, str17, str18, ofb0Var2, str19, str20, str21, str22, z15, z16, z17, z18, z19, z20, z21, z22, z13, z12);
    }

    public final List<au1> component1() {
        return this.badges;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ofb0 getSportType() {
        return this.sportType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsLiveInPlayAvailable() {
        return this.isLiveInPlayAvailable;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsLiveStreamAvailable() {
        return this.isLiveStreamAvailable;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsAudioStreamAvailable() {
        return this.isAudioStreamAvailable;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsDelaySettle() {
        return this.isDelaySettle;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getAreEventsForSameTournamentLoaded() {
        return this.areEventsForSameTournamentLoaded;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCompetitionName() {
        return this.competitionName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsPreviousEventAvailable() {
        return this.isPreviousEventAvailable;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getIsNextEventAvailable() {
        return this.isNextEventAvailable;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getAreLiveEventsAvailable() {
        return this.areLiveEventsAvailable;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getHasGift() {
        return this.hasGift;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsTeamPagesEnabled() {
        return this.isTeamPagesEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTeamHome() {
        return this.teamHome;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTeamAway() {
        return this.teamAway;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAreTeamLogosVisible() {
        return this.areTeamLogosVisible;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHomeTeamIcon() {
        return this.homeTeamIcon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAwayTeamIcon() {
        return this.awayTeamIcon;
    }

    public final EventDetailHeaderUiModel copy(List<au1> badges, String competitionName, String teamHome, String teamAway, String homeTeamId, String awayTeamId, boolean areTeamLogosVisible, String homeTeamIcon, String awayTeamIcon, ofb0 sportType, String date, String day, String time, String gameId, boolean isLiveInPlayAvailable, boolean isLiveStreamAvailable, boolean isAudioStreamAvailable, boolean isDelaySettle, boolean areEventsForSameTournamentLoaded, boolean isPreviousEventAvailable, boolean isNextEventAvailable, boolean areLiveEventsAvailable, boolean hasGift, boolean isTeamPagesEnabled) {
        badges.getClass();
        competitionName.getClass();
        teamHome.getClass();
        teamAway.getClass();
        homeTeamId.getClass();
        awayTeamId.getClass();
        date.getClass();
        day.getClass();
        time.getClass();
        gameId.getClass();
        return new EventDetailHeaderUiModel(badges, competitionName, teamHome, teamAway, homeTeamId, awayTeamId, areTeamLogosVisible, homeTeamIcon, awayTeamIcon, sportType, date, day, time, gameId, isLiveInPlayAvailable, isLiveStreamAvailable, isAudioStreamAvailable, isDelaySettle, areEventsForSameTournamentLoaded, isPreviousEventAvailable, isNextEventAvailable, areLiveEventsAvailable, hasGift, isTeamPagesEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDetailHeaderUiModel)) {
            return false;
        }
        EventDetailHeaderUiModel eventDetailHeaderUiModel = (EventDetailHeaderUiModel) other;
        return Intrinsics.g(this.badges, eventDetailHeaderUiModel.badges) && Intrinsics.g(this.competitionName, eventDetailHeaderUiModel.competitionName) && Intrinsics.g(this.teamHome, eventDetailHeaderUiModel.teamHome) && Intrinsics.g(this.teamAway, eventDetailHeaderUiModel.teamAway) && Intrinsics.g(this.homeTeamId, eventDetailHeaderUiModel.homeTeamId) && Intrinsics.g(this.awayTeamId, eventDetailHeaderUiModel.awayTeamId) && this.areTeamLogosVisible == eventDetailHeaderUiModel.areTeamLogosVisible && Intrinsics.g(this.homeTeamIcon, eventDetailHeaderUiModel.homeTeamIcon) && Intrinsics.g(this.awayTeamIcon, eventDetailHeaderUiModel.awayTeamIcon) && this.sportType == eventDetailHeaderUiModel.sportType && Intrinsics.g(this.date, eventDetailHeaderUiModel.date) && Intrinsics.g(this.day, eventDetailHeaderUiModel.day) && Intrinsics.g(this.time, eventDetailHeaderUiModel.time) && Intrinsics.g(this.gameId, eventDetailHeaderUiModel.gameId) && this.isLiveInPlayAvailable == eventDetailHeaderUiModel.isLiveInPlayAvailable && this.isLiveStreamAvailable == eventDetailHeaderUiModel.isLiveStreamAvailable && this.isAudioStreamAvailable == eventDetailHeaderUiModel.isAudioStreamAvailable && this.isDelaySettle == eventDetailHeaderUiModel.isDelaySettle && this.areEventsForSameTournamentLoaded == eventDetailHeaderUiModel.areEventsForSameTournamentLoaded && this.isPreviousEventAvailable == eventDetailHeaderUiModel.isPreviousEventAvailable && this.isNextEventAvailable == eventDetailHeaderUiModel.isNextEventAvailable && this.areLiveEventsAvailable == eventDetailHeaderUiModel.areLiveEventsAvailable && this.hasGift == eventDetailHeaderUiModel.hasGift && this.isTeamPagesEnabled == eventDetailHeaderUiModel.isTeamPagesEnabled;
    }

    public final boolean getAreEventsForSameTournamentLoaded() {
        return this.areEventsForSameTournamentLoaded;
    }

    public final boolean getAreLiveEventsAvailable() {
        return this.areLiveEventsAvailable;
    }

    public final boolean getAreTeamLogosVisible() {
        return this.areTeamLogosVisible;
    }

    public final String getAwayTeamIcon() {
        return this.awayTeamIcon;
    }

    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    public final List<au1> getBadges() {
        return this.badges;
    }

    public final String getCompetitionName() {
        return this.competitionName;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDay() {
        return this.day;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final boolean getHasGift() {
        return this.hasGift;
    }

    public final String getHomeTeamIcon() {
        return this.homeTeamIcon;
    }

    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    public final ofb0 getSportType() {
        return this.sportType;
    }

    public final String getTeamAway() {
        return this.teamAway;
    }

    public final String getTeamHome() {
        return this.teamHome;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        int iA = mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.badges.hashCode() * 31, 31, this.competitionName), 31, this.teamHome), 31, this.teamAway), 31, this.homeTeamId), 31, this.awayTeamId), 31, this.areTeamLogosVisible);
        String str = this.homeTeamIcon;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awayTeamIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ofb0 ofb0Var = this.sportType;
        return Boolean.hashCode(this.isTeamPagesEnabled) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((iHashCode2 + (ofb0Var != null ? ofb0Var.hashCode() : 0)) * 31, 31, this.date), 31, this.day), 31, this.time), 31, this.gameId), 31, this.isLiveInPlayAvailable), 31, this.isLiveStreamAvailable), 31, this.isAudioStreamAvailable), 31, this.isDelaySettle), 31, this.areEventsForSameTournamentLoaded), 31, this.isPreviousEventAvailable), 31, this.isNextEventAvailable), 31, this.areLiveEventsAvailable), 31, this.hasGift);
    }

    public final boolean isAudioStreamAvailable() {
        return this.isAudioStreamAvailable;
    }

    public final boolean isDelaySettle() {
        return this.isDelaySettle;
    }

    public final boolean isLiveInPlayAvailable() {
        return this.isLiveInPlayAvailable;
    }

    public final boolean isLiveStreamAvailable() {
        return this.isLiveStreamAvailable;
    }

    public final boolean isNextEventAvailable() {
        return this.isNextEventAvailable;
    }

    public final boolean isPreviousEventAvailable() {
        return this.isPreviousEventAvailable;
    }

    public final boolean isTeamPagesEnabled() {
        return this.isTeamPagesEnabled;
    }

    public String toString() {
        List<au1> list = this.badges;
        String str = this.competitionName;
        String str2 = this.teamHome;
        String str3 = this.teamAway;
        String str4 = this.homeTeamId;
        String str5 = this.awayTeamId;
        boolean z = this.areTeamLogosVisible;
        String str6 = this.homeTeamIcon;
        String str7 = this.awayTeamIcon;
        ofb0 ofb0Var = this.sportType;
        String str8 = this.date;
        String str9 = this.day;
        String str10 = this.time;
        String str11 = this.gameId;
        boolean z2 = this.isLiveInPlayAvailable;
        boolean z3 = this.isLiveStreamAvailable;
        boolean z4 = this.isAudioStreamAvailable;
        boolean z5 = this.isDelaySettle;
        boolean z6 = this.areEventsForSameTournamentLoaded;
        boolean z7 = this.isPreviousEventAvailable;
        boolean z8 = this.isNextEventAvailable;
        boolean z9 = this.areLiveEventsAvailable;
        boolean z10 = this.hasGift;
        boolean z11 = this.isTeamPagesEnabled;
        StringBuilder sb = new StringBuilder("EventDetailHeaderUiModel(badges=");
        sb.append(list);
        sb.append(", competitionName=");
        sb.append(str);
        sb.append(", teamHome=");
        hxa.c(sb, str2, ", teamAway=", str3, ", homeTeamId=");
        hxa.c(sb, str4, ", awayTeamId=", str5, ", areTeamLogosVisible=");
        mng.a(", homeTeamIcon=", str6, ", awayTeamIcon=", sb, z);
        sb.append(str7);
        sb.append(", sportType=");
        sb.append(ofb0Var);
        sb.append(", date=");
        hxa.c(sb, str8, ", day=", str9, ", time=");
        hxa.c(sb, str10, ", gameId=", str11, ", isLiveInPlayAvailable=");
        nng.a(", isLiveStreamAvailable=", ", isAudioStreamAvailable=", sb, z2, z3);
        nng.a(", isDelaySettle=", ", areEventsForSameTournamentLoaded=", sb, z4, z5);
        nng.a(", isPreviousEventAvailable=", ", isNextEventAvailable=", sb, z6, z7);
        nng.a(", areLiveEventsAvailable=", ", hasGift=", sb, z8, z9);
        return lng.a(", isTeamPagesEnabled=", ")", sb, z10, z11);
    }

    public /* synthetic */ EventDetailHeaderUiModel(List list, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ofb0 ofb0Var, String str8, String str9, String str10, String str11, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, z, str6, str7, ofb0Var, str8, str9, str10, str11, z2, z3, z4, z5, z6, z7, z8, z9, z10, (i & 8388608) != 0 ? false : z11);
    }
}
