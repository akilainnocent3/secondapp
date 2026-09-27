package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class HeartbeatMissingError extends VungleError {
    public HeartbeatMissingError() {
        super(Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT, "Ad closed without receiving heartbeat", null);
    }
}
