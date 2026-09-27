package com.unity3d.ads;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@UnityAdsExperimental
public final class UnityAdsError {
    private final int code;

    @l
    private final String message;

    public UnityAdsError(int i10, @l String message) {
        m0.p(message, "message");
        this.code = i10;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final String getMessage() {
        return this.message;
    }
}
