package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.j0;
import com.fyber.inneractive.sdk.flow.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class NativeAdImageContentController extends j0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        x adContent = inneractiveAdSpot.getAdContent();
        return (adContent instanceof NativeAdContent) && !adContent.isVideoAd();
    }
}
