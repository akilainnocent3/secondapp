package com.yandex.div.core.util.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.yandex.div.core.util.bitmap.blur.BlurHelper;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class BitmapEffectHelper implements BlurHelper {
    @l
    public final Bitmap mirrorBitmap(@l Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmapCreateBitmap.setDensity(160);
        return bitmapCreateBitmap;
    }
}
