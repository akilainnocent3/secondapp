package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface AdCallback {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static void onAdExpired(@l AdCallback adCallback, @l ExpirationEvent event) {
            m0.p(event, "event");
        }
    }

    void onAdClicked(@l ClickEvent clickEvent, @m ClickError clickError);

    void onAdExpired(@l ExpirationEvent expirationEvent);

    void onAdLoaded(@l CacheEvent cacheEvent, @m CacheError cacheError);

    void onAdRequestedToShow(@l ShowEvent showEvent);

    void onAdShown(@l ShowEvent showEvent, @m ShowError showError);

    void onImpressionRecorded(@l ImpressionEvent impressionEvent);
}
