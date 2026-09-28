package com.sporty.android.core.model.realsports;

import defpackage.v9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011Ê\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/realsports/EarlyPayoutConfig;", "", "name", "", "enabled", "Lcom/sporty/android/core/model/realsports/EarlyPayoutProductEnabled;", "marketMapping", "", "Lcom/sporty/android/core/model/realsports/EarlyPayoutMarketMapping;", "supportSportIds", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/realsports/EarlyPayoutProductEnabled;Ljava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getEnabled", "()Lcom/sporty/android/core/model/realsports/EarlyPayoutProductEnabled;", "getMarketMapping", "()Ljava/util/List;", "getSupportSportIds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EarlyPayoutConfig {
    private final EarlyPayoutProductEnabled enabled;
    private final List<EarlyPayoutMarketMapping> marketMapping;
    private final String name;
    private final List<String> supportSportIds;

    public /* synthetic */ EarlyPayoutConfig(String str, EarlyPayoutProductEnabled earlyPayoutProductEnabled, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : earlyPayoutProductEnabled, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarlyPayoutConfig copy$default(EarlyPayoutConfig earlyPayoutConfig, String str, EarlyPayoutProductEnabled earlyPayoutProductEnabled, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earlyPayoutConfig.name;
        }
        if ((i & 2) != 0) {
            earlyPayoutProductEnabled = earlyPayoutConfig.enabled;
        }
        if ((i & 4) != 0) {
            list = earlyPayoutConfig.marketMapping;
        }
        if ((i & 8) != 0) {
            list2 = earlyPayoutConfig.supportSportIds;
        }
        return earlyPayoutConfig.copy(str, earlyPayoutProductEnabled, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EarlyPayoutProductEnabled getEnabled() {
        return this.enabled;
    }

    public final List<EarlyPayoutMarketMapping> component3() {
        return this.marketMapping;
    }

    public final List<String> component4() {
        return this.supportSportIds;
    }

    public final EarlyPayoutConfig copy(String name, EarlyPayoutProductEnabled enabled, List<EarlyPayoutMarketMapping> marketMapping, List<String> supportSportIds) {
        return new EarlyPayoutConfig(name, enabled, marketMapping, supportSportIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyPayoutConfig)) {
            return false;
        }
        EarlyPayoutConfig earlyPayoutConfig = (EarlyPayoutConfig) other;
        return Intrinsics.g(this.name, earlyPayoutConfig.name) && Intrinsics.g(this.enabled, earlyPayoutConfig.enabled) && Intrinsics.g(this.marketMapping, earlyPayoutConfig.marketMapping) && Intrinsics.g(this.supportSportIds, earlyPayoutConfig.supportSportIds);
    }

    public final EarlyPayoutProductEnabled getEnabled() {
        return this.enabled;
    }

    public final List<EarlyPayoutMarketMapping> getMarketMapping() {
        return this.marketMapping;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getSupportSportIds() {
        return this.supportSportIds;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EarlyPayoutProductEnabled earlyPayoutProductEnabled = this.enabled;
        int iHashCode2 = (iHashCode + (earlyPayoutProductEnabled == null ? 0 : earlyPayoutProductEnabled.hashCode())) * 31;
        List<EarlyPayoutMarketMapping> list = this.marketMapping;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.supportSportIds;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        EarlyPayoutProductEnabled earlyPayoutProductEnabled = this.enabled;
        List<EarlyPayoutMarketMapping> list = this.marketMapping;
        List<String> list2 = this.supportSportIds;
        StringBuilder sb = new StringBuilder("EarlyPayoutConfig(name=");
        sb.append(str);
        sb.append(", enabled=");
        sb.append(earlyPayoutProductEnabled);
        sb.append(", marketMapping=");
        return v9d.a(", supportSportIds=", ")", sb, list, list2);
    }

    public EarlyPayoutConfig(String str, EarlyPayoutProductEnabled earlyPayoutProductEnabled, List<EarlyPayoutMarketMapping> list, List<String> list2) {
        this.name = str;
        this.enabled = earlyPayoutProductEnabled;
        this.marketMapping = list;
        this.supportSportIds = list2;
    }

    public EarlyPayoutConfig() {
        this(null, null, null, null, 15, null);
    }
}
