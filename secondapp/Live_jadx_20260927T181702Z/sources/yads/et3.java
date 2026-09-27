package yads;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class et3 implements NativeAdAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f148836a;

    public et3(y00 y00Var) {
        this.f148836a = y00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et3) && kotlin.jvm.internal.m0.g(this.f148836a, ((et3) obj).f148836a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getAge() {
        return this.f148836a.f158076f;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.f148836a.f158077g;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.f148836a.f158078h;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.f148836a.f158079i;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getFavicon() {
        a10 a10Var = this.f148836a.f158072b;
        if (a10Var != null) {
            return new kt3(a10Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getIcon() {
        a10 a10Var = this.f148836a.f158073c;
        if (a10Var != null) {
            return new kt3(a10Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getImage() {
        a10 a10Var = this.f148836a.f158074d;
        if (a10Var != null) {
            return new kt3(a10Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdMedia getMedia() {
        h10 h10Var = this.f148836a.f158071a;
        if (h10Var != null) {
            return new qt3(h10Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getPrice() {
        return this.f148836a.f158080j;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final Float getRating() {
        return this.f148836a.f158081k;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getReviewCount() {
        return this.f148836a.f158082l;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getSponsored() {
        return this.f148836a.f158083m;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getTitle() {
        return this.f148836a.f158084n;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getWarning() {
        return this.f148836a.f158085o;
    }

    public final int hashCode() {
        return this.f148836a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final boolean isFeedbackAvailable() {
        return this.f148836a.f158086p;
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.f148836a + gi.j.f86771d;
    }
}
