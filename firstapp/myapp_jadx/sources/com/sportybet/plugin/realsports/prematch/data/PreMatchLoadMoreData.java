package com.sportybet.plugin.realsports.prematch.data;

import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import defpackage.mtg0;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0014\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eÊ\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0000¨\u0006+"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchLoadMoreData;", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData;", "viewType", "", "loadingState", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchLoadingState;", "showNoMarketOptionEvent", "", "selectedMarket", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "filteredMarketList", "", "Lcom/sportybet/plugin/realsports/data/Market;", "<init>", "(ILcom/sportybet/plugin/realsports/prematch/data/PreMatchLoadingState;ZLcom/sportybet/plugin/realsports/type/RegularMarketRule;Ljava/util/List;)V", "getViewType", "()I", "getLoadingState", "()Lcom/sportybet/plugin/realsports/prematch/data/PreMatchLoadingState;", "getShowNoMarketOptionEvent", "()Z", "setShowNoMarketOptionEvent", "(Z)V", "getSelectedMarket", "()Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "setSelectedMarket", "(Lcom/sportybet/plugin/realsports/type/RegularMarketRule;)V", "getFilteredMarketList", "()Ljava/util/List;", "setFilteredMarketList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PreMatchLoadMoreData implements PreMatchSectionData {
    public static final int $stable = 8;
    private List<? extends Market> filteredMarketList;
    private final PreMatchLoadingState loadingState;
    private RegularMarketRule selectedMarket;
    private boolean showNoMarketOptionEvent;
    private final int viewType;

    public PreMatchLoadMoreData(int i, PreMatchLoadingState preMatchLoadingState, boolean z, RegularMarketRule regularMarketRule, List<? extends Market> list) {
        preMatchLoadingState.getClass();
        this.viewType = i;
        this.loadingState = preMatchLoadingState;
        this.showNoMarketOptionEvent = z;
        this.selectedMarket = regularMarketRule;
        this.filteredMarketList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreMatchLoadMoreData copy$default(PreMatchLoadMoreData preMatchLoadMoreData, int i, PreMatchLoadingState preMatchLoadingState, boolean z, RegularMarketRule regularMarketRule, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = preMatchLoadMoreData.viewType;
        }
        if ((i2 & 2) != 0) {
            preMatchLoadingState = preMatchLoadMoreData.loadingState;
        }
        if ((i2 & 4) != 0) {
            z = preMatchLoadMoreData.showNoMarketOptionEvent;
        }
        if ((i2 & 8) != 0) {
            regularMarketRule = preMatchLoadMoreData.selectedMarket;
        }
        if ((i2 & 16) != 0) {
            list = preMatchLoadMoreData.filteredMarketList;
        }
        List list2 = list;
        boolean z2 = z;
        return preMatchLoadMoreData.copy(i, preMatchLoadingState, z2, regularMarketRule, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PreMatchLoadingState getLoadingState() {
        return this.loadingState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowNoMarketOptionEvent() {
        return this.showNoMarketOptionEvent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RegularMarketRule getSelectedMarket() {
        return this.selectedMarket;
    }

    public final List<Market> component5() {
        return this.filteredMarketList;
    }

    public final PreMatchLoadMoreData copy(int viewType, PreMatchLoadingState loadingState, boolean showNoMarketOptionEvent, RegularMarketRule selectedMarket, List<? extends Market> filteredMarketList) {
        loadingState.getClass();
        return new PreMatchLoadMoreData(viewType, loadingState, showNoMarketOptionEvent, selectedMarket, filteredMarketList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreMatchLoadMoreData)) {
            return false;
        }
        PreMatchLoadMoreData preMatchLoadMoreData = (PreMatchLoadMoreData) other;
        return this.viewType == preMatchLoadMoreData.viewType && this.loadingState == preMatchLoadMoreData.loadingState && this.showNoMarketOptionEvent == preMatchLoadMoreData.showNoMarketOptionEvent && Intrinsics.g(this.selectedMarket, preMatchLoadMoreData.selectedMarket) && Intrinsics.g(this.filteredMarketList, preMatchLoadMoreData.filteredMarketList);
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public List<Market> getFilteredMarketList() {
        return this.filteredMarketList;
    }

    public final PreMatchLoadingState getLoadingState() {
        return this.loadingState;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public RegularMarketRule getSelectedMarket() {
        return this.selectedMarket;
    }

    public final boolean getShowNoMarketOptionEvent() {
        return this.showNoMarketOptionEvent;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int iA = mtg0.a((this.loadingState.hashCode() + (Integer.hashCode(this.viewType) * 31)) * 31, 31, this.showNoMarketOptionEvent);
        RegularMarketRule regularMarketRule = this.selectedMarket;
        int iHashCode = (iA + (regularMarketRule == null ? 0 : regularMarketRule.hashCode())) * 31;
        List<? extends Market> list = this.filteredMarketList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public void setFilteredMarketList(List<? extends Market> list) {
        this.filteredMarketList = list;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public void setSelectedMarket(RegularMarketRule regularMarketRule) {
        this.selectedMarket = regularMarketRule;
    }

    public final void setShowNoMarketOptionEvent(boolean z) {
        this.showNoMarketOptionEvent = z;
    }

    public String toString() {
        int i = this.viewType;
        PreMatchLoadingState preMatchLoadingState = this.loadingState;
        boolean z = this.showNoMarketOptionEvent;
        RegularMarketRule regularMarketRule = this.selectedMarket;
        List<? extends Market> list = this.filteredMarketList;
        StringBuilder sb = new StringBuilder("PreMatchLoadMoreData(viewType=");
        sb.append(i);
        sb.append(", loadingState=");
        sb.append(preMatchLoadingState);
        sb.append(", showNoMarketOptionEvent=");
        sb.append(z);
        sb.append(", selectedMarket=");
        sb.append(regularMarketRule);
        sb.append(", filteredMarketList=");
        return ng1.a(sb, list, ")");
    }

    public /* synthetic */ PreMatchLoadMoreData(int i, PreMatchLoadingState preMatchLoadingState, boolean z, RegularMarketRule regularMarketRule, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, preMatchLoadingState, z, (i2 & 8) != 0 ? null : regularMarketRule, (i2 & 16) != 0 ? null : list);
    }
}
