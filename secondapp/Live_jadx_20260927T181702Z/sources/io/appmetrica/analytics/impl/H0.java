package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f95877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f95879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f95880f;

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i10, String str3, String str4) {
        this.f95875a = str;
        this.f95876b = str2;
        this.f95877c = counterConfigurationReporterType;
        this.f95878d = i10;
        this.f95879e = str3;
        this.f95880f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h10 = (H0) obj;
        return kotlin.jvm.internal.m0.g(this.f95875a, h10.f95875a) && kotlin.jvm.internal.m0.g(this.f95876b, h10.f95876b) && this.f95877c == h10.f95877c && this.f95878d == h10.f95878d && kotlin.jvm.internal.m0.g(this.f95879e, h10.f95879e) && kotlin.jvm.internal.m0.g(this.f95880f, h10.f95880f);
    }

    public final int hashCode() {
        int iHashCode = (this.f95879e.hashCode() + ((this.f95878d + ((this.f95877c.hashCode() + ((this.f95876b.hashCode() + (this.f95875a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f95880f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f95875a + ", packageName=" + this.f95876b + ", reporterType=" + this.f95877c + ", processID=" + this.f95878d + ", processSessionID=" + this.f95879e + ", errorEnvironment=" + this.f95880f + ')';
    }
}
