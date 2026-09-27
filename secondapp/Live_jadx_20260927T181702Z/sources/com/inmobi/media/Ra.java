package com.inmobi.media;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ra extends Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f55428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55431d;

    public Ra(Activity activity, String finalUrl, String callerId, boolean z10) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        kotlin.jvm.internal.m0.p(finalUrl, "finalUrl");
        kotlin.jvm.internal.m0.p(callerId, "callerId");
        this.f55428a = activity;
        this.f55429b = finalUrl;
        this.f55430c = callerId;
        this.f55431d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ra)) {
            return false;
        }
        Ra ra2 = (Ra) obj;
        return kotlin.jvm.internal.m0.g(this.f55428a, ra2.f55428a) && kotlin.jvm.internal.m0.g(this.f55429b, ra2.f55429b) && kotlin.jvm.internal.m0.g(this.f55430c, ra2.f55430c) && this.f55431d == ra2.f55431d;
    }

    public final int hashCode() {
        return g8.a.a(this.f55431d) + ((this.f55430c.hashCode() + ((this.f55429b.hashCode() + (this.f55428a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.f55428a + ", finalUrl=" + this.f55429b + ", callerId=" + this.f55430c + ", overlay=" + this.f55431d + gi.j.f86771d;
    }
}
