package yads;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kt3 implements NativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a10 f151712a;

    public kt3(a10 a10Var) {
        this.f151712a = a10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt3) && kotlin.jvm.internal.m0.g(this.f151712a, ((kt3) obj).f151712a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final Bitmap getBitmap() {
        return (Bitmap) this.f151712a.f146608a.invoke();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getHeight() {
        return this.f151712a.f146611d;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getWidth() {
        return this.f151712a.f146610c;
    }

    public final int hashCode() {
        return this.f151712a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.f151712a + gi.j.f86771d;
    }
}
