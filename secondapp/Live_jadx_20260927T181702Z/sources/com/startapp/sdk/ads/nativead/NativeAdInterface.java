package com.startapp.sdk.ads.nativead;

import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Keep
public interface NativeAdInterface {
    @Keep
    String getCallToAction();

    @Keep
    StartAppNativeAd.CampaignAction getCampaignAction();

    @Keep
    String getCategory();

    @Keep
    String getDescription();

    @Nullable
    @Keep
    String getErid();

    @Nullable
    @Keep
    String getEridUrl();

    @Keep
    Bitmap getImageBitmap();

    @Keep
    String getImageUrl();

    @Keep
    String getInstalls();

    @Keep
    String getPackageName();

    @Keep
    float getRating();

    @Keep
    Bitmap getSecondaryImageBitmap();

    @Keep
    String getSecondaryImageUrl();

    @Keep
    String getTitle();

    @Keep
    boolean isApp();

    @Keep
    boolean isBelowMinCPM();

    @Keep
    void registerViewForInteraction(@NonNull View view);

    @Keep
    void registerViewForInteraction(@NonNull View view, @Nullable List<View> list);

    @Keep
    void registerViewForInteraction(@NonNull View view, @Nullable List<View> list, @Nullable NativeAdDisplayListener nativeAdDisplayListener);

    @Keep
    void unregisterView();
}
