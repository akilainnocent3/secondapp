package com.mbridge.msdk.out.strategy;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.video.bt.module.orglistener.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface IVideoAdStrategy extends IBaseVideoAdStrategy {
    void clearBitmapCache();

    boolean isReady();

    void load();

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void loadFormSelfFilling();

    void setIVRewardEnable(int i10, double d10);

    void setIVRewardEnable(int i10, int i11);

    void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener);

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void setRewardPlus(boolean z10);

    void setRewardVideoListener(g gVar);

    void show();

    void show(Activity activity);

    void show(String str);

    void show(String str, String str2);
}
