package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mt3 implements b10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdImageLoadingListener f152678a;

    public mt3(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f152678a = nativeAdImageLoadingListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt3) && kotlin.jvm.internal.m0.g(this.f152678a, ((mt3) obj).f152678a);
    }

    public final int hashCode() {
        return this.f152678a.hashCode();
    }

    @Override // yads.b10
    public final void onFinishLoadingImages() {
        new CallbackStackTraceMarker(new lt3(this));
    }

    public final String toString() {
        return "YandexNativeAdImageLoadingListenerAdapter(imageLoadingListener=" + this.f152678a + gi.j.f86771d;
    }
}
