package com.monetization.ads.mediation.appopenad;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class MediatedAppOpenAdAdapter extends com.monetization.ads.mediation.base.a {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface MediatedAppOpenAdAdapterListener {
        void onAdImpression();

        void onAppOpenAdClicked();

        void onAppOpenAdDismissed();

        void onAppOpenAdFailedToLoad(@l MediatedAdRequestError mediatedAdRequestError);

        void onAppOpenAdLeftApplication();

        void onAppOpenAdLoaded();

        void onAppOpenAdShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadAppOpenAd(@l Context context, @l MediatedAppOpenAdAdapterListener mediatedAppOpenAdAdapterListener, @l Map<String, ? extends Object> map, @l Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showAppOpenAd(@l Activity activity);
}
