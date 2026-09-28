package com.sportybet.plugin.realsports.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SelectionFeatures;", "", "marketStatus", "", "selectionFeatures", "Lcom/sportybet/plugin/realsports/data/FeaturesWithoutMarketStatus;", "<init>", "(ILcom/sportybet/plugin/realsports/data/FeaturesWithoutMarketStatus;)V", "getMarketStatus", "()I", "getSelectionFeatures", "()Lcom/sportybet/plugin/realsports/data/FeaturesWithoutMarketStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectionFeatures {
    public static final int $stable = 8;
    private final int marketStatus;
    private final FeaturesWithoutMarketStatus selectionFeatures;

    public SelectionFeatures(int i, FeaturesWithoutMarketStatus featuresWithoutMarketStatus) {
        featuresWithoutMarketStatus.getClass();
        this.marketStatus = i;
        this.selectionFeatures = featuresWithoutMarketStatus;
    }

    public static /* synthetic */ SelectionFeatures copy$default(SelectionFeatures selectionFeatures, int i, FeaturesWithoutMarketStatus featuresWithoutMarketStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = selectionFeatures.marketStatus;
        }
        if ((i2 & 2) != 0) {
            featuresWithoutMarketStatus = selectionFeatures.selectionFeatures;
        }
        return selectionFeatures.copy(i, featuresWithoutMarketStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMarketStatus() {
        return this.marketStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FeaturesWithoutMarketStatus getSelectionFeatures() {
        return this.selectionFeatures;
    }

    public final SelectionFeatures copy(int marketStatus, FeaturesWithoutMarketStatus selectionFeatures) {
        selectionFeatures.getClass();
        return new SelectionFeatures(marketStatus, selectionFeatures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionFeatures)) {
            return false;
        }
        SelectionFeatures selectionFeatures = (SelectionFeatures) other;
        return this.marketStatus == selectionFeatures.marketStatus && Intrinsics.g(this.selectionFeatures, selectionFeatures.selectionFeatures);
    }

    public final int getMarketStatus() {
        return this.marketStatus;
    }

    public final FeaturesWithoutMarketStatus getSelectionFeatures() {
        return this.selectionFeatures;
    }

    public int hashCode() {
        return this.selectionFeatures.hashCode() + (Integer.hashCode(this.marketStatus) * 31);
    }

    public String toString() {
        return "SelectionFeatures(marketStatus=" + this.marketStatus + ", selectionFeatures=" + this.selectionFeatures + ")";
    }
}
