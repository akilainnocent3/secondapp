package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AdRetryError extends VungleError {
    public AdRetryError() {
        super(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER, "Ads retry-after: Server is busy", null);
    }
}
