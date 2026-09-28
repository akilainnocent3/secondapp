package com.sportybet.plugin.realsports.prematch.data;

import com.appsflyer.internal.a0;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import defpackage.dd3;
import defpackage.f87;
import defpackage.mtg0;
import defpackage.u8;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\nHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u009f\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001J\u0014\u0010I\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0083\u0004J\n\u0010L\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010M\u001a\u00020NHÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109Ê\u0001\f\bP\u0012\b\bQ\u0012\u0004\b\u0003\u0010\u0000¨\u0006O"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchMarketTitleData;", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData;", "viewType", "", "startTime", "", "oddsMin", "Ljava/math/BigDecimal;", "oddsMax", "haveOneUpMarket", "", "haveActiveOneUpMarket", "haveTwoUpMarket", "haveActiveTwoUpMarket", "haveDCOneUpMarket", "haveActiveDCOneUpMarket", "haveOUEarlyGoalsMarket", "haveActiveOUEarlyGoalsMarket", "selectedMarket", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "filteredMarketList", "", "Lcom/sportybet/plugin/realsports/data/Market;", "<init>", "(IJLjava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZZZZZLcom/sportybet/plugin/realsports/type/RegularMarketRule;Ljava/util/List;)V", "getViewType", "()I", "getStartTime", "()J", "getOddsMin", "()Ljava/math/BigDecimal;", "getOddsMax", "getHaveOneUpMarket", "()Z", "setHaveOneUpMarket", "(Z)V", "getHaveActiveOneUpMarket", "setHaveActiveOneUpMarket", "getHaveTwoUpMarket", "setHaveTwoUpMarket", "getHaveActiveTwoUpMarket", "setHaveActiveTwoUpMarket", "getHaveDCOneUpMarket", "setHaveDCOneUpMarket", "getHaveActiveDCOneUpMarket", "setHaveActiveDCOneUpMarket", "getHaveOUEarlyGoalsMarket", "setHaveOUEarlyGoalsMarket", "getHaveActiveOUEarlyGoalsMarket", "setHaveActiveOUEarlyGoalsMarket", "getSelectedMarket", "()Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "setSelectedMarket", "(Lcom/sportybet/plugin/realsports/type/RegularMarketRule;)V", "getFilteredMarketList", "()Ljava/util/List;", "setFilteredMarketList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PreMatchMarketTitleData implements PreMatchSectionData {
    public static final int $stable = 8;
    private List<? extends Market> filteredMarketList;
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
    private final long startTime;
    private final int viewType;

    public /* synthetic */ PreMatchMarketTitleData(int i, long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, RegularMarketRule regularMarketRule, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, bigDecimal, bigDecimal2, z, z2, z3, z4, (i2 & 256) != 0 ? false : z5, (i2 & 512) != 0 ? false : z6, z7, z8, (i2 & 4096) != 0 ? null : regularMarketRule, (i2 & 8192) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHaveActiveDCOneUpMarket() {
        return this.haveActiveDCOneUpMarket;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getHaveOUEarlyGoalsMarket() {
        return this.haveOUEarlyGoalsMarket;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getHaveActiveOUEarlyGoalsMarket() {
        return this.haveActiveOUEarlyGoalsMarket;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final RegularMarketRule getSelectedMarket() {
        return this.selectedMarket;
    }

    public final List<Market> component14() {
        return this.filteredMarketList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getOddsMin() {
        return this.oddsMin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getOddsMax() {
        return this.oddsMax;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHaveOneUpMarket() {
        return this.haveOneUpMarket;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHaveActiveOneUpMarket() {
        return this.haveActiveOneUpMarket;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHaveTwoUpMarket() {
        return this.haveTwoUpMarket;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHaveActiveTwoUpMarket() {
        return this.haveActiveTwoUpMarket;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHaveDCOneUpMarket() {
        return this.haveDCOneUpMarket;
    }

    public final PreMatchMarketTitleData copy(int viewType, long startTime, BigDecimal oddsMin, BigDecimal oddsMax, boolean haveOneUpMarket, boolean haveActiveOneUpMarket, boolean haveTwoUpMarket, boolean haveActiveTwoUpMarket, boolean haveDCOneUpMarket, boolean haveActiveDCOneUpMarket, boolean haveOUEarlyGoalsMarket, boolean haveActiveOUEarlyGoalsMarket, RegularMarketRule selectedMarket, List<? extends Market> filteredMarketList) {
        oddsMin.getClass();
        oddsMax.getClass();
        return new PreMatchMarketTitleData(viewType, startTime, oddsMin, oddsMax, haveOneUpMarket, haveActiveOneUpMarket, haveTwoUpMarket, haveActiveTwoUpMarket, haveDCOneUpMarket, haveActiveDCOneUpMarket, haveOUEarlyGoalsMarket, haveActiveOUEarlyGoalsMarket, selectedMarket, filteredMarketList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreMatchMarketTitleData)) {
            return false;
        }
        PreMatchMarketTitleData preMatchMarketTitleData = (PreMatchMarketTitleData) other;
        return this.viewType == preMatchMarketTitleData.viewType && this.startTime == preMatchMarketTitleData.startTime && Intrinsics.g(this.oddsMin, preMatchMarketTitleData.oddsMin) && Intrinsics.g(this.oddsMax, preMatchMarketTitleData.oddsMax) && this.haveOneUpMarket == preMatchMarketTitleData.haveOneUpMarket && this.haveActiveOneUpMarket == preMatchMarketTitleData.haveActiveOneUpMarket && this.haveTwoUpMarket == preMatchMarketTitleData.haveTwoUpMarket && this.haveActiveTwoUpMarket == preMatchMarketTitleData.haveActiveTwoUpMarket && this.haveDCOneUpMarket == preMatchMarketTitleData.haveDCOneUpMarket && this.haveActiveDCOneUpMarket == preMatchMarketTitleData.haveActiveDCOneUpMarket && this.haveOUEarlyGoalsMarket == preMatchMarketTitleData.haveOUEarlyGoalsMarket && this.haveActiveOUEarlyGoalsMarket == preMatchMarketTitleData.haveActiveOUEarlyGoalsMarket && Intrinsics.g(this.selectedMarket, preMatchMarketTitleData.selectedMarket) && Intrinsics.g(this.filteredMarketList, preMatchMarketTitleData.filteredMarketList);
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

    public final long getStartTime() {
        return this.startTime;
    }

    @Override // com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData
    public int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int iA = mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(dd3.a(this.oddsMax, dd3.a(this.oddsMin, f87.a(Integer.hashCode(this.viewType) * 31, this.startTime, 31), 31), 31), 31, this.haveOneUpMarket), 31, this.haveActiveOneUpMarket), 31, this.haveTwoUpMarket), 31, this.haveActiveTwoUpMarket), 31, this.haveDCOneUpMarket), 31, this.haveActiveDCOneUpMarket), 31, this.haveOUEarlyGoalsMarket), 31, this.haveActiveOUEarlyGoalsMarket);
        RegularMarketRule regularMarketRule = this.selectedMarket;
        int iHashCode = (iA + (regularMarketRule == null ? 0 : regularMarketRule.hashCode())) * 31;
        List<? extends Market> list = this.filteredMarketList;
        return iHashCode + (list != null ? list.hashCode() : 0);
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
        long j = this.startTime;
        BigDecimal bigDecimal = this.oddsMin;
        BigDecimal bigDecimal2 = this.oddsMax;
        boolean z = this.haveOneUpMarket;
        boolean z2 = this.haveActiveOneUpMarket;
        boolean z3 = this.haveTwoUpMarket;
        boolean z4 = this.haveActiveTwoUpMarket;
        boolean z5 = this.haveDCOneUpMarket;
        boolean z6 = this.haveActiveDCOneUpMarket;
        boolean z7 = this.haveOUEarlyGoalsMarket;
        boolean z8 = this.haveActiveOUEarlyGoalsMarket;
        RegularMarketRule regularMarketRule = this.selectedMarket;
        List<? extends Market> list = this.filteredMarketList;
        StringBuilder sbA = a0.a("PreMatchMarketTitleData(viewType=", ", startTime=", i, j);
        sbA.append(", oddsMin=");
        sbA.append(bigDecimal);
        sbA.append(", oddsMax=");
        sbA.append(bigDecimal2);
        u8.a(", haveOneUpMarket=", ", haveActiveOneUpMarket=", sbA, z, z2);
        u8.a(", haveTwoUpMarket=", ", haveActiveTwoUpMarket=", sbA, z3, z4);
        u8.a(", haveDCOneUpMarket=", ", haveActiveDCOneUpMarket=", sbA, z5, z6);
        u8.a(", haveOUEarlyGoalsMarket=", ", haveActiveOUEarlyGoalsMarket=", sbA, z7, z8);
        sbA.append(", selectedMarket=");
        sbA.append(regularMarketRule);
        sbA.append(", filteredMarketList=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }

    public PreMatchMarketTitleData(int i, long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, RegularMarketRule regularMarketRule, List<? extends Market> list) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        this.viewType = i;
        this.startTime = j;
        this.oddsMin = bigDecimal;
        this.oddsMax = bigDecimal2;
        this.haveOneUpMarket = z;
        this.haveActiveOneUpMarket = z2;
        this.haveTwoUpMarket = z3;
        this.haveActiveTwoUpMarket = z4;
        this.haveDCOneUpMarket = z5;
        this.haveActiveDCOneUpMarket = z6;
        this.haveOUEarlyGoalsMarket = z7;
        this.haveActiveOUEarlyGoalsMarket = z8;
        this.selectedMarket = regularMarketRule;
        this.filteredMarketList = list;
    }
}
