package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.mediation.adapter.MaxAdapterError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface MaxAdViewAdapterListener extends MaxAdapterListener {
    void onAdViewAdClicked();

    void onAdViewAdClicked(@Nullable Bundle bundle);

    void onAdViewAdCollapsed();

    void onAdViewAdCollapsed(@Nullable Bundle bundle);

    void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    void onAdViewAdDisplayed();

    void onAdViewAdDisplayed(@Nullable Bundle bundle);

    void onAdViewAdExpanded();

    void onAdViewAdExpanded(@Nullable Bundle bundle);

    void onAdViewAdHidden();

    void onAdViewAdHidden(@Nullable Bundle bundle);

    void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError);

    void onAdViewAdLoaded(View view);

    void onAdViewAdLoaded(View view, @Nullable Bundle bundle);
}
