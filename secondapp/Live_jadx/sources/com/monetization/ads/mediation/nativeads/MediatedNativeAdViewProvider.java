package com.monetization.ads.mediation.nativeads;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedNativeAdViewProvider {
    @m
    TextView getAgeView();

    @m
    TextView getBodyView();

    @m
    TextView getCallToActionView();

    @m
    TextView getDomainView();

    @m
    ImageView getFeedbackView();

    @m
    ImageView getIconView();

    @m
    FrameLayout getMediaView();

    @l
    View getNativeAdView();

    @m
    TextView getPriceView();

    @m
    View getRatingView();

    @m
    TextView getReviewCountView();

    @m
    TextView getSponsoredView();

    @m
    TextView getTitleView();

    @m
    TextView getWarningView();
}
