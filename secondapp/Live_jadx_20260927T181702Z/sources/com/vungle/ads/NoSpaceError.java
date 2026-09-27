package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class NoSpaceError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public NoSpaceError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NoSpaceError(String str, int i10, x xVar) {
        this((i10 & 1) != 0 ? "No space left on device" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSpaceError(@l String msg) {
        super(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE, msg, null);
        m0.p(msg, "msg");
    }
}
