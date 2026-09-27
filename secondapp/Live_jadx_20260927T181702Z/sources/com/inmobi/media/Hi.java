package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Hi extends AbstractC4004t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f54803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hi(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        kotlin.jvm.internal.m0.p(adView, "adView");
        kotlin.jvm.internal.m0.p(adQualityConfig, "adQualityConfig");
        this.f54803b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.M0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        View adView = (View) this.f54803b.get();
        if (adView == null) {
            System.currentTimeMillis();
            return null;
        }
        kotlin.jvm.internal.m0.p(adView, "adView");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(adView.getMeasuredWidth(), adView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.m0.o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = adView.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        adView.draw(canvas);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        System.currentTimeMillis();
        return a(bitmapCreateBitmap);
    }
}
