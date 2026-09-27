package com.monetization.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class MediatedBannerAdapter extends com.monetization.ads.mediation.base.a {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface MediatedBannerAdapterListener {
        void onAdClicked();

        void onAdFailedToLoad(@l MediatedAdRequestError mediatedAdRequestError);

        void onAdImpression();

        void onAdLeftApplication();

        void onAdLoaded(@l View view);
    }

    public abstract void loadBanner(@l Context context, @l MediatedBannerAdapterListener mediatedBannerAdapterListener, @l Map<String, ? extends Object> map, @l Map<String, String> map2);

    public abstract void onInvalidate();
}
