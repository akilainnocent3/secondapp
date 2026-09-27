package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PlacementAdTypeMismatchError extends VungleError {
    public PlacementAdTypeMismatchError(@m String str) {
        super(Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH, str + " Ad type does not match with placement type", null);
    }
}
