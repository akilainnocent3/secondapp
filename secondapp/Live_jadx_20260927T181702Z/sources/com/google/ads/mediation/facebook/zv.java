package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zv {
    public InterstitialAd zr(Context context, String str) {
        return new InterstitialAd(context, str);
    }

    public RewardedVideoAd zs(Context context, String str) {
        return new RewardedVideoAd(context, str);
    }

    public InterstitialAd zz(Context context, String str) {
        return new InterstitialAd(context, str);
    }

    public MediaView zz(Context context) {
        return new MediaView(context);
    }

    public AdView zz(Context context, String str, String str2) {
        return new AdView(context, str, str2);
    }
}
