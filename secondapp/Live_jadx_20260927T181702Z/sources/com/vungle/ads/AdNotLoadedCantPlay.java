package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.x;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AdNotLoadedCantPlay extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public AdNotLoadedCantPlay() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdNotLoadedCantPlay(String str, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public AdNotLoadedCantPlay(@m String str) {
        super(Sdk.SDKError.Reason.AD_NOT_LOADED, "Failed to retrieve the ad object: " + str, null);
    }
}
