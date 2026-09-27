package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ly implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f152216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152217b;

    public ly(y00 y00Var, int i10) {
        this.f152216a = y00Var;
        this.f152217b = i10;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        y00 y00Var = this.f152216a;
        ny nyVar = new ny(y00Var, this.f152217b, new gy1());
        ImageView imageViewA = nyVar.a(extendedNativeAdView, my.f152753b, y00Var.f158072b);
        ImageView imageViewA2 = nyVar.a(extendedNativeAdView, my.f152754c, y00Var.f158073c);
        if (imageViewA != null) {
            imageViewA.setId(R.id.favicon);
        }
        if (imageViewA2 != null) {
            imageViewA2.setId(R.id.icon);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
