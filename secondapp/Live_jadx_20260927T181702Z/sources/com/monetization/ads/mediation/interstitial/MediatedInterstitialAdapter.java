package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class MediatedInterstitialAdapter extends com.monetization.ads.mediation.base.a {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface MediatedInterstitialAdapterListener {
        void onAdImpression();

        void onInterstitialClicked();

        void onInterstitialDismissed();

        void onInterstitialFailedToLoad(@l MediatedAdRequestError mediatedAdRequestError);

        void onInterstitialLeftApplication();

        void onInterstitialLoaded();

        void onInterstitialShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadInterstitial(@l Context context, @l MediatedInterstitialAdapterListener mediatedInterstitialAdapterListener, @l Map<String, ? extends Object> map, @l Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showInterstitial(@l Activity activity);
}
