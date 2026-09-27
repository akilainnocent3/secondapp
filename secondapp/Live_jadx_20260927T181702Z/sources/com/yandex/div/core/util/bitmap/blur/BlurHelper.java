package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface BlurHelper {
    @l
    Bitmap blurBitmap(@l Bitmap bitmap, float f10);

    @l
    Bitmap blurShadow(@l Bitmap bitmap, float f10);

    float getBitmapScale(float f10);

    float getCoercedBlurRadius(float f10);

    void release();
}
