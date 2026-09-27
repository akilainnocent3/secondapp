package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class IndexHtmlError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexHtmlError(@l Sdk.SDKError.Reason reason, @l String msg) {
        super(reason, msg, null);
        m0.p(reason, "reason");
        m0.p(msg, "msg");
    }
}
