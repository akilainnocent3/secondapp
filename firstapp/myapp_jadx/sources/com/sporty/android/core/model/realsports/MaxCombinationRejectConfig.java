package com.sporty.android.core.model.realsports;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/realsports/MaxCombinationRejectConfig;", "", "enabled", "", "maxCombinations", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxCombinations", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/sporty/android/core/model/realsports/MaxCombinationRejectConfig;", "equals", "other", "hashCode", "toString", "", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MaxCombinationRejectConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean enabled;
    private final Integer maxCombinations;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005H\u0007b\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sporty/android/core/model/realsports/MaxCombinationRejectConfig$Companion;", "", "<init>", "()V", "getDefault", "Lcom/sporty/android/core/model/realsports/MaxCombinationRejectConfig;", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MaxCombinationRejectConfig getDefault() {
            return new MaxCombinationRejectConfig(Boolean.TRUE, 40000);
        }

        private Companion() {
        }
    }

    public /* synthetic */ MaxCombinationRejectConfig(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? 40000 : num);
    }

    public static /* synthetic */ MaxCombinationRejectConfig copy$default(MaxCombinationRejectConfig maxCombinationRejectConfig, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = maxCombinationRejectConfig.enabled;
        }
        if ((i & 2) != 0) {
            num = maxCombinationRejectConfig.maxCombinations;
        }
        return maxCombinationRejectConfig.copy(bool, num);
    }

    public static final MaxCombinationRejectConfig getDefault() {
        return INSTANCE.getDefault();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxCombinations() {
        return this.maxCombinations;
    }

    public final MaxCombinationRejectConfig copy(Boolean enabled, Integer maxCombinations) {
        return new MaxCombinationRejectConfig(enabled, maxCombinations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxCombinationRejectConfig)) {
            return false;
        }
        MaxCombinationRejectConfig maxCombinationRejectConfig = (MaxCombinationRejectConfig) other;
        return Intrinsics.g(this.enabled, maxCombinationRejectConfig.enabled) && Intrinsics.g(this.maxCombinations, maxCombinationRejectConfig.maxCombinations);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getMaxCombinations() {
        return this.maxCombinations;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.maxCombinations;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "MaxCombinationRejectConfig(enabled=" + this.enabled + ", maxCombinations=" + this.maxCombinations + ")";
    }

    public MaxCombinationRejectConfig(Boolean bool, Integer num) {
        this.enabled = bool;
        this.maxCombinations = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaxCombinationRejectConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
