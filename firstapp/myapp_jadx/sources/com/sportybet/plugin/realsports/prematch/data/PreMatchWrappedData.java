package com.sportybet.plugin.realsports.prematch.data;

import defpackage.f87;
import defpackage.mtg0;
import defpackage.to10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\nHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchWrappedData;", "", "preMatchDisplayList", "", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData;", "hasMore", "", "lastItemDay", "", "oddsFilterLastIndex", "", "<init>", "(Ljava/util/List;ZJI)V", "getPreMatchDisplayList", "()Ljava/util/List;", "getHasMore", "()Z", "getLastItemDay", "()J", "getOddsFilterLastIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PreMatchWrappedData {
    public static final int $stable = 8;
    private final boolean hasMore;
    private final long lastItemDay;
    private final int oddsFilterLastIndex;
    private final List<PreMatchSectionData> preMatchDisplayList;

    public /* synthetic */ PreMatchWrappedData(List list, boolean z, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreMatchWrappedData copy$default(PreMatchWrappedData preMatchWrappedData, List list, boolean z, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = preMatchWrappedData.preMatchDisplayList;
        }
        if ((i2 & 2) != 0) {
            z = preMatchWrappedData.hasMore;
        }
        if ((i2 & 4) != 0) {
            j = preMatchWrappedData.lastItemDay;
        }
        if ((i2 & 8) != 0) {
            i = preMatchWrappedData.oddsFilterLastIndex;
        }
        int i3 = i;
        return preMatchWrappedData.copy(list, z, j, i3);
    }

    public final List<PreMatchSectionData> component1() {
        return this.preMatchDisplayList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastItemDay() {
        return this.lastItemDay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOddsFilterLastIndex() {
        return this.oddsFilterLastIndex;
    }

    public final PreMatchWrappedData copy(List<? extends PreMatchSectionData> preMatchDisplayList, boolean hasMore, long lastItemDay, int oddsFilterLastIndex) {
        preMatchDisplayList.getClass();
        return new PreMatchWrappedData(preMatchDisplayList, hasMore, lastItemDay, oddsFilterLastIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreMatchWrappedData)) {
            return false;
        }
        PreMatchWrappedData preMatchWrappedData = (PreMatchWrappedData) other;
        return Intrinsics.g(this.preMatchDisplayList, preMatchWrappedData.preMatchDisplayList) && this.hasMore == preMatchWrappedData.hasMore && this.lastItemDay == preMatchWrappedData.lastItemDay && this.oddsFilterLastIndex == preMatchWrappedData.oddsFilterLastIndex;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getLastItemDay() {
        return this.lastItemDay;
    }

    public final int getOddsFilterLastIndex() {
        return this.oddsFilterLastIndex;
    }

    public final List<PreMatchSectionData> getPreMatchDisplayList() {
        return this.preMatchDisplayList;
    }

    public int hashCode() {
        return Integer.hashCode(this.oddsFilterLastIndex) + f87.a(mtg0.a(this.preMatchDisplayList.hashCode() * 31, 31, this.hasMore), this.lastItemDay, 31);
    }

    public String toString() {
        List<PreMatchSectionData> list = this.preMatchDisplayList;
        boolean z = this.hasMore;
        long j = this.lastItemDay;
        int i = this.oddsFilterLastIndex;
        StringBuilder sb = new StringBuilder("PreMatchWrappedData(preMatchDisplayList=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(z);
        sb.append(", lastItemDay=");
        to10.a(sb, j, ", oddsFilterLastIndex=", i);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreMatchWrappedData(List<? extends PreMatchSectionData> list, boolean z, long j, int i) {
        list.getClass();
        this.preMatchDisplayList = list;
        this.hasMore = z;
        this.lastItemDay = j;
        this.oddsFilterLastIndex = i;
    }
}
