package com.sporty.android.common_analytics.opentelemetry;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/common_analytics/opentelemetry/TraceSamplingConfig;", "", "ok", "", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "unset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOk", "()Ljava/lang/String;", "getError", "getUnset", "validate", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "common-analytics", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TraceSamplingConfig {
    private final String error;
    private final String ok;
    private final String unset;

    public TraceSamplingConfig(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.ok = str;
        this.error = str2;
        this.unset = str3;
    }

    public static /* synthetic */ TraceSamplingConfig copy$default(TraceSamplingConfig traceSamplingConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = traceSamplingConfig.ok;
        }
        if ((i & 2) != 0) {
            str2 = traceSamplingConfig.error;
        }
        if ((i & 4) != 0) {
            str3 = traceSamplingConfig.unset;
        }
        return traceSamplingConfig.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOk() {
        return this.ok;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnset() {
        return this.unset;
    }

    public final TraceSamplingConfig copy(String ok, String error, String unset) {
        ok.getClass();
        error.getClass();
        unset.getClass();
        return new TraceSamplingConfig(ok, error, unset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceSamplingConfig)) {
            return false;
        }
        TraceSamplingConfig traceSamplingConfig = (TraceSamplingConfig) other;
        return Intrinsics.g(this.ok, traceSamplingConfig.ok) && Intrinsics.g(this.error, traceSamplingConfig.error) && Intrinsics.g(this.unset, traceSamplingConfig.unset);
    }

    public final String getError() {
        return this.error;
    }

    public final String getOk() {
        return this.ok;
    }

    public final String getUnset() {
        return this.unset;
    }

    public int hashCode() {
        return this.unset.hashCode() + gmf0.a(this.ok.hashCode() * 31, 31, this.error);
    }

    public String toString() {
        String str = this.ok;
        String str2 = this.error;
        return uf80.a(ux5.a("TraceSamplingConfig(ok=", str, ", error=", str2, ", unset="), this.unset, ")");
    }

    public final boolean validate() {
        try {
            double d = Double.parseDouble(this.ok);
            if (0.0d <= d && d <= 1.0d) {
                double d2 = Double.parseDouble(this.error);
                if (0.0d <= d2 && d2 <= 1.0d) {
                    double d3 = Double.parseDouble(this.unset);
                    if (0.0d <= d3 && d3 <= 1.0d) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
