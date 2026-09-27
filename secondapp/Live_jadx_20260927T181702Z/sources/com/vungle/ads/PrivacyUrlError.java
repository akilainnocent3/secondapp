package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PrivacyUrlError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyUrlError(@l String privacyUrl) {
        super(Sdk.SDKError.Reason.PRIVACY_URL_ERROR, "Failed to open privacy url: " + privacyUrl, null);
        m0.p(privacyUrl, "privacyUrl");
    }
}
