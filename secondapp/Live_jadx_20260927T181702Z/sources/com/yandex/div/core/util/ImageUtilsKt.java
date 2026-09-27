package com.yandex.div.core.util;

import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import l1.e;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ImageUtilsKt {
    @l
    public static final CachedBitmap toCachedBitmap(@l PictureDrawable pictureDrawable, @l Uri uri, @m byte[] bArr) {
        return new CachedBitmap(e.b(pictureDrawable, 0, 0, null, 7, null), bArr, uri, BitmapSource.MEMORY);
    }

    public static /* synthetic */ CachedBitmap toCachedBitmap$default(PictureDrawable pictureDrawable, Uri uri, byte[] bArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bArr = null;
        }
        return toCachedBitmap(pictureDrawable, uri, bArr);
    }
}
