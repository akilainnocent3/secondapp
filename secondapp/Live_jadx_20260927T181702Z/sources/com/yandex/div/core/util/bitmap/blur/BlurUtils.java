package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class BlurUtils {

    @l
    public static final BlurUtils INSTANCE = new BlurUtils();

    private BlurUtils() {
    }

    public final boolean isBlurParamsValid(@l Bitmap bitmap, float f10) {
        return !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && f10 > 0.0f;
    }
}
