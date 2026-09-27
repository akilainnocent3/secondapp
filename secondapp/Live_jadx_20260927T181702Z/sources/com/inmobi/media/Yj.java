package com.inmobi.media;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f55845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f55846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f55847g;

    public Yj(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List priorityEventsList, double d10) {
        kotlin.jvm.internal.m0.p(priorityEventsList, "priorityEventsList");
        this.f55841a = z10;
        this.f55842b = z11;
        this.f55843c = z12;
        this.f55844d = z13;
        this.f55845e = z14;
        this.f55846f = priorityEventsList;
        this.f55847g = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yj)) {
            return false;
        }
        Yj yj2 = (Yj) obj;
        return this.f55841a == yj2.f55841a && this.f55842b == yj2.f55842b && this.f55843c == yj2.f55843c && this.f55844d == yj2.f55844d && this.f55845e == yj2.f55845e && kotlin.jvm.internal.m0.g(this.f55846f, yj2.f55846f) && Double.compare(this.f55847g, yj2.f55847g) == 0;
    }

    public final int hashCode() {
        return f0.i.a(this.f55847g) + ((this.f55846f.hashCode() + ((g8.a.a(this.f55845e) + ((g8.a.a(this.f55844d) + ((g8.a.a(this.f55843c) + ((g8.a.a(this.f55842b) + (g8.a.a(this.f55841a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f55841a + ", isImageEnabled=" + this.f55842b + ", isGIFEnabled=" + this.f55843c + ", isVideoEnabled=" + this.f55844d + ", isGeneralEventsDisabled=" + this.f55845e + ", priorityEventsList=" + this.f55846f + ", samplingFactor=" + this.f55847g + gi.j.f86771d;
    }
}
