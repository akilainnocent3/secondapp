package com.sporty.android.core.model.config;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.google.gson.annotations.SerializedName;
import defpackage.n36;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/config/BoreDrawItem;", "", "marketId", "", "excludedOutcomeId", "<init>", "(II)V", "getMarketId", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getExcludedOutcomeId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BoreDrawItem {

    @SerializedName("excludedOutcomeId")
    private final int excludedOutcomeId;

    @SerializedName("marketId")
    private final int marketId;

    public BoreDrawItem(int i, int i2) {
        this.marketId = i;
        this.excludedOutcomeId = i2;
    }

    public static /* synthetic */ BoreDrawItem copy$default(BoreDrawItem boreDrawItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = boreDrawItem.marketId;
        }
        if ((i3 & 2) != 0) {
            i2 = boreDrawItem.excludedOutcomeId;
        }
        return boreDrawItem.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getExcludedOutcomeId() {
        return this.excludedOutcomeId;
    }

    public final BoreDrawItem copy(int marketId, int excludedOutcomeId) {
        return new BoreDrawItem(marketId, excludedOutcomeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoreDrawItem)) {
            return false;
        }
        BoreDrawItem boreDrawItem = (BoreDrawItem) other;
        return this.marketId == boreDrawItem.marketId && this.excludedOutcomeId == boreDrawItem.excludedOutcomeId;
    }

    public final int getExcludedOutcomeId() {
        return this.excludedOutcomeId;
    }

    public final int getMarketId() {
        return this.marketId;
    }

    public int hashCode() {
        return Integer.hashCode(this.excludedOutcomeId) + (Integer.hashCode(this.marketId) * 31);
    }

    public String toString() {
        return n36.a("BoreDrawItem(marketId=", this.marketId, this.excludedOutcomeId, ", excludedOutcomeId=", LxHElgWAiSeM.OGljpcdERocX);
    }
}
