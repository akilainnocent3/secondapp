package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.x;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AdExpiredOnPlayError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public AdExpiredOnPlayError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdExpiredOnPlayError(String str, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public AdExpiredOnPlayError(@m String str) {
        super(Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY, "Ad expired upon playback request: " + str, null);
    }
}
