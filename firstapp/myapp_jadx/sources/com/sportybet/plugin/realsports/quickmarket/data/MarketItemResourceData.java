package com.sportybet.plugin.realsports.quickmarket.data;

import com.sportybet.android.gp.tz.R;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/quickmarket/data/MarketItemResourceData;", "", "itemTextColor", "", "itemBgRes", "itemTitleColorRes", "<init>", "(III)V", "getItemTextColor", "()I", "getItemBgRes", "getItemTitleColorRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketItemResourceData {
    public static final int $stable = 0;
    private final int itemBgRes;
    private final int itemTextColor;
    private final int itemTitleColorRes;

    public /* synthetic */ MarketItemResourceData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? R.color.text_type2_primary : i, (i4 & 2) != 0 ? R.drawable.spr_quick_market_select_color : i2, (i4 & 4) != 0 ? R.color.text_type2_primary : i3);
    }

    public static /* synthetic */ MarketItemResourceData copy$default(MarketItemResourceData marketItemResourceData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = marketItemResourceData.itemTextColor;
        }
        if ((i4 & 2) != 0) {
            i2 = marketItemResourceData.itemBgRes;
        }
        if ((i4 & 4) != 0) {
            i3 = marketItemResourceData.itemTitleColorRes;
        }
        return marketItemResourceData.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getItemTextColor() {
        return this.itemTextColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getItemBgRes() {
        return this.itemBgRes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getItemTitleColorRes() {
        return this.itemTitleColorRes;
    }

    public final MarketItemResourceData copy(int itemTextColor, int itemBgRes, int itemTitleColorRes) {
        return new MarketItemResourceData(itemTextColor, itemBgRes, itemTitleColorRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketItemResourceData)) {
            return false;
        }
        MarketItemResourceData marketItemResourceData = (MarketItemResourceData) other;
        return this.itemTextColor == marketItemResourceData.itemTextColor && this.itemBgRes == marketItemResourceData.itemBgRes && this.itemTitleColorRes == marketItemResourceData.itemTitleColorRes;
    }

    public final int getItemBgRes() {
        return this.itemBgRes;
    }

    public final int getItemTextColor() {
        return this.itemTextColor;
    }

    public final int getItemTitleColorRes() {
        return this.itemTitleColorRes;
    }

    public int hashCode() {
        return Integer.hashCode(this.itemTitleColorRes) + gpp.a(this.itemBgRes, Integer.hashCode(this.itemTextColor) * 31, 31);
    }

    public String toString() {
        return zk1.a(this.itemTitleColorRes, ")", dy5.a("MarketItemResourceData(itemTextColor=", this.itemTextColor, this.itemBgRes, ", itemBgRes=", ", itemTitleColorRes="));
    }

    public MarketItemResourceData(int i, int i2, int i3) {
        this.itemTextColor = i;
        this.itemBgRes = i2;
        this.itemTitleColorRes = i3;
    }

    public MarketItemResourceData() {
        this(0, 0, 0, 7, null);
    }
}
