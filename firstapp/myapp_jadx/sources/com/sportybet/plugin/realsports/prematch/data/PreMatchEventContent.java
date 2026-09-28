package com.sportybet.plugin.realsports.prematch.data;

import com.sportybet.plugin.realsports.data.MarketHotTags;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0011"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchEventContent;", "", "marketHotTags", "Lcom/sportybet/plugin/realsports/data/MarketHotTags;", "<init>", "(Lcom/sportybet/plugin/realsports/data/MarketHotTags;)V", "getMarketHotTags", "()Lcom/sportybet/plugin/realsports/data/MarketHotTags;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PreMatchEventContent {
    public static final int $stable = MarketHotTags.$stable;
    private final MarketHotTags marketHotTags;

    public PreMatchEventContent(MarketHotTags marketHotTags) {
        this.marketHotTags = marketHotTags;
    }

    public static /* synthetic */ PreMatchEventContent copy$default(PreMatchEventContent preMatchEventContent, MarketHotTags marketHotTags, int i, Object obj) {
        if ((i & 1) != 0) {
            marketHotTags = preMatchEventContent.marketHotTags;
        }
        return preMatchEventContent.copy(marketHotTags);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MarketHotTags getMarketHotTags() {
        return this.marketHotTags;
    }

    public final PreMatchEventContent copy(MarketHotTags marketHotTags) {
        return new PreMatchEventContent(marketHotTags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreMatchEventContent) && Intrinsics.g(this.marketHotTags, ((PreMatchEventContent) other).marketHotTags);
    }

    public final MarketHotTags getMarketHotTags() {
        return this.marketHotTags;
    }

    public int hashCode() {
        MarketHotTags marketHotTags = this.marketHotTags;
        if (marketHotTags == null) {
            return 0;
        }
        return marketHotTags.hashCode();
    }

    public String toString() {
        return "PreMatchEventContent(marketHotTags=" + this.marketHotTags + ")";
    }
}
