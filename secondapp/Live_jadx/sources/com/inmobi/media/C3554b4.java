package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.b4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3554b4 extends AbstractC3907p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56044c;

    public C3554b4(int i10, long j10, String configType) {
        kotlin.jvm.internal.m0.p(configType, "configType");
        this.f56042a = configType;
        this.f56043b = i10;
        this.f56044c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3554b4)) {
            return false;
        }
        C3554b4 c3554b4 = (C3554b4) obj;
        return kotlin.jvm.internal.m0.g(this.f56042a, c3554b4.f56042a) && this.f56043b == c3554b4.f56043b && this.f56044c == c3554b4.f56044c;
    }

    public final int hashCode() {
        return f0.p.a(this.f56044c) + AbstractC3671fi.a(this.f56043b, this.f56042a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigFailure(configType=" + this.f56042a + ", errorCode=" + this.f56043b + ", lastUpdatedTimestamp=" + this.f56044c + gi.j.f86771d;
    }
}
