package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketCategory;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "marketTypes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getName", "getMarketTypes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingMarketCategory {
    public static final int $stable = 8;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    @SerializedName("marketTypes")
    private final List<NetworkInstantRacingMarketType> marketTypes;

    @SerializedName("name")
    private final String name;

    public NetworkInstantRacingMarketCategory(String str, String str2, List<NetworkInstantRacingMarketType> list) {
        this.id = str;
        this.name = str2;
        this.marketTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingMarketCategory copy$default(NetworkInstantRacingMarketCategory networkInstantRacingMarketCategory, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingMarketCategory.id;
        }
        if ((i & 2) != 0) {
            str2 = networkInstantRacingMarketCategory.name;
        }
        if ((i & 4) != 0) {
            list = networkInstantRacingMarketCategory.marketTypes;
        }
        return networkInstantRacingMarketCategory.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<NetworkInstantRacingMarketType> component3() {
        return this.marketTypes;
    }

    public final NetworkInstantRacingMarketCategory copy(String id, String name, List<NetworkInstantRacingMarketType> marketTypes) {
        return new NetworkInstantRacingMarketCategory(id, name, marketTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingMarketCategory)) {
            return false;
        }
        NetworkInstantRacingMarketCategory networkInstantRacingMarketCategory = (NetworkInstantRacingMarketCategory) other;
        return Intrinsics.g(this.id, networkInstantRacingMarketCategory.id) && Intrinsics.g(this.name, networkInstantRacingMarketCategory.name) && Intrinsics.g(this.marketTypes, networkInstantRacingMarketCategory.marketTypes);
    }

    public final String getId() {
        return this.id;
    }

    public final List<NetworkInstantRacingMarketType> getMarketTypes() {
        return this.marketTypes;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<NetworkInstantRacingMarketType> list = this.marketTypes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return ng1.a(ux5.a("NetworkInstantRacingMarketCategory(id=", str, ", name=", str2, ", marketTypes="), this.marketTypes, ")");
    }
}
