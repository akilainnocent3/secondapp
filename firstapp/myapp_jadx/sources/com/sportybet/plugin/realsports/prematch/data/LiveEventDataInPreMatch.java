package com.sportybet.plugin.realsports.prematch.data;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import defpackage.dd3;
import defpackage.gmf0;
import defpackage.iib0;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.uts;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\fHÆ\u0003J\t\u0010L\u001a\u00020\u000eHÆ\u0003J\t\u0010M\u001a\u00020\u000eHÆ\u0003J\t\u0010N\u001a\u00020\fHÆ\u0003J\t\u0010O\u001a\u00020\fHÆ\u0003J\t\u0010P\u001a\u00020\fHÆ\u0003J\t\u0010Q\u001a\u00020\fHÆ\u0003J\t\u0010R\u001a\u00020\fHÆ\u0003J\t\u0010S\u001a\u00020\fHÆ\u0003J\t\u0010T\u001a\u00020\fHÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\t\u0010W\u001a\u00020\u001cHÆ\u0003JÇ\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0014\u0010Y\u001a\u00020\f2\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0083\u0004J\n\u0010\\\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010]\u001a\u00020\u0007HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u00101R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u00101R\u001a\u0010\u0012\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010+\"\u0004\b5\u00101R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010+\"\u0004\b7\u00101R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u00101R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u00101R\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010+\"\u0004\b=\u00101R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010+\"\u0004\b?\u00101R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bD\u0010EÊ\u0001\f\b_\u0012\b\b`\u0012\u0004\b\u0003\u0010\u0000¨\u0006^"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/LiveEventDataInPreMatch;", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData;", "viewType", "", "selectedMarket", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "sportId", "", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "Lcom/sportybet/plugin/realsports/data/Event;", "tournamentId", "showTitle", "", "oddsMin", "Ljava/math/BigDecimal;", "oddsMax", "haveOneUpMarket", "haveActiveOneUpMarket", "haveTwoUpMarket", "haveActiveTwoUpMarket", "haveDCOneUpMarket", "haveActiveDCOneUpMarket", "haveOUEarlyGoalsMarket", "haveActiveOUEarlyGoalsMarket", "filteredMarketList", "", "Lcom/sportybet/plugin/realsports/data/Market;", AnalyticsParam.EVENT_PARAM_ID, "Ljava/util/UUID;", "<init>", "(ILcom/sportybet/plugin/realsports/type/RegularMarketRule;Ljava/lang/String;Lcom/sportybet/plugin/realsports/data/Event;Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZZZZZLjava/util/List;Ljava/util/UUID;)V", "getViewType", "()I", "getSelectedMarket", "()Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "setSelectedMarket", "(Lcom/sportybet/plugin/realsports/type/RegularMarketRule;)V", "getSportId", "()Ljava/lang/String;", "getEvent", "()Lcom/sportybet/plugin/realsports/data/Event;", "getTournamentId", "getShowTitle", "()Z", "getOddsMin", "()Ljava/math/BigDecimal;", "getOddsMax", "getHaveOneUpMarket", "setHaveOneUpMarket", "(Z)V", "getHaveActiveOneUpMarket", "setHaveActiveOneUpMarket", "getHaveTwoUpMarket", "setHaveTwoUpMarket", "getHaveActiveTwoUpMarket", "setHaveActiveTwoUpMarket", "getHaveDCOneUpMarket", "setHaveDCOneUpMarket", "getHaveActiveDCOneUpMarket", "setHaveActiveDCOneUpMarket", "getHaveOUEarlyGoalsMarket", "setHaveOUEarlyGoalsMarket", "getHaveActiveOUEarlyGoalsMarket", "setHaveActiveOUEarlyGoalsMarket", "getFilteredMarketList", "()Ljava/util/List;", "setFilteredMarketList", "(Ljava/util/List;)V", "getId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveEventDataInPreMatch implements PreMatchSectionData {
    public static final int $stable = 8;
    private final Event event;
    private List<? extends Market> filteredMarketList;
    private boolean haveActiveDCOneUpMarket;
    private boolean haveActiveOUEarlyGoalsMarket;
    private boolean haveActiveOneUpMarket;
    private boolean haveActiveTwoUpMarket;
    private boolean haveDCOneUpMarket;
    private boolean haveOUEarlyGoalsMarket;
    private boolean haveOneUpMarket;
    private boolean haveTwoUpMarket;
    private final UUID id;
    private final BigDecimal oddsMax;
    private final BigDecimal oddsMin;
    private RegularMarketRule selectedMarket;
    private final boolean showTitle;
    private final String sportId;
    private final String tournamentId;
    private final int viewType;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LiveEventDataInPreMatch(int i, RegularMarketRule regularMarketRule, String str, Event event, String str2, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List list, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        UUID uuid2;
        boolean z10 = (i2 & 32) != 0 ? false : z;
        boolean z11 = (i2 & 4096) != 0 ? false : z6;
        boolean z12 = (i2 & 8192) != 0 ? false : z7;
        List list2 = (65536 & i2) != 0 ? null : list;
        if ((i2 & 131072) != 0) {
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            uuid2 = uuidRandomUUID;
        } else {
            uuid2 = uuid;
        }
        this(i, regularMarketRule, str, event, str2, z10, bigDecimal, bigDecimal2, z2, z3, z4, z5, z11, z12, z8, z9, list2, uuid2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveEventDataInPreMatch copy$default(LiveEventDataInPreMatch liveEventDataInPreMatch, int i, RegularMarketRule regularMarketRule, String str, Event event, String str2, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List list, UUID uuid, int i2, Object obj) {
        UUID uuid2;
        List list2;
        int i3 = (i2 & 1) != 0 ? liveEventDataInPreMatch.viewType : i;
        RegularMarketRule regularMarketRule2 = (i2 & 2) != 0 ? liveEventDataInPreMatch.selectedMarket : regularMarketRule;
        String str3 = (i2 & 4) != 0 ? liveEventDataInPreMatch.sportId : str;
        Event event2 = (i2 & 8) != 0 ? liveEventDataInPreMatch.event : event;
        String str4 = (i2 & 16) != 0 ? liveEventDataInPreMatch.tournamentId : str2;
        boolean z10 = (i2 & 32) != 0 ? liveEventDataInPreMatch.showTitle : z;
        BigDecimal bigDecimal3 = (i2 & 64) != 0 ? liveEventDataInPreMatch.oddsMin : bigDecimal;
        BigDecimal bigDecimal4 = (i2 & 128) != 0 ? liveEventDataInPreMatch.oddsMax : bigDecimal2;
        boolean z11 = (i2 & 256) != 0 ? liveEventDataInPreMatch.haveOneUpMarket : z2;
        boolean z12 = (i2 & 512) != 0 ? liveEventDataInPreMatch.haveActiveOneUpMarket : z3;
        boolean z13 = (i2 & 1024) != 0 ? liveEventDataInPreMatch.haveTwoUpMarket : z4;
        boolean z14 = (i2 & 2048) != 0 ? liveEventDataInPreMatch.haveActiveTwoUpMarket : z5;
        boolean z15 = (i2 & 4096) != 0 ? liveEventDataInPreMatch.haveDCOneUpMarket : z6;
        boolean z16 = (i2 & 8192) != 0 ? liveEventDataInPreMatch.haveActiveDCOneUpMarket : z7;
        int i4 = i3;
        boolean z17 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? liveEventDataInPreMatch.haveOUEarlyGoalsMarket : z8;
        boolean z18 = (i2 & 32768) != 0 ? liveEventDataInPreMatch.haveActiveOUEarlyGoalsMarket : z9;
        List list3 = (i2 & 65536) != 0 ? liveEventDataInPreMatch.filteredMarketList : list;
        if ((i2 & 131072) != 0) {
            list2 = list3;
            uuid2 = liveEventDataInPreMatch.id;
        } else {
            uuid2 = uuid;
            list2 = list3;
        }
        return liveEventDataInPreMatch.copy(i4, regularMarketRule2, str3, event2, str4, z10, bigDecimal3, bigDecimal4, z11, z12, z13, z14, z15, z16, z17, z18, list2, uuid2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHaveActiveOneUpMarket() {
        return this.haveActiveOneUpMarket;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getHaveTwoUpMarket() {
        return this.haveTwoUpMarket;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getHaveActiveTwoUpMarket() {
        return this.haveActiveTwoUpMarket;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getHaveDCOneUpMarket() {
        return this.haveDCOneUpMarket;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getHaveActiveDCOneUpMarket() {
        return this.haveActiveDCOneUpMarket;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getHaveOUEarlyGoalsMarket() {
        return this.haveOUEarlyGoalsMarket;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getHaveActiveOUEarlyGoalsMarket() {
        return this.haveActiveOUEarlyGoalsMarket;
    }

    public final List<Market> component17() {
        return this.filteredMarketList;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RegularMarketRule getSelectedMarket() {
        return this.selectedMarket;
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
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getOddsMin() {
        return this.oddsMin;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getOddsMax() {
        return this.oddsMax;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHaveOneUpMarket() {
        return this.haveOneUpMarket;
    }

    public final LiveEventDataInPreMatch copy(int viewType, RegularMarketRule selectedMarket, String sportId, Event event, String tournamentId, boolean showTitle, BigDecimal oddsMin, BigDecimal oddsMax, boolean haveOneUpMarket, boolean haveActiveOneUpMarket, boolean haveTwoUpMarket, boolean haveActiveTwoUpMarket, boolean haveDCOneUpMarket, boolean haveActiveDCOneUpMarket, boolean haveOUEarlyGoalsMarket, boolean haveActiveOUEarlyGoalsMarket, List<? extends Market> filteredMarketList, UUID id) {
        sportId.getClass();
        event.getClass();
        tournamentId.getClass();
        oddsMin.getClass();
        oddsMax.getClass();
        id.getClass();
        return new LiveEventDataInPreMatch(viewType, selectedMarket, sportId, event, tournamentId, showTitle, oddsMin, oddsMax, haveOneUpMarket, haveActiveOneUpMarket, haveTwoUpMarket, haveActiveTwoUpMarket, haveDCOneUpMarket, haveActiveDCOneUpMarket, haveOUEarlyGoalsMarket, haveActiveOUEarlyGoalsMarket, filteredMarketList, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveEventDataInPreMatch)) {
            return false;
        }
        LiveEventDataInPreMatch liveEventDataInPreMatch = (LiveEventDataInPreMatch) other;
        return this.viewType == liveEventDataInPreMatch.viewType && Intrinsics.g(this.selectedMarket, liveEventDataInPreMatch.selectedMarket) && Intrinsics.g(this.sportId, liveEventDataInPreMatch.sportId) && Intrinsics.g(this.event, liveEventDataInPreMatch.event) && Intrinsics.g(this.tournamentId, liveEventDataInPreMatch.tournamentId) && this.showTitle == liveEventDataInPreMatch.showTitle && Intrinsics.g(this.oddsMin, liveEventDataInPreMatch.oddsMin) && Intrinsics.g(this.oddsMax, liveEventDataInPreMatch.oddsMax) && this.haveOneUpMarket == liveEventDataInPreMatch.haveOneUpMarket && this.haveActiveOneUpMarket == liveEventDataInPreMatch.haveActiveOneUpMarket && this.haveTwoUpMarket == liveEventDataInPreMatch.haveTwoUpMarket && this.haveActiveTwoUpMarket == liveEventDataInPreMatch.haveActiveTwoUpMarket && this.haveDCOneUpMarket == liveEventDataInPreMatch.haveDCOneUpMarket && this.haveActiveDCOneUpMarket == liveEventDataInPreMatch.haveActiveDCOneUpMarket && this.haveOUEarlyGoalsMarket == liveEventDataInPreMatch.haveOUEarlyGoalsMarket && this.haveActiveOUEarlyGoalsMarket == liveEventDataInPreMatch.haveActiveOUEarlyGoalsMarket && Intrinsics.g(this.filteredMarketList, liveEventDataInPreMatch.filteredMarketList) && Intrinsics.g(this.id, liveEventDataInPreMatch.id);
    }

    public final Event getEvent() {
        return this.event;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public List<Market> getFilteredMarketList() {
        return this.filteredMarketList;
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

    public final UUID getId() {
        return this.id;
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

    public final String getTournamentId() {
        return this.tournamentId;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.viewType) * 31;
        RegularMarketRule regularMarketRule = this.selectedMarket;
        int iA = mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(dd3.a(this.oddsMax, dd3.a(this.oddsMin, mtg0.a(gmf0.a((this.event.hashCode() + gmf0.a((iHashCode + (regularMarketRule == null ? 0 : regularMarketRule.hashCode())) * 31, 31, this.sportId)) * 31, 31, this.tournamentId), 31, this.showTitle), 31), 31), 31, this.haveOneUpMarket), 31, this.haveActiveOneUpMarket), 31, this.haveTwoUpMarket), 31, this.haveActiveTwoUpMarket), 31, this.haveDCOneUpMarket), 31, this.haveActiveDCOneUpMarket), 31, this.haveOUEarlyGoalsMarket), 31, this.haveActiveOUEarlyGoalsMarket);
        List<? extends Market> list = this.filteredMarketList;
        return this.id.hashCode() + ((iA + (list != null ? list.hashCode() : 0)) * 31);
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

    public String toString() {
        int i = this.viewType;
        RegularMarketRule regularMarketRule = this.selectedMarket;
        String str = this.sportId;
        Event event = this.event;
        String str2 = this.tournamentId;
        boolean z = this.showTitle;
        BigDecimal bigDecimal = this.oddsMin;
        BigDecimal bigDecimal2 = this.oddsMax;
        boolean z2 = this.haveOneUpMarket;
        boolean z3 = this.haveActiveOneUpMarket;
        boolean z4 = this.haveTwoUpMarket;
        boolean z5 = this.haveActiveTwoUpMarket;
        boolean z6 = this.haveDCOneUpMarket;
        boolean z7 = this.haveActiveDCOneUpMarket;
        boolean z8 = this.haveOUEarlyGoalsMarket;
        boolean z9 = this.haveActiveOUEarlyGoalsMarket;
        List<? extends Market> list = this.filteredMarketList;
        UUID uuid = this.id;
        StringBuilder sb = new StringBuilder("LiveEventDataInPreMatch(viewType=");
        sb.append(i);
        sb.append(", selectedMarket=");
        sb.append(regularMarketRule);
        sb.append(", sportId=");
        sb.append(str);
        sb.append(", event=");
        sb.append(event);
        sb.append(", tournamentId=");
        uts.b(str2, ", showTitle=", ", oddsMin=", sb, z);
        iib0.b(sb, bigDecimal, ", oddsMax=", bigDecimal2, ", haveOneUpMarket=");
        nng.a(", haveActiveOneUpMarket=", ", haveTwoUpMarket=", sb, z2, z3);
        nng.a(", haveActiveTwoUpMarket=", ", haveDCOneUpMarket=", sb, z4, z5);
        nng.a(", haveActiveDCOneUpMarket=", ", haveOUEarlyGoalsMarket=", sb, z6, z7);
        nng.a(", haveActiveOUEarlyGoalsMarket=", ", filteredMarketList=", sb, z8, z9);
        sb.append(list);
        sb.append(", id=");
        sb.append(uuid);
        sb.append(")");
        return sb.toString();
    }

    public LiveEventDataInPreMatch(int i, RegularMarketRule regularMarketRule, String str, Event event, String str2, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List<? extends Market> list, UUID uuid) {
        str.getClass();
        event.getClass();
        str2.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        uuid.getClass();
        this.viewType = i;
        this.selectedMarket = regularMarketRule;
        this.sportId = str;
        this.event = event;
        this.tournamentId = str2;
        this.showTitle = z;
        this.oddsMin = bigDecimal;
        this.oddsMax = bigDecimal2;
        this.haveOneUpMarket = z2;
        this.haveActiveOneUpMarket = z3;
        this.haveTwoUpMarket = z4;
        this.haveActiveTwoUpMarket = z5;
        this.haveDCOneUpMarket = z6;
        this.haveActiveDCOneUpMarket = z7;
        this.haveOUEarlyGoalsMarket = z8;
        this.haveActiveOUEarlyGoalsMarket = z9;
        this.filteredMarketList = list;
        this.id = uuid;
    }
}
