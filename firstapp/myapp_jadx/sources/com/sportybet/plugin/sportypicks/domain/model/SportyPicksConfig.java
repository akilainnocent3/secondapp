package com.sportybet.plugin.sportypicks.domain.model;

import com.google.gson.annotations.SerializedName;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u0018Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/plugin/sportypicks/domain/model/SportyPicksConfig;", "", "pickMarketsPageSize", "", "sportyPicksGroupedMarketIds", "", "", "<init>", "(ILjava/util/List;)V", "getPickMarketsPageSize", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getSportyPicksGroupedMarketIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyPicksConfig {
    public static final int $stable = 8;

    @SerializedName("pickMarketsPageSize")
    private final int pickMarketsPageSize;

    @SerializedName("sportyPicksGroupedMarketIds")
    private final List<String> sportyPicksGroupedMarketIds;

    public SportyPicksConfig(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportyPicksConfig copy$default(SportyPicksConfig sportyPicksConfig, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportyPicksConfig.pickMarketsPageSize;
        }
        if ((i2 & 2) != 0) {
            list = sportyPicksConfig.sportyPicksGroupedMarketIds;
        }
        return sportyPicksConfig.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPickMarketsPageSize() {
        return this.pickMarketsPageSize;
    }

    public final List<String> component2() {
        return this.sportyPicksGroupedMarketIds;
    }

    public final SportyPicksConfig copy(int pickMarketsPageSize, List<String> sportyPicksGroupedMarketIds) {
        sportyPicksGroupedMarketIds.getClass();
        return new SportyPicksConfig(pickMarketsPageSize, sportyPicksGroupedMarketIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportyPicksConfig)) {
            return false;
        }
        SportyPicksConfig sportyPicksConfig = (SportyPicksConfig) other;
        return this.pickMarketsPageSize == sportyPicksConfig.pickMarketsPageSize && Intrinsics.g(this.sportyPicksGroupedMarketIds, sportyPicksConfig.sportyPicksGroupedMarketIds);
    }

    public final int getPickMarketsPageSize() {
        return this.pickMarketsPageSize;
    }

    public final List<String> getSportyPicksGroupedMarketIds() {
        return this.sportyPicksGroupedMarketIds;
    }

    public int hashCode() {
        return this.sportyPicksGroupedMarketIds.hashCode() + (Integer.hashCode(this.pickMarketsPageSize) * 31);
    }

    public String toString() {
        return "SportyPicksConfig(pickMarketsPageSize=" + this.pickMarketsPageSize + ", sportyPicksGroupedMarketIds=" + this.sportyPicksGroupedMarketIds + ")";
    }

    public SportyPicksConfig(int i, List<String> list) {
        list.getClass();
        this.pickMarketsPageSize = i;
        this.sportyPicksGroupedMarketIds = list;
    }

    public SportyPicksConfig() {
        this(0, null, 3, null);
    }
}
