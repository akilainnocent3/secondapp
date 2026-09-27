package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface AppLovinNativeAd {
    void destroy();

    long getAdIdNumber();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Uri getIconUri();

    AppLovinMediaView getMediaView();

    AppLovinOptionsView getOptionsView();

    Double getStarRating();

    String getTitle();

    void registerViewsForInteraction(List<View> list, ViewGroup viewGroup);

    void unregisterViewsForInteraction();
}
