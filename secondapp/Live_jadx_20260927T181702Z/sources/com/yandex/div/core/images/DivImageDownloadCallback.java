package com.yandex.div.core.images;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public class DivImageDownloadCallback {
    @Nullable
    @g1
    public String getAdditionalLogInfo() {
        return null;
    }

    @g1
    public void onCancel() {
        onError();
    }

    @g1
    public void onSuccess(@NonNull Drawable drawable) {
    }

    @g1
    public void onSuccess(@NonNull PictureDrawable pictureDrawable) {
    }

    @g1
    public void onSuccess(@NonNull CachedBitmap cachedBitmap) {
    }

    @g1
    public void onError() {
    }

    @g1
    public void onScheduling() {
    }
}
