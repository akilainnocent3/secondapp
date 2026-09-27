package com.yandex.div.core.images;

import android.widget.ImageView;
import androidx.annotation.NonNull;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivImageLoader {
    Boolean hasSvgSupport();

    @NonNull
    @j0
    LoadReference loadImage(@NonNull String str, @NonNull ImageView imageView);

    @NonNull
    @j0
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @j0
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10);

    @NonNull
    @j0
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @j0
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10);
}
