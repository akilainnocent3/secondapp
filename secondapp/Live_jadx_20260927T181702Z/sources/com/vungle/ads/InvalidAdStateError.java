package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InvalidAdStateError extends VungleError {
    public /* synthetic */ InvalidAdStateError(Sdk.SDKError.Reason reason, String str, int i10, x xVar) {
        this(reason, (i10 & 2) != 0 ? "Ad state is invalid" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAdStateError(@l Sdk.SDKError.Reason loggableReason, @l String errorMessage) {
        super(loggableReason, errorMessage, null);
        m0.p(loggableReason, "loggableReason");
        m0.p(errorMessage, "errorMessage");
    }
}
