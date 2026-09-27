package com.applovin.shadow.okhttp3.internal.http2;

import cs.g;
import java.io.IOException;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class StreamResetException extends IOException {

    @l
    @g
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(@l ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        m0.p(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
