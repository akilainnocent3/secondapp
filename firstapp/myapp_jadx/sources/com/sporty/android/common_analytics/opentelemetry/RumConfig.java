package com.sporty.android.common_analytics.opentelemetry;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.t160;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/common_analytics/opentelemetry/RumConfig;", "", "isEnabled", "", "traceRatio", "", "traceSamplingConfig", "Lcom/sporty/android/common_analytics/opentelemetry/TraceSamplingConfig;", "<init>", "(ZLjava/lang/String;Lcom/sporty/android/common_analytics/opentelemetry/TraceSamplingConfig;)V", "()Z", "getTraceRatio", "()Ljava/lang/String;", "getTraceSamplingConfig", "()Lcom/sporty/android/common_analytics/opentelemetry/TraceSamplingConfig;", "Lcom/google/gson/annotations/SerializedName;", "value", "traceSamplingByStatus", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "common-analytics", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RumConfig {
    private final boolean isEnabled;
    private final String traceRatio;

    @SerializedName("traceSamplingByStatus")
    private final TraceSamplingConfig traceSamplingConfig;

    public RumConfig(boolean z, String str, TraceSamplingConfig traceSamplingConfig) {
        str.getClass();
        this.isEnabled = z;
        this.traceRatio = str;
        this.traceSamplingConfig = traceSamplingConfig;
    }

    public static /* synthetic */ RumConfig copy$default(RumConfig rumConfig, boolean z, String str, TraceSamplingConfig traceSamplingConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rumConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            str = rumConfig.traceRatio;
        }
        if ((i & 4) != 0) {
            traceSamplingConfig = rumConfig.traceSamplingConfig;
        }
        return rumConfig.copy(z, str, traceSamplingConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTraceRatio() {
        return this.traceRatio;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TraceSamplingConfig getTraceSamplingConfig() {
        return this.traceSamplingConfig;
    }

    public final RumConfig copy(boolean isEnabled, String traceRatio, TraceSamplingConfig traceSamplingConfig) {
        traceRatio.getClass();
        return new RumConfig(isEnabled, traceRatio, traceSamplingConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RumConfig)) {
            return false;
        }
        RumConfig rumConfig = (RumConfig) other;
        return this.isEnabled == rumConfig.isEnabled && Intrinsics.g(this.traceRatio, rumConfig.traceRatio) && Intrinsics.g(this.traceSamplingConfig, rumConfig.traceSamplingConfig);
    }

    public final String getTraceRatio() {
        return this.traceRatio;
    }

    public final TraceSamplingConfig getTraceSamplingConfig() {
        return this.traceSamplingConfig;
    }

    public int hashCode() {
        int iA = gmf0.a(Boolean.hashCode(this.isEnabled) * 31, 31, this.traceRatio);
        TraceSamplingConfig traceSamplingConfig = this.traceSamplingConfig;
        return iA + (traceSamplingConfig == null ? 0 : traceSamplingConfig.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        String str = this.traceRatio;
        TraceSamplingConfig traceSamplingConfig = this.traceSamplingConfig;
        StringBuilder sbA = t160.a("RumConfig(isEnabled=", ", traceRatio=", str, ", traceSamplingConfig=", z);
        sbA.append(traceSamplingConfig);
        sbA.append(")");
        return sbA.toString();
    }
}
