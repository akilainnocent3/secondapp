package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.div.core.annotations.PublicApi;
import java.util.concurrent.Future;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface LoadableImage {
    void cleanLoadingTask();

    @m
    Future<?> getLoadingTask();

    void imageLoaded();

    boolean isImageLoaded();

    boolean isImagePreview();

    void previewLoaded();

    void resetImageLoaded();

    void saveLoadingTask(@l Future<?> future);

    void setImage(@m Bitmap bitmap);

    void setImage(@m Drawable drawable);

    void setPlaceholder(@m Drawable drawable);

    void setPreview(@m Bitmap bitmap);

    void setPreview(@m Drawable drawable);
}
