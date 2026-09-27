package com.google.android.gms.ads.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface NativeCustomFormatAd {

    @NonNull
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface DisplayOpenMeasurement {
        void setView(@NonNull View view);

        boolean start();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface OnCustomClickListener {
        void onCustomClick(@NonNull NativeCustomFormatAd nativeCustomFormatAd, @NonNull String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(@NonNull NativeCustomFormatAd nativeCustomFormatAd);
    }

    void destroy();

    @Nullable
    List<String> getAvailableAssetNames();

    @Nullable
    String getCustomFormatId();

    @Nullable
    DisplayOpenMeasurement getDisplayOpenMeasurement();

    @Nullable
    NativeAd.Image getImage(@NonNull String str);

    @Nullable
    MediaContent getMediaContent();

    @Nullable
    CharSequence getText(@NonNull String str);

    void performClick(@NonNull String str);

    void recordImpression();
}
