package yads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y12 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f158095g = {wb.a(y12.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), wb.a(y12.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), wb.a(y12.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), wb.a(y12.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), wb.a(y12.class, "customAssets", "getCustomAssets()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f158096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f158097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f158098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f158099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2 f158100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f158101f;

    public y12(x12 x12Var) {
        this.f158096a = mm2.a(x12Var.e());
        this.f158097b = mm2.a(x12Var.c());
        this.f158098c = mm2.a(x12Var.d());
        this.f158099d = mm2.a(x12Var.f());
        this.f158100e = mm2.a(x12Var.b());
        this.f158101f = ki1.a(x12Var.a());
    }

    public final View a(String str) {
        WeakReference weakReference = (WeakReference) this.f158101f.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final View a() {
        lm2 lm2Var = this.f158096a;
        ns.o oVar = f158095g[0];
        return (View) lm2Var.f152056a.get();
    }
}
