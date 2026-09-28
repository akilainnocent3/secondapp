package com.sportybet.plugin.realsports.prematch.data;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import defpackage.dd3;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.u8;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\t\u0010V\u001a\u00020\tHÆ\u0003J\t\u0010W\u001a\u00020\u0007HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\u0007HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\u000fHÆ\u0003J\t\u0010\\\u001a\u00020\u0011HÆ\u0003J\t\u0010]\u001a\u00020\u0011HÆ\u0003J\t\u0010^\u001a\u00020\u0014HÆ\u0003J\t\u0010_\u001a\u00020\u0014HÆ\u0003J\t\u0010`\u001a\u00020\u0011HÆ\u0003J\t\u0010a\u001a\u00020\u0011HÆ\u0003J\t\u0010b\u001a\u00020\u0011HÆ\u0003J\t\u0010c\u001a\u00020\u0011HÆ\u0003J\t\u0010d\u001a\u00020\u0011HÆ\u0003J\t\u0010e\u001a\u00020\u0011HÆ\u0003J\t\u0010f\u001a\u00020\u0011HÆ\u0003J\t\u0010g\u001a\u00020\u0011HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fHÆ\u0003J\t\u0010i\u001a\u00020\"HÆ\u0003Jù\u0001\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\"HÆ\u0001J\u0014\u0010k\u001a\u00020\u00112\b\u0010l\u001a\u0004\u0018\u00010mHÖ\u0083\u0004J\n\u0010n\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010o\u001a\u00020\u0007HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00106\"\u0004\b>\u00108R\u001a\u0010\u0017\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00106\"\u0004\b@\u00108R\u001a\u0010\u0018\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00106\"\u0004\bB\u00108R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00106\"\u0004\bD\u00108R\u001a\u0010\u001a\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00106\"\u0004\bF\u00108R\u001a\u0010\u001b\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00106\"\u0004\bH\u00108R\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\u001a\u0010\u001d\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00106\"\u0004\bL\u00108R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RÊ\u0001\f\bq\u0012\b\br\u0012\u0004\b\u0003\u0010\u0000¨\u0006p"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventData;", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData;", "viewType", "", "selectedMarket", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "sportId", "", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "Lcom/sportybet/plugin/realsports/data/Event;", "categoryId", "categoryName", "tournamentId", "tournamentName", "startTime", "", "showTitle", "", "hasTournamentTitleBar", "oddsMin", "Ljava/math/BigDecimal;", "oddsMax", "haveOneUpMarket", "haveActiveOneUpMarket", "haveTwoUpMarket", "haveActiveTwoUpMarket", "haveDCOneUpMarket", "haveActiveDCOneUpMarket", "haveOUEarlyGoalsMarket", "haveActiveOUEarlyGoalsMarket", "filteredMarketList", "", "Lcom/sportybet/plugin/realsports/data/Market;", "eventContent", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventContent;", "<init>", "(ILcom/sportybet/plugin/realsports/type/RegularMarketRule;Ljava/lang/String;Lcom/sportybet/plugin/realsports/data/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZLjava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZZZZZLjava/util/List;Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventContent;)V", "getViewType", "()I", "getSelectedMarket", "()Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "setSelectedMarket", "(Lcom/sportybet/plugin/realsports/type/RegularMarketRule;)V", "getSportId", "()Ljava/lang/String;", "getEvent", "()Lcom/sportybet/plugin/realsports/data/Event;", "getCategoryId", "getCategoryName", "getTournamentId", "getTournamentName", "getStartTime", "()J", "getShowTitle", "()Z", "setShowTitle", "(Z)V", "getHasTournamentTitleBar", "getOddsMin", "()Ljava/math/BigDecimal;", "getOddsMax", "getHaveOneUpMarket", "setHaveOneUpMarket", "getHaveActiveOneUpMarket", "setHaveActiveOneUpMarket", "getHaveTwoUpMarket", "setHaveTwoUpMarket", "getHaveActiveTwoUpMarket", "setHaveActiveTwoUpMarket", "getHaveDCOneUpMarket", "setHaveDCOneUpMarket", "getHaveActiveDCOneUpMarket", "setHaveActiveDCOneUpMarket", "getHaveOUEarlyGoalsMarket", "setHaveOUEarlyGoalsMarket", "getHaveActiveOUEarlyGoalsMarket", "setHaveActiveOUEarlyGoalsMarket", "getFilteredMarketList", "()Ljava/util/List;", "setFilteredMarketList", "(Ljava/util/List;)V", "getEventContent", "()Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventContent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PreMatchEventData implements PreMatchSectionData {
    public static final int $stable = 8;
    private final String categoryId;
    private final String categoryName;
    private final Event event;
    private final PreMatchEventContent eventContent;
    private List<? extends Market> filteredMarketList;
    private final boolean hasTournamentTitleBar;
    private boolean haveActiveDCOneUpMarket;
    private boolean haveActiveOUEarlyGoalsMarket;
    private boolean haveActiveOneUpMarket;
    private boolean haveActiveTwoUpMarket;
    private boolean haveDCOneUpMarket;
    private boolean haveOUEarlyGoalsMarket;
    private boolean haveOneUpMarket;
    private boolean haveTwoUpMarket;
    private final BigDecimal oddsMax;
    private final BigDecimal oddsMin;
    private RegularMarketRule selectedMarket;
    private boolean showTitle;
    private final String sportId;
    private final long startTime;
    private final String tournamentId;
    private final String tournamentName;
    private final int viewType;

    public /* synthetic */ PreMatchEventData(int i, RegularMarketRule regularMarketRule, String str, Event event, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List list, PreMatchEventContent preMatchEventContent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Event event2;
        PreMatchEventContent preMatchEventContent2;
        boolean z11 = (i2 & 512) != 0 ? false : z;
        boolean z12 = (i2 & 1024) != 0 ? false : z2;
        boolean z13 = (131072 & i2) != 0 ? false : z7;
        boolean z14 = (262144 & i2) != 0 ? false : z8;
        List list2 = (2097152 & i2) != 0 ? null : list;
        if ((i2 & 4194304) != 0) {
            event2 = event;
            preMatchEventContent2 = new PreMatchEventContent(event2.marketHotTags);
        } else {
            event2 = event;
            preMatchEventContent2 = preMatchEventContent;
        }
        this(i, regularMarketRule, str, event2, str2, str3, str4, str5, j, z11, z12, bigDecimal, bigDecimal2, z3, z4, z5, z6, z13, z14, z9, z10, list2, preMatchEventContent2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreMatchEventData copy$default(PreMatchEventData preMatchEventData, int i, RegularMarketRule regularMarketRule, String str, Event event, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List list, PreMatchEventContent preMatchEventContent, int i2, Object obj) {
        PreMatchEventContent preMatchEventContent2;
        List list2;
        int i3 = (i2 & 1) != 0 ? preMatchEventData.viewType : i;
        RegularMarketRule regularMarketRule2 = (i2 & 2) != 0 ? preMatchEventData.selectedMarket : regularMarketRule;
        String str6 = (i2 & 4) != 0 ? preMatchEventData.sportId : str;
        Event event2 = (i2 & 8) != 0 ? preMatchEventData.event : event;
        String str7 = (i2 & 16) != 0 ? preMatchEventData.categoryId : str2;
        String str8 = (i2 & 32) != 0 ? preMatchEventData.categoryName : str3;
        String str9 = (i2 & 64) != 0 ? preMatchEventData.tournamentId : str4;
        String str10 = (i2 & 128) != 0 ? preMatchEventData.tournamentName : str5;
        long j2 = (i2 & 256) != 0 ? preMatchEventData.startTime : j;
        boolean z11 = (i2 & 512) != 0 ? preMatchEventData.showTitle : z;
        boolean z12 = (i2 & 1024) != 0 ? preMatchEventData.hasTournamentTitleBar : z2;
        BigDecimal bigDecimal3 = (i2 & 2048) != 0 ? preMatchEventData.oddsMin : bigDecimal;
        BigDecimal bigDecimal4 = (i2 & 4096) != 0 ? preMatchEventData.oddsMax : bigDecimal2;
        int i4 = i3;
        boolean z13 = (i2 & 8192) != 0 ? preMatchEventData.haveOneUpMarket : z3;
        boolean z14 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? preMatchEventData.haveActiveOneUpMarket : z4;
        boolean z15 = (i2 & 32768) != 0 ? preMatchEventData.haveTwoUpMarket : z5;
        boolean z16 = (i2 & 65536) != 0 ? preMatchEventData.haveActiveTwoUpMarket : z6;
        boolean z17 = (i2 & 131072) != 0 ? preMatchEventData.haveDCOneUpMarket : z7;
        boolean z18 = (i2 & 262144) != 0 ? preMatchEventData.haveActiveDCOneUpMarket : z8;
        boolean z19 = (i2 & 524288) != 0 ? preMatchEventData.haveOUEarlyGoalsMarket : z9;
        boolean z20 = (i2 & 1048576) != 0 ? preMatchEventData.haveActiveOUEarlyGoalsMarket : z10;
        List list3 = (i2 & 2097152) != 0 ? preMatchEventData.filteredMarketList : list;
        if ((i2 & 4194304) != 0) {
            list2 = list3;
            preMatchEventContent2 = preMatchEventData.eventContent;
        } else {
            preMatchEventContent2 = preMatchEventContent;
            list2 = list3;
        }
        return preMatchEventData.copy(i4, regularMarketRule2, str6, event2, str7, str8, str9, str10, j2, z11, z12, bigDecimal3, bigDecimal4, z13, z14, z15, z16, z17, z18, z19, z20, list2, preMatchEventContent2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getHasTournamentTitleBar() {
        return this.hasTournamentTitleBar;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getOddsMin() {
        return this.oddsMin;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getOddsMax() {
        return this.oddsMax;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getHaveOneUpMarket() {
        return this.haveOneUpMarket;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getHaveActiveOneUpMarket() {
        return this.haveActiveOneUpMarket;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getHaveTwoUpMarket() {
        return this.haveTwoUpMarket;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getHaveActiveTwoUpMarket() {
        return this.haveActiveTwoUpMarket;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getHaveDCOneUpMarket() {
        return this.haveDCOneUpMarket;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getHaveActiveDCOneUpMarket() {
        return this.haveActiveDCOneUpMarket;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RegularMarketRule getSelectedMarket() {
        return this.selectedMarket;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getHaveOUEarlyGoalsMarket() {
        return this.haveOUEarlyGoalsMarket;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getHaveActiveOUEarlyGoalsMarket() {
        return this.haveActiveOUEarlyGoalsMarket;
    }

    public final List<Market> component22() {
        return this.filteredMarketList;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final PreMatchEventContent getEventContent() {
        return this.eventContent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final PreMatchEventData copy(int viewType, RegularMarketRule selectedMarket, String sportId, Event event, String categoryId, String categoryName, String tournamentId, String tournamentName, long startTime, boolean showTitle, boolean hasTournamentTitleBar, BigDecimal oddsMin, BigDecimal oddsMax, boolean haveOneUpMarket, boolean haveActiveOneUpMarket, boolean haveTwoUpMarket, boolean haveActiveTwoUpMarket, boolean haveDCOneUpMarket, boolean haveActiveDCOneUpMarket, boolean haveOUEarlyGoalsMarket, boolean haveActiveOUEarlyGoalsMarket, List<? extends Market> filteredMarketList, PreMatchEventContent eventContent) {
        sportId.getClass();
        event.getClass();
        categoryId.getClass();
        categoryName.getClass();
        tournamentId.getClass();
        tournamentName.getClass();
        oddsMin.getClass();
        oddsMax.getClass();
        eventContent.getClass();
        return new PreMatchEventData(viewType, selectedMarket, sportId, event, categoryId, categoryName, tournamentId, tournamentName, startTime, showTitle, hasTournamentTitleBar, oddsMin, oddsMax, haveOneUpMarket, haveActiveOneUpMarket, haveTwoUpMarket, haveActiveTwoUpMarket, haveDCOneUpMarket, haveActiveDCOneUpMarket, haveOUEarlyGoalsMarket, haveActiveOUEarlyGoalsMarket, filteredMarketList, eventContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreMatchEventData)) {
            return false;
        }
        PreMatchEventData preMatchEventData = (PreMatchEventData) other;
        return this.viewType == preMatchEventData.viewType && Intrinsics.g(this.selectedMarket, preMatchEventData.selectedMarket) && Intrinsics.g(this.sportId, preMatchEventData.sportId) && Intrinsics.g(this.event, preMatchEventData.event) && Intrinsics.g(this.categoryId, preMatchEventData.categoryId) && Intrinsics.g(this.categoryName, preMatchEventData.categoryName) && Intrinsics.g(this.tournamentId, preMatchEventData.tournamentId) && Intrinsics.g(this.tournamentName, preMatchEventData.tournamentName) && this.startTime == preMatchEventData.startTime && this.showTitle == preMatchEventData.showTitle && this.hasTournamentTitleBar == preMatchEventData.hasTournamentTitleBar && Intrinsics.g(this.oddsMin, preMatchEventData.oddsMin) && Intrinsics.g(this.oddsMax, preMatchEventData.oddsMax) && this.haveOneUpMarket == preMatchEventData.haveOneUpMarket && this.haveActiveOneUpMarket == preMatchEventData.haveActiveOneUpMarket && this.haveTwoUpMarket == preMatchEventData.haveTwoUpMarket && this.haveActiveTwoUpMarket == preMatchEventData.haveActiveTwoUpMarket && this.haveDCOneUpMarket == preMatchEventData.haveDCOneUpMarket && this.haveActiveDCOneUpMarket == preMatchEventData.haveActiveDCOneUpMarket && this.haveOUEarlyGoalsMarket == preMatchEventData.haveOUEarlyGoalsMarket && this.haveActiveOUEarlyGoalsMarket == preMatchEventData.haveActiveOUEarlyGoalsMarket && Intrinsics.g(this.filteredMarketList, preMatchEventData.filteredMarketList) && Intrinsics.g(this.eventContent, preMatchEventData.eventContent);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final PreMatchEventContent getEventContent() {
        return this.eventContent;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public List<Market> getFilteredMarketList() {
        return this.filteredMarketList;
    }

    public final boolean getHasTournamentTitleBar() {
        return this.hasTournamentTitleBar;
    }

    public final boolean getHaveActiveDCOneUpMarket() {
        return this.haveActiveDCOneUpMarket;
    }

    public final boolean getHaveActiveOUEarlyGoalsMarket() {
        return this.haveActiveOUEarlyGoalsMarket;
    }

    public final boolean getHaveActiveOneUpMarket() {
        return this.haveActiveOneUpMarket;
    }

    public final boolean getHaveActiveTwoUpMarket() {
        return this.haveActiveTwoUpMarket;
    }

    public final boolean getHaveDCOneUpMarket() {
        return this.haveDCOneUpMarket;
    }

    public final boolean getHaveOUEarlyGoalsMarket() {
        return this.haveOUEarlyGoalsMarket;
    }

    public final boolean getHaveOneUpMarket() {
        return this.haveOneUpMarket;
    }

    public final boolean getHaveTwoUpMarket() {
        return this.haveTwoUpMarket;
    }

    public final BigDecimal getOddsMax() {
        return this.oddsMax;
    }

    public final BigDecimal getOddsMin() {
        return this.oddsMin;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public RegularMarketRule getSelectedMarket() {
        return this.selectedMarket;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public final String getTournamentName() {
        return this.tournamentName;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.viewType) * 31;
        RegularMarketRule regularMarketRule = this.selectedMarket;
        int iA = mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(dd3.a(this.oddsMax, dd3.a(this.oddsMin, mtg0.a(mtg0.a(f87.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((this.event.hashCode() + gmf0.a((iHashCode + (regularMarketRule == null ? 0 : regularMarketRule.hashCode())) * 31, 31, this.sportId)) * 31, 31, this.categoryId), 31, this.categoryName), 31, this.tournamentId), 31, this.tournamentName), this.startTime, 31), 31, this.showTitle), 31, this.hasTournamentTitleBar), 31), 31), 31, this.haveOneUpMarket), 31, this.haveActiveOneUpMarket), 31, this.haveTwoUpMarket), 31, this.haveActiveTwoUpMarket), 31, this.haveDCOneUpMarket), 31, this.haveActiveDCOneUpMarket), 31, this.haveOUEarlyGoalsMarket), 31, this.haveActiveOUEarlyGoalsMarket);
        List<? extends Market> list = this.filteredMarketList;
        return this.eventContent.hashCode() + ((iA + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public void setFilteredMarketList(List<? extends Market> list) {
        this.filteredMarketList = list;
    }

    public final void setHaveActiveDCOneUpMarket(boolean z) {
        this.haveActiveDCOneUpMarket = z;
    }

    public final void setHaveActiveOUEarlyGoalsMarket(boolean z) {
        this.haveActiveOUEarlyGoalsMarket = z;
    }

    public final void setHaveActiveOneUpMarket(boolean z) {
        this.haveActiveOneUpMarket = z;
    }

    public final void setHaveActiveTwoUpMarket(boolean z) {
        this.haveActiveTwoUpMarket = z;
    }

    public final void setHaveDCOneUpMarket(boolean z) {
        this.haveDCOneUpMarket = z;
    }

    public final void setHaveOUEarlyGoalsMarket(boolean z) {
        this.haveOUEarlyGoalsMarket = z;
    }

    public final void setHaveOneUpMarket(boolean z) {
        this.haveOneUpMarket = z;
    }

    public final void setHaveTwoUpMarket(boolean z) {
        this.haveTwoUpMarket = z;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public void setSelectedMarket(RegularMarketRule regularMarketRule) {
        this.selectedMarket = regularMarketRule;
    }

    public final void setShowTitle(boolean z) {
        this.showTitle = z;
    }

    public String toString() {
        int i = this.viewType;
        RegularMarketRule regularMarketRule = this.selectedMarket;
        String str = this.sportId;
        Event event = this.event;
        String str2 = this.categoryId;
        String str3 = this.categoryName;
        String str4 = this.tournamentId;
        String str5 = this.tournamentName;
        long j = this.startTime;
        boolean z = this.showTitle;
        boolean z2 = this.hasTournamentTitleBar;
        BigDecimal bigDecimal = this.oddsMin;
        BigDecimal bigDecimal2 = this.oddsMax;
        boolean z3 = this.haveOneUpMarket;
        boolean z4 = this.haveActiveOneUpMarket;
        boolean z5 = this.haveTwoUpMarket;
        boolean z6 = this.haveActiveTwoUpMarket;
        boolean z7 = this.haveDCOneUpMarket;
        boolean z8 = this.haveActiveDCOneUpMarket;
        boolean z9 = this.haveOUEarlyGoalsMarket;
        boolean z10 = this.haveActiveOUEarlyGoalsMarket;
        List<? extends Market> list = this.filteredMarketList;
        PreMatchEventContent preMatchEventContent = this.eventContent;
        StringBuilder sb = new StringBuilder("PreMatchEventData(viewType=");
        sb.append(i);
        sb.append(", selectedMarket=");
        sb.append(regularMarketRule);
        sb.append(", sportId=");
        sb.append(str);
        sb.append(", event=");
        sb.append(event);
        sb.append(", categoryId=");
        hxa.c(sb, str2, ", categoryName=", str3, ", tournamentId=");
        hxa.c(sb, str4, vZBMKENANSz.hOqQovrJq, str5, ", startTime=");
        sb.append(j);
        sb.append(", showTitle=");
        sb.append(z);
        sb.append(", hasTournamentTitleBar=");
        sb.append(z2);
        sb.append(", oddsMin=");
        sb.append(bigDecimal);
        sb.append(", oddsMax=");
        sb.append(bigDecimal2);
        sb.append(", haveOneUpMarket=");
        sb.append(z3);
        u8.a(", haveActiveOneUpMarket=", ", haveTwoUpMarket=", sb, z4, z5);
        u8.a(", haveActiveTwoUpMarket=", ", haveDCOneUpMarket=", sb, z6, z7);
        u8.a(", haveActiveDCOneUpMarket=", ", haveOUEarlyGoalsMarket=", sb, z8, z9);
        sb.append(", haveActiveOUEarlyGoalsMarket=");
        sb.append(z10);
        sb.append(", filteredMarketList=");
        sb.append(list);
        sb.append(", eventContent=");
        sb.append(preMatchEventContent);
        sb.append(")");
        return sb.toString();
    }

    public PreMatchEventData(int i, RegularMarketRule regularMarketRule, String str, Event event, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List<? extends Market> list, PreMatchEventContent preMatchEventContent) {
        str.getClass();
        event.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        preMatchEventContent.getClass();
        this.viewType = i;
        this.selectedMarket = regularMarketRule;
        this.sportId = str;
        this.event = event;
        this.categoryId = str2;
        this.categoryName = str3;
        this.tournamentId = str4;
        this.tournamentName = str5;
        this.startTime = j;
        this.showTitle = z;
        this.hasTournamentTitleBar = z2;
        this.oddsMin = bigDecimal;
        this.oddsMax = bigDecimal2;
        this.haveOneUpMarket = z3;
        this.haveActiveOneUpMarket = z4;
        this.haveTwoUpMarket = z5;
        this.haveActiveTwoUpMarket = z6;
        this.haveDCOneUpMarket = z7;
        this.haveActiveDCOneUpMarket = z8;
        this.haveOUEarlyGoalsMarket = z9;
        this.haveActiveOUEarlyGoalsMarket = z10;
        this.filteredMarketList = list;
        this.eventContent = preMatchEventContent;
    }
}
