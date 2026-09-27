package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface DismissibleAdCallback extends AdCallback {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static void onAdExpired(@l DismissibleAdCallback dismissibleAdCallback, @l ExpirationEvent event) {
            m0.p(event, "event");
            AdCallback.DefaultImpls.onAdExpired(dismissibleAdCallback, event);
        }
    }

    void onAdDismiss(@l DismissEvent dismissEvent);
}
