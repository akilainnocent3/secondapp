package com.sportybet.plugin.realsports.quickmarket.data;

import defpackage.ai50;
import defpackage.kya0;
import defpackage.m2g;
import defpackage.uqe0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006!"}, d2 = {"Lcom/sportybet/plugin/realsports/quickmarket/data/MarketGroupData;", "", "viewType", "", "groupInfoId", "", "groupName", "marketGroupDicts", "", "Lcom/sportybet/plugin/realsports/quickmarket/data/MarketGroupDict;", "marketGroupDict", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/sportybet/plugin/realsports/quickmarket/data/MarketGroupDict;)V", "getViewType", "()I", "getGroupInfoId", "()Ljava/lang/String;", "getGroupName", "getMarketGroupDicts", "()Ljava/util/List;", "getMarketGroupDict", "()Lcom/sportybet/plugin/realsports/quickmarket/data/MarketGroupDict;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketGroupData {
    public static final int $stable = 8;
    private final String groupInfoId;
    private final String groupName;
    private final MarketGroupDict marketGroupDict;
    private final List<MarketGroupDict> marketGroupDicts;
    private final int viewType;

    public MarketGroupData(int i, String str, String str2, List list, MarketGroupDict marketGroupDict, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? m2g.a : list, (i2 & 16) != 0 ? null : marketGroupDict);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketGroupData copy$default(MarketGroupData marketGroupData, int i, String str, String str2, List list, MarketGroupDict marketGroupDict, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = marketGroupData.viewType;
        }
        if ((i2 & 2) != 0) {
            str = marketGroupData.groupInfoId;
        }
        if ((i2 & 4) != 0) {
            str2 = marketGroupData.groupName;
        }
        if ((i2 & 8) != 0) {
            list = marketGroupData.marketGroupDicts;
        }
        if ((i2 & 16) != 0) {
            marketGroupDict = marketGroupData.marketGroupDict;
        }
        MarketGroupDict marketGroupDict2 = marketGroupDict;
        String str3 = str2;
        return marketGroupData.copy(i, str, str3, list, marketGroupDict2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupInfoId() {
        return this.groupInfoId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    public final List<MarketGroupDict> component4() {
        return this.marketGroupDicts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MarketGroupDict getMarketGroupDict() {
        return this.marketGroupDict;
    }

    public final MarketGroupData copy(int viewType, String groupInfoId, String groupName, List<MarketGroupDict> marketGroupDicts, MarketGroupDict marketGroupDict) {
        marketGroupDicts.getClass();
        return new MarketGroupData(viewType, groupInfoId, groupName, marketGroupDicts, marketGroupDict);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketGroupData)) {
            return false;
        }
        MarketGroupData marketGroupData = (MarketGroupData) other;
        return this.viewType == marketGroupData.viewType && Intrinsics.g(this.groupInfoId, marketGroupData.groupInfoId) && Intrinsics.g(this.groupName, marketGroupData.groupName) && Intrinsics.g(this.marketGroupDicts, marketGroupData.marketGroupDicts) && Intrinsics.g(this.marketGroupDict, marketGroupData.marketGroupDict);
    }

    public final String getGroupInfoId() {
        return this.groupInfoId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final MarketGroupDict getMarketGroupDict() {
        return this.marketGroupDict;
    }

    public final List<MarketGroupDict> getMarketGroupDicts() {
        return this.marketGroupDicts;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.viewType) * 31;
        String str = this.groupInfoId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupName;
        int iA = ai50.a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.marketGroupDicts);
        MarketGroupDict marketGroupDict = this.marketGroupDict;
        return iA + (marketGroupDict != null ? marketGroupDict.hashCode() : 0);
    }

    public String toString() {
        int i = this.viewType;
        String str = this.groupInfoId;
        String str2 = this.groupName;
        List<MarketGroupDict> list = this.marketGroupDicts;
        MarketGroupDict marketGroupDict = this.marketGroupDict;
        StringBuilder sbA = uqe0.a(i, "MarketGroupData(viewType=", ", groupInfoId=", str, ", groupName=");
        kya0.b(str2, ", marketGroupDicts=", ", marketGroupDict=", sbA, list);
        sbA.append(marketGroupDict);
        sbA.append(")");
        return sbA.toString();
    }

    public MarketGroupData(int i, String str, String str2, List<MarketGroupDict> list, MarketGroupDict marketGroupDict) {
        list.getClass();
        this.viewType = i;
        this.groupInfoId = str;
        this.groupName = str2;
        this.marketGroupDicts = list;
        this.marketGroupDict = marketGroupDict;
    }

    public MarketGroupData() {
        this(0, null, null, null, null, 31, null);
    }
}
