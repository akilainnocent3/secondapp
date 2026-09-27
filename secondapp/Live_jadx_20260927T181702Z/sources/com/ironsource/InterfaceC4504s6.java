package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.s6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4504s6 {
    void a();

    void a(@oy.l Activity activity, @oy.m String str);

    void a(@oy.l LevelPlayAdError levelPlayAdError);

    @oy.l
    LevelPlayAdInfo b();

    @oy.l
    InterfaceC4338j0 c();

    void loadAd();

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@oy.l LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@oy.l LevelPlayAdInfo levelPlayAdInfo);
}
