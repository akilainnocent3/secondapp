package com.startapp.sdk.adsbase.adlisteners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.sdk.adsbase.Ad;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Keep
public interface AdEventListener {
    @Keep
    void onFailedToReceiveAd(@Nullable Ad ad2);

    @Keep
    void onReceiveAd(@NonNull Ad ad2);
}
