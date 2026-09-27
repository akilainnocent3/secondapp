package com.yandex.div.core.images;

import androidx.annotation.NonNull;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a {
    public static Boolean a(DivImageLoader divImageLoader) {
        return Boolean.FALSE;
    }

    @NonNull
    @j0
    public static LoadReference b(DivImageLoader divImageLoader, @NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return divImageLoader.loadImage(str, divImageDownloadCallback);
    }

    @NonNull
    @j0
    public static LoadReference c(DivImageLoader divImageLoader, @NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return divImageLoader.loadImageBytes(str, divImageDownloadCallback);
    }
}
