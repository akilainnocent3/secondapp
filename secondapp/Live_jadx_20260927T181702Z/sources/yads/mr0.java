package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mr0 implements t31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f152608b = {wb.a(mr0.class, "faviconView", "getFaviconView()Landroid/widget/ImageView;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f152609a;

    public mr0(ImageView imageView) {
        this.f152609a = mm2.a(imageView);
    }

    @Override // yads.t31
    public final void a(Drawable drawable) {
        Bitmap bitmap;
        int dimensionPixelSize;
        dr.w2 w2Var = null;
        w2Var = null;
        if (drawable != null) {
            lm2 lm2Var = this.f152609a;
            ns.o oVar = f152608b[0];
            ImageView imageView = (ImageView) lm2Var.f152056a.get();
            if (imageView != null) {
                BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    try {
                        dimensionPixelSize = imageView.getResources().getDimensionPixelSize(R.dimen.monetization_instream_internal_advertiser_icon_size);
                    } catch (Throwable unused) {
                        dimensionPixelSize = 0;
                    }
                    imageView.setScaleType((dimensionPixelSize <= 0 || (width >= dimensionPixelSize && height >= dimensionPixelSize)) ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_INSIDE);
                }
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                w2Var = dr.w2.f79517a;
            }
        }
        if (w2Var == null) {
            lm2 lm2Var2 = this.f152609a;
            ns.o oVar2 = f152608b[0];
            ImageView imageView2 = (ImageView) lm2Var2.f152056a.get();
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
        }
    }
}
