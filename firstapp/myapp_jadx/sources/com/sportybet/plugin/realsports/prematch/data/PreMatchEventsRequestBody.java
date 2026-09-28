package com.sportybet.plugin.realsports.prematch.data;

import defpackage.ffp;
import defpackage.gpp;
import defpackage.lng;
import defpackage.ml5;
import defpackage.mtg0;
import defpackage.nrg0;
import defpackage.w03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0002KLBÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\bHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010C\u001a\u00020\u0017HÆ\u0003J\t\u0010D\u001a\u00020\u0017HÆ\u0003JÐ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010FJ\u0014\u0010G\u001a\u00020\u00172\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010I\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010J\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001f\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00103Ê\u0001\f\bN\u0012\b\bO\u0012\u0004\b\u0003\u0010\u0000¨\u0006M"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody;", "", "sportId", "", "order", "", "productId", "tournamentId", "", "startTime", "", "endTime", "timeline", "pageSize", "pageNum", "marketId", "oddsFilter", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$OddsFilter;", "userId", "timeZone", "timeFilter", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$TimeFilter;", "withOneUpMarket", "", "withTwoUpMarket", "<init>", "(Ljava/lang/String;IILjava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$OddsFilter;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$TimeFilter;ZZ)V", "getSportId", "()Ljava/lang/String;", "getOrder", "()I", "getProductId", "getTournamentId", "()Ljava/util/List;", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getTimeline", "getPageSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageNum", "getMarketId", "getOddsFilter", "()Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$OddsFilter;", "getUserId", "getTimeZone", "getTimeFilter", "()Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$TimeFilter;", "getWithOneUpMarket", "()Z", "getWithTwoUpMarket", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;IILjava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$OddsFilter;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$TimeFilter;ZZ)Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody;", "equals", "other", "hashCode", "toString", "OddsFilter", "TimeFilter", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PreMatchEventsRequestBody {
    public static final int $stable = 8;
    private final Long endTime;
    private final String marketId;
    private final OddsFilter oddsFilter;
    private final int order;
    private final Integer pageNum;
    private final Integer pageSize;
    private final int productId;
    private final String sportId;
    private final Long startTime;
    private final TimeFilter timeFilter;
    private final String timeZone;
    private final Long timeline;
    private final List<List<String>> tournamentId;
    private final String userId;
    private final boolean withOneUpMarket;
    private final boolean withTwoUpMarket;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$TimeFilter;", "", "startTime", "", "endTime", "timeline", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getTimeline", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$TimeFilter;", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class TimeFilter {
        public static final int $stable = 0;
        private final Long endTime;
        private final Long startTime;
        private final Long timeline;

        public TimeFilter(Long l, Long l2, Long l3) {
            this.startTime = l;
            this.endTime = l2;
            this.timeline = l3;
        }

        public static /* synthetic */ TimeFilter copy$default(TimeFilter timeFilter, Long l, Long l2, Long l3, int i, Object obj) {
            if ((i & 1) != 0) {
                l = timeFilter.startTime;
            }
            if ((i & 2) != 0) {
                l2 = timeFilter.endTime;
            }
            if ((i & 4) != 0) {
                l3 = timeFilter.timeline;
            }
            return timeFilter.copy(l, l2, l3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getTimeline() {
            return this.timeline;
        }

        public final TimeFilter copy(Long startTime, Long endTime, Long timeline) {
            return new TimeFilter(startTime, endTime, timeline);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeFilter)) {
                return false;
            }
            TimeFilter timeFilter = (TimeFilter) other;
            return Intrinsics.g(this.startTime, timeFilter.startTime) && Intrinsics.g(this.endTime, timeFilter.endTime) && Intrinsics.g(this.timeline, timeFilter.timeline);
        }

        public final Long getEndTime() {
            return this.endTime;
        }

        public final Long getStartTime() {
            return this.startTime;
        }

        public final Long getTimeline() {
            return this.timeline;
        }

        public int hashCode() {
            Long l = this.startTime;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.endTime;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.timeline;
            return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
        }

        public String toString() {
            return "TimeFilter(startTime=" + this.startTime + ", endTime=" + this.endTime + ", timeline=" + this.timeline + ")";
        }
    }

    public /* synthetic */ PreMatchEventsRequestBody(String str, int i, int i2, List list, Long l, Long l2, Long l3, Integer num, Integer num2, String str2, OddsFilter oddsFilter, String str3, String str4, TimeFilter timeFilter, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : l, (i3 & 32) != 0 ? null : l2, (i3 & 64) != 0 ? null : l3, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : str2, (i3 & 1024) != 0 ? null : oddsFilter, (i3 & 2048) != 0 ? null : str3, (i3 & 4096) != 0 ? null : str4, (i3 & 8192) != 0 ? null : timeFilter, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z, (i3 & 32768) != 0 ? true : z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final OddsFilter getOddsFilter() {
        return this.oddsFilter;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final TimeFilter getTimeFilter() {
        return this.timeFilter;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getWithOneUpMarket() {
        return this.withOneUpMarket;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getWithTwoUpMarket() {
        return this.withTwoUpMarket;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    public final List<List<String>> component4() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getTimeline() {
        return this.timeline;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getPageNum() {
        return this.pageNum;
    }

    public final PreMatchEventsRequestBody copy(String sportId, int order, int productId, List<? extends List<String>> tournamentId, Long startTime, Long endTime, Long timeline, Integer pageSize, Integer pageNum, String marketId, OddsFilter oddsFilter, String userId, String timeZone, TimeFilter timeFilter, boolean withOneUpMarket, boolean withTwoUpMarket) {
        sportId.getClass();
        return new PreMatchEventsRequestBody(sportId, order, productId, tournamentId, startTime, endTime, timeline, pageSize, pageNum, marketId, oddsFilter, userId, timeZone, timeFilter, withOneUpMarket, withTwoUpMarket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreMatchEventsRequestBody)) {
            return false;
        }
        PreMatchEventsRequestBody preMatchEventsRequestBody = (PreMatchEventsRequestBody) other;
        return Intrinsics.g(this.sportId, preMatchEventsRequestBody.sportId) && this.order == preMatchEventsRequestBody.order && this.productId == preMatchEventsRequestBody.productId && Intrinsics.g(this.tournamentId, preMatchEventsRequestBody.tournamentId) && Intrinsics.g(this.startTime, preMatchEventsRequestBody.startTime) && Intrinsics.g(this.endTime, preMatchEventsRequestBody.endTime) && Intrinsics.g(this.timeline, preMatchEventsRequestBody.timeline) && Intrinsics.g(this.pageSize, preMatchEventsRequestBody.pageSize) && Intrinsics.g(this.pageNum, preMatchEventsRequestBody.pageNum) && Intrinsics.g(this.marketId, preMatchEventsRequestBody.marketId) && Intrinsics.g(this.oddsFilter, preMatchEventsRequestBody.oddsFilter) && Intrinsics.g(this.userId, preMatchEventsRequestBody.userId) && Intrinsics.g(this.timeZone, preMatchEventsRequestBody.timeZone) && Intrinsics.g(this.timeFilter, preMatchEventsRequestBody.timeFilter) && this.withOneUpMarket == preMatchEventsRequestBody.withOneUpMarket && this.withTwoUpMarket == preMatchEventsRequestBody.withTwoUpMarket;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final OddsFilter getOddsFilter() {
        return this.oddsFilter;
    }

    public final int getOrder() {
        return this.order;
    }

    public final Integer getPageNum() {
        return this.pageNum;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final TimeFilter getTimeFilter() {
        return this.timeFilter;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final Long getTimeline() {
        return this.timeline;
    }

    public final List<List<String>> getTournamentId() {
        return this.tournamentId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean getWithOneUpMarket() {
        return this.withOneUpMarket;
    }

    public final boolean getWithTwoUpMarket() {
        return this.withTwoUpMarket;
    }

    public int hashCode() {
        int iA = gpp.a(this.productId, gpp.a(this.order, this.sportId.hashCode() * 31, 31), 31);
        List<List<String>> list = this.tournamentId;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.timeline;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.pageSize;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageNum;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.marketId;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        OddsFilter oddsFilter = this.oddsFilter;
        int iHashCode8 = (iHashCode7 + (oddsFilter == null ? 0 : oddsFilter.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeZone;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TimeFilter timeFilter = this.timeFilter;
        return Boolean.hashCode(this.withTwoUpMarket) + mtg0.a((iHashCode10 + (timeFilter != null ? timeFilter.hashCode() : 0)) * 31, 31, this.withOneUpMarket);
    }

    public String toString() {
        String str = this.sportId;
        int i = this.order;
        int i2 = this.productId;
        List<List<String>> list = this.tournamentId;
        Long l = this.startTime;
        Long l2 = this.endTime;
        Long l3 = this.timeline;
        Integer num = this.pageSize;
        Integer num2 = this.pageNum;
        String str2 = this.marketId;
        OddsFilter oddsFilter = this.oddsFilter;
        String str3 = this.userId;
        String str4 = this.timeZone;
        TimeFilter timeFilter = this.timeFilter;
        boolean z = this.withOneUpMarket;
        boolean z2 = this.withTwoUpMarket;
        StringBuilder sbA = ml5.a(i, "PreMatchEventsRequestBody(sportId=", str, ", order=", ", productId=");
        sbA.append(i2);
        sbA.append(", tournamentId=");
        sbA.append(list);
        sbA.append(", startTime=");
        sbA.append(l);
        sbA.append(", endTime=");
        sbA.append(l2);
        sbA.append(", timeline=");
        sbA.append(l3);
        sbA.append(", pageSize=");
        sbA.append(num);
        sbA.append(", pageNum=");
        w03.a(num2, ", marketId=", str2, ", oddsFilter=", sbA);
        sbA.append(oddsFilter);
        sbA.append(", userId=");
        sbA.append(str3);
        sbA.append(", timeZone=");
        sbA.append(str4);
        sbA.append(", timeFilter=");
        sbA.append(timeFilter);
        sbA.append(", withOneUpMarket=");
        return lng.a(", withTwoUpMarket=", ")", sbA, z, z2);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$OddsFilter;", "", "min", "", "max", "lastIndex", "", "<init>", "(DDLjava/lang/Integer;)V", "getMin", "()D", "getMax", "getLastIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(DDLjava/lang/Integer;)Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventsRequestBody$OddsFilter;", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OddsFilter {
        public static final int $stable = 0;
        private final Integer lastIndex;
        private final double max;
        private final double min;

        public /* synthetic */ OddsFilter(double d, double d2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, d2, (i & 4) != 0 ? null : num);
        }

        public static /* synthetic */ OddsFilter copy$default(OddsFilter oddsFilter, double d, double d2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                d = oddsFilter.min;
            }
            double d3 = d;
            if ((i & 2) != 0) {
                d2 = oddsFilter.max;
            }
            double d4 = d2;
            if ((i & 4) != 0) {
                num = oddsFilter.lastIndex;
            }
            return oddsFilter.copy(d3, d4, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getLastIndex() {
            return this.lastIndex;
        }

        public final OddsFilter copy(double min, double max, Integer lastIndex) {
            return new OddsFilter(min, max, lastIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OddsFilter)) {
                return false;
            }
            OddsFilter oddsFilter = (OddsFilter) other;
            return Double.compare(this.min, oddsFilter.min) == 0 && Double.compare(this.max, oddsFilter.max) == 0 && Intrinsics.g(this.lastIndex, oddsFilter.lastIndex);
        }

        public final Integer getLastIndex() {
            return this.lastIndex;
        }

        public final double getMax() {
            return this.max;
        }

        public final double getMin() {
            return this.min;
        }

        public int hashCode() {
            int iA = nrg0.a(Double.hashCode(this.min) * 31, 31, this.max);
            Integer num = this.lastIndex;
            return iA + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            double d = this.min;
            double d2 = this.max;
            Integer num = this.lastIndex;
            StringBuilder sbA = ffp.a(d, "OddsFilter(min=", ", max=");
            sbA.append(d2);
            sbA.append(", lastIndex=");
            sbA.append(num);
            sbA.append(")");
            return sbA.toString();
        }

        public OddsFilter(double d, double d2, Integer num) {
            this.min = d;
            this.max = d2;
            this.lastIndex = num;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreMatchEventsRequestBody(String str, int i, int i2, List<? extends List<String>> list, Long l, Long l2, Long l3, Integer num, Integer num2, String str2, OddsFilter oddsFilter, String str3, String str4, TimeFilter timeFilter, boolean z, boolean z2) {
        str.getClass();
        this.sportId = str;
        this.order = i;
        this.productId = i2;
        this.tournamentId = list;
        this.startTime = l;
        this.endTime = l2;
        this.timeline = l3;
        this.pageSize = num;
        this.pageNum = num2;
        this.marketId = str2;
        this.oddsFilter = oddsFilter;
        this.userId = str3;
        this.timeZone = str4;
        this.timeFilter = timeFilter;
        this.withOneUpMarket = z;
        this.withTwoUpMarket = z2;
    }
}
