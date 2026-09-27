package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiNativeViewData f55506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f55507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f55508c;

    public Sg(InMobiNativeViewData pubView, MediaView mediaView, View view) {
        kotlin.jvm.internal.m0.p(pubView, "pubView");
        this.f55506a = pubView;
        this.f55507b = mediaView;
        this.f55508c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sg)) {
            return false;
        }
        Sg sg2 = (Sg) obj;
        return kotlin.jvm.internal.m0.g(this.f55506a, sg2.f55506a) && kotlin.jvm.internal.m0.g(this.f55507b, sg2.f55507b) && kotlin.jvm.internal.m0.g(this.f55508c, sg2.f55508c);
    }

    public final int hashCode() {
        int iHashCode = this.f55506a.hashCode() * 31;
        MediaView mediaView = this.f55507b;
        int iHashCode2 = (iHashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f55508c;
        return iHashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.f55506a + ", mediaView=" + this.f55507b + ", adChoice=" + this.f55508c + gi.j.f86771d;
    }
}
