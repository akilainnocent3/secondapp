package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class SdkNotInitializedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkNotInitializedException(@l String adType) {
        super("Please initialize the SDK before creating " + adType + " ad");
        m0.p(adType, "adType");
    }
}
