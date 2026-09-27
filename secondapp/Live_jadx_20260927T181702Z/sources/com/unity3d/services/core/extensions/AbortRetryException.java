package com.unity3d.services.core.extensions;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AbortRetryException extends Exception {

    @l
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortRetryException(@l String reason) {
        super(reason);
        m0.p(reason, "reason");
        this.reason = reason;
    }
}
