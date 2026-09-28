package com.sporty.android.core.model.realsports;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/realsports/SportDynamicMarkets;", "", "sportId", "", "marketIds", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSportId", "()Ljava/lang/String;", "getMarketIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportDynamicMarkets {
    private final List<String> marketIds;
    private final String sportId;

    public SportDynamicMarkets(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.sportId = str;
        this.marketIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportDynamicMarkets copy$default(SportDynamicMarkets sportDynamicMarkets, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportDynamicMarkets.sportId;
        }
        if ((i & 2) != 0) {
            list = sportDynamicMarkets.marketIds;
        }
        return sportDynamicMarkets.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    public final List<String> component2() {
        return this.marketIds;
    }

    public final SportDynamicMarkets copy(String sportId, List<String> marketIds) {
        sportId.getClass();
        marketIds.getClass();
        return new SportDynamicMarkets(sportId, marketIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportDynamicMarkets)) {
            return false;
        }
        SportDynamicMarkets sportDynamicMarkets = (SportDynamicMarkets) other;
        return Intrinsics.g(this.sportId, sportDynamicMarkets.sportId) && Intrinsics.g(this.marketIds, sportDynamicMarkets.marketIds);
    }

    public final List<String> getMarketIds() {
        return this.marketIds;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        return this.marketIds.hashCode() + (this.sportId.hashCode() * 31);
    }

    public String toString() {
        return nf.b("SportDynamicMarkets(sportId=", this.sportId, ", marketIds=", ")", this.marketIds);
    }
}
