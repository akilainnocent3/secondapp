package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/MarketCategory;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "marketTypes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/InstantWinType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getName", "getMarketTypes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketCategory {
    public static final int $stable = 8;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    @SerializedName("marketTypes")
    private final List<InstantWinType> marketTypes;

    @SerializedName("name")
    private final String name;

    public MarketCategory(String str, String str2, List<InstantWinType> list) {
        bt6.a(str, str2, list);
        this.id = str;
        this.name = str2;
        this.marketTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketCategory copy$default(MarketCategory marketCategory, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketCategory.id;
        }
        if ((i & 2) != 0) {
            str2 = marketCategory.name;
        }
        if ((i & 4) != 0) {
            list = marketCategory.marketTypes;
        }
        return marketCategory.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<InstantWinType> component3() {
        return this.marketTypes;
    }

    public final MarketCategory copy(String id, String name, List<InstantWinType> marketTypes) {
        id.getClass();
        name.getClass();
        marketTypes.getClass();
        return new MarketCategory(id, name, marketTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketCategory)) {
            return false;
        }
        MarketCategory marketCategory = (MarketCategory) other;
        return Intrinsics.g(this.id, marketCategory.id) && Intrinsics.g(this.name, marketCategory.name) && Intrinsics.g(this.marketTypes, marketCategory.marketTypes);
    }

    public final String getId() {
        return this.id;
    }

    public final List<InstantWinType> getMarketTypes() {
        return this.marketTypes;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.marketTypes.hashCode() + gmf0.a(this.id.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return ng1.a(ux5.a("MarketCategory(id=", str, ", name=", str2, ", marketTypes="), this.marketTypes, ")");
    }
}
