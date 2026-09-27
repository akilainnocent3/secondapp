package com.startapp.sdk.ads.banner;

import android.view.View;
import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Keep
public interface BannerListener {
    @Keep
    void onClick(View view);

    @Keep
    void onFailedToReceiveAd(View view);

    @Keep
    void onImpression(View view);

    @Keep
    void onReceiveAd(View view);
}
