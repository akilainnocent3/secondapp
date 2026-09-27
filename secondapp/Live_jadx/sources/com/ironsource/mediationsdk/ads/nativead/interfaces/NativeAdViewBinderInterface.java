package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface NativeAdViewBinderInterface {
    void setAdvertiserView(@m View view);

    void setBodyView(@m View view);

    void setCallToActionView(@m View view);

    void setIconView(@m View view);

    void setMediaView(@m LevelPlayMediaView levelPlayMediaView);

    void setTitleView(@m View view);
}
