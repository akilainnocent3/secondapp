package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f95841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f95845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H0 f95846f;

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, H0 h10) {
        this.f95841a = nativeCrashSource;
        this.f95842b = str;
        this.f95843c = str2;
        this.f95844d = str3;
        this.f95845e = j10;
        this.f95846f = h10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g10 = (G0) obj;
        return this.f95841a == g10.f95841a && kotlin.jvm.internal.m0.g(this.f95842b, g10.f95842b) && kotlin.jvm.internal.m0.g(this.f95843c, g10.f95843c) && kotlin.jvm.internal.m0.g(this.f95844d, g10.f95844d) && this.f95845e == g10.f95845e && kotlin.jvm.internal.m0.g(this.f95846f, g10.f95846f);
    }

    public final int hashCode() {
        return this.f95846f.hashCode() + ((f0.p.a(this.f95845e) + ((this.f95844d.hashCode() + ((this.f95843c.hashCode() + ((this.f95842b.hashCode() + (this.f95841a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f95841a + ", handlerVersion=" + this.f95842b + ", uuid=" + this.f95843c + ", dumpFile=" + this.f95844d + ", creationTime=" + this.f95845e + ", metadata=" + this.f95846f + ')';
    }
}
