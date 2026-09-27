package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class A6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaView f54328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3799kl f54329b;

    public A6(MediaView mediaView, C3799kl c3799kl) {
        kotlin.jvm.internal.m0.p(mediaView, "mediaView");
        this.f54328a = mediaView;
        this.f54329b = c3799kl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A6)) {
            return false;
        }
        A6 a10 = (A6) obj;
        return kotlin.jvm.internal.m0.g(this.f54328a, a10.f54328a) && kotlin.jvm.internal.m0.g(this.f54329b, a10.f54329b);
    }

    public final int hashCode() {
        int iHashCode = this.f54328a.hashCode() * 31;
        C3799kl c3799kl = this.f54329b;
        return iHashCode + (c3799kl == null ? 0 : c3799kl.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.f54328a + ", vastBeaconData=" + this.f54329b + gi.j.f86771d;
    }
}
