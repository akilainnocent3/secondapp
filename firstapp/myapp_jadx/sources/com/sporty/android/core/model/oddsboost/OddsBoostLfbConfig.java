package com.sporty.android.core.model.oddsboost;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J@\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\u0002\b\u001e¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/oddsboost/OddsBoostLfbConfig;", "", "isEnabled", "", "maxBoostsPerEventIn24Hours", "", "maxBoostsIn24Hours", "boostedEventIds", "", "", "<init>", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "()Z", "getMaxBoostsPerEventIn24Hours", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxBoostsIn24Hours", "getBoostedEventIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/sporty/android/core/model/oddsboost/OddsBoostLfbConfig;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OddsBoostLfbConfig {
    private final List<String> boostedEventIds;
    private final boolean isEnabled;
    private final Integer maxBoostsIn24Hours;
    private final Integer maxBoostsPerEventIn24Hours;

    public OddsBoostLfbConfig(boolean z, Integer num, Integer num2, List<String> list) {
        list.getClass();
        this.isEnabled = z;
        this.maxBoostsPerEventIn24Hours = num;
        this.maxBoostsIn24Hours = num2;
        this.boostedEventIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OddsBoostLfbConfig copy$default(OddsBoostLfbConfig oddsBoostLfbConfig, boolean z, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = oddsBoostLfbConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            num = oddsBoostLfbConfig.maxBoostsPerEventIn24Hours;
        }
        if ((i & 4) != 0) {
            num2 = oddsBoostLfbConfig.maxBoostsIn24Hours;
        }
        if ((i & 8) != 0) {
            list = oddsBoostLfbConfig.boostedEventIds;
        }
        return oddsBoostLfbConfig.copy(z, num, num2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxBoostsPerEventIn24Hours() {
        return this.maxBoostsPerEventIn24Hours;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxBoostsIn24Hours() {
        return this.maxBoostsIn24Hours;
    }

    public final List<String> component4() {
        return this.boostedEventIds;
    }

    public final OddsBoostLfbConfig copy(boolean isEnabled, Integer maxBoostsPerEventIn24Hours, Integer maxBoostsIn24Hours, List<String> boostedEventIds) {
        boostedEventIds.getClass();
        return new OddsBoostLfbConfig(isEnabled, maxBoostsPerEventIn24Hours, maxBoostsIn24Hours, boostedEventIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsBoostLfbConfig)) {
            return false;
        }
        OddsBoostLfbConfig oddsBoostLfbConfig = (OddsBoostLfbConfig) other;
        return this.isEnabled == oddsBoostLfbConfig.isEnabled && Intrinsics.g(this.maxBoostsPerEventIn24Hours, oddsBoostLfbConfig.maxBoostsPerEventIn24Hours) && Intrinsics.g(this.maxBoostsIn24Hours, oddsBoostLfbConfig.maxBoostsIn24Hours) && Intrinsics.g(this.boostedEventIds, oddsBoostLfbConfig.boostedEventIds);
    }

    public final List<String> getBoostedEventIds() {
        return this.boostedEventIds;
    }

    public final Integer getMaxBoostsIn24Hours() {
        return this.maxBoostsIn24Hours;
    }

    public final Integer getMaxBoostsPerEventIn24Hours() {
        return this.maxBoostsPerEventIn24Hours;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
        Integer num = this.maxBoostsPerEventIn24Hours;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxBoostsIn24Hours;
        return this.boostedEventIds.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "OddsBoostLfbConfig(isEnabled=" + this.isEnabled + ", maxBoostsPerEventIn24Hours=" + this.maxBoostsPerEventIn24Hours + ", maxBoostsIn24Hours=" + this.maxBoostsIn24Hours + ", boostedEventIds=" + this.boostedEventIds + ")";
    }
}
