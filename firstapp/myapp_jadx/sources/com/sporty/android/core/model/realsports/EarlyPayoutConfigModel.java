package com.sporty.android.core.model.realsports;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0012¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/realsports/EarlyPayoutConfigModel;", "", "features", "Lcom/sporty/android/core/model/realsports/EarlyPayoutConfigFeatures;", "<init>", "(Lcom/sporty/android/core/model/realsports/EarlyPayoutConfigFeatures;)V", "getFeatures", "()Lcom/sporty/android/core/model/realsports/EarlyPayoutConfigFeatures;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EarlyPayoutConfigModel {
    private final EarlyPayoutConfigFeatures features;

    public /* synthetic */ EarlyPayoutConfigModel(EarlyPayoutConfigFeatures earlyPayoutConfigFeatures, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : earlyPayoutConfigFeatures);
    }

    public static /* synthetic */ EarlyPayoutConfigModel copy$default(EarlyPayoutConfigModel earlyPayoutConfigModel, EarlyPayoutConfigFeatures earlyPayoutConfigFeatures, int i, Object obj) {
        if ((i & 1) != 0) {
            earlyPayoutConfigFeatures = earlyPayoutConfigModel.features;
        }
        return earlyPayoutConfigModel.copy(earlyPayoutConfigFeatures);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EarlyPayoutConfigFeatures getFeatures() {
        return this.features;
    }

    public final EarlyPayoutConfigModel copy(EarlyPayoutConfigFeatures features) {
        return new EarlyPayoutConfigModel(features);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EarlyPayoutConfigModel) && Intrinsics.g(this.features, ((EarlyPayoutConfigModel) other).features);
    }

    public final EarlyPayoutConfigFeatures getFeatures() {
        return this.features;
    }

    public int hashCode() {
        EarlyPayoutConfigFeatures earlyPayoutConfigFeatures = this.features;
        if (earlyPayoutConfigFeatures == null) {
            return 0;
        }
        return earlyPayoutConfigFeatures.hashCode();
    }

    public String toString() {
        return "EarlyPayoutConfigModel(features=" + this.features + ")";
    }

    public EarlyPayoutConfigModel(EarlyPayoutConfigFeatures earlyPayoutConfigFeatures) {
        this.features = earlyPayoutConfigFeatures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarlyPayoutConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
