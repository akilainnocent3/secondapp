package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f54401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f54402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f54403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f54404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Fe f54405e;

    public Be(ViewGroup parentView, ImageView imageView, MediaView mediaView, List friendlyViews, Fe nativeVisibilitySpec) {
        kotlin.jvm.internal.m0.p(parentView, "parentView");
        kotlin.jvm.internal.m0.p(friendlyViews, "friendlyViews");
        kotlin.jvm.internal.m0.p(nativeVisibilitySpec, "nativeVisibilitySpec");
        this.f54401a = parentView;
        this.f54402b = imageView;
        this.f54403c = mediaView;
        this.f54404d = friendlyViews;
        this.f54405e = nativeVisibilitySpec;
    }
}
