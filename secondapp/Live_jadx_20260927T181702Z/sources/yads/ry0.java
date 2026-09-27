package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ry0 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0 f155191a;

    public ry0(zf0 zf0Var) {
        this.f155191a = zf0Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f155191a.a((ExtendedNativeAdView) viewGroup);
    }

    @Override // yads.zf0
    public final void c() {
        this.f155191a.c();
    }
}
