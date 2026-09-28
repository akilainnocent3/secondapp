package com.sportybet.plugin.realsports.data;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import defpackage.mfb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/sportybet/plugin/realsports/data/SearchLiveEventMeta;", "", "Lmfb0;", "sportRule", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "marketRule", "Lcom/sportybet/plugin/realsports/data/BoostResult;", "boostInfoResult", "<init>", "(Lmfb0;Lcom/sportybet/plugin/realsports/type/RegularMarketRule;Lcom/sportybet/plugin/realsports/data/BoostResult;)V", "component1", "()Lmfb0;", "component2", "()Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "component3", "()Lcom/sportybet/plugin/realsports/data/BoostResult;", "copy", "(Lmfb0;Lcom/sportybet/plugin/realsports/type/RegularMarketRule;Lcom/sportybet/plugin/realsports/data/BoostResult;)Lcom/sportybet/plugin/realsports/data/SearchLiveEventMeta;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmfb0;", "getSportRule", "setSportRule", "(Lmfb0;)V", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "getMarketRule", "setMarketRule", "(Lcom/sportybet/plugin/realsports/type/RegularMarketRule;)V", "Lcom/sportybet/plugin/realsports/data/BoostResult;", "getBoostInfoResult", "setBoostInfoResult", "(Lcom/sportybet/plugin/realsports/data/BoostResult;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchLiveEventMeta {
    public static final int $stable = 8;
    private BoostResult boostInfoResult;
    private RegularMarketRule marketRule;
    private mfb0 sportRule;

    public /* synthetic */ SearchLiveEventMeta(mfb0 mfb0Var, RegularMarketRule regularMarketRule, BoostResult boostResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mfb0Var, (i & 2) != 0 ? null : regularMarketRule, (i & 4) != 0 ? new BoostResult(false, null, 3, null) : boostResult);
    }

    public static /* synthetic */ SearchLiveEventMeta copy$default(SearchLiveEventMeta searchLiveEventMeta, mfb0 mfb0Var, RegularMarketRule regularMarketRule, BoostResult boostResult, int i, Object obj) {
        if ((i & 1) != 0) {
            mfb0Var = searchLiveEventMeta.sportRule;
        }
        if ((i & 2) != 0) {
            regularMarketRule = searchLiveEventMeta.marketRule;
        }
        if ((i & 4) != 0) {
            boostResult = searchLiveEventMeta.boostInfoResult;
        }
        return searchLiveEventMeta.copy(mfb0Var, regularMarketRule, boostResult);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final mfb0 getSportRule() {
        return this.sportRule;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RegularMarketRule getMarketRule() {
        return this.marketRule;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BoostResult getBoostInfoResult() {
        return this.boostInfoResult;
    }

    public final SearchLiveEventMeta copy(mfb0 sportRule, RegularMarketRule marketRule, BoostResult boostInfoResult) {
        boostInfoResult.getClass();
        return new SearchLiveEventMeta(sportRule, marketRule, boostInfoResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchLiveEventMeta)) {
            return false;
        }
        SearchLiveEventMeta searchLiveEventMeta = (SearchLiveEventMeta) other;
        return Intrinsics.g(this.sportRule, searchLiveEventMeta.sportRule) && Intrinsics.g(this.marketRule, searchLiveEventMeta.marketRule) && Intrinsics.g(this.boostInfoResult, searchLiveEventMeta.boostInfoResult);
    }

    public final BoostResult getBoostInfoResult() {
        return this.boostInfoResult;
    }

    public final RegularMarketRule getMarketRule() {
        return this.marketRule;
    }

    public final mfb0 getSportRule() {
        return this.sportRule;
    }

    public int hashCode() {
        mfb0 mfb0Var = this.sportRule;
        int iHashCode = (mfb0Var == null ? 0 : mfb0Var.hashCode()) * 31;
        RegularMarketRule regularMarketRule = this.marketRule;
        return this.boostInfoResult.hashCode() + ((iHashCode + (regularMarketRule != null ? regularMarketRule.hashCode() : 0)) * 31);
    }

    public final void setBoostInfoResult(BoostResult boostResult) {
        boostResult.getClass();
        this.boostInfoResult = boostResult;
    }

    public final void setMarketRule(RegularMarketRule regularMarketRule) {
        this.marketRule = regularMarketRule;
    }

    public final void setSportRule(mfb0 mfb0Var) {
        this.sportRule = mfb0Var;
    }

    public String toString() {
        return "SearchLiveEventMeta(sportRule=" + this.sportRule + ", marketRule=" + this.marketRule + ", boostInfoResult=" + this.boostInfoResult + ")";
    }

    public SearchLiveEventMeta(mfb0 mfb0Var, RegularMarketRule regularMarketRule, BoostResult boostResult) {
        boostResult.getClass();
        this.sportRule = mfb0Var;
        this.marketRule = regularMarketRule;
        this.boostInfoResult = boostResult;
    }

    public SearchLiveEventMeta() {
        this(null, null, null, 7, null);
    }
}
