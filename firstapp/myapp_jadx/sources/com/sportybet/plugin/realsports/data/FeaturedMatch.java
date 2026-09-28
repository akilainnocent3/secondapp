package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nng;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003Ju\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u00104\u001a\u00020\r2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u000207HÖ\u0081\u0004J\n\u00108\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u001fR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018Ê\u0001\f\b:\u0012\b\b;\u0012\u0004\b\u0003\u0010\u0000¨\u00069"}, d2 = {"Lcom/sportybet/plugin/realsports/data/FeaturedMatch;", "", AnalyticsParam.EVENT_PARAM_ID, "", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "Lcom/sportybet/plugin/realsports/data/Event;", AnalyticsParam.MARKET_PARAM_MARKET, "Lcom/sportybet/plugin/realsports/data/Market;", "marketTitles", "", "marketDescMain", "marketDescSub", "showBoost", "", "displayDefaultIcon", "isTeamPagesEnabled", "pcbbReplacementMarket", "<init>", "(Ljava/lang/String;Lcom/sportybet/plugin/realsports/data/Event;Lcom/sportybet/plugin/realsports/data/Market;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZZLcom/sportybet/plugin/realsports/data/Market;)V", "getId", "()Ljava/lang/String;", "getEvent", "()Lcom/sportybet/plugin/realsports/data/Event;", "getMarket", "()Lcom/sportybet/plugin/realsports/data/Market;", "setMarket", "(Lcom/sportybet/plugin/realsports/data/Market;)V", "getMarketTitles", "()Ljava/util/List;", "getMarketDescMain", "setMarketDescMain", "(Ljava/lang/String;)V", "getMarketDescSub", "setMarketDescSub", "getShowBoost", "()Z", "setShowBoost", "(Z)V", "getDisplayDefaultIcon", "setDisplayDefaultIcon", "getPcbbReplacementMarket", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeaturedMatch {
    public static final int $stable = 8;
    private boolean displayDefaultIcon;
    private final Event event;
    private final String id;
    private final boolean isTeamPagesEnabled;
    private Market market;
    private String marketDescMain;
    private String marketDescSub;
    private final List<String> marketTitles;
    private final Market pcbbReplacementMarket;
    private boolean showBoost;

    public FeaturedMatch(String str, Event event, Market market, List<String> list, String str2, String str3, boolean z, boolean z2, boolean z3, Market market2) {
        str.getClass();
        event.getClass();
        market.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        this.id = str;
        this.event = event;
        this.market = market;
        this.marketTitles = list;
        this.marketDescMain = str2;
        this.marketDescSub = str3;
        this.showBoost = z;
        this.displayDefaultIcon = z2;
        this.isTeamPagesEnabled = z3;
        this.pcbbReplacementMarket = market2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeaturedMatch copy$default(FeaturedMatch featuredMatch, String str, Event event, Market market, List list, String str2, String str3, boolean z, boolean z2, boolean z3, Market market2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featuredMatch.id;
        }
        if ((i & 2) != 0) {
            event = featuredMatch.event;
        }
        if ((i & 4) != 0) {
            market = featuredMatch.market;
        }
        if ((i & 8) != 0) {
            list = featuredMatch.marketTitles;
        }
        if ((i & 16) != 0) {
            str2 = featuredMatch.marketDescMain;
        }
        if ((i & 32) != 0) {
            str3 = featuredMatch.marketDescSub;
        }
        if ((i & 64) != 0) {
            z = featuredMatch.showBoost;
        }
        if ((i & 128) != 0) {
            z2 = featuredMatch.displayDefaultIcon;
        }
        if ((i & 256) != 0) {
            z3 = featuredMatch.isTeamPagesEnabled;
        }
        if ((i & 512) != 0) {
            market2 = featuredMatch.pcbbReplacementMarket;
        }
        boolean z4 = z3;
        Market market3 = market2;
        boolean z5 = z;
        boolean z6 = z2;
        String str4 = str2;
        String str5 = str3;
        return featuredMatch.copy(str, event, market, list, str4, str5, z5, z6, z4, market3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Market getPcbbReplacementMarket() {
        return this.pcbbReplacementMarket;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Market getMarket() {
        return this.market;
    }

    public final List<String> component4() {
        return this.marketTitles;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMarketDescMain() {
        return this.marketDescMain;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketDescSub() {
        return this.marketDescSub;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowBoost() {
        return this.showBoost;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDisplayDefaultIcon() {
        return this.displayDefaultIcon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsTeamPagesEnabled() {
        return this.isTeamPagesEnabled;
    }

    public final FeaturedMatch copy(String id, Event event, Market market, List<String> marketTitles, String marketDescMain, String marketDescSub, boolean showBoost, boolean displayDefaultIcon, boolean isTeamPagesEnabled, Market pcbbReplacementMarket) {
        id.getClass();
        event.getClass();
        market.getClass();
        marketTitles.getClass();
        marketDescMain.getClass();
        marketDescSub.getClass();
        return new FeaturedMatch(id, event, market, marketTitles, marketDescMain, marketDescSub, showBoost, displayDefaultIcon, isTeamPagesEnabled, pcbbReplacementMarket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturedMatch)) {
            return false;
        }
        FeaturedMatch featuredMatch = (FeaturedMatch) other;
        return Intrinsics.g(this.id, featuredMatch.id) && Intrinsics.g(this.event, featuredMatch.event) && Intrinsics.g(this.market, featuredMatch.market) && Intrinsics.g(this.marketTitles, featuredMatch.marketTitles) && Intrinsics.g(this.marketDescMain, featuredMatch.marketDescMain) && Intrinsics.g(this.marketDescSub, featuredMatch.marketDescSub) && this.showBoost == featuredMatch.showBoost && this.displayDefaultIcon == featuredMatch.displayDefaultIcon && this.isTeamPagesEnabled == featuredMatch.isTeamPagesEnabled && Intrinsics.g(this.pcbbReplacementMarket, featuredMatch.pcbbReplacementMarket);
    }

    public final boolean getDisplayDefaultIcon() {
        return this.displayDefaultIcon;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final String getId() {
        return this.id;
    }

    public final Market getMarket() {
        return this.market;
    }

    public final String getMarketDescMain() {
        return this.marketDescMain;
    }

    public final String getMarketDescSub() {
        return this.marketDescSub;
    }

    public final List<String> getMarketTitles() {
        return this.marketTitles;
    }

    public final Market getPcbbReplacementMarket() {
        return this.pcbbReplacementMarket;
    }

    public final boolean getShowBoost() {
        return this.showBoost;
    }

    public int hashCode() {
        int iA = mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(ai50.a((this.market.hashCode() + ((this.event.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.marketTitles), 31, this.marketDescMain), 31, this.marketDescSub), 31, this.showBoost), 31, this.displayDefaultIcon), 31, this.isTeamPagesEnabled);
        Market market = this.pcbbReplacementMarket;
        return iA + (market == null ? 0 : market.hashCode());
    }

    public final boolean isTeamPagesEnabled() {
        return this.isTeamPagesEnabled;
    }

    public final void setDisplayDefaultIcon(boolean z) {
        this.displayDefaultIcon = z;
    }

    public final void setMarket(Market market) {
        market.getClass();
        this.market = market;
    }

    public final void setMarketDescMain(String str) {
        str.getClass();
        this.marketDescMain = str;
    }

    public final void setMarketDescSub(String str) {
        str.getClass();
        this.marketDescSub = str;
    }

    public final void setShowBoost(boolean z) {
        this.showBoost = z;
    }

    public String toString() {
        String str = this.id;
        Event event = this.event;
        Market market = this.market;
        List<String> list = this.marketTitles;
        String str2 = this.marketDescMain;
        String str3 = this.marketDescSub;
        boolean z = this.showBoost;
        boolean z2 = this.displayDefaultIcon;
        boolean z3 = this.isTeamPagesEnabled;
        Market market2 = this.pcbbReplacementMarket;
        StringBuilder sb = new StringBuilder("FeaturedMatch(id=");
        sb.append(str);
        sb.append(", event=");
        sb.append(event);
        sb.append(", market=");
        sb.append(market);
        sb.append(", marketTitles=");
        sb.append(list);
        sb.append(", marketDescMain=");
        hxa.c(sb, str2, ", marketDescSub=", str3, ", showBoost=");
        nng.a(", displayDefaultIcon=", ", isTeamPagesEnabled=", sb, z, z2);
        sb.append(z3);
        sb.append(", pcbbReplacementMarket=");
        sb.append(market2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ FeaturedMatch(String str, Event event, Market market, List list, String str2, String str3, boolean z, boolean z2, boolean z3, Market market2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, event, market, list, str2, str3, z, z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : market2);
    }
}
