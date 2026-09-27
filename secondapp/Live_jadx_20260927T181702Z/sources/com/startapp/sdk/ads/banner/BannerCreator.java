package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Keep
public interface BannerCreator {
    @NonNull
    @Keep
    View create(@NonNull Context context, @Nullable BannerListener bannerListener);
}
