package com.sportybet.feature.dedicatedteampage.team.data.model;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gfs;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.pr0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0014HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0017HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010IJ\u0010\u0010j\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010IJ\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0084\u0003\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010oJ\u0014\u0010p\u001a\u00020\u00172\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010r\u001a\u00020sHÖ\u0081\u0004J\n\u0010t\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010(R'\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\bD\u0012\b\bE\u0012\u0004\b\b(F¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010(R\u0015\u0010 \u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010IR\u0015\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010J\u001a\u0004\bK\u0010IR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010(R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010(R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010(Ê\u0001\u0002\bvÊ\u0001\f\bw\u0012\b\bx\u0012\u0004\b\u0003\u0010\u0000¨\u0006u"}, d2 = {"Lcom/sportybet/feature/dedicatedteampage/team/data/model/EventDataDto;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "eventScore", "eventGameScore", "", "eventPointScore", "eventStatus", "eventMatchStatus", "eventMatchPeriod", "fixtureAwayTeamId", "fixtureAwayTeamName", "fixtureHomeTeamId", "fixtureHomeTeamName", "homeLogoUri", "awayLogoUri", "fixtureHomeTeamLogoUri", "fixtureAwayTeamLogoUri", "fixtureStartTime", "", "eventPlayedTime", "myFavourite", "", "fixtureTournamentId", "fixtureTournamentName", "fixtureSportId", "homeShortName", "awayShortName", "liveStreamProvider", "audioLiveProvider", "youtubeHighlightsVideoId", "liveStreamStartTime", "liveStreamEndTime", "displayScore", "source", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getEventScore", "getEventGameScore", "()Ljava/util/List;", "getEventPointScore", "getEventStatus", "getEventMatchStatus", "getEventMatchPeriod", "getFixtureAwayTeamId", "getFixtureAwayTeamName", "getFixtureHomeTeamId", "getFixtureHomeTeamName", "getHomeLogoUri", "getAwayLogoUri", "getFixtureHomeTeamLogoUri", "getFixtureAwayTeamLogoUri", "getFixtureStartTime", "()J", "getEventPlayedTime", "getMyFavourite", "()Z", "getFixtureTournamentId", "getFixtureTournamentName", "getFixtureSportId", "getHomeShortName", "getAwayShortName", "getLiveStreamProvider", "getAudioLiveProvider", "Lcom/google/gson/annotations/SerializedName;", "value", "audioLiveProviderEnum", "getYoutubeHighlightsVideoId", "getLiveStreamStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLiveStreamEndTime", "getDisplayScore", "getSource", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportybet/feature/dedicatedteampage/team/data/model/EventDataDto;", "equals", "other", "hashCode", "", "toString", "dedicated-team-page", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventDataDto {
    public static final int $stable = 8;

    @SerializedName("audioLiveProviderEnum")
    private final String audioLiveProvider;
    private final String awayLogoUri;
    private final String awayShortName;
    private final String displayScore;
    private final List<String> eventGameScore;
    private final String eventId;
    private final String eventMatchPeriod;
    private final String eventMatchStatus;
    private final String eventPlayedTime;
    private final String eventPointScore;
    private final String eventScore;
    private final String eventStatus;
    private final String fixtureAwayTeamId;
    private final String fixtureAwayTeamLogoUri;
    private final String fixtureAwayTeamName;
    private final String fixtureHomeTeamId;
    private final String fixtureHomeTeamLogoUri;
    private final String fixtureHomeTeamName;
    private final String fixtureSportId;
    private final long fixtureStartTime;
    private final String fixtureTournamentId;
    private final String fixtureTournamentName;
    private final String homeLogoUri;
    private final String homeShortName;
    private final Long liveStreamEndTime;
    private final String liveStreamProvider;
    private final Long liveStreamStartTime;
    private final boolean myFavourite;
    private final String source;
    private final String type;
    private final String youtubeHighlightsVideoId;

    public EventDataDto(String str, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, long j, String str15, boolean z, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Long l, Long l2, String str24, String str25, String str26) {
        str.getClass();
        this.eventId = str;
        this.eventScore = str2;
        this.eventGameScore = list;
        this.eventPointScore = str3;
        this.eventStatus = str4;
        this.eventMatchStatus = str5;
        this.eventMatchPeriod = str6;
        this.fixtureAwayTeamId = str7;
        this.fixtureAwayTeamName = str8;
        this.fixtureHomeTeamId = str9;
        this.fixtureHomeTeamName = str10;
        this.homeLogoUri = str11;
        this.awayLogoUri = str12;
        this.fixtureHomeTeamLogoUri = str13;
        this.fixtureAwayTeamLogoUri = str14;
        this.fixtureStartTime = j;
        this.eventPlayedTime = str15;
        this.myFavourite = z;
        this.fixtureTournamentId = str16;
        this.fixtureTournamentName = str17;
        this.fixtureSportId = str18;
        this.homeShortName = str19;
        this.awayShortName = str20;
        this.liveStreamProvider = str21;
        this.audioLiveProvider = str22;
        this.youtubeHighlightsVideoId = str23;
        this.liveStreamStartTime = l;
        this.liveStreamEndTime = l2;
        this.displayScore = str24;
        this.source = str25;
        this.type = str26;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventDataDto copy$default(EventDataDto eventDataDto, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, long j, String str15, boolean z, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Long l, Long l2, String str24, String str25, String str26, int i, Object obj) {
        String str27;
        String str28;
        String str29 = (i & 1) != 0 ? eventDataDto.eventId : str;
        String str30 = (i & 2) != 0 ? eventDataDto.eventScore : str2;
        List list2 = (i & 4) != 0 ? eventDataDto.eventGameScore : list;
        String str31 = (i & 8) != 0 ? eventDataDto.eventPointScore : str3;
        String str32 = (i & 16) != 0 ? eventDataDto.eventStatus : str4;
        String str33 = (i & 32) != 0 ? eventDataDto.eventMatchStatus : str5;
        String str34 = (i & 64) != 0 ? eventDataDto.eventMatchPeriod : str6;
        String str35 = (i & 128) != 0 ? eventDataDto.fixtureAwayTeamId : str7;
        String str36 = (i & 256) != 0 ? eventDataDto.fixtureAwayTeamName : str8;
        String str37 = (i & 512) != 0 ? eventDataDto.fixtureHomeTeamId : str9;
        String str38 = (i & 1024) != 0 ? eventDataDto.fixtureHomeTeamName : str10;
        String str39 = (i & 2048) != 0 ? eventDataDto.homeLogoUri : str11;
        String str40 = (i & 4096) != 0 ? eventDataDto.awayLogoUri : str12;
        String str41 = (i & 8192) != 0 ? eventDataDto.fixtureHomeTeamLogoUri : str13;
        String str42 = str29;
        String str43 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? eventDataDto.fixtureAwayTeamLogoUri : str14;
        long j2 = (i & 32768) != 0 ? eventDataDto.fixtureStartTime : j;
        String str44 = (i & 65536) != 0 ? eventDataDto.eventPlayedTime : str15;
        boolean z2 = (i & 131072) != 0 ? eventDataDto.myFavourite : z;
        String str45 = str44;
        String str46 = (i & 262144) != 0 ? eventDataDto.fixtureTournamentId : str16;
        String str47 = (i & 524288) != 0 ? eventDataDto.fixtureTournamentName : str17;
        String str48 = (i & 1048576) != 0 ? eventDataDto.fixtureSportId : str18;
        String str49 = (i & 2097152) != 0 ? eventDataDto.homeShortName : str19;
        String str50 = (i & 4194304) != 0 ? eventDataDto.awayShortName : str20;
        String str51 = (i & 8388608) != 0 ? eventDataDto.liveStreamProvider : str21;
        String str52 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? eventDataDto.audioLiveProvider : str22;
        String str53 = (i & 33554432) != 0 ? eventDataDto.youtubeHighlightsVideoId : str23;
        Long l3 = (i & 67108864) != 0 ? eventDataDto.liveStreamStartTime : l;
        Long l4 = (i & 134217728) != 0 ? eventDataDto.liveStreamEndTime : l2;
        String str54 = (i & 268435456) != 0 ? eventDataDto.displayScore : str24;
        String str55 = (i & 536870912) != 0 ? eventDataDto.source : str25;
        if ((i & 1073741824) != 0) {
            str28 = str55;
            str27 = eventDataDto.type;
        } else {
            str27 = str26;
            str28 = str55;
        }
        return eventDataDto.copy(str42, str30, list2, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str43, j2, str45, z2, str46, str47, str48, str49, str50, str51, str52, str53, l3, l4, str54, str28, str27);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFixtureHomeTeamId() {
        return this.fixtureHomeTeamId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFixtureHomeTeamName() {
        return this.fixtureHomeTeamName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getHomeLogoUri() {
        return this.homeLogoUri;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAwayLogoUri() {
        return this.awayLogoUri;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFixtureHomeTeamLogoUri() {
        return this.fixtureHomeTeamLogoUri;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFixtureAwayTeamLogoUri() {
        return this.fixtureAwayTeamLogoUri;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getFixtureStartTime() {
        return this.fixtureStartTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getEventPlayedTime() {
        return this.eventPlayedTime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getMyFavourite() {
        return this.myFavourite;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getFixtureTournamentId() {
        return this.fixtureTournamentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventScore() {
        return this.eventScore;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getFixtureTournamentName() {
        return this.fixtureTournamentName;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getFixtureSportId() {
        return this.fixtureSportId;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getHomeShortName() {
        return this.homeShortName;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAwayShortName() {
        return this.awayShortName;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getLiveStreamProvider() {
        return this.liveStreamProvider;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getAudioLiveProvider() {
        return this.audioLiveProvider;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getYoutubeHighlightsVideoId() {
        return this.youtubeHighlightsVideoId;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getLiveStreamStartTime() {
        return this.liveStreamStartTime;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Long getLiveStreamEndTime() {
        return this.liveStreamEndTime;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getDisplayScore() {
        return this.displayScore;
    }

    public final List<String> component3() {
        return this.eventGameScore;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventPointScore() {
        return this.eventPointScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEventStatus() {
        return this.eventStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEventMatchStatus() {
        return this.eventMatchStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEventMatchPeriod() {
        return this.eventMatchPeriod;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFixtureAwayTeamId() {
        return this.fixtureAwayTeamId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFixtureAwayTeamName() {
        return this.fixtureAwayTeamName;
    }

    public final EventDataDto copy(String eventId, String eventScore, List<String> eventGameScore, String eventPointScore, String eventStatus, String eventMatchStatus, String eventMatchPeriod, String fixtureAwayTeamId, String fixtureAwayTeamName, String fixtureHomeTeamId, String fixtureHomeTeamName, String homeLogoUri, String awayLogoUri, String fixtureHomeTeamLogoUri, String fixtureAwayTeamLogoUri, long fixtureStartTime, String eventPlayedTime, boolean myFavourite, String fixtureTournamentId, String fixtureTournamentName, String fixtureSportId, String homeShortName, String awayShortName, String liveStreamProvider, String audioLiveProvider, String youtubeHighlightsVideoId, Long liveStreamStartTime, Long liveStreamEndTime, String displayScore, String source, String type) {
        eventId.getClass();
        return new EventDataDto(eventId, eventScore, eventGameScore, eventPointScore, eventStatus, eventMatchStatus, eventMatchPeriod, fixtureAwayTeamId, fixtureAwayTeamName, fixtureHomeTeamId, fixtureHomeTeamName, homeLogoUri, awayLogoUri, fixtureHomeTeamLogoUri, fixtureAwayTeamLogoUri, fixtureStartTime, eventPlayedTime, myFavourite, fixtureTournamentId, fixtureTournamentName, fixtureSportId, homeShortName, awayShortName, liveStreamProvider, audioLiveProvider, youtubeHighlightsVideoId, liveStreamStartTime, liveStreamEndTime, displayScore, source, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDataDto)) {
            return false;
        }
        EventDataDto eventDataDto = (EventDataDto) other;
        return Intrinsics.g(this.eventId, eventDataDto.eventId) && Intrinsics.g(this.eventScore, eventDataDto.eventScore) && Intrinsics.g(this.eventGameScore, eventDataDto.eventGameScore) && Intrinsics.g(this.eventPointScore, eventDataDto.eventPointScore) && Intrinsics.g(this.eventStatus, eventDataDto.eventStatus) && Intrinsics.g(this.eventMatchStatus, eventDataDto.eventMatchStatus) && Intrinsics.g(this.eventMatchPeriod, eventDataDto.eventMatchPeriod) && Intrinsics.g(this.fixtureAwayTeamId, eventDataDto.fixtureAwayTeamId) && Intrinsics.g(this.fixtureAwayTeamName, eventDataDto.fixtureAwayTeamName) && Intrinsics.g(this.fixtureHomeTeamId, eventDataDto.fixtureHomeTeamId) && Intrinsics.g(this.fixtureHomeTeamName, eventDataDto.fixtureHomeTeamName) && Intrinsics.g(this.homeLogoUri, eventDataDto.homeLogoUri) && Intrinsics.g(this.awayLogoUri, eventDataDto.awayLogoUri) && Intrinsics.g(this.fixtureHomeTeamLogoUri, eventDataDto.fixtureHomeTeamLogoUri) && Intrinsics.g(this.fixtureAwayTeamLogoUri, eventDataDto.fixtureAwayTeamLogoUri) && this.fixtureStartTime == eventDataDto.fixtureStartTime && Intrinsics.g(this.eventPlayedTime, eventDataDto.eventPlayedTime) && this.myFavourite == eventDataDto.myFavourite && Intrinsics.g(this.fixtureTournamentId, eventDataDto.fixtureTournamentId) && Intrinsics.g(this.fixtureTournamentName, eventDataDto.fixtureTournamentName) && Intrinsics.g(this.fixtureSportId, eventDataDto.fixtureSportId) && Intrinsics.g(this.homeShortName, eventDataDto.homeShortName) && Intrinsics.g(this.awayShortName, eventDataDto.awayShortName) && Intrinsics.g(this.liveStreamProvider, eventDataDto.liveStreamProvider) && Intrinsics.g(this.audioLiveProvider, eventDataDto.audioLiveProvider) && Intrinsics.g(this.youtubeHighlightsVideoId, eventDataDto.youtubeHighlightsVideoId) && Intrinsics.g(this.liveStreamStartTime, eventDataDto.liveStreamStartTime) && Intrinsics.g(this.liveStreamEndTime, eventDataDto.liveStreamEndTime) && Intrinsics.g(this.displayScore, eventDataDto.displayScore) && Intrinsics.g(this.source, eventDataDto.source) && Intrinsics.g(this.type, eventDataDto.type);
    }

    public final String getAudioLiveProvider() {
        return this.audioLiveProvider;
    }

    public final String getAwayLogoUri() {
        return this.awayLogoUri;
    }

    public final String getAwayShortName() {
        return this.awayShortName;
    }

    public final String getDisplayScore() {
        return this.displayScore;
    }

    public final List<String> getEventGameScore() {
        return this.eventGameScore;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventMatchPeriod() {
        return this.eventMatchPeriod;
    }

    public final String getEventMatchStatus() {
        return this.eventMatchStatus;
    }

    public final String getEventPlayedTime() {
        return this.eventPlayedTime;
    }

    public final String getEventPointScore() {
        return this.eventPointScore;
    }

    public final String getEventScore() {
        return this.eventScore;
    }

    public final String getEventStatus() {
        return this.eventStatus;
    }

    public final String getFixtureAwayTeamId() {
        return this.fixtureAwayTeamId;
    }

    public final String getFixtureAwayTeamLogoUri() {
        return this.fixtureAwayTeamLogoUri;
    }

    public final String getFixtureAwayTeamName() {
        return this.fixtureAwayTeamName;
    }

    public final String getFixtureHomeTeamId() {
        return this.fixtureHomeTeamId;
    }

    public final String getFixtureHomeTeamLogoUri() {
        return this.fixtureHomeTeamLogoUri;
    }

    public final String getFixtureHomeTeamName() {
        return this.fixtureHomeTeamName;
    }

    public final String getFixtureSportId() {
        return this.fixtureSportId;
    }

    public final long getFixtureStartTime() {
        return this.fixtureStartTime;
    }

    public final String getFixtureTournamentId() {
        return this.fixtureTournamentId;
    }

    public final String getFixtureTournamentName() {
        return this.fixtureTournamentName;
    }

    public final String getHomeLogoUri() {
        return this.homeLogoUri;
    }

    public final String getHomeShortName() {
        return this.homeShortName;
    }

    public final Long getLiveStreamEndTime() {
        return this.liveStreamEndTime;
    }

    public final String getLiveStreamProvider() {
        return this.liveStreamProvider;
    }

    public final Long getLiveStreamStartTime() {
        return this.liveStreamStartTime;
    }

    public final boolean getMyFavourite() {
        return this.myFavourite;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getType() {
        return this.type;
    }

    public final String getYoutubeHighlightsVideoId() {
        return this.youtubeHighlightsVideoId;
    }

    public int hashCode() {
        int iHashCode = this.eventId.hashCode() * 31;
        String str = this.eventScore;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.eventGameScore;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.eventPointScore;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventStatus;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventMatchStatus;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventMatchPeriod;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fixtureAwayTeamId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fixtureAwayTeamName;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fixtureHomeTeamId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fixtureHomeTeamName;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.homeLogoUri;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.awayLogoUri;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fixtureHomeTeamLogoUri;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fixtureAwayTeamLogoUri;
        int iA = f87.a((iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31, this.fixtureStartTime, 31);
        String str14 = this.eventPlayedTime;
        int iA2 = mtg0.a((iA + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.myFavourite);
        String str15 = this.fixtureTournamentId;
        int iHashCode15 = (iA2 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.fixtureTournamentName;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.fixtureSportId;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.homeShortName;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.awayShortName;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.liveStreamProvider;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.audioLiveProvider;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.youtubeHighlightsVideoId;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Long l = this.liveStreamStartTime;
        int iHashCode23 = (iHashCode22 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.liveStreamEndTime;
        int iHashCode24 = (iHashCode23 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str23 = this.displayScore;
        int iHashCode25 = (iHashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.source;
        int iHashCode26 = (iHashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.type;
        return iHashCode26 + (str25 != null ? str25.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.eventScore;
        List<String> list = this.eventGameScore;
        String str3 = this.eventPointScore;
        String str4 = this.eventStatus;
        String str5 = this.eventMatchStatus;
        String str6 = this.eventMatchPeriod;
        String str7 = this.fixtureAwayTeamId;
        String str8 = this.fixtureAwayTeamName;
        String str9 = this.fixtureHomeTeamId;
        String str10 = this.fixtureHomeTeamName;
        String str11 = this.homeLogoUri;
        String str12 = this.awayLogoUri;
        String str13 = this.fixtureHomeTeamLogoUri;
        String str14 = this.fixtureAwayTeamLogoUri;
        long j = this.fixtureStartTime;
        String str15 = this.eventPlayedTime;
        boolean z = this.myFavourite;
        String str16 = this.fixtureTournamentId;
        String str17 = this.fixtureTournamentName;
        String str18 = this.fixtureSportId;
        String str19 = this.homeShortName;
        String str20 = this.awayShortName;
        String str21 = this.liveStreamProvider;
        String str22 = this.audioLiveProvider;
        String str23 = this.youtubeHighlightsVideoId;
        Long l = this.liveStreamStartTime;
        Long l2 = this.liveStreamEndTime;
        String str24 = this.displayScore;
        String str25 = this.source;
        String str26 = this.type;
        StringBuilder sbA = ux5.a("EventDataDto(eventId=", str, ", eventScore=", str2, ", eventGameScore=");
        gfs.a(", eventPointScore=", str3, ", eventStatus=", sbA, list);
        hxa.c(sbA, str4, ", eventMatchStatus=", str5, ", eventMatchPeriod=");
        hxa.c(sbA, str6, ", fixtureAwayTeamId=", str7, ", fixtureAwayTeamName=");
        hxa.c(sbA, str8, ", fixtureHomeTeamId=", str9, ", fixtureHomeTeamName=");
        hxa.c(sbA, str10, ", homeLogoUri=", str11, ", awayLogoUri=");
        hxa.c(sbA, str12, ", fixtureHomeTeamLogoUri=", str13, ", fixtureAwayTeamLogoUri=");
        l.a(j, str14, ", fixtureStartTime=", sbA);
        sbA.append(", eventPlayedTime=");
        sbA.append(str15);
        sbA.append(", myFavourite=");
        sbA.append(z);
        hxa.c(sbA, ", fixtureTournamentId=", str16, ", fixtureTournamentName=", str17);
        hxa.c(sbA, ", fixtureSportId=", str18, ", homeShortName=", str19);
        hxa.c(sbA, ", awayShortName=", str20, ", liveStreamProvider=", str21);
        hxa.c(sbA, ", audioLiveProvider=", str22, ", youtubeHighlightsVideoId=", str23);
        sbA.append(", liveStreamStartTime=");
        sbA.append(l);
        sbA.append(", liveStreamEndTime=");
        sbA.append(l2);
        hxa.c(sbA, ", displayScore=", str24, ", source=", str25);
        return pr0.a(sbA, ", type=", str26, ")");
    }
}
